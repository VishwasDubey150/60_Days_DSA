public class countzero
{

    public static int count(int n,int c)
    {
        if(n<=0)
        {
            return c;
        }
        else if(n%10 == 0)
        {
            return count(n/10,c+1);
        }
        else {
            return count(n/10,c);
        }
    }

    public static void main(String args[])
    {
        int n=10010;
        int c=0;
        System.out.print(count(n,c));
    }
}