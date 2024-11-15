package com.directi.training.dip.exercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements IReader {
    private URL url;

    public NetworkReader(URL url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            inputString.append((char) c);
        }
        return inputString.toString();
    }
}
