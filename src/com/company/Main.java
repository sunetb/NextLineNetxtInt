package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please write some text");
        System.out.println("You wrote: "+s.nextLine());
        System.out.println();
        System.out.println("Now write a number");
        System.out.println("You wrote the number: "+s.nextInt());
        System.out.println("Please write some text again");
        System.out.println("You wrote: "+s.nextLine()); //Goes wong because after the int, the user typed Return

        //The fix:

        System.out.println("Please write some text");
        System.out.println("You wrote: "+s.nextLine());
        System.out.println();
        System.out.println("Now write a number");
        System.out.println("You wrote the number: "+s.nextInt());
        System.out.println("Please write some text again");
        s.nextLine(); //add an extra nexLine()
        System.out.println("You wrote: "+s.nextLine());

        // write your code here
    }
}
