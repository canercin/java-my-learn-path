package demo;

public class CollectionLearn {
    public static void main(String[] args) {
        /* 1 - List Arayüzü
        *   Tekrarlı elemanlarla ve null elemanlarla çalışabilir.
        *       1.a - ArrayList Sınıfı
        *           Index bazlı bir erişim sistemini benimsemiştir.
        *           Array tabanlı bir dinamik sistemi benimser.
        *           Başlangıçta değer tanımlanması yapılması opsiyoneldir ama artış/azalış durumlarında boyut değişebilir.
        *           Elemanlara rastgele erişimi mümkün kılar.
        *           Thread ile doğrudan kullanıma uygun değildir.
        *           Arama işlemlerinde LinkedList yapısına göre daha performanslıdır.
        *           Eleman ekleme ve silme konusunda LinkedList yapısına göre daha kötü performans sergiler.
        *       1.b - LinkedList Sınıfı
        *           Dinamik bir diziymiş gibi davranır.
        *           Boyutu ekleme yaptıkça otomatik artar, sildikçe azalır.
        *           Çift yönlü linked list yapısı temellidir. (Bu sebeple çift yönlü dolaşım mümkündür.)
        *           Ekleme silme gibi operasyonlarda ArrayList yapısına göre daha performanslıdır.
        *           Arama işlemlerinde ArrayList yapısına göre daha kötü performans sergiler.
        *           ArrayList yapısına göre daha fazla yer kaplar.
        * 2 - Set Arayüzü
        *   Tekrarlı elemanlar ile çalışmayı engeller.
        *   null ile çalışılabilir
        *       2.a - HashSet Sınıfı
        *           Elemanların sırası ile ilgili bir garanti vermez.
        *           null ile çalışılabilir.
        *       2.b - LinkedHashSet Sınıfı
        *           Elemanları ekleme sırasına göre tutar.
        * 3 - SortedSet Arayüzü
        *   Elemanların sıralı bir şekilde tutulmasını garanti eder.
        *       3.a - TreeSetClass Sınıfı
        *           Elemanları ağaç yapısı kullanarak saklar.
        * 4- Map Arayüzü
        *   Elemanları (key, value) olarak tutar. Sınıfları benzer isimli sınıflarla benzerdir tek farkı (key, value) kısmıdır.
        * */
    }
}
