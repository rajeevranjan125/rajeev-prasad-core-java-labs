package com.rajeev.lab8.exe2;

import java.time.LocalTime;

public class TimerDisplay implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current Time: " + LocalTime.now());
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
    }

    public static void main(String[] args) {
        Thread timerThread = new Thread(new TimerDisplay());
        timerThread.start();
    }
}