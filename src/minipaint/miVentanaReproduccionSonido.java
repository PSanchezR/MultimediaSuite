/*
<<copyright 2013 Pablo Sánchez Robles>>
This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
     any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
*/
/*
 * miVentanaReproduccionSonido.java
 *
 * Created on 21-may-2013, 10:58:59
 */

package minipaint;

import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineEvent.Type;
/**
 *Clase que gestiona la reproducción de sonidos sin codificar tipo wave.
 * @author pablosanchezrobles
 */
public class miVentanaReproduccionSonido extends javax.swing.JInternalFrame {
    SMSoundPlayer player;
    /** Creates new form miVentanaReproduccionSonido */
    public miVentanaReproduccionSonido(File f)
    {
        initComponents();
        player = new SMSoundPlayer(f);
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonPlaySonido = new javax.swing.JToggleButton();
        botonStopSonido = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setMaximumSize(new java.awt.Dimension(150, 50));
        setMinimumSize(new java.awt.Dimension(150, 50));
        setPreferredSize(new java.awt.Dimension(210, 130));
        setSize(new java.awt.Dimension(210, 130));

        botonPlaySonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/PlayPressed_48x48.png"))); // NOI18N
        botonPlaySonido.setMaximumSize(new java.awt.Dimension(95, 29));
        botonPlaySonido.setPreferredSize(new java.awt.Dimension(95, 29));
        botonPlaySonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPlaySonidoActionPerformed(evt);
            }
        });
        getContentPane().add(botonPlaySonido, java.awt.BorderLayout.WEST);

        botonStopSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/StopDisabled_48x48.png"))); // NOI18N
        botonStopSonido.setPreferredSize(new java.awt.Dimension(95, 29));
        botonStopSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStopSonidoActionPerformed(evt);
            }
        });
        getContentPane().add(botonStopSonido, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPlaySonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPlaySonidoActionPerformed
       player.play();
       botonStopSonido.setSelected(false);
       botonStopSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/StopNormalRed_48x48.png")));
       botonPlaySonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/PlayDisabled_48x48.png")));

       LineListener l=new LineListener()
        {
            public void update(LineEvent event)
            {
                //if(event.getType()==Type.START) {}
                if(event.getType()==Type.STOP)
                {
                    botonPlaySonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/PlayPressed_48x48.png")));
                    botonStopSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/StopDisabled_48x48.png")));
                }
            }
        };
        player.setLineListener(l);
    }//GEN-LAST:event_botonPlaySonidoActionPerformed

    private void botonStopSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStopSonidoActionPerformed
        player.stop();
        botonPlaySonido.setSelected(false);
        botonStopSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/StopDisabled_48x48.png")));
        botonPlaySonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/PlayPressed_48x48.png")));
    }//GEN-LAST:event_botonStopSonidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonPlaySonido;
    private javax.swing.JToggleButton botonStopSonido;
    // End of variables declaration//GEN-END:variables

}
