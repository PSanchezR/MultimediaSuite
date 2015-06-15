/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * miVentanaGrabacionSonido.java
 *
 * Created on 21-may-2013, 11:06:52
 */

package minipaint;
import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineEvent.Type;
/**
 * Clase que gestiona la grabación sonidos del dispositivo micrófono.
 * @author pablosanchezrobles
 */
public class miVentanaGrabacionSonido extends javax.swing.JInternalFrame {
    SMSoundRecorder recorder;
  
    /** Creates new form miVentanaGrabacionSonido */
    public miVentanaGrabacionSonido(File f) {
        initComponents();
        recorder = new SMSoundRecorder(f);
        botonGrabacionSonido.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/RecordDisabled_48x48.png")));
        botonStopGrabacion.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/stopDisabled_48x48.png")));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBotones = new javax.swing.JPanel();
        botonGrabacionSonido = new javax.swing.JToggleButton();
        botonStopGrabacion = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setToolTipText("Ventana de grabación de audio");
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(213, 78));
        setSize(new java.awt.Dimension(313, 178));

        panelBotones.setPreferredSize(new java.awt.Dimension(190, 49));
        panelBotones.setLayout(new java.awt.GridLayout());

        botonGrabacionSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/RecordPressed_48x48.png"))); // NOI18N
        botonGrabacionSonido.setMinimumSize(new java.awt.Dimension(95, 29));
        botonGrabacionSonido.setPreferredSize(new java.awt.Dimension(95, 29));
        botonGrabacionSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrabacionSonidoActionPerformed(evt);
            }
        });
        panelBotones.add(botonGrabacionSonido);

        botonStopGrabacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/StopDisabled_48x48.png"))); // NOI18N
        botonStopGrabacion.setPreferredSize(new java.awt.Dimension(95, 29));
        botonStopGrabacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStopGrabacionActionPerformed(evt);
            }
        });
        panelBotones.add(botonStopGrabacion);

        getContentPane().add(panelBotones, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGrabacionSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrabacionSonidoActionPerformed
        try{
       
        recorder.record();
        botonStopGrabacion.setSelected(false);
        botonGrabacionSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/RecordDisabled_48x48.png")));
        botonStopGrabacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/StopNormalRed_48x48.png")));
        LineListener l=new LineListener()
        {
            public void update(LineEvent event) {
            if(event.getType()==Type.START) {
                
            }
            if(event.getType()==Type.STOP) {
                botonGrabacionSonido.setSelected(false);
            }
            }
        };
        recorder.setLineListener(l);
       }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_botonGrabacionSonidoActionPerformed

    private void botonStopGrabacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStopGrabacionActionPerformed
       recorder.stop();
       botonGrabacionSonido.setSelected(false);
       botonStopGrabacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/StopDisabled_48x48.png")));
       botonGrabacionSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/RecordPressed_48x48.png")));
    }//GEN-LAST:event_botonStopGrabacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonGrabacionSonido;
    private javax.swing.JToggleButton botonStopGrabacion;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables

};
