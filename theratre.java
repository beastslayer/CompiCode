import java.util.*;

public class theatre
{
	public static void main(String[] args)
	{
		int n,m,a;

		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		a=s.nextInt();

		double area_of_tile=a*a;
		double area_of_plot=m*n;

		System.out.println(String.valueOf(area_of_plot));
		System.out.println(String.valueOf(area_of_tile));
	}
}