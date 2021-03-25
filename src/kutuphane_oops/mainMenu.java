package kutuphane_oops;

import java.util.Scanner;

public class mainMenu extends libraryMain{
    public static void mainMenu(){
        System.out.println(" ** Welcome to the World Library Data Base ** ");
        Scanner pNumber = new Scanner(System.in);
        System.out.println();
        System.out.println(" Enter a Book To the Library ----------> 1 ");
        System.out.println(" Delete a Book from the Library -------> 2 ");
        System.out.println(" List All Books in Library ------------> 3 ");
        System.out.println(" Search a book in Library by book Id---> 4 ");
        System.out.println(" Search a book in Library by book Info-> 5 ");
        System.out.println(" Exit from World Library Data Base ----> 6 ");
        System.out.println();
        System.out.print(" Enter the Process Number ---------------> ");
        processNumber = pNumber.nextInt();
    }
}
