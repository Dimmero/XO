package Game;

import java.util.Scanner;

public class Players {

    String name;
    final static char x = 'X';
    final static char o = 'O';

    public String setName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, provide player's name");
        return name = sc.next();
    }

    public char getCharX(){
        return x;
    }
    public char getCharO(){
        return o;
    }



}
