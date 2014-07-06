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
public class Ejercicio_05 
{
    public static void main(String[] args)
    {        
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango del vector"));
        int[] arreglo=new int[n];
        int c=0;
        for (int i = 0; i < arreglo.length; i++) 
        {           
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
            arreglo[i]=numero;
        }        
        for (int i = 0; i < arreglo.length; i++) 
        {            
            System.out.print(arreglo[i]);
        }
        System.out.println("");
         int i, j, aux;
         for(i=0;i<arreglo.length-1;i++)
         {
            for(j=0;j<arreglo.length-i-1;j++)
            {
                if(arreglo[j+1]<arreglo[j])
                {
                    aux=arreglo[j+1];
                     arreglo[j+1]=arreglo[j];
                    arreglo[j]=aux;
                } 
            }
        }        
        for ( i = 0; i < arreglo.length; i++) 
        {
            System.out.print(arreglo[i]);
        }
        System.out.println("Arreglo Sin Numeros Repetidos");
        int a1;
        for ( i = 0; i < arreglo.length; i++) 
        {
            if (i==0) 
            {
                System.out.print(arreglo[i]);
            }
            else
            {
                a1=i-1;
                aux=arreglo[i];
                if (aux==arreglo[a1]) 
                {
                 
                }
                else
                    {
                        System.out.print(arreglo[i]);
                    }
            }
        }
    }
}
