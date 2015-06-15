/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minipaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;

/**
 *  Clase que crea figuras de una dimensión(puntos y rallas).
 * @author pablosanchezrobles
 */
public class MiFigura1D extends MiFigura
{
    Shape figura;
    public MiFigura1D(Color c, BasicStroke trazo,int tipo, Shape s)
    {
        super(c,trazo,tipo);
        figura = s;
    }

    public void setFigura(Shape s){figura = s;}
    public Shape getFigura(){return figura;}


}
