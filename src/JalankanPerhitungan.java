import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s=new Perhitungan(4, 5, 0);

        // Tugas Mandiri
        // Tampilkan hasil perhitungan dengan memanggil method yg ada pada perhitungan.java,
        // Method yg dibuat menerima parameter dan mengembalikan nilai (method with return).
        // Dikumpulkan hari sabtu,23 april 2022
        // Dikirim ke "aherijanto@mimoapps.xyz"email berupa github repo masing2
        // Subject email : TM_NIM_NamaLengkap_Kelas
        // e.g : TM_21090068_NURRIZQIMAULANA_2C

        System.out.println("----------");
        System.out.println("Hasil pertambahan :");
        int hasiltambah = s.hsltmbh(30, 2);
        System.out.println(hasiltambah);



        System.out.println("----------");
        System.out.println("Hasil Perkalian :");
        int hasilkali = s.hslkli(45, 60);
        System.out.println(hasilkali); 
    }
    
}
