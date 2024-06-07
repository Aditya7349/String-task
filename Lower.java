public class Lower {
    public static void main(String[] args) {
    
        String inputString = "RailWorld"; 
        
        
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        
        StringBuilder stringWithoutLowercase = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(c)) {
                uppercaseCount++;
                stringWithoutLowercase.append(c);
            }
        }
    
        System.out.println("Original string: " + inputString);
        System.out.println("Lowercase count: " + lowercaseCount);
        System.out.println("Uppercase count: " + uppercaseCount);
        System.out.println("String without lowercase characters: " + stringWithoutLowercase.toString());
    }
}
