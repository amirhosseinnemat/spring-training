package com.sample.file;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Component
public class FileReading {

    public void ReadFile() throws IOException {
        Path path = Paths.get("sample.txt");
        List<String> text = Files.readAllLines(path);
        System.out.println("read successfully.");
    }
}
