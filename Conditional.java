public class Conditional {
    public static void main(String[] args) 
    {
        int age =15;
        if(age>=18 && age<45)
        {
            System.out.println(age>=18 && age<45);
            System.out.println("you are still younger");
            
        }
        else if(age>45)
        {   
            System.out.println(age>45);
            System.out.println("you are to old");
        }
        else
        {
            System.out.println("you are such baby");
        }
    }
    
}