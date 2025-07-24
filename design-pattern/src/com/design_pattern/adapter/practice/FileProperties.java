package com.design_pattern.adapter.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    private static final long serialVersionUID = 1L;
    public FileProperties() {
        super();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        Reader reader = new FileReader(filename);
        try {
            this.load(reader);
        } finally {
            reader.close();
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Writer writer = new FileWriter(filename);
        try {
            this.store(writer, "Written by FileProperties");
        } finally {
            writer.close();
        }
    }

    @Override
    public void setValue(String key, String value) {
        this.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return this.getProperty(key);
    }
    
}
