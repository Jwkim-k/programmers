import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a;
        String result = "";
        
        for(int i=0; i<str.length(); i++) {
            a = str.charAt(i);
            
            if(Character.isUpperCase(a)){
                result += Character.toLowerCase(a);
            }
            else {
                result += Character.toUpperCase(a);
            }
        }
        System.out.println(result);
        
    }
}