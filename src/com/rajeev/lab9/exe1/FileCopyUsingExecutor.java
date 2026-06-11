package com.rajeev.lab9.exe1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileCopyUsingExecutor {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(() -> {
            try (
                    FileInputStream source = new FileInputStream("source.txt");
                    FileOutputStream target = new FileOutputStream("target.txt")
            ) {
                int ch;
                int count = 0;

                while ((ch = source.read()) != -1) {
                    target.write(ch);
                    count++;

                    if (count % 10 == 0) {
                        System.out.println("10 characters are copied");
                        Thread.sleep(5000);
                    }
                }

                System.out.println("File copying completed.");

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
    }
}