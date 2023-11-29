package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            numbers.add((int) (Math.random() * 100) + 1);
        }
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        int summe = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Summe: " + summe);

        List<Integer> verarbeiteteZahlen = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Verarbeitete Zahlen: " + verarbeiteteZahlen);
    }

    }


