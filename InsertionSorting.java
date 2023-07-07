import java.util.*;
class InsertionSorting
{
    public static void main()
    {
        int arr[]={5,9,2,8,1,7,4,6};
        int i , j , t;
        System.out.println("Original Array values");
        for(i=0;i<=7;i++)
        {
            System.out.print(arr[i]+ " , ");
        }
        System.out.println();
        for(i=1;i<=7;i++)
        {
            t=arr[i];
            j=i;
            while(j>0 && arr[j-1]>t)// arr[j-1]<t for arranging the values in descending order
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=t;
        }
        System.out.println("Sorted Array");
        for(i=0;i<=7;i++)
        {
            System.out.print(arr[i]+ " , ");
        }
    }
}
