/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning_Projects;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Voter_Elegibility {

    public static void main(String[] args) {
        Regsiter register = new Regsiter();
        register.display();//calling the method
        register.Age_verification(); //calling the method
    }

}

class Regsiter {

    public void display() { //display method
        System.out.println("voters Registration center you must be 18 and above");
        System.out.println("You details must be correct \n");
    }

   
    public void Age_verification() { //Age verification method
        Scanner scanner = new Scanner(System.in);//new object1 of Scanner class
        System.out.println("Enter your age to proceed ");
        int Age = scanner.nextInt(); //scanner object only accept int as argument

        if (Age >17) {
            System.out.println("You are qualified to Register \n");
            Scanner scanner2 = new Scanner(System.in); //new object2 of Scanner class
            System.out.println("Enter your fullname ");
            String Name = scanner2.nextLine();
            System.out.println("Welcome " + Name + " You are registered succesfully");

        } else { //if statement to check the Age of user elligible to vote
            System.out.println("Your are not qualified to Register come back when you are up to 18");
            
        }
    }
}
