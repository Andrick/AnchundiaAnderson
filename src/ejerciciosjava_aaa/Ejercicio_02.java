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
public class Ejercicio_02 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int y;
        long x, r;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor entero Y"));
        if (x<=0 || x>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+r);
        }
        else
        {
            long[] arreglo=new long[y];
            arreglo[0]=x;
            for (int i = 1; i < arreglo.length; i++) 
            {
               x=x*(i+1);
               arreglo[i]=x;
                System.out.println(i+" "+arreglo[i]);               
            }
            for (int i = 0; i < arreglo.length; i++) 
            {
                if(i==(y-1))
                {
                    r=arreglo[i];
                    JOptionPane.showMessageDialog(null,"Resultado "+r);
                }
            }
        }
    } 
}
