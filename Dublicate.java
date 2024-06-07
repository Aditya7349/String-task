public class Dublicate {
    public static void main(String[] args) {
        
        String inputString = "programming"; 
        
        
        String resultString = removeDuplicates(inputString);
        
        System.out.println("Original string: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }
    
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; 
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seen[currentChar]) {
                seen[currentChar] = true;
                result.append(currentChar);
            }
        }
        
        return result.toString();
    }
}
