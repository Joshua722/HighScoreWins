package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a game score in this format : Home:Visitor|HomePoints:VisitorPoints - ");
        String userInput = myScanner.next();

        String[] scores = userInput.split("\\|");
        String[] userTeams = scores[0].split("\\:");
        String[] userPoints = scores[1].split("\\:");
            if(Integer.parseInt(userPoints[0]) > Integer.parseInt(userPoints[1])){
                System.out.println("The winner is : " + userTeams[0]);
        }
            else {
                System.out.println("The winner is : " + userTeams[1]);
        }

    }


}
