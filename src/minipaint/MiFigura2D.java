/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minipaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;

/**
 * Clase que crea figuras de dos dimensiones(Rectangulos y elipses).
 * @author pablosanchezrobles
 * 
 */

public class MiFigura2D extends MiFigura1D
{
    Color color1=Color.WHITE, color2 = Color.WHITE;
    boolean relleno, gradual;
    int tipoDegradado;

    public MiFigura2D(Color c, BasicStroke trazo,int tipo, Shape s, Color c1, Color c2, boolean rell, boolean gra, int tipdeg)
    {
        super(c,trazo,tipo,s);
        color1 = c1;
        color2 = c2;
        relleno = rell;
        gradual = gra;
        tipoDegradado = tipdeg;

    }

    public void setColor1(Color c1){color1 = c1;}
    public void setColor2(Color c2){color2 = c2;}
    public void setRelleno(boolean rell){relleno = rell;}
    public void setGradual(boolean gra){gradual = gra;}
    public void setTipoDegradado(int tipo){tipoDegradado= tipo;}

    public Color getColor1(){return color1;}
    public Color getColor2(){return color2;}
    public boolean getRelleno(){return relleno;}
    public boolean getGradual(){return gradual;}
    public int getTipoDegradado(){return tipoDegradado;}



}
