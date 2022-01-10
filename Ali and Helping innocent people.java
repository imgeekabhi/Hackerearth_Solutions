import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(((Integer.parseInt(String.valueOf(str.charAt(0))) + Integer.parseInt(String.valueOf(str.charAt(1)))) %2==0) &&
            ((Integer.parseInt(String.valueOf(str.charAt(3))) + Integer.parseInt(String.valueOf(str.charAt(4))))%2==0) &&
            ((Integer.parseInt(String.valueOf(str.charAt(4))) + Integer.parseInt(String.valueOf(str.charAt(5))))%2==0) &&
            ((Integer.parseInt(String.valueOf(str.charAt(7))) + Integer.parseInt(String.valueOf(str.charAt(8))))%2==0)  
        )
        {
                if(
                    (str.charAt(2) == 'A') ||
                    (str.charAt(2) == 'E') ||
                    (str.charAt(2) == 'I') ||
                    (str.charAt(2) == 'O') ||
                    (str.charAt(2) == 'U') ||
                    (str.charAt(2) == 'Y') 
                ){
                    System.out.println("invalid");
                }else{
                    System.out.println("valid");
                }
            }else{
                System.out.println("invalid");
            }
        
            
    }
}
