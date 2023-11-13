import java.sql.SQLOutput;

public class String_Method {
    public static void main(String[] args) {
        String name = "Rohit";
        int lengtha = (name.length()); //Length of String
        System.out.println(lengtha);

        System.out.println(name.toUpperCase()); // Upper Case

        System.out.println(name.toLowerCase()); // Lower Case

        String nts = "     xyz      "; // trim
        String nts2 = (nts.trim());
        System.out.println(nts2);
        System.out.println(nts.trim());

        System.out.println(name.substring(3));

        System.out.println(name.substring(2));

        System.out.println(name.replace("R","M")); // Replace

        System.out.println(name.startsWith("Ro")); // returns true if string start with given character

        System.out.println(name.endsWith("S")); // returns true if string ends with S

        System.out.println(name.charAt(2)); // returns character at given index

        System.out.println(name.indexOf("R")); // returns the index of given string
        System.out.println(name.indexOf("i"));

        System.out.println(name.lastIndexOf("t")); // returns the last index of given string

        System.out.println(name.lastIndexOf("t",3)); //return the last index of given string before given index

        System.out.println(name.equals("Rohit")); // returns true if the string is equals to given string
        System.out.println(name.equals("xyz"));

        System.out.println(name.equalsIgnoreCase("rohit")); // returns true if the string is equals ignoring the Case to given string






    }
}
