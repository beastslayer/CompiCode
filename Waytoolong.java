import java.util.*;


public class test
{
  public static void main(String[] args)
  {
    int n,l;
    String string;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int x=0;x<n;x++)
    {
      string=s.nextLine();
      l=s.lenght();

      if(l>10)
      {
        System.out.println(s.charAt(0)+String.valueOf(l-2)+s.charAt(l-1));
      }
      else
      {
          System.out.println(s);
      }
    }

  }
}
