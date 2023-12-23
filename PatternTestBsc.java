class PatternTestBsc
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=0; i<n; i++)
        {
             for(int j=0; j<n; j++)
            {
                // 5by5 pattern
                System.out.print(" ["+i+"]"+"["+j+"]");
            }
        System.out.println();
       }
    // int n=8;
    // for(int i=0; i<n; i++)
    // {
    //     for(int j=0; j<n; j++)
    //     {
    //         if(j==0 || j<(n-1)/2 && i==0 || i>0 && j==(n-1)/2 && i<n-1 || j<(n-1)/2 && i==n-1)
    //         {
    //             System.out.print(" *");
    //         }
    //         else
    //         {
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // }
}}