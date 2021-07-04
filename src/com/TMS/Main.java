package com.TMS;

/* Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.*/
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] first = new int[10];
        int[] second = new int[10];
        double[] third = new double[10];
        int j=0;
        Random rnd = new Random();
        for (int i = 0; i <10; i++) {
            first[i] = rnd.nextInt(9);
            second[i] = rnd.nextInt(9);
            if (second[i] != 0) {
                third[i] = (double)first[i] / second[i];
            } else {
                third[i] = 0;
            }
        }
        for (int one : first) {
            System.out.print(one + " ");
        }
        System.out.println();
        for (int two : second) {
            System.out.print(two+ " ");
        }
        System.out.println();
        for (double three : third) {
            System.out.print(three+ " ");
            if (three %1 == 0) {
                j =  j +1;
            }
        }
        System.out.println();
        System.out.println ("Кол-во целых элементов: " +j);
    }

}