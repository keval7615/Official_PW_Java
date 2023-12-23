class PW77typecast 
{
    public static void main(String[] args) {
    
    int s=12;
    double b;
     //..implicite typecast
    b=s;
    System.out.println(b);

    //..exlicite typecast
        double bi=13.87878;
        int sm;
       // sm=bi;  ce
        sm=(int)bi;
        System.out.println(bi);

        int x=3;
        int y=5;
        float f=7;
        float r=x/y; 
           // i/i  both are int thatswhy ans is int either you specify different
           float d=x/f;
           //i/f   if atliast 1is float ans os float
           
        System.out.println(r);
        System.out.println(d);
       





    }
   
}
