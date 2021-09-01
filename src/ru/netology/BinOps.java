package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int sum = first + second;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int mult = first * second;
        return Integer.toBinaryString(mult);
    }
}
