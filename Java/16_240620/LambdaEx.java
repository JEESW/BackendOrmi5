import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    //    Iterator<Integer> iter = numbers.iterator();
    //
    //    while (iter.hasNext()) {
    //      Integer next = iter.next();
    //      if (next % 2 == 0) {
    //        iter.remove();
    //      }
    //    }

    numbers.removeIf(i -> i % 2 == 0);

    System.out.println(numbers);
  }
}
