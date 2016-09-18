/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question0 , Assignment 8
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 19/09/13

import java.util.LinkedList;
import java.util.Scanner;

public class Question0 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String text_entered = "";
        LinkedList<String> elements = new LinkedList<String>();
        
        while(true){
            System.out.println("Enter something or ^z to end:");
            text_entered = input.nextLine();
            
            if(text_entered.equals("^z")){
                String output = "";
                output = elements.getFirst();
                elements.remove(0);
                for (int k = 0; k < elements.size(); k++)
                    output += " -> " + elements.get(k);
                System.out.println(output);
                System.exit(0);
            }
                
            
            elements.add(text_entered);
        }
        
        
        
        
     

    }

}
