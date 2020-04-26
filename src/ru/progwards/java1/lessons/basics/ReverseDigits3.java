package ru.progwards.java1.lessons.basics;

public class ReverseDigits3 {
    public static int reverseDigits(int number) {
        int mirror = 0;
        while (number != 0) {
            mirror = mirror * 10 + (number % 10);
            number = number / 10;
        }
        return mirror;

    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(567));
    }
}
