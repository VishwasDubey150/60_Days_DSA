public class sod{

    public static int s_o_d(int n)
    {
        if(n<1)
        {
            return 0;
        }
        int a=n%10;
        return a+s_o_d(n/10);
    }

    public static void main(String args[])
    {
        int n=123;
        System.out.print(s_o_d(n));
    }
}