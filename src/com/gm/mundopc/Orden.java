
package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private static int ContOrdenes;
    private int contComp;
    private static final int maxComp = 10;

    public Orden() {
        idOrden = ++ContOrdenes;
        computadoras = new Computadora[maxComp];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(contComp < maxComp){
           computadoras[contComp++] = computadora;
        }else{
            System.out.println("A superado el Maximo de Computadoras"+maxComp);
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Computadoras de la orden #" + idOrden + ":");
        for (int i = 0; i < contComp; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
