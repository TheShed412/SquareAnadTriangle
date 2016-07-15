class SquareAndTriangle
{
  public static void main(String[] args)
  {
    int both = 0;
    int n = 2;
    boolean foundOne;
    System.out.println("Well 0 and 1 are obvious answers! But hopefully there are more...");
      while(true){
        for(int m=n; m<=(n*n); m++){
          foundOne = (n*n == (m*(m+1))/2);
          if (foundOne){
            System.out.println("Matt, "+(n*n)+" is one!");
            System.out.println("m: "+m);
            System.out.println("n: "+n);
            both++;
            System.out.println("Place: "+both);
          }//if
        }//for
        n++;
      }//while
  }//main
}//class
