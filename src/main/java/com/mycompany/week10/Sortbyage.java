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

public class Sortbyage implements Comparator <Car> {

    @Override
    public int compare(Car o1, Car o2) {
    
       if ( o1.getAge() < o2.getAge()) return -1;
       else if (o1.getAge() == o2.getAge()) return 0;
       else return 1;
    
    }
    
}