public class Ternaryopr
{
    public static void main(String[]args)
    {
        int a=40;
        int b=20;
        int d=30;
        int c=(a>b)?a:b;
        //between two num
        System.out.println(""+c);
        
        System.out.println((a>b)?"ais big":"b is big");     // withoout storing variable; >> either i use string;
        System.out.println(c=(a>b)?a:b);

        // between three num
        int res_add=a>b?a>d?a:d:b>d?b:d;
        System.out.println(res_add);
        System.out.println("MAXIMUM IS FOLLOWING");
        // (a>b)?(a>d?a:d):(b>d?b:d);
        System.out.println(a>b?a>d?a:d:b>d?b:d);
        
        System.out.println("MINIMMUM IS FOLLOWING");
        // (a<b)?(a<c?a:c):(b<a?b:c);
        System.out.println((a<b)?(a<c?a:c):(b<a?b:c));
        
}
    }
   