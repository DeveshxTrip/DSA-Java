import java.util.Scanner;
import java.util.Arrays;
public class Switch {
    public static void main(String[] args) {
        Scanner swi = new Scanner(System.in);
        String fruits = swi.nextLine();

        switch (fruits){
            case "mango" -> System.out.println("maa ki chut");
            case "orange" -> System.out.println("maa ka bosda");
            case "apple" -> System.out.println("behen ki chut");
            case "grapes" -> System.out.println("behen ka bosda");
            default -> System.out.println("gaandu");
        }
        int arr [] ={1,2,3,4,5,6};
        System.out.println(arr[2]);



    }
    
}
