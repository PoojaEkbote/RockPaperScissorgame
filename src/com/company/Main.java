package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random randnum=new Random();
        Scanner sc=new Scanner(System.in);
        int round=0;
        int compterpoints=0,userpoints=0;

        System.out.println("Welcome to Rock Paper Scissor game!It will have 5 rounds\n");

        while(round<5){
            System.out.println("*******************************************************************************");
            int counter=round+1;
            System.out.println("Welcome to round "+counter);

            //User turn
            System.out.println("Please select one of the below number :\n0\tRock\n1\tPaper\n2\tScissor");
            System.out.println("Your turn!");
            int userinput=sc.nextInt();

            while(userinput>=3){
                System.out.println("Please enter valid number");
                System.out.println("Please select one of the below number :\n0\tRock\n1\tPaper\n2\tScissor");
                userinput=sc.nextInt();
            }

            switch (userinput){
                case 0 -> System.out.println("You chose Rock!");
                case 1 -> System.out.println("You chose Paper!");
                case 2 -> System.out.println("You chose Scissor!");
            }


            //Computer chooses random number between 0,1 and 2
            System.out.println("Its Computers turn!");
            int compinput= randnum.nextInt(3);
            System.out.println(compinput);

            switch (compinput){
                case 0 -> System.out.println("Computer chose Rock!");
                case 1 -> System.out.println("Computer chose Paper!");
                case 2 -> System.out.println("Computer chose Scissor!");
            }



            //Logic to declare winner after each round
            if ((compinput == 0 && userinput == 2) || (compinput==1 && userinput==0) || (compinput==2 && userinput==1) ) {
                System.out.println("Computer Wins round"+counter);
                compterpoints=compterpoints+1;
                System.out.println("Press any letter to know points after round "+counter);
                String checkr=sc.next();
                System.out.println("--------------------");
                System.out.println("After round "+counter+"\n\tComputer points "+compterpoints+"\n\tYour points "+userpoints);
                System.out.println("--------------------");
            }
            else if (compinput==userinput){
                System.out.println("Nobody wins this round!");
                System.out.println("Press any letter to know points after round "+counter);
                String checkr=sc.next();
                System.out.println("--------------------");
                System.out.println("After round "+counter+"\n\tComputer points "+compterpoints+"\n\tYour points "+userpoints);
                System.out.println("--------------------");
            }
            else {
                System.out.println("You won round "+counter);
                userpoints=userpoints+1;
                System.out.println("Press any letter to know points after round "+counter);
                String checkr=sc.next();
                System.out.println("--------------------");
                System.out.println("After round "+counter+"\n\tComputer points "+compterpoints+"\n\tYour points "+userpoints);
                System.out.println("--------------------");
            }

            //incrmenting to go for next round
            round++;

            //Message before going to next round
            if (round<4) {
                System.out.println("Press any letter to go to next round");
                String checkr = sc.next();
            }
        }

        //Logic to declare result after 5 rounds of game

        //If user wins the game
        if (userpoints>compterpoints){
            System.out.println("#############################################################");
            System.out.println(":-):-):-)-------------------------------------------:-):-):-)");
            System.out.println("Wooohooo!\nCongratulations You have finally won the game!!...");
            System.out.println(":-):-):-)-------------------------------------------:-):-):-)");
            System.out.println("#############################################################");
        }

        //if match is a tie
        else if (userpoints==compterpoints){
            System.out.println("Match tie, Nobody won the game!");
        }

        //If Computer wins the game
        else{
            System.out.println("Better luck next time!, Computer won this game.");
        }

        sc.close();
    }
}