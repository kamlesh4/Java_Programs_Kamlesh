package StringPrograms;

import javax.sound.midi.SysexMessage;

public class Uppercase {

    public static void main(String[]args){
        String kam="Kamlesh Choudhary";

        for(int i=0;i<kam.length();i++){
            char name=kam.charAt(i);
          if(Character.isUpperCase(name))

              System.out.print("" +name +"");

        }


    }


}

