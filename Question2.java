
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Question 2, Assignment 8
// Name: Nelson Kadama
// Student Number: NLSANG001
// Date: 19/09/13

public class Question2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String text_entered = "";
        String choice = "";
        LinkedList<String> elements = new LinkedList<String>();
        int count = 0;
        
        while(true){
            System.out.println("MENU: Add to the list(A), Delete from the list(D), Display list(L), Exit(^z)");
            choice = input.nextLine();
            
            
            switch(choice.charAt(0)){
                case 'A':
                case 'a':
                    while(true){
                        System.out.println("Enter something or ^z to return to the main menu:");
                        text_entered = input.nextLine();
                        boolean placed = false;

                        if(text_entered.equalsIgnoreCase("^z")){
                            break;
                        }
                        else{
                            if(count > 3){
                                String pos;
                                System.out.println("Specify element after which to insert:");
                                pos = input.nextLine();
                                for(int k = 0; k < elements.size()-1; k++){
                                    if(pos.equalsIgnoreCase(elements.get(k))){
                                        elements.add(k+1, text_entered);
                                        count +=1;
                                        placed = true;
                                    }
                                }
                            }
                            if(placed == false){
                                elements.add(text_entered);
                                count+=1;
                            }
                        }
                    }
                    break;
                case 'D':
                case 'd':
                    String delt;
                    System.out.println("Specify what to delete:");
                    delt = input.nextLine();
                    boolean found = false;
                    for(int k = 0; k < elements.size(); k ++){
                        if(delt.equals(elements.get(k))){
                            elements.remove(k);
                            count -= 1;
                            found = true;
                            
                        }
                    }
                    if(found == false)
                        System.out.println("Element not found");
                    else
                        System.out.println("Deletion done!");
                    break;
                    
                case 'L':
                case 'l':
                    if(elements.size() == 0){
                        System.out.println("List is empty");
                        break;
                    }
                    else{
                        String output = "";
                        output = elements.getFirst();
                        for (int k = 1; k < elements.size(); k++)
                            output += " -> " + elements.get(k);
                        System.out.println(output);
                    }
                    break;
                    
                default:
                    if(choice.equalsIgnoreCase("^z")){
                        System.out.println("Bye bye");
                        System.exit(0);
                    }
                    else
                       System.out.println(choice.charAt(0) + " is not a valid option"); 
                            
                    
                    
            }
            
        }

    }

}
