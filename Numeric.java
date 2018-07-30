import java.util.*;
class Numeric
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         String a=in.next();
         int c=0;
         for(int i=0;i<a.length();i++)
         { 
             int y=Integer.valueOf(a.charAt(i))-'0';
             if(y>=0 && y<=9 || y=='.')
             {
                 c++;
             }
         }
         if(c==a.length()-1)
         {
         System.out.print("yes");
         }
         else
         {
             System.out.print("no");
         }
}
}
