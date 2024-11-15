package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private IReader reader;
    private IWriter writer;

    public EncodingModule(IReader reader, IWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() throws IOException {
        String data = reader.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        writer.write(encodedData);
    }
}
