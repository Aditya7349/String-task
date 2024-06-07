public class Concat {
    public static void main(String args[]){
        String firstName="Aditya";
        String lastName="Bhargav";
        String s1="java";
        String s2="java";
        String s3=new String("java");
        String fullName=firstName+" "+lastName;
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.concat(" "+"Rajput"));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals("java"));
        System.out.println(s3.equalsIgnoreCase("Java"));
        System.out.println(fullName.length());
    }
}
