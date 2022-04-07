public class FrequencyCharString {
  public static void main(String[] args) {
    String str = "This website is awesome.";
    char ch = 'e';
    int frequency = 0;

    for (int i = 0; i < str.length(); i++) {
      if (ch == str.charAt(i)) {
        ++frequency;
      }
    }

    System.out.println("Frequency of " + ch + " = " + frequency);
  }
}

// We loop through each character in the string using charAt() function 
// which takes the index (i) and returns the character in the given index.