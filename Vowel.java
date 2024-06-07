public class Vowel {
    public static void main(String[] args) {
        String inputString = "Hello World"; 
        int vowelCount = countVowels(inputString);
        System.out.println("The number of vowels in the string \"" + inputString + "\" is: " + vowelCount);
    }
    
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        
        return count;
    }
}
