/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ospedale;

/**
 *
 * @author Sergio
 */
public class coda extends pazienti {
    
    
    
    pazienti[] paz = new pazienti[10];
    
     public int contatore = 0;
     
     public coda(){
         
     }
   
    
    public void lista( pazienti Nome_Cognome){
        
        if(contatore < paz.length){
            
            paz[contatore] = Nome_Cognome ;
            
            contatore++;
        }
        else{
            
            System.out.println("la coda è vuota");
           
        } 
        }
    
    public void stampa(){
        
        
        for(int i = 0; i < contatore; i++){
            
            System.out.println("paziente:"+paz[i].Nome_Cognome);
            
        }
    }
    
    }
    

