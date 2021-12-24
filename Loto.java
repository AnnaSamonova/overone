package one;

import java.util.Scanner;

public class Loto {
    public static void main(String[] args) {

        System.out.println("Введите  номер от 1 до 100: ");
        int number = new Scanner(System.in).nextInt();
       /* switch (number){
            case 4:
            {
                System.out.println("Вы выиграли");
                break;
            }
            case 10: {
                System.out.println("Вы выиграли");
                break; }
            case 40: {
                System.out.println("Вы выиграли");
                break; }
            case 89: {
                System.out.println("Вы выиграли");
                break; }



        }*/
        if  (number==4 || number==40 || number==10|| number==89){
            System.out.println("Вы   выиграли");

        }
        else {
            System.out.println("Вы  не  выиграли");


    }}}

