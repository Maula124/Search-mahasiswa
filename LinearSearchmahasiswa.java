import java.util.Scanner;

public class LinearSearchmahasiswa {
    public static void main(String[] args) {
        
        String[] nim = {"20250040080", "20250040081", "20250040082", "20250040083", "20250040084"};
        String[] nama = {"Andrea Michael Pratama", "Haikal Jonathan Wiranata", "Ryan Alexander Saputra", "Amanda Elizabeth Maharani", "Rifki Nicholas Aditya"};
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("    PENCARIAN MAHASISWA    ");
        System.out.println("=============================================");
        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i]);
        }
        System.out.println("---------------------------------------------");
        
        System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
        String cariNama = input.nextLine(); 
        
        System.out.println("\n---   Pencarian   ---");
        
        int posisiIndeks = -1;
        int jumlahPerbandingan = 0;

        for (int i = 0; i < nama.length; i++) {
            jumlahPerbandingan++; 
            
            if (nama[i].equalsIgnoreCase(cariNama)) {
                posisiIndeks = i;
                break; 
            }
        }

        System.out.println("\n--- Hasil Pencarian ---");
        
        if (posisiIndeks != -1) {
            System.out.println("Status: Ditemukan");
            System.out.println("Posisi indeks   : " + posisiIndeks);
            System.out.println("Nama Mahasiswa  : " + nama[posisiIndeks]);
            System.out.println("NIM Mahasiswa   : " + nim[posisiIndeks]);
        } else {
            System.out.println("Status: Tidak ditemukan");
            System.out.println("Posisi indeks   : -1");
        }
        
        System.out.println("Jumlah perbandingan pencarian: " + jumlahPerbandingan);
        System.out.println("=============================================");

        input.close();
    }
}