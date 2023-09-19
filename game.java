import java.util.Random;
import java.util.Scanner;
import java.util.*;
public class game
{
public static void main(String k[])
{
Scanner ob=new Scanner(System.in);
Random r=new Random();
int lowerBound=1;
int upperBound=100;
int randomNumber=r.nextInt(upperBound-lowerBound+1)+lowerBound;
int numberOfTries=0;
boolean hasGuessedCorrectly=false;
System.out.println("WELCOME to the number guessing game");
System.out.println("I have selected a number between1 and 100.Try to guess it.");
while(!hasGuessedCorrectly)
{
System.out.println("enter your guess:");
int userGuess=ob.nextInt();
numberOfTries++;
if(userGuess<lowerBound||userGuess>upperBound)
{
System.out.println("please enter a number between 1 and 100");
}
else if(userGuess<randomNumber)
{
System.out.println("Too low!!! Try again.");
}
else if(userGuess>randomNumber)
{
System.out.println("Too high!!! Try again.");
}
else 
{
hasGuessedCorrectly=true;
System.out.println("Congratulations! You guessed the number" + randomNumber +" in " + numberOfTries + "tries");
}
}
ob.close();
}
}
