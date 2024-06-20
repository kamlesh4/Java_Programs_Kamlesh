package StringPrograms;

public class Palindrome {

    public static void main(String[]args){

        String name ="nan", palindromename ="";
        // int strlength =name.length();

        for(int i=(name.length()-1);i>=0;--i)
        {
            palindromename=palindromename + name.charAt(i);
        }
        if(name.equals(palindromename)){
            System.out.println("This is palindrome");
        }else
        {
            System.out.println("This is not a palindrome");
        }
    }
}
