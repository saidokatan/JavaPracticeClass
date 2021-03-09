package sekiz_mart_pratik;

import sun.font.FontRunIterator;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
       /* FizzBuzz is a well known programming assignment, asked during interviews.
        Klavyeden girilen bir sayı girilecek
        0 dan n sayısına kadar 3 e bolunebilen sayının yerine fizz
        5 e bölünebilen sayının yerine buzz
        Hem 3 hem de 5 e bölünebilen sayının yerine FizzBuzz yazacak program
        İnput: 20
        Output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz*/

        Scanner kac_adet = new Scanner(System.in);
        System.out.print("Bir Sati Giriniz..> ");
        Integer adet = kac_adet.nextInt();

        for (int i = 1; i <= adet; i++) {
            if (i % 15 == 0) {
                System.out.print(" Fizzbuz ");
            } else if (i % 3 == 0) {
                System.out.print(" fizz ");
            } else if (i % 5 == 0){
                System.out.print(" buzz ");
            }
            else{
                System.out.print(i);
            }

        }
    }

}


