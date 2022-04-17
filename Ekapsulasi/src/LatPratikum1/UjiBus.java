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
public class UjiBus {
    public static void main(String[]args){
        Bus bus = new Bus(10);
        bus.addPenumpang(1);
        bus.addPenumpang(5);
        bus.cetakPenumpang();
        
        bus.addPenumpang(1);
        bus.cetakPenumpang();
        
        bus.addPenumpang(2);
        bus.cetakPenumpang();
        
        bus.addPenumpang(3);
        bus.cetakPenumpang();
    }
}

