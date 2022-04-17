/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Member
 */
public class TestSiswa {
  public static void main(String[]args){
        encapSiswa siswa = new encapSiswa();
        siswa.setName("Hegel Pradipta Pria Kurniawan");
        siswa.setAge(17);
        siswa.setAddress("Malang");
        
            System.out.println("Nama: "+siswa.getName());
            System.out.println("Alamat: "+siswa.getAddress());
            System.out.println("Berumur: "+siswa.getAge()+" Tahun");
    }
}

