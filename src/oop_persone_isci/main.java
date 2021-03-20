package oop_persone_isci;

public class main {
    public static void main(String[] args) {
        mudur personel_muduru = new mudur();
        personel_muduru.setIsim("Erdinc");
        personel_muduru.setDeneyimYili(3);
        isci personel_isci = new isci();
        personel_isci.setIsim("Hasan");
        personel_isci.setDeneyimYili(3);
        int isci_tazminati = personel_isci.tazminatHesapla();
        int mudur_tazminati= personel_muduru.tazminatHesapla();
        System.out.println(personel_isci.getIsim() + " Bey in Tazminati ...> "+ isci_tazminati);
        System.out.println(personel_muduru.getIsim()+ " Bey in Tazminati..> " + mudur_tazminati);

    }
}
