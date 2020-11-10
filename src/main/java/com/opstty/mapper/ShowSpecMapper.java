package com.opstty.mapper;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;
public class ShowSpecMapper extends Mapper<Object, Text, Text, IntWritable> {

    private final static IntWritable one = new IntWritable(1);

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
        String line = value.toString();
        if (line.contains("GEOPOINT")){
            return;
        }
        else{
            String species = line.split(";")[2];
            context.write(new Text(species),one);
        }
    }
}