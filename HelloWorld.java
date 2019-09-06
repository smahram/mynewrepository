//Sarah Mahram
//Object Oriented Programming
//Hello World

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
    
        Scanner user_input = new Scanner(System.in);
        System.out.print("Hello World! My name is Sarah."); //My greeting and intro. 

        String first_name;  
        System.out.print("\nWhat's your name? "); //User enters name.
        first_name = user_input.next();
        
        String place_location;                  //User enters where they are from. 
        System.out.print("Where are you from? ");
        place_location = user_input.next();
        System.out.print("Hello "+first_name+" from "+place_location+"!"); //Will display the users info.
                                                             
        
    }

    

}