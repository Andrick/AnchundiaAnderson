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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int x=0, y=0, x1=7, y1=6, re=0, a;
        int[] arreglo1=new int[128];
        int[] arreglo2=new int[127];
        int[] arreglo3=new int[255];
        for (int i = 0; i <= 127; i++) 
        {            
            arreglo1[i]=x1;
            x1=x1+1;            
        }
        for (int j = 0; j < 126; j++) 
        {            
            arreglo2[j]=y1;
            y1=y1-2;            
        }
        x1=0;
        for (int i = 0; i < 255; i++) 
        {
            a=i % 2;
            if (a==0)
            {
             arreglo3[i]=arreglo1[x1];             
            }
            else
            {                
                arreglo3[i]=arreglo2[x1]; 
                x1=x1+1;
            }            
        }
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor entero Y"));
        if (x<=0 || x>255 || y<=0 || y>255)
        {
            re=-1;
        }
        else
        {
            for (int i = 0; i <255; i++) 
            {
                if (x==(i+1))
                {
                    x1=arreglo3[i];
                }
                else
                {
                    if (y==(i+1))
                    {
                        y1=arreglo3[i];
                    }                    
                }
            }
            re=x1+y1;
        }
        JOptionPane.showMessageDialog(null, re); 
    }  
}
