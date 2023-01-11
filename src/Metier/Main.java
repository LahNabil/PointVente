/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metier;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Main {
     public static void main(String args[]) {
         Loading load = new Loading();
         load.setVisible(true);
         load.setLocationRelativeTo(null);
         Authentification auth = new Authentification();
               
   
                try{
                    for (int i=0;i<100;i++){
                        Thread.sleep(60);
                        load.loadingBar.setValue(i);
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                
                load.setVisible(false);
                auth.setVisible(true);
                auth.setLocationRelativeTo(null);
                load.dispose();
    }
    
}
