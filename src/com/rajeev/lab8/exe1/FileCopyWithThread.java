package com.rajeev.lab8.exe1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyWithThread {

    static class CopyDataThread extends Thread {

        private FileInputStream source;
        private FileOutputStream target;

        public CopyDataThread(FileInputStream source, FileOutputStream target) {
            this.source = source;
            this.target = target;
        }

        @Override
        public void run() {
            try {
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

                System.out.println("File copying completed successfully.");

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            } finally {
                try {
                    source.close();
                    target.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("target.txt");

            CopyDataThread thread = new CopyDataThread(fis, fos);
            thread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}