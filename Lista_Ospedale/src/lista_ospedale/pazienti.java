/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ospedale;
import java.util.Scanner;
/**
 *
 * @author Sergio
 * 
 * questo programma si basa su inserire i nomi di ogni paziente
 * in un array di oggetti,creando cosi una lista e soddisfare il paziente 
 * che ha più necessità di ricevere assistenza
 */
public class pazienti {
    //creo un attributo di tipo stringa
    protected String Nome_Cognome;
    
    
    
    
    
    //creo il metodo che fa inserire il nome del paziente
    
    public void inserisce_nome(){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("inseire il nome e cognome :");
       //assegno il valore all'attributo Nome_Cognome
        Nome_Cognome = scan.nextLine();
    }
    
    
    
}

