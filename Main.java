import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        Scanner keybaord = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int value = keybaord.nextInt();
        if(value%2 == 0)
        {
            System.out.println("value is even: " + value);
            System.out.println("after dividing it by 2: " + value/2);
        }
        else if(value%2 == 1)
        {
            System.out.println("value is odd: " + value);
            System.out.println("after condition odd value is: " + ((value*3)-1));
        }


    }
}
