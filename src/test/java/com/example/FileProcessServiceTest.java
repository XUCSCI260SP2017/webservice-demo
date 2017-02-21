package com.example;

import com.example.service.FileProcessorService;
import com.example.service.FileProcessorServiceImpl;
import org.junit.*;
import org.junit.Assert.*;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class FileProcessServiceTest {

@Test
    public void test1() {

    FileProcessorService sut = new FileProcessorServiceImpl();

    List<String> answer = sut.getFileContents("test2.txt");
    assertNotNull(answer);
    }
}
