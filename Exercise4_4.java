public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}

1- yine 42 döndürür.
    Ama biz bu değeri hiçbir değişkene atamadık ve hiç yazdırmadık.
    Yani 42 hiçbir yerde gözükmez.
    Program çalışılır, hata vermez, sadece 42 "boşa gider", yok sayılır.


    2- Void metotlarda değer döndürülümez bu nedenle toplanacak da bir değer yoktur bu yüzden hata verir.
    
