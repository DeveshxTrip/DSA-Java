import java.util.Scanner;
import java.util.Arrays;
public class Arr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    
    String[] str = new String[4];
    for (int i = 0; i<str.length;i++){
        str[i]=inp.nextLine();
    } 
    
System.out.println(Arrays.toString(str));
}
    
}
