public class sum_sub_1
{

    public static int sum(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=i;j<arr.length;j++)
            {
                int s=0;
                int end = j;
                for(int k=start;k<=end;k++)
                {
                    s=s+arr[k];
                }
                System.out.println(s);
                System.out.println();
            
                if(max<s)
                {
                    max=s;
                }
            }
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[]={2,4,6,8};
        int ans=sum(arr);
        System.out.println(ans);
    }
}