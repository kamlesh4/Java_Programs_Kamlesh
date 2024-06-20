package StringPrograms;

public class PanctuationChar {

    public static void main(String[]args){

        String name="At last, print the count variable that gives the total number of punctuations.";
        int count=0;

    for(int i=0;i<name.length();i++){
       if(name.charAt(i)=='.'||name.charAt(i)==';'||name.charAt(i)=='?'||name.charAt(i)==','){
           count++;


       }
    }
        System.out.println("The number of punctuations:"+count);
    }
}
