
import java.util.ArrayList;
import java.util.Scanner;

public class coba1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        while (true) {
            System.out.println("Daftar Menu: ");
            System.out.println("1. Tampilkan isi ArrayList");
            System.out.println("2. Tambahkan elemen Badak dan Bebek");
            System.out.println("3. Hapus posisi Bebek yang pertama");
            System.out.println("4. Tampilkan elemen pada index ke-0 dan ke-2, selanjutnya hapus index ke-0");
            System.out.println("5. Ubah index ke-0 dari Cicak Menjadi Ular, tambahkan elemen baru pada index ke-2 dengan Itik");
            System.out.println("6. Hapus elemen diantara index ke-1 dan ke-5");
            System.out.println("7. Tampilkan elemen pertama dan terakhir");
            System.out.println("8. Tampilkan jumlah elemen pada ArrayList");
            System.out.println("9. Cari posisi index dari Badak");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println(hewan);
                    break;
                case 2:
                    hewan.add("Badak");
                    hewan.add("Bebek");

                    ArrayList<String> tambahan = new ArrayList<>();
                    for (int i = 0; i < hewan.size(); i++) {
                        if (hewan.get(i).equals("Bebek")) {
                            tambahan.add(String.valueOf(i));
                        }
                    }
                    System.out.println(hewan);
                    System.out.println("Bebek = " + tambahan.size());
                    System.out.println("Posisi Index: " + tambahan);
                    break;
                case 3:
                    hewan.remove("Bebek");
                    System.out.println(hewan);
                    break;
                case 4:
                    System.out.println("Index ke-0: " + hewan.get(0));
                    System.out.println("Index ke-2: " + hewan.get(2));
                    hewan.remove(0);
                    System.out.println(hewan);
                    break;
                case 5:
                    hewan.set(0, "Ular");
                    hewan.add(2, "Itik");
                    System.out.println(hewan);
                    break;
                case 6:
                    hewan.subList(1, 5).clear();
                    System.out.println(hewan);
                    break;
                case 7:
                    System.out.println("Elemen Pertama : " + hewan.get(0));
                    System.out.println("Elemen Terakhir : " + hewan.get(hewan.size() - 1));
                    break;
                case 8:
                    System.out.println("Jumlah Elemen : " + hewan.size());
                    break;
                case 9:
                    System.out.println("Index Hewan Badak : " + hewan.indexOf("Badak"));
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak tersedia.");
            }
            System.out.println("\n");
        }
    }
}
