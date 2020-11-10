package com.opstty.mapper;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class SortHeightMapper extends Mapper<Object, Text, IntWritable, Text> {
    private IntWritable word = new IntWritable();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString();
        if (line.contains("GEOPOINT")){
            return;
        }
        else{
            String[] line_split=line.split(";");
            String treeID = line_split[11];

            int height=0;
            if (line_split[6].length()>0){
                height = (int) Float.parseFloat(line_split[6]);
            }
            word.set(height);
            context.write(word,new Text(treeID));
        }

    }
}

