public class Exercise4_3 {

    public static void zoop() {
        baffle();                       // 3, 8   (zoop içindeki ilk baffle çağrısı -> 3. adım; ikinci baffle çağrısı -> 8. adım)
        System.out.print("You wugga "); // 5
        baffle();                       // 6
    }

    public static void main(String[] args) {
        System.out.print("No, I "); // 1
        zoop();                    // 2
        System.out.print("I ");    // 7
        baffle();                  // 9
    }

    public static void baffle() {
        System.out.print("wug"); // 4, 9, 14  (bu satır 3 kere çalışır: ilk baffle (4), ikinci baffle (9), main'deki son baffle (14))
        ping();                  // 5, 11, 16 (ping 3 kere çağrılır: sıralar 5,11,16)
    }

    public static void ping() {
        System.out.println("."); // 6, 12, 17 ???  // (NOT: Ancak aşağıdaki bölümde daha doğru ordinal sayıları veriyoruz)
    }
}
