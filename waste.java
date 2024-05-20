/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeeproject_23;

/**
 *
 * @author Hp
 */
public class waste {
    
private int counter;

    public waste() {
        this.counter = 0;
    }

     
   

    public  int getCounter() {
        return counter;
    }

    public  void setCounter(int counter) {
        this.counter = counter;
    }
    public void clean()
    {counter=0;
    }

    public boolean isFull() {
        return counter>=20;   //20 is max number of cups served
    }

    
    public String getInfo() {
        return  "Number of cups in waste =" + counter ;
    }

}
 

