public class Fibonacci_Secuencial 
{
    static int n1=1,n2=1,n3=0;
    public static void main(String[] args) 
    {
        int a=5;
        System.out.print(0+", "+n2);
        getFibonacci(a-2);
        System.out.print("\n");
    }
    static void getFibonacci(int b)
    {
        if(b>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(", "+n3);
            getFibonacci(b-1);
        }
    }
}
