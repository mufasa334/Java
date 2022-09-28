import java.util.Scanner;

public class java2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
      
         // Ticket Buyer 
       System.out.println("Hello to the age counter made by Mustafa. I will be here to tell you if you are eligible to watch this R rated movie. Please enter your age: ");
       int age = scanner.nextInt();

       if(age >= 18){
        System.out.println("You are eligible to watch the movie");
       }else if(age <= 17){

        System.out.println("You are NOT eligible for the movie!");
       }else{
        System.out.println("Please enter a valid number ");
       }

       //Larger Numbers calculator
       System.out.println("\nPlease you have to enter two numbers and I'm going to tell you which number is larger!");
       System.out.println("\nPlease enter the first number (the number can be decimal!): ");
       double num1 = (double) scanner.nextDouble();
       System.out.println("Please enter the second number (the number can be a decimal!): ");
       double num2 = (double) scanner.nextDouble();
      
       if(num1 > num2){
        System.out.println(num1 + " is greater than the other decimal number!");
       }else if(num2 > num1){
        System.out.println(num2 + " Is greater than the other decimal number!");
       }else{
        System.out.println("Please enter valid numbers or don't add the same number twice");
       }


       //Largest number finder
       System.out.println("\nWelcome to largest number finder, please enter some digits and I'm going to find what is the largest among them all!");
       System.out.println("Please enter the first number: ");
       int newNum1 =  scanner.nextInt();
       System.out.println("Please enter the second number: ");
       int newNum2 =  scanner.nextInt();
       System.out.println("Please enter the third number1: ");
       int newNum3 =  scanner.nextInt();


        if(newNum1 >newNum2 &&  newNum1 > newNum3){
        System.out.println(newNum1 + " is the biggest!");
       } else if(newNum2 > newNum1 && newNum2 > newNum3){
        System.out.println(newNum2 + " is the biggest!");
       }else if(newNum3 > newNum1 && newNum3 > newNum2){
        System.out.println(newNum3 + " is the biggest!");
       }else{
        System.out.println("Please enter valid numbers or don't enter the same numbers");
       }


       // odd even

       System.out.println("Hi there to the odd number finder. Please enter a number and I'm  going to tell you if it is odd or not");
       int x = scanner.nextInt();
       if((x % 2) == 0){
        System.out.println(x + " is an even number!");
       }else{
            System.out.println(x+ " is an odd number");
       }


       //Random number guesser 
       final int NUM_GUESS = 1;
       System.out.println("\nI'm going to ask you to put in two random guesses and im going to tell you if it is close or if you actually guessed my number!, (Hint: the number is between 1 and 100)\n enter your first guess please:");
       int guess1 = scanner.nextInt();
       System.out.println("Enter your second guess please: ");
       int guess2 = scanner.nextInt();

       System.out.println("\nThe guess was 1!");
       if(guess1 == NUM_GUESS ){
        System.out.println("AMAZING! You got it correctly from the first try!");
       }else if(guess2 == NUM_GUESS){
        System.out.println("WOW! You got the second guess right!");
       }else if(guess1 <= 10  ){
        System.out.println("Your first guess was close!");
       }else if(guess2 <= 10){
        System.out.println("Your second guess was closer!");
       }else{
        System.out.println("Game over, good luck next time!");
       }
   
       scanner.close();
       
    }
}
