package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String state = "Introductory Exercises";
        int fails = 0;
        boolean loop = true;
        Scanner input = new Scanner(System.in);

        while (loop) {
            System.out.println(state);
            String action = input.nextLine();


            if (state == "Introductory Exercises" && action.equals("Complete")) {
                state = "Project";
            }
            else if (state == "Project" && action.equals("Pass")) {
                state = "Benchmark";
            }
            else if (state == "Benchmark" && fails < 3) {
                if (action.equals("Fail")) {
                    fails++;
                    System.out.println(fails);
                    state = "Project";
                    if (fails == 3) {
                        state = "Module Failed";
                        loop = false;
                    }
                } else if (state == "Benchmark" && action.equals("Pass")) {
                    state = "Module Passed";
                    System.out.println(state);
                    loop = false;
                }
            }
        }



    }
}
