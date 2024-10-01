/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

import java.util.Date;

public class Pasajero implements Frecuencia {
    private int millasAcumuladas;
    private Date ultimoViajeRealizado;
    
    public Pasajero (int millasAcumuladas, Date ultimoViajeRealizado){
        this.millasAcumuladas =  millasAcumuladas;
        this.ultimoViajeRealizado = ultimoViajeRealizado;
    }
    @Override
   public int millasAcumuladas(){
    return millasAcumuladas;   
   }
   @Override
   public Date ultimoViajeRealizado(){
       return ultimoViajeRealizado;
   }
   
}
