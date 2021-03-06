/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */

package practicas.pract8.partes;

import practicas.pract8.PanelBase;

import java.awt.Color;
import java.awt.Graphics;

public class Parte2_1 extends PanelBase {

    private final int[] X = {-4,4,8,-8};
    private final int[] Y = {4,4,-4,-4};

    /**
     * Unico constructor de la clase PanelBase el cual solicita un valor booleano para
     * elegir la metodologia a utilzar para realizar los dibujos graficos.
     * <br><br>
     * Si es <b>true</b> se utilizara el metodo de vectores, de lo contrario
     * si es <b>false</b> se utilizara el metodo de algoritmos.
     *
     * @param metodo Valor booleano que permite seleccionar que tipo de metodo utilizar:
     *               si <b>true</b> vectorial de lo contrario si <b>false</b> algoritmos.
     */
    public Parte2_1(boolean metodo) {
        super(metodo);
    }

    /**
     * Dibuja 2 trapecios y un trapecio original (de color negro) en donde los otros dos trapecios
     * se tranladan a diferentes posiciones siendo iguales al original.
     * @param g Objeto grafico del invocador.
     */
    private void parte1(Graphics g){
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        //TRANSLACIÓN A
        mapa.rellenarPoligonoEscalar(X,Y,9,-15,Color.RED,Color.BLACK,g);

        //TRANSLACIÓN B
        mapa.rellenarPoligonoEscalar(X,Y,-10,7,Color.BLUE,Color.BLACK,g);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte1(g);
    }
}
