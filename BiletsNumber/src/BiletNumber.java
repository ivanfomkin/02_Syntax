public class BiletNumber {
    public static void main(String[] args) {
        int biletNumber = 200_000;
        //using while cycle
        while (biletNumber <= 235_000) {
            System.out.println("Билет № " + biletNumber);
            if (biletNumber == 210_000) biletNumber += 10_000;
            else biletNumber++;
        }
        //using for cycle
        biletNumber = 200_000;
        for (; biletNumber <= 235_000; biletNumber++) {
            System.out.println("Билет № " + biletNumber);
            if (biletNumber == 210_000) biletNumber += 9999;
        }
    }
}
