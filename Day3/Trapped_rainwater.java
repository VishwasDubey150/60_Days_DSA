import java.util.*;
public class Trapped_rainwater
{

    public static int trap(int arr[])
    {
        int h=arr.length;

        int left_max[]=new int[h];
        left_max[0]=arr[0];
        for(int i=1;i<h;i++)
        {
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }

        int right_max[]=new int[h];
        right_max[h-1]=arr[h-1];
        for(int i=h-2;i>=0;i--)
        {
            right_max[i]=Math.max(arr[i],right_max[i+1]);
        }

        int water=0;
        for(int i=0;i<h;i++)
        {
            int wl=Math.min(left_max[i],right_max[i]);
            water=water+(wl-arr[i]);
        }
        return water;
        
    }


    public static void main(String args[])
    {
        int arr[]={4,2,0,6,3,2,5};
        int ans=trap(arr);
        System.out.println(ans);
    }
}