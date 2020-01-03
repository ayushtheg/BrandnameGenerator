import java.util.*;
public class BrandName {
    public static void main (String[] args) {
        System.out.println("Brand Name Generator-- Ayush Gaur\n");
        int size;
        //Returns  10 brandnames through 10 method calls
        for (int i = 1; i <= 10; i++) {
            //Random size set between 6 and 12
            size = (int)(Math.random() * 7) + 6;
            String output = generateName(size);
            System.out.println(i + ") " + output);
        } 
    } 
    public static String generateName(int length) {
       //arrays for consonants and vowels
        String[] consonants = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","x","z"};
        String[] vowels = {"a","e","i","o","u"};
        int randoconso;
        int randovowel;
       //Creates array which will contain the charactars of the brand name
        String[] brandname = new String[length];
       //Slots in random consonant for odd digits and vowels for even digits
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                randoconso = (int)(Math.random()*18)+1;
                brandname[i] = consonants[randoconso];
            }
            else if (i % 2 == 1) {
                randovowel = (int)(Math.random()*4)+1;
                brandname[i] = vowels[randovowel];
            }
        } 
       //Capitalizes the first digit of the string
       String name = String.join("", brandname);
       String first = name.substring(0,1);
       name = first.toUpperCase() + name.substring(1);
      //returns a brand name
       return name;
    }
}
            

