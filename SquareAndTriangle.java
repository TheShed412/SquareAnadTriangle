class SquareAndTriangle
{
  public static void main(String[] args)
  {
    int both = 0;
    int n = 2;
    System.out.println("Well 0 and 1 are obvious answers! But hopefully there are more...");
      while(both < 10){
        for(int m=1; m<=(n*n); m++){
          boolean foundOne = (n*n == (m*(m+1))/2);
          if (foundOne){
            System.out.println("Matt, "+(n*n)+" is one!");
            System.out.println("m: "+m);
            System.out.println("n: "+n);
            both++;
          }//if
        }//for
        n++;
      }//while
      System.out.println("And there are the first 10 that aren't 0, and 1!");
  }//main
}//class
