package tarea6ed;

import java.util.logging.Logger;

public class Tarea6EDClase {

    private static final Logger logger = Logger.getLogger(Tarea6EDClase.class.getName());

    public void aplicarDescuento(double precioProducto, int numProductos) {
        CALCULO_DESCUENTO(numProductos, precioProducto);
    }

    private static final double DESCUENTO_ALTO = 0.95;
    private static final double DESCUENTO_BAJO = 0.8;
    private static final int PRECIO_UNIDAD = 5;

    private void CALCULO_DESCUENTO(int numProductos, double precioProducto) {
        double total;
        if (numProductos > 3) {
            precioProducto -= PRECIO_UNIDAD;
            if (numProductos != 0) {
                total = precioProducto * DESCUENTO_BAJO;
                logger.info(() -> "El total a pagar es: " + total);
                logger.info(() -> "Enviado");
            } else {
                total = precioProducto * DESCUENTO_ALTO;
                logger.info(() -> "El total a pagar es: " + total);
                logger.info(() -> "Enviado");
            }
        }
    }
}
