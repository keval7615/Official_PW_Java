public class Case2 {
    public static void main(String [] args)
    {
        int a = 40,b = 50;
        System.out.println("Wellcome to temprary *Calculator*");
        System.out.println(">>choose operation \n1> '+'\n2> '-'\n3> '*'\n4> '/'");
        char opr = '-';
        switch(opr)
        {
            case '+' :System.out.println(a+b+"  addition");
            break;
            case '-' :System.out.println(a-b+"  subtract");
            break;
            case '*' :System.out.println(a*b+"  multiplication");
            break;
            case '/' :System.out.println(a/b+"  divide");
            break;
            default :System.out.println("chossen from +,-,*,/");
            
        }
    }
    
}
