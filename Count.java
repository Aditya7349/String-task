import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        
        System.out.print("Enter the character to count: ");
        char characterToCount = scanner.next().charAt(0);
        
        
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == characterToCount) {
                count++;
            }
        }
        
        
        System.out.println("The character '" + characterToCount + "' occurs " + count + " times in the string.");
        
        scanner.close();
    }
}
