/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_ospedale;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class Lista_Ospedale {

   
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pazienti lavoro = new pazienti();
        coda lavoro1 = new coda();
        
         Scanner scan = new Scanner(System.in);
        
        
        
         int scelta = 0;
        
        
        do{
            
          
            
            
            
         System.out.println("inserire il numero: ");
        
            System.out.println("1 per inserire gli utenti alla coda ");
           System.out.println("2 per visualizzare la lista ");
            System.out.println("3 per uscire dal programma  ");   
             scelta = scan.nextInt();
         
            if (scelta == 1) {
                
                //richiamo del metodo new_ut tramite l'oggetto ute
               lavoro.inserisce_nome();
               lavoro1.lista(lavoro);
                //controllo 
            } else if (scelta == 2) {
                
                //richiamo del metodo clear tramite l'oggetto ute
               lavoro1.stampa();
                //controllo 
             
                //controllo
            } else if (scelta == 3) {
                //break per fare in modo di non stampare la scritta sottostante al voler uscire dal programma 
                break;
                //else in caso viene inserito un numero che non e fra quelli indicati con stampa di messaggio di avviso 
            } else {
                //messaggio di avviso per dice all'utente di inserire un numero fra quelli indicati 
                System.out.println("errore riprova ad inserire il numeroi");
                System.out.println("");
            }
            
            
        }while(scelta !=3);
    }
    
}
