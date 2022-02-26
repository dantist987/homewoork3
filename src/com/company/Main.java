package com.company;


public class Main {

    public static void main(String[] args) {

        double[] array = new double[]{2.5, -3.2, 5.5, 3.0, 10.5, -20.3, 18.2, 1.8, -4.3, 6.7, 15.8, 4.2, 0.5, 7.5, 12.0};


        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double ii = sum / array.length;
        System.out.println("Среднее арифметическое: " + ii);


        boolean Sorted = false;
        while (!Sorted) {
            Sorted = true;
            for (int i = 1; i < array.length; i++) {
                double temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                Sorted = false;
            }
        }



    }

}

