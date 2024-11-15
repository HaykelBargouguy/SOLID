package com.directi.training.dip.exercise;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
  
        EncodingModule fileEncodingModule = new EncodingModule(
            new FileReaderImpl("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"),
            new FileWriterImpl("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt")
        );
        fileEncodingModule.encode();

        EncodingModule networkEncodingModule = new EncodingModule(
            new NetworkReader(new URL("http", "myfirstappwith.appspot.com", "/index.html")),
            new DatabaseWriter()
        );
        networkEncodingModule.encode();
    }
}
