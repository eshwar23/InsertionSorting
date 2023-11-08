/*
  Write a program to input ten values in an array , arrange the values in ascending order using 
  Exchange Selection Sorting
  // swap the position of value present at outer loop (i) with the lowest value of the unsorted part of the array
 */
import java.util.*;
class P9_ExchangeSelectionSort
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int arr[]=new int[10];
        int i, j , min,minp,t;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a value");
            arr[i]=in.nextInt();
        }
        System.out.println("Original Values of the array");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ,");
        }
        System.out.println();
        // Exchange Selection Sort Code
        for(i=0;i<10;i++)// external loop
        {
            min=arr[i];
            minp=i;
            for(j=i;j<10;j++)// internal loop-- responsible for finding the min value repeatedly
            {                
                if(arr[j]<min)//For arranging in descending order if(arr[j]>max)
                {
                    min=arr[j];
                    minp=j;
                }
            }
            // code for swapping
            t=arr[i];
            arr[i]=arr[minp];
            arr[minp]=t;
        }
        System.out.println("Values of the array after sorting");
        for(i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ,");
        }
        
    }
}
