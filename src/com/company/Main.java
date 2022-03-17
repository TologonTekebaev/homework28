package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        double b = random.nextDouble(0, 10000);
        System.out.println("Рандом сан: "+ b);
        System.out.println("Квадраттан чыкканы: " + wed.apply(b));
    }
        static UnaryOperator<Double> wed = num -> Math.sqrt(num);
}
        /*sqrt деген метод тузунуз.
        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).
        public static UnaryOperator<Double> sqrt();*/