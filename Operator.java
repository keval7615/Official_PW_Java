class Operator 
{
    public static void main(String[] args)
    {
     int a=5;
     int b;

        //System.out.println(a++); simpli print 5 and after inc by 1
        //a++;  
        //System.out.println(a); >>>6
        
        //System.out.println(++a); //first incriment and than print 6
    /*  b= ++a + a++ + --a;
        System.out.println(a);
        System.out.println(b);*/
        //  5     7     8     8     8    8 
        b= a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(a);
        System.out.println(5+7+8+8+8+8);
        System.out.println(b);

        

    }
}