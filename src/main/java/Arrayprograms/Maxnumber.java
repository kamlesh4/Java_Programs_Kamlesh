package Arrayprograms;

public class Maxnumber {

    public static void main (String[]args){

        int a[]= {2,4,8,-3};
        int max=a[0];
        int min=a[0];
        for(int i=0;i<a.length;i++){

            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
    }
}
