import java.util.Scanner;

/**
 * Kelas CalculatorApp menyediakan aplikasi kalkulator sederhana yang dapat melakukan
 * operasi penjumlahan, pengurangan, perkalian, dan pembagian antara dua angka.
 * Program ini meminta input angka dari pengguna dan memberikan hasilnya berdasarkan operasi yang dipilih.
 */
public class CalculatorApp {

    /**
     * Menjumlahkan dua angka.
     * 
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penjumlahan dari a dan b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangi angka kedua dari angka pertama.
     * 
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pengurangan a - b
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua angka.
     * 
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil perkalian a * b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Membagi angka pertama dengan angka kedua.
     * 
     * @param a angka pembilang
     * @param b angka penyebut
     * @return hasil pembagian a / b
     * @throws ArithmeticException jika angka penyebut (b) adalah nol
     */
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol.");
        }
        return a / b;
    }

    /**
     * Metode utama untuk menjalankan aplikasi kalkulator.
     * Program ini meminta input dari pengguna untuk memilih operasi dan memasukkan dua angka,
     * kemudian menampilkan hasil operasi yang dipilih.
     * 
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");

        System.out.print("Masukkan pilihan Anda (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double num1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Hasil: " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Hasil: " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Hasil: " + result);
                break;
            case 4:
                try {
                    result = divide(num1, num2);
                    System.out.println("Hasil: " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
