/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosjava_aaa;

import javax.swing.JOptionPane;

/**
 *
 * @author Jefrie_Principal
 */
public class Ejercicio_08 
{
    public static void main(String[] args) 
    {
        int c=0,longi;
        String Cadena_1;
        Cadena_1=JOptionPane.showInputDialog("Ingrese una Frase");
        Cadena_1=" "+ Cadena_1;         
        char[] frase1 =Cadena_1.toCharArray();        
        for (int i = 0; i< Cadena_1.length() ; i++)
        {
            if (frase1[i]=='A'||frase1[i]=='a') 
            {
                c=c+1;
                for (int j = i; j < Cadena_1.length(); j++) 
                {
                    if (frase1[j]==' ') 
                    {
                      i=j;
                      j=Cadena_1.length();                      
                    }   
                }                
            }            
        }        
        System.out.println(Cadena_1);
        JOptionPane.showMessageDialog(null,"Hay "+c+ " palabras que tiene/n letras A");
    }    
}
