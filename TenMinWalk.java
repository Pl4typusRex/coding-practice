public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    
    // first condition - walk must be 10 minutes long
    if (walk.length == 10){
      // second condition - walk must return to starting point
      // starting point 0,0
      int x, y;
      x = y = 0;
      
      for (char i : walk){
        // north/south +/- 1 to x value
        // east/west +/- 1 to y value
        if (i == 'n') { y++; }
        else if (i == 's') { y--; }
        else if (i == 'e') { x++; }
        else if (i == 'w') { x--; }
        else { System.out.println("Error, unexpected character"); }
      }
      
      // check ending coords
      if (x == 0 && y == 0) {
        return true;
      } else {
        return false;
      }
      
    } else {    
      return false;
    }
    
  }
}
