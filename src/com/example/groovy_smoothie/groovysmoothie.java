package com.example.groovy_smoothie;

public class groovysmoothie {
    public static void main(String[] args) {
        //Wrong input for variable type
        int wrong1 = "porridge";
        String wrong2 = 666;
        double wrong3 = 67;

        //Invalid variable name
        String #wrong4 = "Oh dear!";
        boolean ^^^teepee = false;

        //Undefined
        String noOneHome;

        //Prints them out!
        System.out.println(wrong1);
        System.out.println(wrong2);
        System.out.println(wrong3);
        System.out.println(wrong4);
        System.out.print(^^^teepee);
        System.out.println(noOneHome);

    }
}
