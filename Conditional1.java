class Conditional1
{
    public static void main(String [] arg)
        {
            int age = 18;
            if(age >= 18 && age <= 60)
            {
                if(age >= 18 && age <25)
                {
                    System.out.println("learning phase");
                }
                else if(age >= 25 && age <35)
                {
                    System.out.println("strugling phase");
                }
                else 
                {
                    System.out.println("relaxing phase");
                }
            }
            else
            {
                System.out.println("out of range");
            }
        }
}