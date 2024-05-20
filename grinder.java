/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeeproject_23;

/**
 *
 * @author Hp
 */
public class grinder {
    private String str;
   
    
    public String degree(int ch)
    {
        if(ch>=1 && ch<=10)
            str="Grinding at Degree "+ch;
        else
            str="invalid choice";
    return str;
}

    public grinder(  ) {
     
    }

   
    
} 
