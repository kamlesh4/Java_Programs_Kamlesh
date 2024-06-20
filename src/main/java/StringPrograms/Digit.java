package StringPrograms;

public class Digit {
    public static void main(String[]args){

        String name="Kamlesh 1997 Choudhary";

        for(int i=0;i<name.length();i++){
             char kam=name.charAt(i);
             if(Character.isDigit(kam))
                 System.out.print(kam);
        }
    }
}
