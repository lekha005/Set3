import java.util.*;
class Hr
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         String[] a=in.nextLine().split(" ");
         String[] b=in.nextLine().split(" ");
         for(int i=0;i<a.length;i++)
         {
             int c=Integer.valueOf(a[i]);
             int cc=Integer.valueOf(b[i]);
             System.out.print(Math.abs(c-cc)+" ");
         }
}
}
