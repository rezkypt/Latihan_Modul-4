import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Struktur Data", 2020012));
        mhs.put("3", new Mahasiswa("Aryo", "3D", "Struktur Data", 2020017));

        System.out.println("Masukan iD : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " +data.nama+ "\n" + "kelas :" +data.kelas + "\n" + "mata Kuliah praktikum : "+data.matkulPraktikum+ "\n"+ "Nim : " + data.nim);
        }
    }
}
