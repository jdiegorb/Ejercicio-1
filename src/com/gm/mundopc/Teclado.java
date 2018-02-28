
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private final int idTeclado;
    private static int contTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++contTeclado;
    }

    @Override
    public String toString() {
        return " Teclado {Id Teclado : "+idTeclado+", "+super.toString();
    }
    
    
}
