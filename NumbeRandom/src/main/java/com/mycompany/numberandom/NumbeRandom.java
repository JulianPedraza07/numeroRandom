package com.mycompany.numberandom;

/**
 *
 * @author Malik
 */
public class NumbeRandom {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        
        int f = 10000;
        
        double ma[][] = new double[f][f];
        
        ma=new double[f][f];
        for (int i =0; i<f; i++){
            for (int o=0; o<f; o++){
                ma[i][o] = Math.random()*100;
            }
        }
        
        /*
        for (int i = 0; i < f; i++) {
            for (int o = 0; o < f; o++) {
                System.out.print(ma[i][o] + " ");
            }
            
            System.out.println();
        }
       
        */
        long fin = System.currentTimeMillis();
        
        long tiempo = fin - inicio;
        
        System.out.println(tiempo +" milisegundos");
    }
}
