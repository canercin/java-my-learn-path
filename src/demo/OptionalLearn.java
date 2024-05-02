package demo;

import model.Invoice;
import java.util.Optional;

public class OptionalLearn {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.empty(); // boş bir optional nesnesi oluşturur.
        // String str1 = opt1.get(); // opt1 nesnesi içinde bulunan veriyi alır.
        // string değeri barındırabilen opt2 nesnesine string değer atama
        Optional<String> opt2 = Optional.of("example1"); // null değer kabul etmez
        // object tipinden nesne barındıran opt3 nesnesine null kabul edebilen değer ekleme
        Optional<Object> opt3 = Optional.ofNullable(null); // null değer kabul eder
        // opt2 nesnesinde değer varsa true yoksa false değer çıkartır.
        boolean bool = opt2.isPresent(); // içinde değer var mı kontrol eder
        System.out.println(bool);
        // orElse ve türevlerinin kullanımı -- orElse kontrol eder devamını ona göre yapar.
        Object obj = opt3.orElse(null); // doğrudan bir nesne değeri atama
        obj = opt3.orElseGet(Invoice::new); // lambda func ile değer atama
        opt2.orElseThrow(NullPointerException::new); // hata fırlatma
        // ifPresent içinde değer varsa lambda func gerçekleştirir
        opt2.ifPresent(x -> System.out.println("bu metni görüyorsan içinde değer vardır"));
        System.out.println(opt2.map(x -> "strtest").get());
    }
}
