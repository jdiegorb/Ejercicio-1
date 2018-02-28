
package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contRaton;
    }

    @Override
    public String toString() {
        return "Raton: {Id Raton: "+idRaton+", "+super.toString(); 
    }

    
    
    
}
