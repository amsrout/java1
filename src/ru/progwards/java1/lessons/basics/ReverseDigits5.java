package ru.progwards.java1.lessons.basics; //Tatyana

public class ReverseDigits5 {
    public static int reverseDigits(int number) {
        int a1 = number/100;
        int a2 = (number - a1*100)/10;
        int a3 = number - (a1*100 + a2*10);
        return a3*100+a2*10+a1;
    }
    public static void main(String[] args){
        System.out.println(reverseDigits(457));
    }
}
