/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minipaint;

/**
 *
 * @author pablosanchezrobles
 */
public class Main {

   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

}
