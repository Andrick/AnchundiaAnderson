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
public class Ejercicio_03 
{
  public static void main(String[] args) 
    {        
        int x,y,r;
        double proceso,co=1,co1=1;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero Y"));
        double a=(double)x;
        if (x<=0 || x>255)
        {
            r=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+r);
        }
        else
        {
            double[] arreglo=new double[y];
            arreglo[0]=a;              
            for (int i = 1;i<arreglo.length; i++) 
            {                
                co=co+1;
               proceso=x*(1/co);
               arreglo[i]=proceso;           
            }
            for (int i = 0; i < arreglo.length; i++) 
            { 
              if(i==(y-1))
                {                    
                    JOptionPane.showMessageDialog(null,"Resultado "+arreglo[i]);
                }  
            }
        }
    }   
}
