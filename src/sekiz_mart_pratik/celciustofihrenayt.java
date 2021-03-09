package sekiz_mart_pratik;

import java.util.Scanner;

public class celciustofihrenayt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temp. in Celsius :");
        int celcius = s.nextInt();
        float fahren = celcius * 9 / 5 + 32;
        System.out.println("Temp. in Fahrenheit: " + fahren);


    }
}
