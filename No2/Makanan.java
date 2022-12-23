import java.util.ArrayList;

public class Makanan {
  public static void main(String[] args) {
    // Membuat ArrayList bernama menuMakanan
    ArrayList<String> menuMakanan = new ArrayList<>();

    // Menambahkan beberapa makanan ke menuMakanan
    menuMakanan.add("Nasi Goreng");
    menuMakanan.add("Mie Goreng");
    menuMakanan.add("Bakso");
    menuMakanan.add("Sate Ayam");
    menuMakanan.add("Gado-gado");

    // Mencetak daftar makanan di menuMakanan
    System.out.println("Daftar Makanan:");
    for (int i = 0; i < menuMakanan.size(); i++) {
      System.out.println((i+1) + ". " + menuMakanan.get(i));
    }

    // Menghapus makanan dari menuMakanan
    menuMakanan.remove(3); // Menghapus "Sate Ayam"
    menuMakanan.remove(2); // Menghapus "Bakso"

    // Mencetak daftar makanan di menuMakanan setelah dihapus
    System.out.println("\nDaftar Makanan Setelah Dihapus:");
    for (int i = 0; i < menuMakanan.size(); i++) {
      System.out.println((i+1) + ". " + menuMakanan.get(i));
    }
  }
}
