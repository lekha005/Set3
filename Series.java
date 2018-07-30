import java.util.*;
class Series
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int a=in.nextInt();
         int d=in.nextInt();
       int sum=0;
         for(int i=1;i<=n;i++)
         {
            sum=sum+(a+((i-1)*d));
         }
         System.out.print(sum);
}
}
