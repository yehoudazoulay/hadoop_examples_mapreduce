
package com.opstty.job;

import com.opstty.mapper.DistrictMapper;
import com.opstty.mapper.MostTreesMapper;
import com.opstty.reducer.DistrictReducer;
import com.opstty.reducer.MostTreesReducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class MostTrees
{
    public static void main(String[] args) throws Exception
    {
        Configuration conf1 = new Configuration();
        String[] otherArgs = new GenericOptionsParser(conf1, args).getRemainingArgs();
        if (otherArgs.length < 2) {
            System.err.println("Usage: mosttrees <in> [<in>...] <out>");
            System.exit(2);
        }

        // First job will count the number of trees in each district
        Job job1 = Job.getInstance(conf1, "districttreessum");
        job1.setJarByClass(MostTrees.class);
        job1.setMapperClass(DistrictMapper.class);
        job1.setCombinerClass(DistrictReducer.class);
        job1.setReducerClass(DistrictReducer.class);
        job1.setOutputKeyClass(Text.class);
        job1.setOutputValueClass(IntWritable.class);

        for (int i = 0; i < otherArgs.length - 1; ++i) {
            FileInputFormat.addInputPath(job1, new Path(otherArgs[i]));
        }

        String outputDir = otherArgs[otherArgs.length - 1];
        String tempPath = new Path(outputDir).getParent().getName() + "/temp" ;
        Path tempDir = new Path(tempPath);
        FileOutputFormat.setOutputPath(job1, tempDir);

        job1.waitForCompletion(true);

        // Job 2 will find the district with the most trees
        Configuration conf2 = new Configuration();
        Job job2 = Job.getInstance(conf2, "districtmosttrees");

        job2.setJarByClass(MostTrees.class);
        job2.setMapperClass(MostTreesMapper.class);
        job2.setCombinerClass(MostTreesReducer.class);
        job2.setReducerClass(MostTreesReducer.class);
        job2.setOutputKeyClass(Text.class);
        job2.setOutputValueClass(IntWritable.class);

        FileInputFormat.addInputPath(job2, new Path(tempPath + "/part-r-00000"));
        FileOutputFormat.setOutputPath(job2, new Path(outputDir));

        System.exit(job2.waitForCompletion(true) ? 0 : 1);
    }
}

