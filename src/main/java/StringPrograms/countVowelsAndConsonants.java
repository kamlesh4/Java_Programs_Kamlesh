package StringPrograms;

import java.util.Locale;

public class countVowelsAndConsonants  {
    public static void main(String[]args){
        String name="This is a really simple sentence" ;

        int vCount=0,cCount=0;

         name=name.toLowerCase();

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
            vCount++;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           }
            else if (name.charAt(i)>='a' && name.charAt(i)<='z') {
                cCount++;

            }
        }
    //System.out.println("Here the vowels and Consonants list :"+vCount+" "+cCount);
        System.out.println("Vowels list :" +vCount);
System.out.println("Consonants List :" +cCount);


    }

}
