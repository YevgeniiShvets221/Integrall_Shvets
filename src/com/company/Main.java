package com.company;

public class Main {

    public static double ourIntegral() {
        return 0;
    }

    public static void main(String[] args) {

        int steps = 10;
        double width = Math.PI / steps;
        double line = 0.4; //4 last number of student card
        double area = 0.0;

        for (int i = 0; i < steps - 1; i++) {
            double height = Math.sin(i * width);

            if (height >= line) {
                height=line; 
            }
            double deltaS = width * Math.sin(i * width);
            area += deltaS;
        }
        System.out.println("Area = " + area);

    }
}

