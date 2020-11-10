package com.opstty.reducer;

import com.opstty.mapper.OldestMapper;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class OldestReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    private IntWritable result = new IntWritable();

    public void reduce(Text key, Iterable<OldestMapper.IntArrayWritable> values, Context context)
            throws IOException, InterruptedException {
        int min = 2020;
        for (OldestMapper.IntArrayWritable val : values) {
            IntWritable[] test = val.get();
            if (test[0].get()<min){
                min=test[0].get();
                result.set(test[1].get());
            }
        }

        context.write(key, result);
    }
}
