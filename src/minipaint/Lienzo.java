
package minipaint;

 import java.awt.Color;
import java.awt.geom.*;
import java.awt.Shape;
import java.awt.BasicStroke;
import java.awt.image.BufferedImage;
import java.awt.geom.Dimension2D;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.color.ColorSpace;
import java.awt.image.AffineTransformOp;
import java.awt.image.ColorConvertOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.LookupTable;
import java.awt.image.RescaleOp;
import java.util.ArrayList;
/**
 * Clase que gestiona figuras e imagenes pintadas sobre un lienzo.
 * @author Pablo Sánchez Robles
 */
public class Lienzo extends javax.swing.JPanel {
private
        /*
         * TIPOS DE TRAZOS
         */
            static final int TRAZO_CONTINUO = 0;
            static final int TRAZO_DISCONTINUO = 1;
            static final int TRAZO_ESQUINAS_REDONDAS = 2;
            static final int TRAZO_ESQUINAS_CORTADAS = 3;
            static final int TRAZO_DISCONTINUO_PUNTO_RALLA= 4;
        /*
         * TIPOS DE FORMAS
         */
            static final int PUNTO = 0;
            static final int LINEA = 1;
            static final int RECTANGULO = 2;
            static final int ELIPSE = 3;
            static final int LIBRE = 4;
            static final int TEXTO = 5;

         /*
          * ATRIBUTOS DE CLASE
          */
            int forma, tipoTrazo, tipoDegradado, filtro, borde,transparencia;
            Color color,colorTrazo,segColor;
            boolean relleno, editar, gradual;
            ArrayList<MiFigura> vFormas;
            ArrayList<Shape> trazoLibre;
            Line2D linea;
            Shape s;
            BufferedImage img, imgFuente, imgCopiaSeguridad;
            BasicStroke trazo;
            float brillo,contraste;
            double escala,angulo;
     
            Point2D inicioLibre, finLibre;

    public Lienzo() {
        initComponents();
        forma = 99;
        color = Color.WHITE;
        colorTrazo = Color.WHITE;
        segColor = Color.WHITE;
        relleno = false;
        vFormas = new ArrayList<MiFigura>();
        tipoTrazo = 0;
        brillo = 0;
        contraste = 1;
        escala = 1;
        angulo = 0;
        filtro = KernelProducer.TYPE_ENFOQUE_3x3;
        gradual = false;
        tipoDegradado = 0;
        trazoLibre = new ArrayList<Shape>();
        transparencia = 255;
    }
    /*
     * Métodos Set de Lienzo
     */
    public void setTransparencia(int t){transparencia = t;}
    public  void setImgCopiaSeguridad(BufferedImage i){imgCopiaSeguridad = i;setImageFuente(i);}
    public void setForma(int form){forma = form;}
    public void setcolor(Color col){color = col;}
    public void setRelleno(boolean rel){relleno = rel;}
    public void setEditar(boolean ed){editar = ed;}
    public void setTrazo(BasicStroke tr){trazo = tr;}
    public void setTipoTrazo(int tipo){ tipoTrazo = tipo;}
    public void setImage(BufferedImage i){img = i;}
    public void setBrillo(float bri){brillo = bri;}
    public void setImageFuente(BufferedImage i){imgFuente = i;img = i; repaint();}
    public void setContraste(float cont){contraste = cont;}
    public void setFiltro(int fil){filtro = fil;}
    public void setColorTrazo(Color c){colorTrazo = c;}
    public void setEscala(double es){escala = es;}
    public void setAngulo(double a){angulo = a;}
    public void setGradual(boolean gra){gradual = gra;}
    public void setSegCol(Color c){segColor = c;}
    public void setTipoDeg(int t){tipoDegradado = t;}
    public void setBorde(int bor){borde = bor;}
    
    /*
     * Métodos set de Lienzo
     */
    public Shape getSeleccionada(){return s;}
    public int getTransparencia(){return transparencia;}
    public BufferedImage getImgCopiaSeguridad(){return imgCopiaSeguridad;}
    public int getTipoDeg(){return tipoDegradado;}
    public Color getCol(){return segColor;}
    public boolean getGradual(){return gradual;}
    public double getAngulo(){return angulo;}
    public double getEscala(){return escala;}
    public Color getColorTrazo(){return colorTrazo;}
    public int getFiltro(){return filtro;}
    public float getContraste(){return contraste;}
    public float getBrillo(){return brillo;}
    public BufferedImage getImage(){return img;}
    public BufferedImage getImageFuente(){return imgFuente;}
    public BasicStroke getTrazo(){return trazo;}
    public boolean getEditar(){return editar;}
    public int getForma(){return forma;}
    public Color getColor(){return color;}
    public boolean getRelleno(){return relleno;}

    /*
     *Devuelve el objeto MiFigura2D que haya seleccionado si
     *   se ha seleccionado alguno de este tipo.
     */
     public MiFigura2D getMiFigura2DSeleccionada()
    {
        for(int i = 0; i< vFormas.size();i++)
        {
            if(((MiFigura2D)vFormas.get(i)).getFigura().equals(s))
            {
                return ((MiFigura2D)vFormas.get(i));
            }
        } 
        return null;
    }
     /*
     *Devuelve el objeto MiFigura1D que haya seleccionado si
     *   se ha seleccionado alguno de este tipo.
     */
    public MiFigura1D getMiFigura1DSeleccionada()
    {
        for(int i = 0; i< vFormas.size();i++)
        {
            if(((MiFigura1D)vFormas.get(i)).getFigura().equals(s))
            {
                return ((MiFigura1D)vFormas.get(i));
            }
        }
        return null;
    }
    /*
     *Devuelve el objeto MiTrazoLibre que haya seleccionado si
     *   se ha seleccionado alguno de este tipo.
     */
    public MiTrazoLibre getMiTrazoLibreSeleccionado()
    {
         for(int i = 0; i< vFormas.size();i++)
        {
            if(vFormas.get(i) instanceof MiTrazoLibre)
            {
                for(int j = 0; j < ((MiTrazoLibre)vFormas.get(i)).getFigura().size();j++)
                if(((MiTrazoLibre)vFormas.get(i)).getFigura().get(j).equals(s))
                {
                    System.out.println("Trazo libre encontrado");
                    return ((MiTrazoLibre)vFormas.get(i));
                }
            }
        }
        return null;

    }
    /*
     * Devuelve el objeto trazo ya construido a partir de un entero que representa su posición
     * en en la lista desplegable del GUI
     */
    public BasicStroke getTipoTrazo(int tipo)
    {
        switch(tipo)
        {
         case TRAZO_CONTINUO:
             trazo = new BasicStroke(borde);
             break;
         case TRAZO_DISCONTINUO:
             float dash1[]={10.0f};
             trazo = new BasicStroke(borde,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER,10.0f,dash1,0.0f);
             break;
         case TRAZO_ESQUINAS_REDONDAS:
             trazo = new BasicStroke(borde, BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
             break;
         case TRAZO_ESQUINAS_CORTADAS:
             trazo = new BasicStroke(borde, BasicStroke.CAP_SQUARE,BasicStroke.JOIN_BEVEL);
             break;
            case TRAZO_DISCONTINUO_PUNTO_RALLA:
                float dash2[]={10.0f,5.0f, 2.0f,5.0f};
              trazo = new BasicStroke(borde,BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER,10.0f,dash2,0.0f);
                break;
        }
        return trazo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        linea = new Line2D.Float(evt.getPoint(),evt.getPoint());
        if((!editar) && (forma <20))
        {
            if(forma == LIBRE)
            {
                inicioLibre = evt.getPoint();
                finLibre = inicioLibre;
                Shape aux = new Line2D.Float(inicioLibre, finLibre);
                trazoLibre.add(aux);
            }
            createShape();
        }else
        {
            s = getSelectedShape(evt.getPoint());
        }
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        linea.setLine(linea.getP1(),evt.getPoint());
        if(editar)
        {
            if(linea != null)moveShape(evt.getPoint());
        }
        else
        {   
            if(forma == LIBRE)
            {
                trazoLibre = new ArrayList<Shape>();
            }
            updateShape();
        }
        repaint();
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        if(forma != LIBRE)
        {
            if((!editar) && (forma < 20))
            {
                linea.setLine(linea.getP1(),evt.getPoint());
                updateShape();
            }
        }else
        {
            if(!editar)
            {
                finLibre = evt.getPoint();
                Shape aux = new Line2D.Float(inicioLibre, finLibre);
                trazoLibre.add(aux);
                inicioLibre = finLibre;
            }
        }
        if(editar)
        {
            moveShape(evt.getPoint());
        }
         repaint();
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    /*
     * Devuelve true si la distancia entre el punto y la línea es menor o igual a 2.0.
     */
    private boolean isNear(Line2D line, Point2D p)
    {
        return line.ptLineDist(p)<=2.0;
    }

    /*
     * Devuelve la figura que se ha seleccionado.
     */
    public Shape getSelectedShape(Point2D p)
    {
        Shape aux;
        for(int i = 0; i < vFormas.size();i++)
        {
            aux = (Shape)(((MiFigura1D)vFormas.get(i)).getFigura());
            forma = (((MiFigura)vFormas.get(i)).getTipo());
            s = aux;
            if(aux instanceof Line2D)
            {
                 if(isNear((Line2D)aux,p)) return aux;
            }else
            {
               if(aux.contains(p))return aux;
            }
        }
        return null;
    }


    /*
     *Mueve la figura seleccionada hacia la nueva posición.
     */
    public void moveShape(Point2D p1)
    {
        if(s instanceof Line2D)
        {
            Line2D l = (Line2D) s;
            double dx = l.getP2().getX()-l.getP1().getX();
            double dy = l.getP2().getY()-l.getP1().getY();
            Point2D p2 = new Point2D.Double(p1.getX()+dx,p1.getY()+dy);
            l.setLine(p1,p2);
        }
        else if(s instanceof Rectangle2D)
        {
            Dimension2D d2= new Dimension();
            d2.setSize(((Rectangle2D)s).getWidth(),((Rectangle2D)s).getHeight());
            ((Rectangle2D)s).setFrame(p1, d2);
        }
        else if(s instanceof Ellipse2D)
        {
            Dimension2D d2= new Dimension();
            d2.setSize(((Ellipse2D)s).getWidth(),((Ellipse2D)s).getHeight());
            ((Ellipse2D)s).setFrame(p1, d2);
        }
        repaint();
    }

    /*
     * Actualiza la figura para que veamos el proceso de construcción en movimiento.
     */
    public void updateShape()
    {
        if(s instanceof Line2D)
        {
            if(forma == 0)((Line2D)s).setLine(linea.getP2(),linea.getP2());
            else((Line2D) s).setLine(linea.getP1(), linea.getP2());
        }
        else if(s instanceof Rectangle2D)
        {
            ((Rectangle2D)s).setFrameFromDiagonal(linea.getP1(), linea.getP2());
            
        }
        else if(s instanceof Ellipse2D)
        {
            ((Ellipse2D)s).setFrameFromDiagonal(linea.getP1(), linea.getP2());
        }
    }


    /*
     * Crea la figura con los atributos que se espicifiquen en el interfaz gráfico.
     */
    public void createShape()
    {
         MiFigura mf = null;
         getTipoTrazo(tipoTrazo);
         System.out.println(relleno);
         switch(forma)
         {
             case PUNTO:
                    s = new Line2D.Float();
                    mf = new MiFigura1D(colorTrazo,trazo,forma,s);
             break;
             case LINEA:
                   s = linea;
                   mf = new MiFigura1D(colorTrazo,trazo,forma,s);
             break;
             case RECTANGULO:
                    s = new Rectangle2D.Double();
                    mf = new MiFigura2D(colorTrazo,trazo,forma,s,color,segColor,relleno,gradual,tipoDegradado);
                   
             break;
             case ELIPSE:
                    s = new Ellipse2D.Double();
                    mf = new MiFigura2D(colorTrazo,trazo,forma,s,color,segColor,relleno,gradual,tipoDegradado);
             break;
             case LIBRE:
                    mf = new MiTrazoLibre(colorTrazo,trazo,forma,trazoLibre);
             break;
         }
        //añade la figura al vector de formas de este lienzo.
        vFormas.add(mf);
    }
                     /*
                     * TRATAMIENTO DE IMÁGENES
                     */
    /*
     * Realiza los cambios relativos al contraste y brillo de la imagen.
     */
    public void convolveOp()
    {
        BufferedImage imgSource =  getImageFuente();
        try{
            if(imgSource!=null)
            {
                Kernel k = KernelProducer.createKernel(getFiltro());
                System.out.println(k);
                ConvolveOp cop = new ConvolveOp( k );
                BufferedImage imgdest = cop.filter(imgSource,null);
                setImage(imgdest);
                repaint();
            }
        }catch(IllegalArgumentException e){System.err.println(e.getLocalizedMessage());}
    }

    /*
     * Realiza los cambios relativos a las transformaciones de la imagen.
     */
    public void rescaleOP()
    {
        BufferedImage imgSource = getImageFuente();
        try{
            if(imgSource!=null)
            {
                RescaleOp rop = new RescaleOp(getContraste(),getBrillo(),null);
                BufferedImage imgdest = rop.filter(imgSource,null);
                setImage(imgdest);
                repaint();
            }
        }catch(IllegalArgumentException e){System.err.println(e.getLocalizedMessage());}
    }
    
    /*
     * Cambia la escala de la imagen.
     */
    public void escalar()
    {
        BufferedImage fuente = getImageFuente();
        BufferedImage dest;
        AffineTransform at;
        AffineTransformOp atop;

        if(fuente != null)
        {
            try
            {
                at = AffineTransform.getScaleInstance(getEscala(),getEscala());
                atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
                dest = atop.filter(fuente, null);
                setImage(dest);
                repaint();
            }catch(Exception e){System.err.println("Error");}
        }
    }

    /*
     *  Gira la imagen con respecto a un eje situado en el centro de la misma.
     */

    public void rotar()
    {
        BufferedImage fuente = getImageFuente();
        BufferedImage dest;
        double r= Math.toRadians(getAngulo());
        Point p;
        AffineTransform at;
        AffineTransformOp atop;
        if(fuente != null)
        {
            try
            {

                p = new Point(fuente.getWidth()/2, fuente.getHeight()/2);

                at = AffineTransform.getRotateInstance(r,p.x,p.y);

                atop = new AffineTransformOp(at,AffineTransformOp.TYPE_BILINEAR);
                dest = atop.filter(fuente, null);
                setImage(dest);
                repaint();
                }catch(Exception e){System.err.println("Error");}
            }
         }

         /*
          * Cambia el contraste de la imagen.
          */
         public void contrastar(int tipo)
         {
            LookupTable lut= LookupTableProducer.createLookupTable(tipo);
            BufferedImage fuente = getImageFuente();
            BufferedImage dest;
            LookupOp lop;
            if(fuente != null)
            {
                try
                {
                    lop = new LookupOp(lut,null);
                    dest= lop.filter(fuente, null);
                    setImage(dest);
                    repaint();
                }catch(Exception e){System.err.println("Error");}
            }
         }

         public void imagenGamaGrises()
         {
            BufferedImage imgSource = getImageFuente(), imgGris;
            ColorSpace espacioColores = ColorSpace.getInstance(ColorSpace.CS_GRAY);
            ColorConvertOp  conversorColor = new ColorConvertOp(espacioColores,null);
            imgGris = conversorColor.filter(imgSource, null);
            setImage(imgGris);
            repaint();
         }


  public void moverPosicionFigura(MiFigura mf,boolean subir)
  {
      int posI = vFormas.size();
      MiFigura aux;
      for(int i = 0; i< vFormas.size(); i++)
      {

          if(mf.equals(vFormas.get(i)))
          {
            posI = i;
          }
      }
      if(posI < vFormas.size())
      {

          if(subir && posI< vFormas.size()-1)
          {
              aux = vFormas.get(posI+1);
              vFormas.set(posI+1,mf);
              vFormas.set(posI, aux);
          }
          else if(!subir && posI > 0)
          {
              aux = vFormas.get(posI-1);
              vFormas.set(posI-1,mf);
              vFormas.set(posI, aux);
          }
      }
      repaint();
  }

    /*
     * El método paint sobrecargado se encarga de pintar en el lienzo tanto las figuras que se van generando
     * como la imagen que se cargue de un archivo.
     */
 @Override

 public void paint(Graphics g)
 {
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        try{
            //Si la variable imagen no es nula se carga en el lienzo.
            if(img != null)
            {
                    g2d.drawImage(img, null, this);
            }

            //Se recorre el vector formas y se pinta cada una de ellas en el lienzo con sus atributos específicos.
            for(int i = 0; i < vFormas.size();i++)
            {
                if(vFormas.get(i) instanceof MiFigura2D)
                {
                    g2d.setColor(((MiFigura2D)vFormas.get(i)).getColor1());
                }
                g2d.setStroke(((MiFigura)vFormas.get(i)).getBorde());
               //Si la figura pertenece a MiFigura2D

                if(vFormas.get(i) instanceof MiFigura2D)
                {
                     //Si la figura tiene relleno
                    if(((MiFigura2D) vFormas.get(i)).getRelleno())
                    {
                        //Si la figura tiene un degradado
                        if(((MiFigura2D)vFormas.get(i)).getGradual())
                        {
                            Point p1, p2;
                            int x1, y1,x2,y2;
                            /*
                             *Calculo x1 e y1 de esta forma para que el degradado sea en función de la figura
                             *y no del lienzo.
                             */
                            x1 = (int)((MiFigura2D)vFormas.get(i)).getFigura().getBounds2D().getMinX();
                            y1 = (int)((MiFigura2D)vFormas.get(i)).getFigura().getBounds2D().getMinY();
                            x2 = (int)((MiFigura2D)vFormas.get(i)).getFigura().getBounds2D().getMaxX();
                            y2 = (int)((MiFigura2D)vFormas.get(i)).getFigura().getBounds2D().getMaxY();
                            p1 = new Point(x1,y1);
                            try{
                                //Tipo de degradado horizontal.
                                if(((MiFigura2D)vFormas.get(i)).getTipoDegradado()== 0)
                                {
                                    p2 = new Point(x2,y1);
                                    GradientPaint gp = new GradientPaint(p1,((MiFigura2D)vFormas.get(i)).getColor1(),p2,((MiFigura2D)vFormas.get(i)).getColor2());
                                    g2d.setPaint(gp);
                                }
                                //Tipo de degradado vertical.
                                else if(((MiFigura2D)vFormas.get(i)).getTipoDegradado()== 1)
                                {
                                    p2 = new Point(x1,y2);
                                    GradientPaint gp = new GradientPaint(p1,((MiFigura2D)vFormas.get(i)).getColor1(),p2,((MiFigura2D)vFormas.get(i)).getColor2());
                                    g2d.setPaint(gp);
                                }
                                //Tipo de degradado radial.
                                else
                                {
                                    p1 = new Point((x2-((x2-x1)/2)),(y2-((y2-y1)/2)));
                                    float diametro =Math.abs((x2-x1)/2) ;
                                    RadialGradientPaint rgp = new RadialGradientPaint(p1,diametro,new float[]{0.0f,0.8f},
                                            new Color[]{((MiFigura2D)vFormas.get(i)).getColor1(),((MiFigura2D)vFormas.get(i)).getColor2()},RadialGradientPaint.CycleMethod.NO_CYCLE);
                                    g2d.setPaint(rgp);
                                }
                            }catch(Exception e){System.out.println(e.getMessage());}
                        }else
                        {
                        }
                       g2d.fill(((MiFigura2D)vFormas.get(i)).getFigura());
                    }
                    g2d.setColor(((MiFigura1D)vFormas.get(i)).getColorTra());
                    g2d.draw(((MiFigura2D)vFormas.get(i)).getFigura());
                }
                else if(vFormas.get(i) instanceof MiFigura1D)
                {
                    g2d.setColor(((MiFigura1D)vFormas.get(i)).getColorTra());
                    g2d.draw(((MiFigura1D)vFormas.get(i)).getFigura());
                }
                else if(vFormas.get(i) instanceof MiTrazoLibre)
                {
                    g2d.setColor(((MiTrazoLibre)vFormas.get(i)).getColorTra());
                    for(Shape parte : ((MiTrazoLibre)vFormas.get(i)).getFigura())
                    {
                        g2d.draw(parte);
                    }
                }
            }
        }catch(Exception e){System.out.println(e.getMessage());}
    }
}