/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3.oopLatihan;

/**
 *
 * @author Muhammad bintang
 */
 class Murid{
        String nama;
        String nis;
        int nilai;
        //  ini adalah constructor
        Murid(String nama, String nis, int nilai){
            this.nama = nama;
            this.nis = nis;
            this.nilai = nilai;
        }
//        ini adalah method dengan menggunakan return
        String getNilai(){
            String hasil;
            if(this.nilai >= 80 && this.nilai <= 100){
                hasil = " A ";
            }else if(this.nilai >=70 && this.nilai < 80){
                hasil = " B ";
            }else{
                hasil = " C ";
            }
            return hasil;
        }
//        ini adalah method tanpa menggunakan method
        void getHasil(){
            System.out.println("=========== HASIL =============");
            System.out.println("NAMA : " + " " + this.nama);
            System.out.println("NIS : " + " " + this.nis);
            System.out.println("NILAI : " + " " + this.nilai );
            System.out.println("Predikat : " + getNilai());
            System.out.println("===============================");
        }
        
    }
public class Overloading {
    public static void main(String[]args){
        Murid Siswa1 = new Murid("Muhammad Bintang","202-062",80);
        Murid Siswa2 = new Murid("Muhammad Syahru", "202-061", 70);
        Murid Siswa3 = new Murid("Fery Fadul Rahman", "202-048", 60);
//        pemangilan method yang berisi inputan
        Siswa1.getHasil();
        Siswa2.getHasil();
        Siswa3.getHasil();
    }
    
}
