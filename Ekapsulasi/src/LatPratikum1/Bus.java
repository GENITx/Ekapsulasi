/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatPratikum1;

/**
 *
 * @author Member
 */
public class Bus {
    private double penumpang, maxPenumpang, counter, penumpangBaru;
    public Bus(double maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang=0;
        counter=1;
    }
    public void addPenumpang(double penumpang){   
        this.penumpangBaru=this.penumpang+penumpang;
        if (this.penumpangBaru >= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");   
        }else {
            this.penumpang=this.penumpangBaru;
            counter++;
        }        
    }
    
    public void getPenumpang(double penumpang){
        if (penumpang==5){
            System.out.println("Jumlah penumpang bertambah "+penumpang);   
        }else{
            System.out.println("Jumlah penumpang kurang dari 5");
        }
    }
    public double getAverage(){return this.penumpang/this.counter;}
    
    public void cetakPenumpang(){
        System.out.println("\nPenumpang Bus sekarang                    = "+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah  = "+maxPenumpang);
        System.out.println("Rata-rata                                  = "+getAverage());
    }
}

