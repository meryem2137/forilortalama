import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        num=input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i+" ");
                sum += i;
                count++;
            }
        }

        double average =  sum / count;
        System.out.println("Ortalama: " + average);

            }



        }




































































