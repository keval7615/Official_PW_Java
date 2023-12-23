public class Cases1 {
    public static void main(String [] args)
    {
        int persentage = 2;
        switch(persentage)
        {
            case 30 : System.out.println("DD");
            break;
            case 40 : System.out.println("CD");
            break;
            case 50 : System.out.println("BC");
            break;
            case 60 : System.out.println("BB");
            break;
            case 80 : System.out.println("AB");
            break;
            case 100 : System.out.println("AA");
            break;
            default :
            if(persentage>100)
                {System.out.println("invalid number");}
                else
                {System.out.println("your faild....");}
        }
    }
    
}
