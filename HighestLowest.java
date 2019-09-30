import java.util.*;

public class Kata {
  public static String HighAndLow(String numbers) {
    
    // split the string
    String[] split = numbers.split(" ");
    int[] num = new int[split.length];

    
    for (int i = 0; i < split.length; i++) {
      int value = Integer.parseInt(split[i]);
      num[i] = value;
    }
    
    Arrays.sort(num);

    return num[num.length-1] + " " + num[0];
    
  }
}
