package StringPrograms;

public class Stringreverse {
   public static void main(String[]args){
       String name ="Kamlesh";
       String rev="";

       for(int i=0;i<name.length();i++){

           rev=name.charAt(i)+rev;
       }
       System.out.println(rev);

   }
}
