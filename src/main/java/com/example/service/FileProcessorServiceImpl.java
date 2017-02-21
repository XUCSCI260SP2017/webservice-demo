package com.example.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ddentinger on 2/20/17.
 */
public class FileProcessorServiceImpl implements FileProcessorService {
    @Override
    public List<String> getFileContents(String filenamne) {

        BufferedReader s = null;
        try {
            s= new BufferedReader(new FileReader(filenamne));
            return s.lines().collect(Collectors.toList());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
