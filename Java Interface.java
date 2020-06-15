
class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int i=0,f=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f+=i;
            }
        }
        return f;
    }
}
//Write your code here

