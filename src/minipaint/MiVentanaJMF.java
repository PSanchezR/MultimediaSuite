/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MiVentanaJMF.java
 *
 * Created on 27-jun-2013, 17:18:23
 */

package minipaint;
import java.awt.Component;
import javax.media.*;
import java.io.File;
import java.net.URL;
import javax.media.format.AudioFormat;
import javax.media.format.VideoFormat;


/**
 * Reproductor de vídeo basado en JMF
 * @author Pablo Sánchez Robles
 */
/*
 * Clase que se encarga de la reproducción de vídeos mediante el uso de JMF.
 * Implementa el interfaz ControllerListener para poder gestionar los controles
 * del vídeo tales como rebobinado al terminar, etc.
 */
public class MiVentanaJMF extends javax.swing.JInternalFrame implements ControllerListener{

    Player reproductor = null;
    Component componenteVideo;
    Component componenteControl;
    String decodificador;
    Codec codec;

    /*
     * Constructor privado sólo accesible mediante getInstance, que genera la reproducción
     * del archivo de vídeo que recibe
     */
    private MiVentanaJMF(File f)
    {
        initComponents();
        this.setTitle("Reproductor");
        try{

            URL url = f.toURL();
            String Formato = url.toString().toUpperCase();
            //Según el formato abre un decodificador u otro e inicia el reproductor.
            if(Formato.endsWith(".MP3") ||Formato.endsWith(".AC3") || Formato.endsWith(".VORBIS"))
            {
                decodificador = "net.sourceforge.jffmpeg.AudioDecoder";
                codec = (Codec) Class.forName(decodificador).newInstance();
                PlugInManager.addPlugIn(decodificador, codec.getSupportedInputFormats(),
                    new Format[]{new AudioFormat("LINEAR")}, PlugInManager.CODEC);
                reproductor = Manager.createRealizedPlayer(url);
            }else
            {
                decodificador = "net.sourceforge.jffmpeg.VideoDecoder";
                codec = (Codec) Class.forName(decodificador).newInstance();
                PlugInManager.addPlugIn(decodificador, codec.getSupportedInputFormats(),
                    new Format[]{new VideoFormat("LINEAR")}, PlugInManager.CODEC);
                reproductor = Manager.createRealizedPlayer(url);
                componenteVideo = reproductor.getVisualComponent();
            }
             componenteControl = reproductor.getControlPanelComponent();
             if(componenteVideo != null)panelVideo.add("Center",componenteVideo);
             if(componenteControl != null)panelControles.add("Center",componenteControl);
            
                this.play();
            
        }catch(Exception e){e.printStackTrace();}
        
    }

    

    public Player getPlayer()
    {
        return reproductor;
    }

    public void close()
    {
        reproductor.stop();
        reproductor.close();
    }

    public void play()
    {
        reproductor.start();  
    }

    /*
     * Crea una instancia de MiVentanaJMF
     */
   public static MiVentanaJMF getInstance(File fichero)
    {
     try{
            MiVentanaJMF mviJMF = new MiVentanaJMF(fichero);
            return mviJMF;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }

   //Actualizador de los controles del reproductor.
   public synchronized void controllerUpdate(ControllerEvent event) {
    //Comprobamos que el reproductor está no es null
    if (reproductor == null) return;
    //Qué evento se ha producido?
    //Si el reproductor ha entrado en estado realizado correctamente
    if (event instanceof RealizeCompleteEvent) {
      componenteControl = reproductor.getControlPanelComponent();
      componenteVideo = reproductor.getVisualComponent();
      //Se añade el componente de visualización y el de control a la UI
      if (componenteVideo != null){
        panelVideo.add("Center",componenteVideo);
      }
      if (componenteControl != null) {
        panelControles.add(componenteControl);
      }      
    }
    //Si se ha alcanzado el final del contenido que se está reproduciendo
    else if (event instanceof EndOfMediaEvent) {
      //"Rebobinamos" el contenido multimedia
      reproductor.setMediaTime(new Time(0));
      reproductor.stop();
  
    }
    //Si se produce un error 
    else if (event instanceof ControllerErrorEvent) {
      reproductor = null;
      System.err.println( ( (ControllerErrorEvent) event).getMessage());
    }
  }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVideo = new javax.swing.JPanel();
        panelControles = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panelVideo.setMinimumSize(new java.awt.Dimension(333, 225));
        panelVideo.setPreferredSize(new java.awt.Dimension(300, 335));
        panelVideo.setSize(new java.awt.Dimension(300, 225));
        panelVideo.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelVideo, java.awt.BorderLayout.CENTER);

        panelControles.setPreferredSize(new java.awt.Dimension(394, 50));
        panelControles.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelControles, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        close();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelVideo;
    // End of variables declaration//GEN-END:variables

}