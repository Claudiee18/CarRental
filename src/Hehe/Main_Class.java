/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hehe;



/**
 *
 * @author admin
 */
public class Main_Class {
    public static void main(String[]args){
         FirstPage splash = new FirstPage();
        splash.setVisible(true); //The slash jFrame will be shown
        try{
            for(int i = 0; i <= 100; ++i){
                Thread.sleep(20);
                splash.SlashPercentage.setText(Integer.toString(i) + "%" );
                splash.SplashProgress.setValue(i);
                
                if(i == 100){
                    splash.dispose();
                   RentPage Login = new RentPage();
                   
                   Login.setVisible(true);
                   

                    
                }
            }
        }
                catch(Exception e){
                        System.out.print("Error");
                        }
            }
    }

