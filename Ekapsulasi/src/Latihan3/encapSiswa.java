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
public class encapSiswa {
    private String nama,alamat;
    private int umur;
    
    public int getAge(){
        return umur;
    }
    public String getName(){
        return nama;
    }
    public String getAddress(){
        return alamat;
    }
    public void setAge (int newAge){
        umur=newAge;
    }
    public void setName (String newName){
        nama=newName;
    }
    public void setAddress (String newAddress){
        alamat=newAddress;
    }

}
