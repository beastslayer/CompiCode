import java.io.*;
import java.util.*;

class test {
  public static void main (String[] args)
  {
    Scanner s=new Scanner(System.in);
    int query=s.nextInt();
    int a,b,n;
    for(int g=1;g<=query;g++)
    {
        a=s.nextInt();
        b=s.nextInt();
        n=s.nextInt();

        for (int lp=0;lp<n;lp++)
        {
          a=a+b;
          System.out.print(a+b);
          b=b*2;
        }
    }
  }
}
