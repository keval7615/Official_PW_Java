public class Tenaryop {
    public static void main(String [] args)
    {
        int a=5;
        int b=3;
        int c=6;
        String result = a<b?"a is smaller":"b is smaller";
        System.out.println("between a & b");
        System.out.println(result);

            int res = (a<b)?(a<c)?a:b:(b<a)?b:c;
                    System.out.println(res);

    }
}
