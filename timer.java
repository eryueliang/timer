// @author yyz

package com.company;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        date.setTime(System.currentTimeMillis() + 10* 1000);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("run!");
            }
        };
        timer.schedule(task, date);
        System.out.println("task set!");

    }
}

