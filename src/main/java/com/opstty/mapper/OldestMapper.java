package com.opstty.mapper;


import org.apache.hadoop.io.ArrayWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;


public class OldestMapper extends Mapper<Object, Text, IntWritable, OldestMapper.IntArrayWritable> {
    private final static IntWritable year = new IntWritable(2020);
    public static class IntArrayWritable extends ArrayWritable {

        public IntArrayWritable(IntWritable[] values) {
            super(IntWritable.class, values);
        }

        @Override
        public IntWritable[] get() {
            return (IntWritable[]) super.get();
        }

        @Override
        public String toString() {
            IntWritable[] values = get();
            return values[0].toString() + ", " + values[1].toString();
        }
    }

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString();
        if (line.contains("GEOPOINT")){
            return;
        }
        else{

            String[] line_split=line.split(";");
            IntWritable treeID= new IntWritable(Integer.parseInt(line_split[11]));
            IntWritable district = new IntWritable(Integer.parseInt(line_split[1]));
            IntWritable[] temp = new IntWritable[2];

            if (line_split[5].length()>0){
                year.set((int) Float.parseFloat(line_split[5]));
            }
            temp[0]=year;
            temp[1]=district;

            context.write(treeID, new IntArrayWritable(temp));
        }

    }
}
