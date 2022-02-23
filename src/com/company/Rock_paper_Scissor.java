package com.company;
import java.util.Scanner;
import java.util.Random;

public class Rock_paper_Scissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String r="rock";
        String p="paper";
        String s="scissor";

        String [] plays={r,p,s};
        boolean quit=false;
        String comPlay;
        String yourPlay;
        int index;
        while(!quit){
            System.out.println("Do Your Play: (rock/paper/scissor)");
            yourPlay=scanner.nextLine();

            index=random.nextInt(bound 3);
            comPlay=plays[index];

            System.out.println("Your play: "+  yourPlay  +"  Computer's Play"+  comPlay  );
        }

    }
}
