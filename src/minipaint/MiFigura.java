/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minipaint;
import java.awt.Color;

import java.awt.Shape;
import java.awt.BasicStroke;
/**
 *  Clase abstracta de la que heredan los demás tipos de figuras.
 * @author Pablo Sánchez Robles
 *
 */

public abstract class MiFigura {

    private int tipo;
    private Color colorTrazo;
    private BasicStroke borde;

    public MiFigura(Color c, BasicStroke bord,int tip)
    {
        borde = bord;
        tipo= tip;
        colorTrazo = c;
    }
    
    public BasicStroke getBorde(){return borde;}
    public int getTipo(){return tipo;}
    public Color getColorTra(){return colorTrazo;}

    public void setColorTra(Color ct){colorTrazo = ct;}
    public void setTipo(int ti){tipo = ti;}
    public void setBorde(BasicStroke bord){borde = bord;}
}
