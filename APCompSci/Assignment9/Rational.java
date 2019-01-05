class Rational
{
  public int den;
  public int num;
  
  public Rational(int d,int n)
  {
     den = d;
     num = n;
  
  }
  
	public void displayData()
	{
		System.out.println();
		System.out.println(getNum() + "/" + getDen() + " equals " + getDecimal());
		System.out.println();
	}
   public int getDen()
   {
      return den;    
   }
   private float getDecimal()
   {
     return (float)num/den;
   }
   private int getNum()
   {
     return num;
   }
   
   
   
	 private void getGCF(int n1,int n2)
	{
 		int rem = 0;
 		do
 		{
 			rem = n1 % n2;
 			if (rem == 0)
 				n1 = n2;
 			else
 			{
 				n1 = n2;
 				n2 = rem;
 			}
 		}
 		while (rem != 0);
 	}
   }