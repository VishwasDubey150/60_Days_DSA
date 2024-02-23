import java.util.*;
public class twoD
{

    public static void ans(int arr[][],int key)
    {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.print(i+1 +","+ j+1);
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m=3;
        int n=3;
        int arr[][]=new int[m][n];



        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int key=4;
        ans(arr,key);

    }
}