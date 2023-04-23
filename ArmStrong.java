class ArmStrong{
  public static int Arm(int x){
    int z=x;
    int sum=0;
    int dc=count(int x);
     while(x!=0)
       {
        int d=x%10;
        sum=sum+ pow(d,dc);
        x=x/10;
       }
       return sum==z;
    }

  public static int count(int n)
    {
      int count=0;
       while(n!=0)    
        {
          count++;
           n=n/10;
        }
      return count;
   }
   
public static int pow(int n,int p)
  {
     int prod=1;
      while(p>1)
       {
        prod=prod*n;
        p--;
        }
      return prod;
   }
     