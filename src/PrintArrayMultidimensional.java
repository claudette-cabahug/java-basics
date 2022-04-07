import java.util.Arrays;

public class PrintArrayMultidimensional {

  public static void main(String[] args) {
    int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };

    System.out.println(Arrays.deepToString(array)); 
  }
}

// deepToString(array) - to get the numbers from the inner array
// toString(array)) - this would only print the address of the elements (nested array)