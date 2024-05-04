package demo;

import java.util.Arrays;
import java.util.List;

public class VariantLearn {

}
/*
 * COVARIANCE
 * Covariant, subclass'ın superclass cinsinden ifade edilebilinmesidir. Javada diziler covariantlara örnektir.
 * Producer yapılarında bolca kullanılır.
 * */

/*
* CONTRAVARIANCE
* Contravariance, superclass'ın subclass cinsinden ifade edilebilinmesidir.
* Consumer yapılarında bolca kullanılır.
* */

/*
* INVARIANCE
* Herhangi iki sınıfın birbiri cininden ifade edilememesidir. Javada generics invariantlara örnektir.
* */

class A{

}

class B extends A{

}
/*
* Bu sınıf A sınıfını ve A sınfından türeyen sınıfları kabul eder ve bu sebeple covariant özelliği gösterir.
* Bu sayede subclasslar, superclass referansı ile saklanabilir.
* */
class CovarianceClass<T extends A> {
    T var;
}
/*
* Bu sınıftaki fonksiyona dikkat edecek olursak, fonksiyon parametresinin yalnızca Number sınıfı ile ilgili olan
*   sınıfları kabul etmesini sağladık.
* */
class ContravariantClass{
    public static void generateList(List<? super Number> list){}
    public static void _generateList(List<? extends Integer> list){}

    public static void main(String[] args) {
        List<Number> list = Arrays.asList(1,2,3); // Integer değerler Number referansı ile saklanabilir.
        generateList(list); // Number tipinden değerleri kabul ettiği için sorun yok.
        _generateList(list); // Bu satırda incompatible types hatası var. Integer class'ı Number class'ından üretilmiştir
        //                      ve bu yüzden parametre değerini kabul etmez.

    }
}
/*
* Bu sınıf yalnızca gelen sınıf üzerinden işlem yapar. Yukarıda B, A'yı extend etmesine rağmen bu sınıf oluşturulan
*   A ve B referans tipli iki sınıf birbirinden bağımsızdır ve farklı özellik gösterirler.
* */
class InvarianceClass<T>{
    T var;
}