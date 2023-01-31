package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int score = 0;
            for (int i = 1; i <= 5; i++) {
                Random r = new Random();
                int num1 = r.nextInt(100);
                Random t = new Random();
                int num2 = t.nextInt(100);
                int s = num1 + num2;
                System.out.print(num1 + " + " + num2 + " = ");
                Scanner input = new Scanner(System.in);
                int ans = input.nextInt();
                if (ans == s) {
                    score++;
                }
            }
            System.out.print("your score : " + score + "/5");
        } catch (Exception e) {
            System.out.print("enter a valid type");
        }


    }
}
