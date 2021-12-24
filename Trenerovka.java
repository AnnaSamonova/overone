package one;

public class Trenerovka {
    public static void main(String[] args) {
        // максимальное и минимальное
        /*int max=0;
        int min=9;
        int i=11135;
        int k=0;
        while (i>0){
            k=i%10;
            if(k>max){
                max=k;
            }
            if (k<min) {
                min=k;
            }
            i=i/10;
        }
        System.out.println(min + " " + max);*/

        // ------------------------------------------

// сумма чисел
       /* int sum = 0;
        int i = 528;
        int k=0;
        while (i>0){
            k=i%10;
            sum=sum+k;
            i=i/10;
        }
        System.out.println(sum);*/

        // --------------------------
        // средне ариф цифр в числе

        int i = 5528;
        int count=0;
        double sum = 0;
        int k = 0;
        while (i>0) {
            k=i%10;
            count++;
            sum=sum+k;
            i=i/10;

        }
        double result=sum/count;
        System.out.println(result);
    }
}
