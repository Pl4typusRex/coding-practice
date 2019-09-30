public class Troll {
    public static String disemvowel(String str) {
        
        // vowel array and converting string to StringBuilder to be able to easily remove individual characters
        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        
        for (String s : vowels){
          str = str.replace(s, "");
        }
        
        return str;
    }
}
