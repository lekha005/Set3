import java.util.*;
class Posi
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int[] a=new int[n];
         int c=0;
         for(int i=0;i<n;i++)
         { 
             a[i]=in.nextInt();
             System.out.println(a[i]+" "+i);
         }
}
}
