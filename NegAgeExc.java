import java.util.*;
class AgeException extends Exception
{
    public AgeException(String str)
    {
        System.out.println(str);
    }
}
public class NegAgeExc {
    public static void main (String [] args)
    {
       int age=0;
        System.out.println("Enter your age:");

        Scanner a =new Scanner(System.in);
        
        age =a.nextInt();

         try{
             if(age < 0)
              throw new AgeException("Invalid age");
                  else System.out.println("valid age");

}
                  catch( Exception e)
     { 
                        System.out.println(e.toString());

     }

    }
}

