/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minipaint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.util.ArrayList;

/**
 * Clase que crea figuras del tipo trazo libre.
 * @author pablosanchezrobles
 */
public class MiTrazoLibre extends MiFigura
{
    ArrayList<Shape> figura = new ArrayList<Shape>();
    public ArrayList<Shape> getFigura(){return figura;}

    public MiTrazoLibre(Color c, BasicStroke trazo,int tipo, ArrayList<Shape> fig)
    {
        super(c,trazo,tipo);
        figura = fig;
    }
}

