/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.colasinlibreria;

/**
 *
 * @author ESTUDIANTES
 */
public class Colasinlibreria {

    public static void main(String[] args) {
        System.out.println("Hello brou, ejercicio de cola sin libreria");
        
        
        simple();
        circular();
        prioridad();
        doble();
    }
    
    static void simple(){
        System.out.println("1. cola simple : primero en llegar , primero en salir ");
        
        EncolarSimple("Ana");
        EncolarSimple("luis");
        EncolarSimple("marta");
       
    }
    
      static void circular(){
    }
    
        static void prioridad(){
    }
    
          static void doble(){
    }
    
          //operaciones propias : arreglos, indice y ciclos ; sin clases ni librerias
          
          private static final String[] datosSimple = new String[5];
          private static int cantidadSimple = 0;
          
          
          static void  EncolarSimple(String nombre){
              
              if (cantidadSimple == datosSimple.length)throw new IllegalStateException ("cola esta llena");
              
              datosSimple[cantidadSimple++]=nombre;
          }
          
          static String  DesencolarSimple(String nombre){
              if (cantidadSimple==0)return null;
              
              
              String primero = datosSimple[0];
              for (int i =0; i < cantidadSimple -1; i ++)
                  
                  datosSimple[i] = datosSimple[i + 1];
              
              datosSimple[--cantidadSimple]= null;
              return primero;
                  
                  
          }
          
          static void AgregarInicioSimple(String nombre ){
              if (cantidadSimple == datosSimple.length)throw new IllegalStateException ("cola esta llena");
              
              for (int i =0; i < cantidadSimple -1; i ++)
                  
                  datosSimple[i] = datosSimple[i + 1];
              
              datosSimple[0]=nombre;
              cantidadSimple++;
          }
          
          static String retirarfinalSimple(){
               if (cantidadSimple==0)return null;
               String ultimo = datosSimple[--cantidadSimple];
               datosSimple[cantidadSimple]=null;
               return ultimo;
          }
          
          private static final String []datosCircular= new String[3];
          private static int frenteCircular=0;
          private static int finCircular=0;
          private static int CantidadCircular=0;
          
          static void EncolarCircular(String nombre){
              
              
                if (CantidadCircular == datosCircular.length)throw new IllegalStateException ("cola esta llena");
              
              datosCircular[finCircular]=nombre;
              finCircular=(finCircular + 1) % datosCircular.length;
              CantidadCircular++;
              
                        }
          static String DesencolarCircular(){
                  
                  if (CantidadCircular==0)return null;
                  String primero = datosCircular[frenteCircular];
                  datosCircular[frenteCircular]=null;
                  frenteCircular=(frenteCircular+1)%datosCircular.length;
                  
                  CantidadCircular--;
                  return primero;
              }

          private static final Integer[]datosprioridad = new Integer [5];
          
          private static int Cantidadprioridad=0;
          
               
          static void Encolarprioridad(int prioridad){
              
              
                if (Cantidadprioridad == datosprioridad.length)throw new IllegalStateException ("cola esta llena");     
          
              datosprioridad[Cantidadprioridad++] = prioridad;
              
                
    }

          static Integer Desencolarprioridad(){
            if  (Cantidadprioridad==0) return null;
            int mejor=0;
            
            for(int i=1 ; i<Cantidadprioridad ; i++){
                if (datosprioridad[i]<datosprioridad[mejor]) mejor=i;
                
            }
            Integer resultado = datosprioridad[mejor];
            for(int i=mejor ; i<Cantidadprioridad - 1 ; i++)datosprioridad[i]=datosprioridad[i + 1];
            datosprioridad[--Cantidadprioridad] = null;
            return resultado;
            }
          
          }
