package org.example;

public class Main {
    public static void main(String[] args) {
        int get  = getDoubledNumber(-2);
        System.out.println(get);
    }
    public static int getDoubledNumber(int number) {
        int y = 1;
        return number << y;
    }
}
