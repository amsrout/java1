package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius) {
        final double PI = 3.14;
        double V1 = 4.0 / 3.0 * PI * (radius * radius * radius);
        return V1;
    }
    public static float volumeBallFloat(float radius) {
        final float PI = 3.14F;
        float V2 = 4F / 3F * PI * (radius * radius * radius);
        return V2;
    }
    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - (float) radius;
    }

    public static void main(String[] args) {
        System.out.println(volumeBallDouble(6371.2));
        System.out.println(volumeBallFloat(6371.2F));
        System.out.println(calculateAccuracy(6371.2));
    }
}
