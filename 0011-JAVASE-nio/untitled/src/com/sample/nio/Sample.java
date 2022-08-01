package com.sample.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Sample {
    public static void main(String[] args) throws IOException {

        // create a path
        Path path = Paths.get("sample.txt");
        // read txt file by using readline method of Files class
        List<String> lines = Files.readAllLines(path);

        // iterate list and remove all line start with Ali
        // our iteration must be start from last item
        for (int i = lines.size() - 1; i <= 0; i--)
            if (lines.get(i).startsWith("Ali"))
                lines.remove(i);

        // declare new path for writing lines to that
        Path path2 = Paths.get("sample2.txt");

        // check that file exists or not
        // in this scenario sample2 not exists
        checkExists(path2);

        // write to path2 with readline method of Files class
        Files.write(path2, lines);

        // check that file exists or not
        checkExists(path2);

    }

    // method for checking file existence
    private static void checkExists(Path p) {
        if (Files.exists(p))
            System.out.println(p.getFileName() + " exist.");
        else
            System.out.println(p.getFileName() + " not exist.");
    }
}
