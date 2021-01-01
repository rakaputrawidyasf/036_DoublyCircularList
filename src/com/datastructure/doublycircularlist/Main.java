// PROGRAM DOUBLY CIRCULAR LIST (DCL)
// Main Class

package com.datastructure.doublycircularlist;

import java.util.Scanner;

public class Main {
    public static void operationMenu() {
        // DEKLARASI LOKAL
        Scanner input = new Scanner(System.in);
        DoublyCircularList DCL = new DoublyCircularList();
        int Search, DAT;
        int options;

        // ALGORITMA
        do {
            System.out.println("----------------------------------------");
            System.out.println("Menu:");
            System.out.println("1) Insert di posisi pertama");
            System.out.println("2) Insert sebelum data terpilih");
            System.out.println("3) Insert setelah data terpilih");
            System.out.println("4) Insert di posisi terakhir");
            System.out.println("5) Remove data pertama");
            System.out.println("6) Remove data terpilih");
            System.out.println("7) Remove data terakhir");
            System.out.println("8) Tampilkan List");
            System.out.println("9) Tampilkan List (reversed)");
            System.out.println("10) Hapus List dan kembali ke menu utama");
            System.out.print("Pilih menu (1-10): "); options = input.nextInt();
            switch(options) {
                case 1:
                    System.out.print("Masukkan data: "); DAT = input.nextInt();
                    DCL.insertFirst(DAT);
                    break;
                case 2:
                    System.out.print("Masukkan data yang sudah ada pada list: "); Search = input.nextInt();
                    System.out.print("Masukkan data baru: "); DAT = input.nextInt();
                    DCL.insertBefore(Search, DAT);
                    break;
                case 3:
                    System.out.print("Masukkan data yang sudah ada pada list: "); Search = input.nextInt();
                    System.out.print("Masukkan data baru: "); DAT = input.nextInt();
                    DCL.insertAfter(Search, DAT);
                    break;
                case 4:
                    System.out.print("Masukkan data: "); DAT = input.nextInt();
                    DCL.insertLast(DAT);
                    break;
                case 5:
                    DCL.removeFirst();
                    break;
                case 6:
                    System.out.print("Masukkan data yang dipilih: "); Search = input.nextInt();
                    DCL.removeSelected(Search);
                    break;
                case 7:
                    DCL.removeLast();
                    break;
                case 8:
                    DCL.printList();
                    break;
                case 9:
                    DCL.reversePrintList();
                    break;
                default:
                    DCL = null;
                    break;
            }
        } while(options >= 1 && options < 10);
    }
    public static void main(String[] args) {
        // DEKLARASI LOKAL
        Scanner input = new Scanner(System.in);
        int options;

        // ALGORITMA
        System.out.println("==========PROGRAM DOUBLY-CIRCULAR-LIST==========");
        do {
            System.out.println("----------------------------------------");
            System.out.println("Menu:");
            System.out.println("1) Buat List baru");
            System.out.println("2) Keluar program");
            System.out.print("Pilih menu (1/2): "); options = input.nextInt();
            if(options == 1) {
                operationMenu();
            } else {
                System.out.println("----------------------------------------");
                System.out.println("Keluar dari program!");
            }
        } while(options == 1);
    }
}
