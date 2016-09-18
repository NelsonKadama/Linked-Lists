import java.io.*;
import java.util.*;

public class Question4 {
   
    public Scanner inputStream = null;
    
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
        Question4 file = new Question4();

        Scanner input;
        
        input = file.run(args[0]);
        
        
        LinkedList<String> elements = new LinkedList<String>();
        LinkedList<String> reverse = new LinkedList<String>();
        

        

        while (input.hasNext()) {
            String value=input.nextLine();
            elements.add(value); 
           
        }
        
        for(int k = elements.size()-1 ; k >=0 ; k--){
            reverse.add(elements.get(k));
        }
            
        
        for(int k = 0; k < reverse.size(); k++){ 
            int counter = 0;
            for(int l = 0; l < reverse.get(k).length(); l++){
                if(reverse.get(k).charAt(l) != ' ')
                    counter+=1;
            }
            System.out.println(k+1 + "/" + counter + ": " + reverse.get(k));
        }
        
        if(reverse.size() == 0)
            System.out.println("1/0:");
        
       
        
        
            
            
   }

}