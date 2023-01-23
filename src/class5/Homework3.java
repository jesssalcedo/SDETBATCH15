package class5;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Homework3 {
    /*
    Write a program that will read three inputs of scores
    (quiz, midterm, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter score for quiz");
        int quiz=scan.nextInt();
        System.out.println("Please enter your score for midterm");
        int midTerm=scan.nextInt();
        System.out.println("Please enter your final score");
        int finalScore= scan.nextInt();

        int average=(quiz+midTerm+finalScore)/3;

        System.out.println("Your average score is "+average);

        if(average>90){
            System.out.println("Grade A");
        } else if (average>=70&&average<90) {
            System.out.println("Grade B");

        }else if(average>=50&&average<70){
            System.out.println("Grade C");
        }else {
            System.out.println("Grade F");
        }
        {

        }

    }





}
