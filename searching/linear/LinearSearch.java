package searching.linear;

public class LinearSearch {

  public static Integer linearSearch(int[] numbers, int value) {
    for (int i = 0; i < numbers.length; i++) if (numbers[i] == value) return i;

    return -1;
  }

  public static void main(String... args) {
    Integer a = LinearSearch.linearSearch(new int[] { 1, 5, 6, 9, 10, 21 }, 9);
    Integer b = LinearSearch.linearSearch(new int[] { 9, 8, 4, 12, 5 }, 4);
    Integer c = LinearSearch.linearSearch(new int[] { 0, 6, 7, 10 }, 1);

    System.out.println(" a ==> " + a);
    System.out.println(" b ==> " + b);
    System.out.println(" c ==> " + c);
  }
}
