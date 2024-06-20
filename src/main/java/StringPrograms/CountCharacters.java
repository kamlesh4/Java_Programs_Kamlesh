package StringPrograms;

public class CountCharacters {
    public static void main(String []args)
    {
        String name ="Kamlesh 1997 Choudhary 14/04/1997";
        int count=0;

        for(int i=0;i<name.length();i++) {
            char kam = name.charAt(i);

            if(Character.isAlphabetic(kam))
                count++;

        }
       System.out.println(count);
    }
}
