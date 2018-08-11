class testing {
  public static void main(String[] args)
  {
    int n,k;

    Scanner s=new Scanner(System.in)
    n=s.nextInt();
    k=s.nextDouble();
    int query,divisible=0;
    for(int i=1;i<=n;i++)
    {
      query=s.nextInt();
      if(query%k==0)
      {
        divisible++;
      }
    }

    System.out.println(""+divisible);

  }
}
