public class largest{

    public static int lar(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String args[])
    {
        int arr[]={9,33,1121,55,2,667};
        int ans=lar(arr);
        System.out.println(ans);
    }
}