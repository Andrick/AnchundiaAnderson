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
public class Ejercicio_07 
{
    public static void main(String[] args) 
    {        
        int codigo;
        char x;
        String a="";
        String Cadena1, aux;
        Cadena1=JOptionPane.showInputDialog("Ingrese Frase");
        int longitud1 = Cadena1.length();    
        char [] frase1= Cadena1.toCharArray();    
        for (int i = 0; i < longitud1; i++)
        {
            if (Cadena1.codePointAt(i)>=65 && Cadena1.codePointAt(i)<=90)
            {
                codigo = Cadena1.codePointAt(i);
                codigo =codigo+32;
                x=(char)codigo; 
                a=a+x;                    
            }
            else                  
            {
                a=a+frase1[i];                    
            }          
        }
        JOptionPane.showMessageDialog(null,a);
    }
}
