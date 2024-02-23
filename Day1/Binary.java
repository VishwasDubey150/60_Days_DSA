public class Binary
{

    public static int bin(int arr[],int n)
    {
        int start = 0;
        int end = arr.length;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(arr[mid] == n)
            {
                return mid+1;
            }
            if(arr[mid]<n)
            {
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10,13,18};
        int n=6;
        int ans=bin(arr,n);
        System.out.println(ans);
    }
}