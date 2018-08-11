
class test {
  static
   {
      System.out.println("This will be executed first");
   }

   public static void main(String[] args)
   {
     System.out.println("This will be executed main");
   }

   static
   {
     System.out.println("This will be executed after first but still before main");
   }
}
