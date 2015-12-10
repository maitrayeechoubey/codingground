import java.util.Scanner;
import java.util.Arrays;
public class ArmstrongNum
{
    public static void main(String[] args)
	{

       Scanner input = new Scanner(System.in);
       int num,len,onum;
       System.out.println("Enter any number");
       num= input.nextInt();
       onum= num;
       len=Integer.toString(num).length();
       int[] armnum= new int[len];
       for(int i =(len-1);i>=0;i--)
        {
        armnum[i]=num%10;
        num=num/10;
        }
        //System.out.println(armnum[2]);
        
       int[] cubenum = new int[len];
       for(int i =(len-1);i>=0;i--)
        {
         cubenum[i]=armnum[i]*armnum[i]*armnum[i];
        }
      //System.out.println(cubenum[2]);
        
       int sum=0;
       for(int i=0;i<len;i++)
        {
            sum=sum+cubenum[i];
        }
        //System.out.println(sum);
          //System.out.println(onum);
       if (sum==onum)
        {
             System.out.println("Its Armstrong Number");
        }
       else
            System.out.println("Its not an Armstrong Number");
    }
}

    