public class revesre
{

    public static int rev(int n)
    {
        if(n<=0)
        {
            return n;
        }
        return (n%10) + rev(n/10);
    }

    public static void main(String args[])
    {
        int n = 1234;
        System.out.println(rev(n));
    }
}