package com.opstty.reducer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class SortHeightReducer extends Reducer<IntWritable, Text, IntWritable,Text> {
    private Text result = new Text();

    public void reduce(IntWritable key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {


        for (Text val : values) {
            result.set(val);
            context.write(key, result);
        }


    }
}
