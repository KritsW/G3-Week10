/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week10;

/**
 *
 * @author LENOVO
 */

import java.util.Comparator;

public class Sortbyman implements Comparator <Car> { // เรียงตามชื่อรถ (Manufacture)

    @Override
    public int compare(Car o1, Car o2) {
    
        return o1.getManufacturer().compareTo(o2.getManufacturer());
    
    }
    
    
    
}