package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество шагов: ");
        int n = in.nextInt();

        System.out.println("Число х: ");
        double x = in.nextDouble();
        double sum = 0;

        if (n < 0)
            System.out.println("Отрицательное кол-во шагов");


        for (int i = 0; i <= n; i++) {
            if (n < 0) {
                break;
            }
            else {

                x = (Math.pow(-1, i) * Math.pow(x - 1, i + 1) / (i + 1));
                sum += x;
                System.out.println(sum);
            }
        }
    }
}