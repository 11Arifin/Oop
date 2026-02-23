import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nim Anda");
        String nimStr = input.nextLine();
        int nim = Integer.parseInt(nimStr);

        System.out.print("masukkan Prodi Anda: ");
        String prodi = input.nextLine();

        System.out.print("Alasan Belajar Java:");
        String alasan = input.nextLine();

        System.out.println("Halo " + nama + ", Dengan NIM " + nim + ", Prodi Anda adalah " + prodi
                + ", Alasan Belajar Java Anda adalah " + alasan);

    }

}