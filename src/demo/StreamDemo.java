package demo;

import model.Invoice;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> strings = Arrays.asList("Uğur", "Nasira", "Caner", "Ramazan", "Merve");
        List<Invoice> invoices = Arrays.asList(
                new Invoice(1, 100, 2),
                new Invoice(2, 200, 2),
                new Invoice(3, 300, 2)
        );

        int sum = integers.stream().reduce((Integer::sum)).orElse(0);
        int size = integers.size();
        System.out.println(sum / size);

        int max = integers.stream().reduce((a,b) -> a > b ? a : b).orElse(-1);
        System.out.println(max);

        int min = integers.stream().reduce((a,b) -> a < b ? a : b).orElse(-1);
        System.out.println(min);

        String firstString = strings.stream().reduce((a,b) -> myCompare(a,b) ? a : b).orElse(null);
        System.out.println(firstString);
        String lastString = strings.stream().reduce((a,b) -> myCompare(a,b) ? b : a).orElse(null);
        System.out.println(lastString);

        double invoiceSum = invoices.stream().map(x -> x.getPrice() * x.getQuantity()).reduce(Double::sum).orElse(0.);
        System.out.println(invoiceSum);

        Stream.generate(() -> new Random().nextInt(100)).limit(20).forEach(System.out::println);
    }

    /**
     * @param a first string to compare
     * @param b second string to compare
     * @return true if first string is lead of alphabet, false if first string and second string is equal each other
     * or second string is lead of alphabet
     */
    public static boolean myCompare(String a, String b){
        return a.compareToIgnoreCase(b) < 0;
    }
}