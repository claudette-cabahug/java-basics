public class SortStringsAlphabetical {
  public static void main(String[] args) {

    String[] words = { "Ruby", "C", "Python", "Java" };

    for (int i = 0; i < 3; ++i) {
      for (int j = i + 1; j < 4; ++j) {

        if (words[i].compareTo(words[j]) > 0) {

          // swap words[i] with words[j[
          String temp = words[i];
          words[i] = words[j];
          words[j] = temp;
        }
      }
    }

    System.out.println("In lexicographical order:");

    for (int i = 0; i < 4; i++) {
      System.out.println(words[i]);
    }
  }
}

// The compareTo() method compares two strings lexicographically - based on Unicode value of each character

// returns 0 if the string is equal to the other string
// < 0 is returned if the string is less than the other string (less characters)
// > 0 if the string is greater than the other string (more characters)