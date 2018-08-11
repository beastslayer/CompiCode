import java.util.*;
import java.io.*;

class test {

  public static void main (String[] args)
  {
    int x;
    double y;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    y=s.nextDouble();
    double balance=y-(x+0.5);

    if(balance>0)
    {
      System.out.println(balance+"");
    }
    else
    {
      System.out.println(""+y);
    }
  }
}
