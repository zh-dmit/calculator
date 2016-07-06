package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Выберите действие 1 - сложить 2 - вычесть 3 - делить 4 - умножить");
        int q = in.nextInt();
        if (q == 1){
            double c = a + b;
            System.out.println("Результат "+c);
        }
        else if (q == 2){
            double c = a - b;
            System.out.println("Результат "+c);
        }
        else if (q == 3){
            double c = a / b;
            System.out.println("Результат "+c);
        }
        else if (q == 4){
            double c = a * b;
            System.out.println("Результат "+c);
        }
    }

}
