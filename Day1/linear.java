import java.util.Scanner;
public class linear
{

    public static int lin(int arr[],int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={9,33,112,55,2,667};
        int n=667;
        int ans=lin(arr,n);
        System.out.println(ans);
    }
}