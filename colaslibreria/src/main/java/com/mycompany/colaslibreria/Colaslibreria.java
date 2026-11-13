
package com.mycompany.colaslibreria;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;

public class Colaslibreria {

    public static void main(String[] args) {
        
        System.out.println("Ejericios colas con libreria de JAVA\n");
        Colasimple();
        ColaCircular();
        ColaPrioridad();
        ColaDoble();
    }
    
    static void Colasimple(){
           System.out.println("Ejericios cola simple: Primero en llegar, primero en salir (FIFO)"); 
           
           Queue<String> java = new ArrayDeque<>();
           java.offer("ANA");
           java.offer("EUSTAQUIO");
           java.offer("CHARLIE");
            System.out.println("Java:  " + java.poll() + " , " + java.poll()+ "\n");
           }
    
     static void ColaCircular(){
           System.out.println("Ejericios cola cicular: Reutiliza los arreglos"); 
           
           Queue<String> java = new ArrayDeque<>();
           java.offer("ANA");
           java.offer("EUSTAQUIO");
           java.offer("CHARLIE");
           System.out.println("SALE : " + java.poll());
           java.offer("JOEL");
            System.out.println("Java:  " + java.poll() + " , " + java.poll() + " , " + java.poll()+ "\n");
           }
     
     static void ColaPrioridad(){
           System.out.println("Ejericios cola : el menor numero atiende primero"); 
           
           Queue<Integer> java = new PriorityQueue<>();
           java.offer(5);
           java.offer(2);
           java.offer(3);
          
            System.out.println("Java:  " + java.poll() + " , " + java.poll() + " , " + java.poll()+ "\n");
           }
     
     static void ColaDoble(){
           System.out.println("Ejericios cola doble (DEQUE) : Permite usar ambos extremos"); 
           
           Deque<String> java = new ArrayDeque<>();
           java.offerLast("ANA");
           java.offerLast("EUSTAQUIO");
           java.offerFirst("CHARLIE");
         
            System.out.println("Java: Sale del inicio  " + java.pollFirst() + " , " + java.pollLast() + " , Sale del final " + java.pollLast());
           }
}

