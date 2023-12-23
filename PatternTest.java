class PatternTest
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int j=0; j<n; j++)
        {
             for(int i=0; i<n; i++)
            {
                // 5by5 pattern
                System.out.print(" *");
                System.out.print(i+""+j);
            }
        System.out.println();
       }
    }
}