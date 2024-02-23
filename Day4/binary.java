import java.util.*;
public class binary
{

    public static int bin(int arr[],int start,int end,int key)
    {
        if(start>=end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;

        if(arr[mid]==key)
        {
            return mid+1;
        }
        if(arr[mid]>key)
        {
            return bin(arr,start,mid-1,key);
        }
        if(arr[mid]<key)
        {
            return bin(arr,mid+1,end,key);
        }
    return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 14;
        int start = 0;
        int end =arr.length-1;
        System.out.print(bin(arr,start,end,key));
    }
}