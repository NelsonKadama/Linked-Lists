/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
import java.io.*;
import java.util.*;

public class Question3 implements Comparator<String> {
   
    public Scanner inputStream = null;
    
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
    
    public Scanner run(String filename){
        inputStream = null;
        
        try {
            inputStream = new Scanner(new FileInputStream(filename));
        } catch (Exception e) {
            System.exit(0);
        }
        return inputStream;
    }
   
   public static void main ( String args [] )
   {
        Question3 file = new Question3();

        Scanner input;
        
        input = file.run(args[0]);
        
        
        LinkedList<String> elements = new LinkedList<String>();
        

        

        while (input.hasNext()) {
            String value=input.nextLine();
            elements.add(value); 
           
        }
        
        
        
        Collections.sort(elements, new Question3());
        
        for(int k = 0; k < elements.size(); k++){ 
            int counter = 0;
            for(int l = 0; l < elements.get(k).length(); l++){
                if(elements.get(k).charAt(l) != ' ')
                    counter+=1;
            }
            System.out.println(k+1 + "/" + counter + ": " + elements.get(k));
        }
        
        if(elements.size() == 0)
            System.out.println("1/0:");
        
       
        
        
            
            
   }

}





