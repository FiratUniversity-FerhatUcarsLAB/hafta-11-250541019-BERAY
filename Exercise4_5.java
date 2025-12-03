public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);              // 2, 8   -> zoop ilk çağrıda 2. adımda; ikinci çağrıda 8. adımda
        if (bob == 5) {
            ping("not ");                      // 3      -> sadece ilk zoop çağrısında çalışır
        } else {
            System.out.println("!");          // 9      -> sadece ikinci zoop çağrısında çalışır
        }
    }

    public static void main(String[] args) {
        int bizz = 5;                          // (değişken ataması, yürütülür ama sıraya genelde dahil edilmeyen setup)
        int buzz = 2;
        zoop("just for", bizz);               // 1
        clink(2 * buzz);                      // 5  (önce 2*buzz hesaplanır, sonra clink çağrılır)
    }

    public static void clink(int fork) {
        System.out.print("It’s ");            // 6
        zoop("breakfast ", fork);             // 7
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more "); // 4
    }
}
