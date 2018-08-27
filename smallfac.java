import java.util.*;
import java.io.*;

class testing {
  public static void main(String[] args)
  {
    int testcases;

    Scanner sc=new Scanner(System.io);

    testcases=sc.nextInt();
    int n;
    int array[200];

    for (int v=1;v<=testcases;v++)
    {
        n=sc.nextInt();
        for(int x=n-1;x>=1;x--)
        {
          n=n*x;
        }
        System.out.print(n);
    }
  }
}
