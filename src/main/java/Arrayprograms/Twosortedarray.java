package Arrayprograms;

public class Twosortedarray {
    public static void main(String[]args){
         int a[]={2,3,5,8,9};
         int b[]={10,25,88,99};

         int a_leng=a.length;
         int b_leng=b.length;
         int c_leng=a.length+b.length;

         int c[]=new int[c_leng];

         for (int i=0;i<a_leng;i++)
        {
            c[i]=a[i];
        }
         for(int i=0;i<b_leng;i++){
             c[a_leng+i]=b[i];
         }
         for(int i=0;i<c_leng;i++){
             System.out.print(c[i]+"");
         }





    }
}
