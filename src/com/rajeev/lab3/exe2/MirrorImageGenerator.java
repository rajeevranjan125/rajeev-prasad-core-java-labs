package com.rajeev.lab3.exe2;

public class MirrorImageGenerator {

    public String getImage(String str) {

        String reverse = new StringBuffer(str)
                .reverse()
                .toString();

        return str + "|" + reverse;
    }

    public static void main(String[] args) {

        MirrorImageGenerator generator = new MirrorImageGenerator();

        String result = generator.getImage("EARTH");

        System.out.println(result);
    }
}