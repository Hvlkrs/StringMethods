import java.util.Scanner;

public class fth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz?// Frankfurt:60km, Koln:80km /20 km başına 5 euro bilet parası alınmaktadir..");
        String sehir = input.next().toUpperCase();
        //String Frankfurt= sehir.toUpperCase();
        //String Koln= sehir.toUpperCase();
        // int frankfrtkm = (60 / 20) * 5;
        int KmBirimFrankfurt = 15;
        // int kolnkm = (80 / 20) * 5;
        int KmBirimFiyatKoln = 20;
        if (sehir.equals("FRANKFURT")) {
            System.out.println("Rota= " + sehir);
            System.out.println("KmBirimFrankfurt= " + KmBirimFrankfurt + " Euro");
        } else {
            System.out.println("Rota= " + sehir + "\n" + "KmBirimFiyatKoln =" + KmBirimFiyatKoln + " Euro");
        }
//        System.out.println("kac kisilik bilet bakiyorsunuz? / En fazla 2 kisi alabilirsiniz");
//        int biletsayi = input.nextInt();
//        int toplamTutarFrankfurt = biletsayi * KmBirimFrankfurt;
//        int toplamTutarKoln = biletsayi * KmBirimFiyatKoln;
//        if (sehir.equals("Frankfurt")) {
//            System.out.println("toplamTutarFrankfurt = " + toplamTutarFrankfurt + " Euro");
//        } else
//            System.out.println("toplamTutarKoln = " + toplamTutarKoln + " Euro");
//        System.out.println("Bakiye ve para ustu icin 1 ye, cikis yapmak icin 2 ye basiniz");
//        int secim = input.nextInt();
//        int bakiye = 100;
//        double paraUstuFrankfurt = bakiye - toplamTutarFrankfurt;
//        double paraUstuKoln = bakiye - toplamTutarKoln;
//        switch (secim) {
//            case 1:
//                System.out.println("Bakiyeniz = " + bakiye + " Euro");
//                if (bakiye >= toplamTutarFrankfurt && sehir.equals("Frankfurt")) {
//                    System.out.println(sehir + "Para ustu : " + paraUstuFrankfurt + " Euro");
//                } else
//                    System.out.println(sehir + "Para ustu:" + paraUstuKoln + " Euro");
//                break;
//            default:
//                System.out.println("Yetersiz bakiye");
//                break;
//            case 2:
//                System.out.println("Iyi gunler");
//                break;

    }
}