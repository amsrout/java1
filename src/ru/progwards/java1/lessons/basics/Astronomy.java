package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r) {
        final double PI = 3.14;

        double S = 4 * PI * (r * r);
        return S;
    }
    public static Double earthSquare() {
        double earthR;
        earthR = sphereSquare(6371.2);
        return earthR;
    }
    public static Double mercurySquare() {
        double mercuryR;
        mercuryR = sphereSquare(2439.7);
        return mercuryR;
    }
    public static Double jupiterSquare() {
        double jupiterR;
        jupiterR = sphereSquare(71492.0);
        return jupiterR;
    }
    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare();
    }
    public static Double earthVsJupiter() {
        return earthSquare() / jupiterSquare();
    }

    public static void main(String[] args) {
        System.out.println("Площадь поверхности сферы радиуса R=7 ");
        System.out.println(sphereSquare(7.0));
        System.out.println("Площадь поверхности Земли, считая радиус равным 6 371.2 км ");
        System.out.println(earthSquare());
        System.out.println("Площадь поверхности Меркурия, считая радиус равным 2 439,7 км ");
        System.out.println(mercurySquare());
        System.out.println("Площадь поверхности Юпитера, считая радиус равным 71 492 км ");
        System.out.println(jupiterSquare());
        System.out.println("Отношение площади поверхности Земли к площади поверхности Меркурия ");
        System.out.println(earthVsMercury());
        System.out.println("Отношение площади поверхности Земли к площади поверхности Юпитера ");
        System.out.println(earthVsJupiter());

    }
}
