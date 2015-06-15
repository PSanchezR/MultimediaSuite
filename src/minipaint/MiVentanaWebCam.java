/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MiVentanaWebCam.java
 *
 * Created on 28-jun-2013, 11:33:41
 */

package minipaint;
import java.awt.Component;
import java.util.List;

import javax.media.*;
import javax.media.format.YUVFormat;
/**
 * Clase que muestra las imagenes provenientes de la webcam.
 * @author pablosanchezrobles
 */
public class MiVentanaWebCam extends javax.swing.JInternalFrame {
    Player grabador;
   
    private MiVentanaWebCam() {
        initComponents();
        this.setTitle("WebCam");
        this.play();
    }

    public static MiVentanaWebCam getInstance()
    {
        MiVentanaWebCam mvwc = new  MiVentanaWebCam();
        return mvwc;
    }
    public Player getPlayer()
    {
        return grabador;
    }
    /*
     * Busca el dispositivo de captura de video e inicia el grabador.
     */
    public void play(){
        try {
            CaptureDeviceInfo deviceInfo;
            List<CaptureDeviceInfo> deviceList = CaptureDeviceManager.getDeviceList(new YUVFormat());
            System.out.println(deviceList.size());
            deviceInfo = deviceList.size()>0?deviceList.get(0):null;
            MediaLocator ml = deviceInfo.getLocator();
            Player p = Manager.createRealizedPlayer(ml);
            Component areaVisual = p.getVisualComponent();
            if(areaVisual!=null) this.add(areaVisual);
            Component panelControl = p.getControlPanelComponent();
            if(panelControl!=null) this.add(panelControl);
            p.start();
        } catch(Exception e){System.out.print(e);}
   }
 public void close()
    {
        grabador.stop();
        grabador.close();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCamara = new javax.swing.JPanel();

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

        org.jdesktop.layout.GroupLayout panelCamaraLayout = new org.jdesktop.layout.GroupLayout(panelCamara);
        panelCamara.setLayout(panelCamaraLayout);
        panelCamaraLayout.setHorizontalGroup(
            panelCamaraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 376, Short.MAX_VALUE)
        );
        panelCamaraLayout.setVerticalGroup(
            panelCamaraLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 254, Short.MAX_VALUE)
        );

        getContentPane().add(panelCamara, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
       close();
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelCamara;
    // End of variables declaration//GEN-END:variables

}
