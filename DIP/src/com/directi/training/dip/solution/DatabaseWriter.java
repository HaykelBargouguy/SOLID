package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class DatabaseWriter implements IWriter {
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public void write(String inputString) {
        _data.put(++_count, inputString);
    }
}
