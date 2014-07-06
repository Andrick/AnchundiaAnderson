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
public class Ejercicio_04 
{
    public static void main(String[] args) 
    {
        String cadena_1, cadena_2, c;        
        cadena_1=(JOptionPane.showInputDialog("Ingrese Cadena_1"));
        cadena_2=(JOptionPane.showInputDialog("Ingrese cadena_2"));    
        cadena_2=cadena_2.toLowerCase();
        c=cadena_2.toUpperCase();
        int longitud1=cadena_1.length();
        int longitud2=cadena_2.length();               
        char[] frase1 = cadena_1.toCharArray();
        char[] frase2 = cadena_2.toCharArray(); 
        char[] frase3 = c.toCharArray();         
         for (int i = 0; i < longitud2; i++)
          {
              for (int j = 0; j < longitud1; j++) 
              {
                  if (frase1[j]== frase2[i] || frase1[j]== frase3[i]) 
                  {
                      frase1[j]=' ';
                  }
              }
          }             
          for (int i = 0; i < longitud1; i++) 
          {
              if (frase1[i]!=' ')
              {
                  System.out.print(frase1[i]);
              }
          }
    }
}
