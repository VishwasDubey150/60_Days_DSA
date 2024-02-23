public class reverse
{

    public static void swap(int f, int l,int[] arr)
    {
        int temp=arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }

    public static void rev(int arr[])
    {
        int start=0;
        int end= arr.length-1;

        while(start<=end)
        {
            swap(start,end,arr);
            start++;
            end--;
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        rev(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}