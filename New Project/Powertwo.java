import java.util.Scanner;
public class Powertwo
{
    public static void main(String[] args)
	{
          Scanner input = new Scanner(System.in);
          int num;
          int x=1;


          System.out.println("Enter any number");
          num= input.nextInt();
              
          if (num%2==0)
              {
                 int y=0;

                 for (int i=1;y==0 && num>1;i++)
                     
                     {

  			 y=num%2;
                         num=num/2;
  			 
  			 x=i;
				}
		
		if(y==0)
			{
				System.out.println("Yes the number is power of 2");
				System.out.println("And the power is" +x);
				
				}
                

	        else
                  		System.out.println("Number is not the power of 2");


 
	       }

           else
	       System.out.println("Number is not the power of 2");

               }
}