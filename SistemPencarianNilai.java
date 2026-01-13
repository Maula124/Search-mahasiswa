import java.util.Scanner;

public class SistemPencarianNilai {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int target = input.nextInt();

        int low = 0;
        int high = nilaiMahasiswa.length - 1;
        int indeksDitemukan = -1;
        int jumlahLangkah = 0;
        boolean statusDitemukan = false;

        while (low <= high) {
            jumlahLangkah++;
            int mid = low + (high - low) / 2;

            if (nilaiMahasiswa[mid] == target) {
                indeksDitemukan = mid;
                statusDitemukan = true;
                break;
            } else if (nilaiMahasiswa[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("\n--- Hasil Pencarian ---");
        if (statusDitemukan) {
            System.out.println("Status           : Ditemukan");
            System.out.println("Indeks ditemukan : " + indeksDitemukan);
        } else {
            System.out.println("Status           : Tidak Ditemukan");
            System.out.println("Indeks ditemukan : -1");
        }
        System.out.println("Jumlah langkah   : " + jumlahLangkah);
        
        input.close();
    }
}