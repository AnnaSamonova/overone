package one;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        double pervoe=new Scanner(System.in).nextDouble();
        System.out.println("Введите операцию +, -, * или / : ");
        String operaciya = new Scanner(System.in).nextLine();
        System.out.println("Введите второе  число: ");
        double vtoroe = new Scanner(System.in).nextDouble();


        if ( operaciya.equals("+")) {
            System.out.println(" Результат: " + (pervoe+vtoroe));}
        else if (operaciya.equals("-")) {
            System.out.println(" Результат: " + (pervoe-vtoroe));}
        else if (operaciya.equals("*") ) {
            System.out.println(" Результат: " + (pervoe*vtoroe));}
        else if (operaciya.equals("/") ) {
            System.out.println(" Результат: " + (pervoe/vtoroe));}
        else {
            System.out.println(" Ошибка ввода операции ");

        }





    }
}
