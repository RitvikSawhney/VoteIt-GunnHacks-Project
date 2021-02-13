import java.util.ArrayList;
import java.util.Scanner;

import java.lang.*;
class Main {

  static opt[] opts = new opt[]{
      new opt(),
      new opt()
    };
       static String opt_1; 
    static String opt_2;
    static int votes1 = 0;
    static int votes2 = 0;
  public static void main(String[] args) {
    //options and choice
    String choice;
    boolean validation = true;
    String[] actual_vote;
    Scanner input = new Scanner(System.in); //scanner 
    System.out.print("Voter count: ");
    int voter_count = input.nextInt();
    
    //array list declaration
    System.out.println(opts.length);
    System.out.println("Write a maximum of 2 options to get voted for");
    System.out.print("Option 1: ");
    opt_1 = input.next();
    System.out.print("Option 2: ");
    opt_2 = input.next();
    opts[0].option = opt_1;
    opts[1].option = opt_2;
    //error if statements
    if(voter_count > 10){
      System.out.println("Maximum voters allowed are 10. Please enter a digit from 1 to 10");
    }
    else if(voter_count < 1)
    {
      System.out.println("Positive integer please.");
    }
    //voter loop
    for (int i = 0; i < opts.length; i++)
    {
      opts[i].votes = 0;
    } 
    for (int i = 0; i < voter_count; i++)
    {
      String name = input.next();
      validation = vote(name);
      if(!validation){
        System.out.println("invalid vote");
        break;
      }
      opts[i].votes++;
    }

    input.close();
  }
  public static boolean vote(String vote){
    for(int i = 0; i < opts.length; i++){
      if(vote == opts[i].option){
        return true;
      }
    }
    return false;
  }
  public static void printWinner(){
    for(int i = 0; i < opts.length; i++){
      if(opts[i].option == opt_1){
        votes1++;
      }
      else if(opts[i].option == opt_2){
        votes2++;
      }
    }
    if(votes2 > votes1){
      System.out.print("Option 1 Wins, You should ");
    }
  }
}
class opt{
  String option;
  int votes;
}

