package week7;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;

class Main {

    class OddNumberFilter {
        public List<Integer> filterOddNumbers(List<Integer> numbers) {
            return numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .collect(Collectors.toList());
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        OddNumberFilter filter = new Main().new OddNumberFilter();
        List<Integer> oddNumbers = filter.filterOddNumbers(numbers);

        System.out.println(oddNumbers);
    }

    
}