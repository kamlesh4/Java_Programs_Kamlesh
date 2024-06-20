package StringPrograms;

import java.util.Scanner;

public class Lowercase {
   public static void main (String[]args){


       String name="GGGGGG  gggggg";
        String count ="";


       for (int i=0;i<name.length();i++){
           char namee=name.charAt(i);

           if(Character.isLowerCase(namee))
               System.out.print(namee+""+count);




       }

   }
}

