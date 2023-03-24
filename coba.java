import java.util.ArrayList;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");
        
        do {
            System.out.println("\nDaftar Menu:");
            System.out.println("1. Tampilkan Hewan");
            System.out.println("2. Tambah Hewan");
            System.out.println("3. Hapus Hewan");
            System.out.println("4. Ubah Hewan");
            System.out.println("5. Hapus Elemen");
            System.out.println("6. Tampilkan Elemen Pertama dan Terakhir");
            System.out.println("7. Tampilkan Jumlah Elemen");
            System.out.println("8. Cari Index Hewan");
            System.out.println("9. Keluar");
            System.out.print("Pilih Menu (1-9): ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println(hewan);
                    break;
                case 2:
                    hewan.add("Badak");
                    hewan.add("Bebek");
                    int count = 0;
                    ArrayList<Integer> indexBebek = new ArrayList<Integer>();
                    for (int i = 0; i < hewan.size(); i++) {
                        if (hewan.get(i).equals("Bebek")) {
                            count++;
                            indexBebek.add(i);
                        }
                    }
                    System.out.println(hewan);
                    System.out.println("Bebek = " + count);
                    System.out.println("Posisi Index: " + indexBebek);
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
                case 10:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan Menu Salah.");
            }
        } while (pilihan != 10);
    }
}
