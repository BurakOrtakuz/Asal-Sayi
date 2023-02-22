public class Main {

    public static void main (String[] args) {
        int sayı = 0;
        boolean Asal = true;
        if(sayı==1){
            System.out.println("Sayı asal değil!");
            return;
        }
        if (sayı > 2) {
            for (int a = 2; a < sayı / 2; a++) {
                if (sayı % a == 0) {
                    Asal = false;
                }
            }
            if (Asal == true) {
                System.out.println("Sayı asal!");
            } else {
                System.out.println("Sayı asal değil tabiki cahil!");
            }
        }
        else{
            System.out.println("mal uşak sence eksi sayı gerçek olabilir mi?!");
        }
    }

}
