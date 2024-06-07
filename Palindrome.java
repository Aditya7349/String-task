public class Palindrome {
    public static void main(String[] args) {
        String inputString = "racecar"; 
        
    
        boolean isPalindrome = isPalindrome(inputString);
        
        if (isPalindrome) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
