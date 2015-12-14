import java.util.Scanner;
import java.util.Arrays;
public class DiffOfTwo
{
    public static void main(String[] args)
	{
	 	    int arr[] = {1,5,3,4,2,6};
	 	    int n=0;
	 	    for (int i =0;i<arr.length;i++)
	 	    {
	 	        for(int j=0;j<arr.length;j++)
	 	        {
	 	           int k=arr[i]-arr[j];
	 	           
	 	           if (k ==2)
	 	           {
	 	               int a= arr[i];
	 	               int b = arr[j];
	 	               
	 	               System.out.println(a+"and"+b);
	 	               n++;
	 	           }
	 	           
	 	        }
	 	       
	 	    }
	 	     System.out.println("there are"+n+"pairs with difference of two");
	}
}
	    