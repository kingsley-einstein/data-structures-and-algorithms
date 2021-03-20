package searching.binary;

import java.util.Arrays;

// import jdk.internal.jshell.tool.resources.l10n;

// import java.util.Collections;

public class BinarySearch {

  public static Integer binarySearch(int[] numbers, int value) {
    Arrays.sort(numbers);

    int low = 1;
    int high = numbers.length;
    int mid = 0;

    while (numbers[mid] != value) {
      if (high < low) return -1;

      mid = low + Math.floorDiv(high - low, 2);

      if (numbers[mid] < value) low = mid + 1;

      if (numbers[mid] > value) high = mid - 1;

      if (numbers[mid] == value) return mid;
    }

    return mid;
  }

  public static void main(String... args) {
    Integer a = BinarySearch.binarySearch(new int[] { 1, 5, 6, 9, 10, 21 }, 9);
    Integer b = BinarySearch.binarySearch(new int[] { 9, 8, 4, 12, 5 }, 4);
    Integer c = BinarySearch.binarySearch(new int[] { 0, 6, 7, 10 }, 1);

    System.out.println(" a ==> " + a);
    System.out.println(" b ==> " + b);
    System.out.println(" c ==> " + c);
  }
}
