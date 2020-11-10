package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");
            programDriver.addClass("district", District.class,
                    "A map/reduce program that display all districts with remarkable trees");
            programDriver.addClass("maxheight", MaxHeight.class,
                    "A map/reduce program that display the maxHeight for each sepcies ");
            programDriver.addClass("sortheight", SortHeight.class,
                    "A map/reduce program that sort tree by height");

            programDriver.addClass("oldest", Oldest.class,
                    "A map/reduce program that returns teh district with the oldest tree");

            programDriver.addClass("showspec", ShowSpec.class,
                    "A map/reduce program that returns list of all the species");

            programDriver.addClass("nbtrees", NbTrees.class,
                    "A map/reduce program that returns the number of trees per species");

            programDriver.addClass("mosttrees", MostTrees.class,
                    "A map/reduce program the district with the most trees");



            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
