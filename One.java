package one;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        int celoe =new Scanner(System.in).nextInt();
        System.out.println("Введите целое число: ");
        int celoe2 = new Scanner(System.in).nextInt();
        System.out.println("Введите строку: ");
        String str= new Scanner(System.in).nextLine();
        System.out.println("Введите дробное число: ");
        double drob = new Scanner(System.in).nextDouble();

        System.out.println("Выводим: " + str + " " + (celoe+celoe2+drob) );
    }
}
