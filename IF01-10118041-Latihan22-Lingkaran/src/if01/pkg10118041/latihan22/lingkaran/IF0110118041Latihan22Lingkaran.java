/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118041.latihan22.lingkaran;
import java.util.Scanner;
/*

 * NAMA              : Eki salman sya'bani
 * KELAS             : IF-01
 * NIM               : 10118041
 * DESKRIPSI PROGRAM : Program yang dapat menghitung luas dan keliling lingkaran
 */

public class IF0110118041Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */

   
    public static void main(String[] args) {

        // TODO code application logic here

        double d,r, luas,keliling;

        System.out.println("Perhitungan lingkaran");

        System.out.println("=================================");

        

        Scanner scanner;

        do{

            System.out.println("Diamter harus berupa angka!!");

            System.out.print("Diameter\t: ");

            System.out.println("");

            scanner = new Scanner(System.in);

            

            

            

        }while(!scanner.hasNextDouble());

        d = scanner.nextDouble();

        r = d * 0.5;

        luas = Math.PI * r * r;

        keliling = d * Math.PI;

         System.out.println("Hasil");

            System.out.println("=================================");

            System.out.printf("Jari jari\t: %,12.2f cm%n" ,r);

            System.out.printf("Luas\t\t: %,12.2f cm%n" ,luas);

            System.out.printf("Keliling\t: %,12.2f cm%n" ,keliling);

    }

    

}