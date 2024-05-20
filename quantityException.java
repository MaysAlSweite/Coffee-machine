/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeeproject_23;

/**
 *
 * @author Hp
 */
public class quantityException  extends Exception{
    String typeofException ;


   
    
    
    public quantityException  (String s )       
    {
   typeofException =s;
    }

  public  String  beanException( )
 {
    return "bean is not enough " ;
 }
 
    @Override
    public String toString() {
        return  typeofException ;
    }
    
      public  String  waterException( )
 {
    return "water is not enough " ;
 }
    
}