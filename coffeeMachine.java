/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeeproject_23;

import com.mycompany.coffeeproject_23.containers.beansContainer;
import com.mycompany.coffeeproject_23.containers.waterContainer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class coffeeMachine  implements logger{
    
 private beansContainer bean;
    private waterContainer water ;
    private waste  waste;
    private grinder grinder ;
    private boolean doneprocessing =false;  
  
  

   

    public coffeeMachine(beansContainer bean, waterContainer water, waste waste) {
        this.bean = bean;
        this.water = water;
        this.waste = waste;
      
      
    }
      
   public beansContainer getBean() {
        return bean;
    }

    public void setBean(beansContainer bean) {
        this.bean = bean;
    }

    public waterContainer getWater() {
        return water;
    }

    public void setWater(waterContainer water) {
        this.water = water;
    }

    public waste getWaste() {
        return waste;
    }

    public grinder getGrinder() {
        return grinder;
    }
    
   

       public void process(int beanGrams, int waterMilli, int degree) {
             
           
         
         try{
             bean.containsEnough(beanGrams);
         
         } 
        
               catch (quantityException r)
             {
                 JOptionPane.showMessageDialog(null,r.beanException());
             }
             try 
             {
               water.containsEnough(waterMilli);
                bean.setQuantity(bean.getQuantity()-beanGrams);
                water.setQuantity(water.getQuantity()- waterMilli);
                   doneprocessing=true;
                   JOptionPane.showMessageDialog(null, "grinding now at degree"+(degree+1 ));    
             }
             catch (quantityException m) {
                  JOptionPane.showMessageDialog(null,m.waterException());
                    doneprocessing=false;
             }
             
         
         }
         
            

         public boolean isDone() {
        return doneprocessing;
    }

    @Override
    public void log(String s) {
        
        
        
     try {
         FileWriter file = new FileWriter ("coffeemachine.log",true);
         file .write(s);
         file.close();
     } catch (IOException ex) {
       JOptionPane.showMessageDialog(null, ex.getMessage());
     }
        
        
    }

   
        
    }

