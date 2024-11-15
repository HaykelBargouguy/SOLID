package com.directi.training.dip.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderImpl implements IReader {

private String filePath;

    public FileReaderImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        reader.close();
        return content.toString();
    }
}