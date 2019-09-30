public class Solution {

  public static boolean validatePin(String pin) {
    
    Boolean result = false;
    
    if (pin.matches("^[0-9]{4}$") || pin.matches("^[0-9]{6}$")) {
      result = true;
    }
    
    return result;
  }

}
