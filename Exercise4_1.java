public class Exercise4_1 {
    public static void printAmerican(String day, int date, String month, int year) {
        // Amerikan format: Monday, July 22, 2019
        System.out.println(day + ", " + month + " " + date + ", " + year); // yürütme sırasında çalışır
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // Avrupa format: 22 July 2019, Monday
        System.out.println(date + " " + month + " " + year + ", " + day); // yürütme sırasında çalışır
    }

    public static void main(String[] args) {
        String day = "Monday";    //  (örnek veri)
        String month = "July";
        int date = 22;
        int year = 2019;

        printAmerican(day, date, month, year); // 1 -> çağrı: Amerikan formatı yazdırılır
        printEuropean(day, date, month, year); // 2 -> çağrı: Avrupa formatı yazdırılır
    }
}
