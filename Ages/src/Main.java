public class Main {
    public static void main(String[] args) {
        int ivanAge = 15;
        int elinaAge = 14;
        int mikhailAge = 8;

        System.out.println("Ivan age is " + ivanAge + " years");
        System.out.println("Elina age is " + elinaAge + " years");
        System.out.println("Mikhail  age is " + mikhailAge + " years");
        int maxAge = 0, minAge = 0, middleAge = 0;
        if (ivanAge > mikhailAge) {
            if (ivanAge > elinaAge) {
                maxAge = ivanAge;
                if (elinaAge > mikhailAge) {
                    middleAge = elinaAge;
                    minAge = mikhailAge;
                } else {
                    minAge = elinaAge;
                    middleAge = mikhailAge;
                }
            } else {
                maxAge = elinaAge;
                minAge = mikhailAge;
                middleAge = ivanAge;
            }
        } else {
            if (mikhailAge > elinaAge) {
                maxAge = mikhailAge;
                if (ivanAge > elinaAge) {
                    middleAge = ivanAge;
                    minAge = elinaAge;
                } else {
                    middleAge = elinaAge;
                    minAge = ivanAge;
                }
            }
        }
        System.out.println("Minimum age is " + minAge);
        System.out.println("Middle age is " + middleAge);
        System.out.println("Maximum age is " + maxAge);

    }
}
