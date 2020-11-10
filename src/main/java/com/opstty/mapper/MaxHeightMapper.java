package com.opstty.mapper;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MaxHeightMapper extends Mapper<Object, Text, Text, IntWritable> {
    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString();
        if (line.contains("GEOPOINT")){
            return;
        }
        else{
            String[] line_split=line.split(";");
            String species = line_split[2];
            int height=0;
            if (line_split[6].length()>0){
                height = (int) Float.parseFloat(line_split[6]);
            }

            context.write(new Text(species), new IntWritable(height));
        }

    }
}
