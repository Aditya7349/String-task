public class Repeated{
    public static void main(String[] args) {
        
        String inputString = "swiss"; 
        
        char firstNonRepeatedChar = 0;
        int[] charCount = new int[256]; 
    
        for (char c : inputString.toCharArray()) {
            charCount[c]++;
        }

        for (char c : inputString.toCharArray()) {
            if (charCount[c] == 1) {
                firstNonRepeatedChar = c;
                break;
            }
        }
        if (firstNonRepeatedChar != 0) {
            System.out.println("The first non-repeated character in the string \"" + inputString + "\" is: " + firstNonRepeatedChar);
        } else {
            System.out.println("There are no non-repeated characters in the string \"" + inputString + "\".");
        }
    }
}
