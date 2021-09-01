package ru.netology;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String sum = bins.sum("1111", "11001");
        String mult = bins.mult("1111", "11001");
        System.out.println(sum + "\n" + mult);
    }
}
