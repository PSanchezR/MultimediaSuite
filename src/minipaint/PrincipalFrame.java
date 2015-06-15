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
package minipaint;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFileChooser;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.media.Buffer;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;
import javax.swing.JOptionPane;
/*
 * Clase principal donde se encuentran todos los elementos del GUI. En ella se gestionan todos los eventos de los elementos del interfaz exceptuando lo relativo al Lienzo y a los botones propios de los objetos de las demás clases.
 * @author pablosanchezrobles
 */
public class PrincipalFrame extends javax.swing.JFrame {

    public PrincipalFrame() {
        initComponents();
        labelSeleccion.setVisible(false);
        panelPesta.setVisible(false);
        herramientasWebCamCaptura.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        panelIneferior = new javax.swing.JPanel();
        labelSeleccion = new javax.swing.JLabel();
        panelPesta = new javax.swing.JTabbedPane();
        herramientasFiguraTrazo = new javax.swing.JToolBar();
        panelEdiciones = new javax.swing.JPanel();
        panelFigura = new javax.swing.JPanel();
        panelTipoFiguraOpcionesTrazo = new javax.swing.JPanel();
        panelTipoFigura = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelFiguras = new javax.swing.JPanel();
        botonOvalo = new javax.swing.JToggleButton();
        botonRectangulo = new javax.swing.JToggleButton();
        botonLinea = new javax.swing.JToggleButton();
        botonPunto = new javax.swing.JToggleButton();
        botonLibre = new javax.swing.JToggleButton();
        panelTrazo = new javax.swing.JPanel();
        panelGrosor = new javax.swing.JPanel();
        labelGrosor = new javax.swing.JLabel();
        spinnerGrosor = new javax.swing.JSpinner();
        panelColCon = new javax.swing.JPanel();
        panelContinuidad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxTrazo = new javax.swing.JComboBox();
        panelColorTrazo = new javax.swing.JPanel();
        botonColorTrazo = new javax.swing.JButton();
        labelTrazo = new javax.swing.JLabel();
        panelOpcionesFigura = new javax.swing.JPanel();
        panelEdit = new javax.swing.JPanel();
        panelChecksFigura = new javax.swing.JPanel();
        checkBoxEditar = new javax.swing.JCheckBox();
        checkBoxGraduado = new javax.swing.JCheckBox();
        checkBoxRelleno = new javax.swing.JCheckBox();
        panelDegradadoTransparenciaColor = new javax.swing.JPanel();
        panelDegradado = new javax.swing.JPanel();
        panelCapa = new javax.swing.JPanel();
        panelProfundidad = new javax.swing.JPanel();
        labelProfundidad = new javax.swing.JLabel();
        botonSubirFigura = new javax.swing.JButton();
        botonBajarCapa = new javax.swing.JButton();
        panelTipoDegradado = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxTipoGraduado = new javax.swing.JComboBox();
        botonColor = new javax.swing.JButton();
        panelTransparencia = new javax.swing.JPanel();
        labelTransparencia = new javax.swing.JLabel();
        sliderTransparencia = new javax.swing.JSlider();
        panelLabelOpcionesFigura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        herramientasImagen = new javax.swing.JToolBar();
        panelEdicionImagen = new javax.swing.JPanel();
        labelOpcionesImagen = new javax.swing.JLabel();
        panelImagen = new javax.swing.JPanel();
        panelFiltroBrilloContraste = new javax.swing.JPanel();
        panelBrilloFiltro = new javax.swing.JPanel();
        panelFiltros = new javax.swing.JPanel();
        labelFiltro = new javax.swing.JLabel();
        comboBoxFiltros = new javax.swing.JComboBox();
        panelBrillo = new javax.swing.JPanel();
        labelBrillo = new javax.swing.JLabel();
        sliderBrillo = new javax.swing.JSlider();
        panelContrastes = new javax.swing.JPanel();
        panelContraste = new javax.swing.JPanel();
        sliderContraste = new javax.swing.JSlider();
        labelContraste = new javax.swing.JLabel();
        panelBotonesContraste = new javax.swing.JPanel();
        botonContrasteNormal = new javax.swing.JButton();
        botonContrasteIluminado = new javax.swing.JButton();
        botonContrasteOscurecido = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonGrises = new javax.swing.JButton();
        botonNegativo = new javax.swing.JButton();
        panelEscalaRotacion = new javax.swing.JPanel();
        panelEscala = new javax.swing.JPanel();
        botonAumentar = new javax.swing.JButton();
        botonDisminuir = new javax.swing.JButton();
        labelEscala = new javax.swing.JLabel();
        panelRotaciones = new javax.swing.JPanel();
        panelBotonesRotacion = new javax.swing.JPanel();
        boton90 = new javax.swing.JButton();
        boton180 = new javax.swing.JButton();
        boton270 = new javax.swing.JButton();
        panelDeslizadorRotacion = new javax.swing.JPanel();
        labelRotacion = new javax.swing.JLabel();
        sliderRotacion = new javax.swing.JSlider();
        panelBotonesGuardarRecuperar = new javax.swing.JPanel();
        botonGuardarCambios = new javax.swing.JButton();
        botonRecuperarImagen = new javax.swing.JButton();
        herramientasWebCamCaptura = new javax.swing.JToolBar();
        grabar = new javax.swing.JButton();
        capturar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNuevo = new javax.swing.JMenu();
        menuNuevaImagen = new javax.swing.JMenuItem();
        menuNuevoSonido = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuVer = new javax.swing.JMenu();
        menuBarraHerr = new javax.swing.JMenu();
        menuBarraHerrFigura = new javax.swing.JCheckBoxMenuItem();
        menuBarraHerrWebcam = new javax.swing.JCheckBoxMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuAyudaAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multimedia Suite 1.0");
        setMinimumSize(new java.awt.Dimension(800, 850));

        escritorio.setMaximumSize(null);
        escritorio.setMinimumSize(null);
        escritorio.setPreferredSize(null);
        getContentPane().add(escritorio, java.awt.BorderLayout.CENTER);

        panelIneferior.setBackground(new java.awt.Color(204, 204, 204));
        panelIneferior.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelIneferior.setMinimumSize(new java.awt.Dimension(416, 30));
        panelIneferior.setPreferredSize(new java.awt.Dimension(416, 30));
        panelIneferior.setLayout(new java.awt.GridLayout(1, 0));
        panelIneferior.add(labelSeleccion);

        getContentPane().add(panelIneferior, java.awt.BorderLayout.PAGE_END);

        panelPesta.setBackground(new java.awt.Color(204, 204, 204));
        panelPesta.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        herramientasFiguraTrazo.setBackground(new java.awt.Color(204, 204, 204));
        herramientasFiguraTrazo.setRollover(true);
        herramientasFiguraTrazo.setPreferredSize(new java.awt.Dimension(300, 600));

        panelEdiciones.setBackground(new java.awt.Color(204, 204, 204));
        panelEdiciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelEdiciones.setRequestFocusEnabled(false);
        panelEdiciones.setLayout(new java.awt.BorderLayout());

        panelFigura.setPreferredSize(new java.awt.Dimension(220, 300));
        panelFigura.setLayout(new java.awt.BorderLayout());

        panelTipoFiguraOpcionesTrazo.setPreferredSize(new java.awt.Dimension(200, 128));
        panelTipoFiguraOpcionesTrazo.setLayout(new java.awt.BorderLayout());

        panelTipoFigura.setLayout(new java.awt.BorderLayout());

        jLabel4.setBackground(new java.awt.Color(200, 200, 200));
        jLabel4.setText("Tipo de Figura:");
        jLabel4.setMaximumSize(new java.awt.Dimension(94, 36));
        jLabel4.setPreferredSize(new java.awt.Dimension(94, 56));
        panelTipoFigura.add(jLabel4, java.awt.BorderLayout.NORTH);

        panelFiguras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelFiguras.setToolTipText("panel tipos de figura");
        panelFiguras.setPreferredSize(new java.awt.Dimension(25, 62));
        panelFiguras.setLayout(new java.awt.GridLayout(1, 0));

        botonOvalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/Ovalo.gif"))); // NOI18N
        botonOvalo.setToolTipText("Dibuja elipses");
        botonOvalo.setFocusable(false);
        botonOvalo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOvalo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOvalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOvaloActionPerformed(evt);
            }
        });
        panelFiguras.add(botonOvalo);

        botonRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/Rectangulo.gif"))); // NOI18N
        botonRectangulo.setToolTipText("Dibuja reactángulos");
        botonRectangulo.setFocusable(false);
        botonRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRectanguloActionPerformed(evt);
            }
        });
        panelFiguras.add(botonRectangulo);

        botonLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/Linea.gif"))); // NOI18N
        botonLinea.setToolTipText("Dibuja líneas");
        botonLinea.setFocusable(false);
        botonLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLineaActionPerformed(evt);
            }
        });
        panelFiguras.add(botonLinea);

        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/Lapiz.gif"))); // NOI18N
        botonPunto.setToolTipText("Dibuja puntos");
        botonPunto.setFocusable(false);
        botonPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPunto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        panelFiguras.add(botonPunto);

        botonLibre.setText("Libre");
        botonLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLibreActionPerformed(evt);
            }
        });
        panelFiguras.add(botonLibre);

        panelTipoFigura.add(panelFiguras, java.awt.BorderLayout.CENTER);

        panelTipoFiguraOpcionesTrazo.add(panelTipoFigura, java.awt.BorderLayout.NORTH);

        panelTrazo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelTrazo.setToolTipText("Panel opciones de trazo");
        panelTrazo.setMinimumSize(new java.awt.Dimension(138, 90));
        panelTrazo.setPreferredSize(new java.awt.Dimension(200, 120));
        panelTrazo.setLayout(new java.awt.BorderLayout());

        panelGrosor.setMinimumSize(new java.awt.Dimension(59, 28));
        panelGrosor.setLayout(new java.awt.BorderLayout());

        labelGrosor.setText("Grosor");
        panelGrosor.add(labelGrosor, java.awt.BorderLayout.WEST);

        spinnerGrosor.setToolTipText("Introduce aquí el grosor del trazo");
        spinnerGrosor.setPreferredSize(new java.awt.Dimension(57, 28));
        spinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerGrosorStateChanged(evt);
            }
        });
        panelGrosor.add(spinnerGrosor, java.awt.BorderLayout.EAST);

        panelColCon.setLayout(new java.awt.BorderLayout());
        panelGrosor.add(panelColCon, java.awt.BorderLayout.PAGE_END);

        panelTrazo.add(panelGrosor, java.awt.BorderLayout.CENTER);

        panelContinuidad.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("tipo trazo:");
        panelContinuidad.add(jLabel1, java.awt.BorderLayout.WEST);

        comboBoxTrazo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Continuo", "Discontinuo", "Esquinas redondas", "Esquinas cortadas", "Discontínuo puntos y rallas" }));
        comboBoxTrazo.setToolTipText("Selecciona aquí el tipo de trazo de entre los disponibles");
        comboBoxTrazo.setMinimumSize(new java.awt.Dimension(106, 27));
        comboBoxTrazo.setPreferredSize(new java.awt.Dimension(126, 27));
        comboBoxTrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTrazoActionPerformed(evt);
            }
        });
        panelContinuidad.add(comboBoxTrazo, java.awt.BorderLayout.EAST);

        panelTrazo.add(panelContinuidad, java.awt.BorderLayout.NORTH);

        panelColorTrazo.setLayout(new java.awt.BorderLayout());

        botonColorTrazo.setText("Seleccione color trazo");
        botonColorTrazo.setToolTipText("Pulse aquí para seleccionar el color del trazo");
        botonColorTrazo.setMaximumSize(new java.awt.Dimension(130, 29));
        botonColorTrazo.setMinimumSize(new java.awt.Dimension(130, 29));
        botonColorTrazo.setPreferredSize(new java.awt.Dimension(130, 39));
        botonColorTrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColorTrazoActionPerformed(evt);
            }
        });
        panelColorTrazo.add(botonColorTrazo, java.awt.BorderLayout.CENTER);

        panelTrazo.add(panelColorTrazo, java.awt.BorderLayout.SOUTH);

        panelTipoFiguraOpcionesTrazo.add(panelTrazo, java.awt.BorderLayout.PAGE_END);

        labelTrazo.setBackground(new java.awt.Color(200, 200, 200));
        labelTrazo.setText("Opciones de trazo:");
        labelTrazo.setPreferredSize(new java.awt.Dimension(118, 56));
        panelTipoFiguraOpcionesTrazo.add(labelTrazo, java.awt.BorderLayout.CENTER);

        panelFigura.add(panelTipoFiguraOpcionesTrazo, java.awt.BorderLayout.CENTER);

        panelEdiciones.add(panelFigura, java.awt.BorderLayout.PAGE_START);

        panelOpcionesFigura.setPreferredSize(new java.awt.Dimension(250, 56));
        panelOpcionesFigura.setLayout(new java.awt.BorderLayout());

        panelEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelEdit.setToolTipText("Panel opciones de figura");
        panelEdit.setLayout(new java.awt.BorderLayout());

        panelChecksFigura.setPreferredSize(new java.awt.Dimension(244, 44));
        panelChecksFigura.setLayout(new java.awt.BorderLayout());

        checkBoxEditar.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        checkBoxEditar.setText("editar");
        checkBoxEditar.setToolTipText("Marca esta casilla para mover figuras");
        checkBoxEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        checkBoxEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxEditarActionPerformed(evt);
            }
        });
        panelChecksFigura.add(checkBoxEditar, java.awt.BorderLayout.WEST);

        checkBoxGraduado.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        checkBoxGraduado.setText("color gradual");
        checkBoxGraduado.setToolTipText("Marca esta casilla junto con Relleno para tener rellenos graduales");
        checkBoxGraduado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxGraduadoActionPerformed(evt);
            }
        });
        panelChecksFigura.add(checkBoxGraduado, java.awt.BorderLayout.CENTER);

        checkBoxRelleno.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        checkBoxRelleno.setText("Relleno");
        checkBoxRelleno.setToolTipText("Marca esta casilla para rellenar las figuras");
        checkBoxRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxRellenoActionPerformed(evt);
            }
        });
        panelChecksFigura.add(checkBoxRelleno, java.awt.BorderLayout.EAST);

        panelEdit.add(panelChecksFigura, java.awt.BorderLayout.NORTH);

        panelDegradadoTransparenciaColor.setPreferredSize(new java.awt.Dimension(274, 108));
        panelDegradadoTransparenciaColor.setLayout(new java.awt.BorderLayout());

        panelDegradado.setLayout(new java.awt.BorderLayout());

        panelCapa.setPreferredSize(new java.awt.Dimension(274, 229));
        panelCapa.setLayout(new java.awt.BorderLayout());

        panelProfundidad.setLayout(new java.awt.BorderLayout());

        labelProfundidad.setText("Profundidad figura:");
        panelProfundidad.add(labelProfundidad, java.awt.BorderLayout.NORTH);

        botonSubirFigura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/subir.jpg"))); // NOI18N
        botonSubirFigura.setToolTipText("Sube la figura una posición en la profundidad de la pantalla.");
        botonSubirFigura.setPreferredSize(new java.awt.Dimension(75, 25));
        botonSubirFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSubirFiguraActionPerformed(evt);
            }
        });
        panelProfundidad.add(botonSubirFigura, java.awt.BorderLayout.WEST);

        botonBajarCapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/bajar.jpg"))); // NOI18N
        botonBajarCapa.setToolTipText("Baja la figura una posición en la profundidad de la pantalla.");
        botonBajarCapa.setPreferredSize(new java.awt.Dimension(75, 42));
        botonBajarCapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajarCapaActionPerformed(evt);
            }
        });
        panelProfundidad.add(botonBajarCapa, java.awt.BorderLayout.EAST);

        panelCapa.add(panelProfundidad, java.awt.BorderLayout.NORTH);

        panelDegradado.add(panelCapa, java.awt.BorderLayout.CENTER);

        panelTipoDegradado.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("tipo de degradado:");
        jPanel6.add(jLabel3, java.awt.BorderLayout.WEST);

        comboBoxTipoGraduado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horizontal", "Vertical", "Radial" }));
        comboBoxTipoGraduado.setToolTipText("Seleccione tipo de degradado");
        comboBoxTipoGraduado.setMinimumSize(new java.awt.Dimension(106, 27));
        comboBoxTipoGraduado.setPreferredSize(new java.awt.Dimension(126, 27));
        comboBoxTipoGraduado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoGraduadoActionPerformed(evt);
            }
        });
        jPanel6.add(comboBoxTipoGraduado, java.awt.BorderLayout.CENTER);

        panelTipoDegradado.add(jPanel6, java.awt.BorderLayout.NORTH);

        botonColor.setText("Seleccione color figura");
        botonColor.setToolTipText("Pulse aquí para seleccionar el color del relleno");
        botonColor.setMaximumSize(new java.awt.Dimension(14, 29));
        botonColor.setMinimumSize(new java.awt.Dimension(14, 29));
        botonColor.setPreferredSize(new java.awt.Dimension(14, 39));
        botonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColorActionPerformed(evt);
            }
        });
        panelTipoDegradado.add(botonColor, java.awt.BorderLayout.SOUTH);

        panelDegradado.add(panelTipoDegradado, java.awt.BorderLayout.PAGE_START);

        panelDegradadoTransparenciaColor.add(panelDegradado, java.awt.BorderLayout.CENTER);

        panelTransparencia.setLayout(new java.awt.BorderLayout());

        labelTransparencia.setText("Transparencia:");
        labelTransparencia.setPreferredSize(new java.awt.Dimension(98, 16));
        panelTransparencia.add(labelTransparencia, java.awt.BorderLayout.CENTER);

        sliderTransparencia.setMaximum(255);
        sliderTransparencia.setToolTipText("Modifica la transparencia del color, fijar antes de elegir color.");
        sliderTransparencia.setValue(255);
        sliderTransparencia.setPreferredSize(new java.awt.Dimension(180, 29));
        sliderTransparencia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTransparenciaStateChanged(evt);
            }
        });
        panelTransparencia.add(sliderTransparencia, java.awt.BorderLayout.EAST);

        panelDegradadoTransparenciaColor.add(panelTransparencia, java.awt.BorderLayout.PAGE_START);

        panelEdit.add(panelDegradadoTransparenciaColor, java.awt.BorderLayout.CENTER);

        panelOpcionesFigura.add(panelEdit, java.awt.BorderLayout.CENTER);

        panelLabelOpcionesFigura.setPreferredSize(new java.awt.Dimension(300, 56));
        panelLabelOpcionesFigura.setLayout(new java.awt.BorderLayout());

        jLabel2.setBackground(new java.awt.Color(200, 200, 200));
        jLabel2.setText("Opciones Figura:");
        jLabel2.setMaximumSize(null);
        jLabel2.setMinimumSize(null);
        jLabel2.setPreferredSize(new java.awt.Dimension(106, 56));
        panelLabelOpcionesFigura.add(jLabel2, java.awt.BorderLayout.NORTH);

        panelOpcionesFigura.add(panelLabelOpcionesFigura, java.awt.BorderLayout.NORTH);

        panelEdiciones.add(panelOpcionesFigura, java.awt.BorderLayout.CENTER);

        herramientasFiguraTrazo.add(panelEdiciones);

        panelPesta.addTab("Figura", herramientasFiguraTrazo);

        herramientasImagen.setBackground(new java.awt.Color(204, 204, 204));
        herramientasImagen.setRollover(true);
        herramientasImagen.setPreferredSize(new java.awt.Dimension(300, 600));

        panelEdicionImagen.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        labelOpcionesImagen.setText("Opciones de imagen:");

        panelImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelImagen.setMinimumSize(new java.awt.Dimension(170, 146));
        panelImagen.setPreferredSize(new java.awt.Dimension(100, 100));
        panelImagen.setLayout(new java.awt.BorderLayout());

        panelFiltroBrilloContraste.setPreferredSize(new java.awt.Dimension(190, 250));
        panelFiltroBrilloContraste.setLayout(new java.awt.BorderLayout());

        panelBrilloFiltro.setLayout(new java.awt.BorderLayout());

        panelFiltros.setPreferredSize(new java.awt.Dimension(237, 50));
        panelFiltros.setLayout(new java.awt.BorderLayout());

        labelFiltro.setText("Filtro:");
        panelFiltros.add(labelFiltro, java.awt.BorderLayout.WEST);

        comboBoxFiltros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Emborronamiento media", "Emborronamiento binomial", "Enfoque", "Relieve", "Detector de fronteras" }));
        comboBoxFiltros.setToolTipText("Selecciona aquí un filtro para la imagen");
        comboBoxFiltros.setMinimumSize(new java.awt.Dimension(127, 27));
        comboBoxFiltros.setPreferredSize(new java.awt.Dimension(200, 37));
        comboBoxFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFiltrosActionPerformed(evt);
            }
        });
        panelFiltros.add(comboBoxFiltros, java.awt.BorderLayout.EAST);

        panelBrilloFiltro.add(panelFiltros, java.awt.BorderLayout.CENTER);

        panelBrillo.setPreferredSize(new java.awt.Dimension(236, 50));
        panelBrillo.setLayout(new java.awt.BorderLayout());

        labelBrillo.setText("Brillo:");
        panelBrillo.add(labelBrillo, java.awt.BorderLayout.WEST);

        sliderBrillo.setToolTipText("Desliza para cambiar el brillo");
        sliderBrillo.setValue(1);
        sliderBrillo.setPreferredSize(new java.awt.Dimension(200, 29));
        sliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBrilloStateChanged(evt);
            }
        });
        panelBrillo.add(sliderBrillo, java.awt.BorderLayout.EAST);

        panelBrilloFiltro.add(panelBrillo, java.awt.BorderLayout.PAGE_END);

        panelFiltroBrilloContraste.add(panelBrilloFiltro, java.awt.BorderLayout.NORTH);

        panelContrastes.setPreferredSize(new java.awt.Dimension(204, 60));
        panelContrastes.setLayout(new java.awt.BorderLayout());

        panelContraste.setPreferredSize(new java.awt.Dimension(265, 50));
        panelContraste.setLayout(new java.awt.BorderLayout());

        sliderContraste.setToolTipText("Desliza para cambiar el contraste");
        sliderContraste.setValue(1);
        sliderContraste.setMinimumSize(new java.awt.Dimension(46, 29));
        sliderContraste.setPreferredSize(new java.awt.Dimension(200, 29));
        sliderContraste.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderContrasteStateChanged(evt);
            }
        });
        panelContraste.add(sliderContraste, java.awt.BorderLayout.EAST);

        labelContraste.setText("Contraste:");
        panelContraste.add(labelContraste, java.awt.BorderLayout.CENTER);

        panelContrastes.add(panelContraste, java.awt.BorderLayout.NORTH);

        panelBotonesContraste.setPreferredSize(new java.awt.Dimension(20, 100));
        panelBotonesContraste.setSize(new java.awt.Dimension(20, 100));
        panelBotonesContraste.setLayout(new java.awt.GridLayout(1, 0));

        botonContrasteNormal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/contraste.png"))); // NOI18N
        botonContrasteNormal.setToolTipText("Contraste normal");
        botonContrasteNormal.setPreferredSize(new java.awt.Dimension(67, 29));
        botonContrasteNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContrasteNormalActionPerformed(evt);
            }
        });
        panelBotonesContraste.add(botonContrasteNormal);

        botonContrasteIluminado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/iluminar.png"))); // NOI18N
        botonContrasteIluminado.setToolTipText("Contraste iluminado");
        botonContrasteIluminado.setPreferredSize(new java.awt.Dimension(67, 29));
        botonContrasteIluminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContrasteIluminadoActionPerformed(evt);
            }
        });
        panelBotonesContraste.add(botonContrasteIluminado);

        botonContrasteOscurecido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/oscurecer.png"))); // NOI18N
        botonContrasteOscurecido.setToolTipText("Contraste oscurecido");
        botonContrasteOscurecido.setPreferredSize(new java.awt.Dimension(67, 29));
        botonContrasteOscurecido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContrasteOscurecidoActionPerformed(evt);
            }
        });
        panelBotonesContraste.add(botonContrasteOscurecido);

        panelContrastes.add(panelBotonesContraste, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        botonGrises.setText("Convertir a  grises");
        botonGrises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrisesActionPerformed(evt);
            }
        });
        jPanel2.add(botonGrises);

        botonNegativo.setText("Convertir a negativo");
        botonNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNegativoActionPerformed(evt);
            }
        });
        jPanel2.add(botonNegativo);

        panelContrastes.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        panelFiltroBrilloContraste.add(panelContrastes, java.awt.BorderLayout.CENTER);

        panelImagen.add(panelFiltroBrilloContraste, java.awt.BorderLayout.NORTH);

        panelEscalaRotacion.setLayout(new java.awt.BorderLayout());

        panelEscala.setPreferredSize(new java.awt.Dimension(174, 85));
        panelEscala.setLayout(new java.awt.BorderLayout());

        botonAumentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/aumentar.png"))); // NOI18N
        botonAumentar.setToolTipText("Aumenta el tamaño de la imagen");
        botonAumentar.setPreferredSize(new java.awt.Dimension(87, 25));
        botonAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAumentarActionPerformed(evt);
            }
        });
        panelEscala.add(botonAumentar, java.awt.BorderLayout.WEST);

        botonDisminuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/disminuir.png"))); // NOI18N
        botonDisminuir.setToolTipText("Disminuye el tamaño de la imagen");
        botonDisminuir.setPreferredSize(new java.awt.Dimension(87, 29));
        botonDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDisminuirActionPerformed(evt);
            }
        });
        panelEscala.add(botonDisminuir, java.awt.BorderLayout.EAST);

        labelEscala.setText("Escala:");
        panelEscala.add(labelEscala, java.awt.BorderLayout.PAGE_START);

        panelEscalaRotacion.add(panelEscala, java.awt.BorderLayout.SOUTH);

        panelRotaciones.setPreferredSize(new java.awt.Dimension(210, 130));
        panelRotaciones.setLayout(new java.awt.BorderLayout());

        panelBotonesRotacion.setPreferredSize(new java.awt.Dimension(200, 50));
        panelBotonesRotacion.setLayout(new java.awt.BorderLayout());

        boton90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/rotacion90.png"))); // NOI18N
        boton90.setToolTipText("Rota la figura 90º");
        boton90.setPreferredSize(new java.awt.Dimension(70, 29));
        boton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton90ActionPerformed(evt);
            }
        });
        panelBotonesRotacion.add(boton90, java.awt.BorderLayout.WEST);

        boton180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/rotacion180.png"))); // NOI18N
        boton180.setToolTipText("Rota la figura 180º");
        boton180.setPreferredSize(new java.awt.Dimension(57, 29));
        boton180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton180ActionPerformed(evt);
            }
        });
        panelBotonesRotacion.add(boton180, java.awt.BorderLayout.CENTER);

        boton270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/rotacion270.png"))); // NOI18N
        boton270.setToolTipText("Rota la figura 270º");
        boton270.setPreferredSize(new java.awt.Dimension(70, 29));
        boton270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton270ActionPerformed(evt);
            }
        });
        panelBotonesRotacion.add(boton270, java.awt.BorderLayout.EAST);

        panelRotaciones.add(panelBotonesRotacion, java.awt.BorderLayout.CENTER);

        panelDeslizadorRotacion.setPreferredSize(new java.awt.Dimension(210, 50));
        panelDeslizadorRotacion.setLayout(new java.awt.BorderLayout());

        labelRotacion.setText("Rotación:");
        panelDeslizadorRotacion.add(labelRotacion, java.awt.BorderLayout.WEST);

        sliderRotacion.setMaximum(180);
        sliderRotacion.setToolTipText("Desliza aquí para rotar la figura");
        sliderRotacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderRotacionStateChanged(evt);
            }
        });
        panelDeslizadorRotacion.add(sliderRotacion, java.awt.BorderLayout.CENTER);

        panelRotaciones.add(panelDeslizadorRotacion, java.awt.BorderLayout.NORTH);

        panelEscalaRotacion.add(panelRotaciones, java.awt.BorderLayout.NORTH);

        panelImagen.add(panelEscalaRotacion, java.awt.BorderLayout.CENTER);

        panelBotonesGuardarRecuperar.setMinimumSize(new java.awt.Dimension(143, 58));
        panelBotonesGuardarRecuperar.setPreferredSize(new java.awt.Dimension(230, 150));
        panelBotonesGuardarRecuperar.setLayout(new java.awt.BorderLayout());

        botonGuardarCambios.setText("Guardar cambios");
        botonGuardarCambios.setToolTipText("Pulse aquí para guardar las modificaciones realizadas en la imagen");
        botonGuardarCambios.setPreferredSize(new java.awt.Dimension(104, 70));
        botonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarCambiosActionPerformed(evt);
            }
        });
        panelBotonesGuardarRecuperar.add(botonGuardarCambios, java.awt.BorderLayout.NORTH);

        botonRecuperarImagen.setText("Recuperar imagen inicial");
        botonRecuperarImagen.setToolTipText("Pulse aquí para recuperar la imagen que se cargó del archivo.");
        botonRecuperarImagen.setPreferredSize(new java.awt.Dimension(143, 70));
        botonRecuperarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecuperarImagenActionPerformed(evt);
            }
        });
        panelBotonesGuardarRecuperar.add(botonRecuperarImagen, java.awt.BorderLayout.SOUTH);

        panelImagen.add(panelBotonesGuardarRecuperar, java.awt.BorderLayout.SOUTH);

        org.jdesktop.layout.GroupLayout panelEdicionImagenLayout = new org.jdesktop.layout.GroupLayout(panelEdicionImagen);
        panelEdicionImagen.setLayout(panelEdicionImagenLayout);
        panelEdicionImagenLayout.setHorizontalGroup(
            panelEdicionImagenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(labelOpcionesImagen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 284, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(panelImagen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 284, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        panelEdicionImagenLayout.setVerticalGroup(
            panelEdicionImagenLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelEdicionImagenLayout.createSequentialGroup()
                .add(labelOpcionesImagen)
                .add(panelImagen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 674, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        herramientasImagen.add(panelEdicionImagen);

        panelPesta.addTab("Imagen", herramientasImagen);

        getContentPane().add(panelPesta, java.awt.BorderLayout.EAST);

        herramientasWebCamCaptura.setRollover(true);
        herramientasWebCamCaptura.setToolTipText("Barra de herramientas de webcam y capturas");

        grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/Camara.png"))); // NOI18N
        grabar.setToolTipText("Pulse aquí para grabar con la webcam");
        grabar.setFocusable(false);
        grabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        grabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabarActionPerformed(evt);
            }
        });
        herramientasWebCamCaptura.add(grabar);

        capturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/Capturar.png"))); // NOI18N
        capturar.setFocusable(false);
        capturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        capturar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        capturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturarActionPerformed(evt);
            }
        });
        herramientasWebCamCaptura.add(capturar);

        getContentPane().add(herramientasWebCamCaptura, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setMinimumSize(null);

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("Archivo");

        menuNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/NuevoBoceto.GIF"))); // NOI18N
        menuNuevo.setText("Nuevo");

        menuNuevaImagen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuNuevaImagen.setText("Imagen-gráfico");
        menuNuevaImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevaImagenActionPerformed(evt);
            }
        });
        menuNuevo.add(menuNuevaImagen);

        menuNuevoSonido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuNuevoSonido.setText("Sonido");
        menuNuevoSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoSonidoActionPerformed(evt);
            }
        });
        menuNuevo.add(menuNuevoSonido);

        jMenu1.add(menuNuevo);

        menuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/abrir.gif"))); // NOI18N
        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        menuGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/Guardar.gif"))); // NOI18N
        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minipaint/iconos/salir.gif"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        menuVer.setText("Ver");

        menuBarraHerr.setText("Barras de herramientas");

        menuBarraHerrFigura.setText("Figura / Imagen");
        menuBarraHerrFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarraHerrFiguraActionPerformed(evt);
            }
        });
        menuBarraHerr.add(menuBarraHerrFigura);

        menuBarraHerrWebcam.setText("Webcam / Capturas");
        menuBarraHerrWebcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarraHerrWebcamActionPerformed(evt);
            }
        });
        menuBarraHerr.add(menuBarraHerrWebcam);

        menuVer.add(menuBarraHerr);

        jMenuBar1.add(menuVer);

        menuAyuda.setText("Ayuda");

        menuAyudaAcercaDe.setText("Acerca de");
        menuAyudaAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAyudaAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuAyudaAcercaDe);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Comienzo de la gestión de los botones de los tipos de forma del GUI.
     */
    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
       try{
            organizaBotonesForma();
            botonPunto.setSelected(true);
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            (mvi.getLienzo()).setForma(0);
            labelSeleccion.setText("  Punto");
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLineaActionPerformed
       try{
            organizaBotonesForma();
            botonLinea.setSelected(true);
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            (mvi.getLienzo()).setForma(1);
           labelSeleccion.setText("  Línea");
       }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_botonLineaActionPerformed

    //Desmarca todos los botones del tipo de forma.
    private void organizaBotonesForma()
    {
        botonPunto.setSelected(false);
        botonLinea.setSelected(false);
        botonRectangulo.setSelected(false);
        botonOvalo.setSelected(false);
        labelSeleccion.setVisible(true);
        botonLibre.setSelected(false);
    }
    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
      try{
            organizaBotonesForma();
            botonRectangulo.setSelected(true);
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            (mvi.getLienzo()).setForma(2);
            labelSeleccion.setText("  Rectángulo");
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_botonRectanguloActionPerformed

    private void botonOvaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOvaloActionPerformed
        try{
            organizaBotonesForma();
            botonOvalo.setSelected(true);
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            (mvi.getLienzo()).setForma(3);
            labelSeleccion.setText("  Óvalo");
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_botonOvaloActionPerformed
/*
 * Final de la gestión de los botones de forma del GUI.
 */



    /*
     * Manejo del evento del checkBox relleno.
     */
    private void checkBoxRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxRellenoActionPerformed
        try{
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            if(checkBoxRelleno.isSelected())
            {
                if(mvi.getLienzo().getEditar())
                {
                    if(mvi.getLienzo().getForma() == Lienzo.RECTANGULO ||
                            mvi.getLienzo().getForma() == Lienzo.ELIPSE)
                    {
                        mvi.getLienzo().getMiFigura2DSeleccionada().setRelleno(true);
                    }
                    
                }
                (mvi.getLienzo()).setRelleno(true);
            }else
            {
                if(checkBoxGraduado.isSelected())
                {
                    checkBoxRelleno.setSelected(true);
                }else
                {

                    if(mvi.getLienzo().getEditar())
                    {
                        if(mvi.getLienzo().getForma() == Lienzo.RECTANGULO ||
                            mvi.getLienzo().getForma() == Lienzo.ELIPSE)
                        {
                            mvi.getLienzo().getMiFigura2DSeleccionada().setRelleno(false);
                        }

                    }
                    (mvi.getLienzo()).setRelleno(false);
                }
            }
            mvi.getLienzo().repaint();
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_checkBoxRellenoActionPerformed

/*
 * Convierte el tipo de imagen a RGB en este caso, o a cualquier tipo que se le
 * especifique en el argumento type.
 */
    private BufferedImage convertImageType(BufferedImage img, int type)
    {
        if(img == null) return null;
        BufferedImage imgOut = new BufferedImage(img.getWidth(), img.getHeight(), type);
        Graphics2D g2d = imgOut.createGraphics();
        g2d.drawImage(img, 0,0 ,null);
        return imgOut;

    }

    /*
     * Guarda la imagen creada en el objeto lienzo que haya seleccionado, incluidas
     * formas, transformaciones hechas en la imagen, etc.
     */
    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
       JFileChooser dlg = new JFileChooser();
        Graphics gr ;
        MiVentanaInterna mvi =((MiVentanaInterna)escritorio.getSelectedFrame());
        BufferedImage img = new BufferedImage(mvi.getLienzo().getWidth(),
                                              mvi.getLienzo().getHeight(),
                                              BufferedImage.TYPE_INT_RGB);
        int resp = dlg.showSaveDialog(this);
        gr = img.getGraphics();
        mvi.getLienzo().paint(gr);
        try{
             if(resp == JFileChooser.APPROVE_OPTION)
             {
                File f = dlg.getSelectedFile();
                mvi.getLienzo().paint(gr);
                ImageIO.write(img, "png", f);
                
             }
        }catch(Exception e){System.err.println(e);}
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void checkBoxEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxEditarActionPerformed
        try{
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            if(checkBoxEditar.isSelected()==true){(mvi.getLienzo()).setEditar(true);}
            else{(mvi.getLienzo()).setEditar(false);}
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_checkBoxEditarActionPerformed

    private void spinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerGrosorStateChanged
        try{
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            if((Integer)spinnerGrosor.getValue() < 0)
            {
                spinnerGrosor.setValue((Integer)0);
            }
            else
            {
                (mvi.getLienzo()).setBorde((Integer)spinnerGrosor.getValue());
            }
            if(mvi.getLienzo().getEditar()
                    &&(mvi.getLienzo().getForma() == Lienzo.RECTANGULO || mvi.getLienzo().getForma() == Lienzo.ELIPSE))
            {
                 ((MiFigura2D)mvi.getLienzo().getMiFigura2DSeleccionada()).setBorde(mvi.getLienzo().getTipoTrazo(mvi.getLienzo().tipoTrazo));
                 mvi.getLienzo().repaint();
            }else
            {
               ((MiFigura1D)mvi.getLienzo().getMiFigura1DSeleccionada()).setBorde(mvi.getLienzo().getTipoTrazo(mvi.getLienzo().tipoTrazo));
                mvi.getLienzo().repaint();
            }

        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_spinnerGrosorStateChanged

    /*
     * Gestiona el Action Performed del botón del color de relleno.
     * Cómo existen varios tipos de relleno éste método asigna los valores
     * a las variables correspondientes en función del tipo de relleno.
     */
    private void botonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColorActionPerformed
        try{
            JColorChooser selectorColor = new JColorChooser();
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            if(mvi != null)
            {
                if(!mvi.getLienzo().getGradual())
                {
                    Color aux = selectorColor.showDialog(null, "Seleccione un color", Color.WHITE);
                    Color c = new Color(aux.getRed(),aux.getGreen(),aux.getBlue(), mvi.getLienzo().getTransparencia());

                    if((mvi.getLienzo()).editar)
                    {

                        if((mvi.getLienzo().getForma() == Lienzo.RECTANGULO ||
                            mvi.getLienzo().getForma() == Lienzo.ELIPSE  ) )
                        {
                            ((MiFigura2D)mvi.getLienzo().getMiFigura2DSeleccionada()).setColor1(c);
                        }
                        mvi.getLienzo().repaint();
                    }
                        (mvi.getLienzo()).setcolor(c);
                    
                }else
                {
                    Color aux1 = selectorColor.showDialog(null, "Seleccione primer color", Color.WHITE);
                    Color aux2 = selectorColor.showDialog(null, "Seleccione segundo color", Color.WHITE);
                    Color c1 =new Color(aux1.getRed(),aux1.getGreen(),aux1.getBlue(),sliderTransparencia.getValue());
                    Color c2 =new Color(aux2.getRed(),aux2.getGreen(),aux2.getBlue(), sliderTransparencia.getValue());

                    if((mvi.getLienzo()).editar )
                    {
                        if((mvi.getLienzo().getForma() == Lienzo.RECTANGULO ||
                            mvi.getLienzo().getForma() == Lienzo.ELIPSE  ) )
                        {
                             ((mvi.getLienzo()).getMiFigura2DSeleccionada()).setColor1(c1);
                             ((mvi.getLienzo()).getMiFigura2DSeleccionada()).setColor2(c2);
                        }
                         mvi.getLienzo().repaint();
                    }
                    (mvi.getLienzo()).setcolor(c1);
                    (mvi.getLienzo()).setSegCol(c2);
                }
            }
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_botonColorActionPerformed

    private void comboBoxTrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTrazoActionPerformed
        try{
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            if(mvi.getLienzo().editar)
            {
                if(mvi.getLienzo().getForma() == Lienzo.PUNTO ||
                        mvi.getLienzo().getForma() == Lienzo.LINEA)
                {
                    (mvi.getLienzo().getMiFigura1DSeleccionada()).setBorde(mvi.getLienzo().getTipoTrazo(comboBoxTrazo.getSelectedIndex()));
                }
                else if (mvi.getLienzo().getForma() == Lienzo.RECTANGULO ||
                        mvi.getLienzo().getForma() == Lienzo.ELIPSE)
                {
                    (mvi.getLienzo().getMiFigura2DSeleccionada()).setBorde(mvi.getLienzo().getTipoTrazo(comboBoxTrazo.getSelectedIndex()));
                }
                
            }
            (mvi.getLienzo()).setTipoTrazo(comboBoxTrazo.getSelectedIndex());
            mvi.getLienzo().repaint();
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_comboBoxTrazoActionPerformed

    private void botonColorTrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColorTrazoActionPerformed
        try{
            JColorChooser selectorColor = new JColorChooser();
            MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
            if(mvi != null)
            {
                Color c = selectorColor.showDialog(null, "Seleccione un color", Color.WHITE);
                if((mvi.getLienzo()).editar)
                {
                    if((mvi.getLienzo()).getForma() == Lienzo.PUNTO
                            ||(mvi.getLienzo()).getForma() == Lienzo.LINEA )
                    {
                        ((mvi.getLienzo()).getMiFigura1DSeleccionada()).setColorTra(c);
                    }
                    else if ((mvi.getLienzo()).getForma() == Lienzo.RECTANGULO
                            ||(mvi.getLienzo()).getForma() == Lienzo.ELIPSE )
                    {
                        ((mvi.getLienzo()).getMiFigura2DSeleccionada()).setColorTra(c);
                    }
                    else
                    {
                        ((mvi.getLienzo()).getMiTrazoLibreSeleccionado()).setColorTra(c);
                    }
                    
                    mvi.getLienzo().repaint();
                }
                    (mvi.getLienzo()).setColorTrazo(c);
            }
        }catch(Exception e){System.out.println(e.getMessage());}
    }//GEN-LAST:event_botonColorTrazoActionPerformed


    
         private void comboBoxFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFiltrosActionPerformed
            try{
                    MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                    String tipo = (String)comboBoxFiltros.getSelectedItem();
                    System.out.println(tipo);
                    if(tipo.compareTo("Emborronamiento media")==0)
                    {
                        mvi.getLienzo().setFiltro(KernelProducer.TYPE_MEDIA_3x3);
                    }else if(tipo.compareTo("Emborronamiento binomial")==0)
                    {
                         mvi.getLienzo().setFiltro(KernelProducer.TYPE_BINOMIAL_3x3);
                    }else if(tipo.compareTo("Enfoque")==0)
                    {
                         mvi.getLienzo().setFiltro(KernelProducer.TYPE_ENFOQUE_3x3);
                    }else if(tipo.compareTo("Relieve")==0)
                    {
                         mvi.getLienzo().setFiltro(KernelProducer.TYPE_RELIEVE_3x3);
                    }else if(tipo.compareTo("Detector de fronteras")==0)
                    {
                        mvi.getLienzo().setFiltro(KernelProducer.TYPE_LAPLACIANA_3x3);
                    }
                    mvi.getLienzo().convolveOp();
                }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_comboBoxFiltrosActionPerformed

         private void botonContrasteNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContrasteNormalActionPerformed
           try{
                 MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                 (mvi.getLienzo()).contrastar(LookupTableProducer.TYPE_SFUNCION);
              }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_botonContrasteNormalActionPerformed

         private void botonContrasteIluminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContrasteIluminadoActionPerformed
           try{
                 MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                 (mvi.getLienzo()).contrastar(LookupTableProducer.TYPE_GAMMA_CORRECTION);
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_botonContrasteIluminadoActionPerformed

         private void botonContrasteOscurecidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContrasteOscurecidoActionPerformed
            try{
             MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
             (mvi.getLienzo()).contrastar(LookupTableProducer.TYPE_POWER);
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_botonContrasteOscurecidoActionPerformed

         private void sliderRotacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderRotacionStateChanged
           try{
                MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                mvi.getLienzo().setAngulo(sliderRotacion.getValue()*2);
                mvi.getLienzo().rotar();
            }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_sliderRotacionStateChanged

         private void boton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton90ActionPerformed
            try{
                MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                mvi.getLienzo().setAngulo(90);
                mvi.getLienzo().rotar();
            }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_boton90ActionPerformed

         private void boton180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton180ActionPerformed
           try{
               MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
               mvi.getLienzo().setAngulo(180);
               mvi.getLienzo().rotar();
           }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_boton180ActionPerformed

         private void boton270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton270ActionPerformed
            try{
                MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                mvi.getLienzo().setAngulo(270);
                mvi.getLienzo().rotar();
            }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_boton270ActionPerformed

         private void botonAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAumentarActionPerformed
            try{
                MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                mvi.getLienzo().setEscala(mvi.getLienzo().getEscala()+0.1);
                mvi.getLienzo().escalar();
            }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_botonAumentarActionPerformed

         private void botonDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDisminuirActionPerformed
            try{
                 MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                 mvi.getLienzo().setEscala(mvi.getLienzo().getEscala()-0.1);
                 mvi.getLienzo().escalar();
            }catch(Exception e){System.out.println(e.getMessage());}

         }//GEN-LAST:event_botonDisminuirActionPerformed

         private void menuNuevaImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaImagenActionPerformed
            MiVentanaInterna mvi = new MiVentanaInterna();
            escritorio.add(mvi);
            mvi.setVisible(true);
            organizaBotonesForma();
            checkBoxRelleno.setSelected(false);
            checkBoxEditar.setSelected(false);
            (mvi.getLienzo()).setcolor(Color.white);
            (mvi.getLienzo()).setColorTrazo(Color.white);
            panelPesta.setVisible(true);
            menuBarraHerrFigura.setSelected(true);         
         }//GEN-LAST:event_menuNuevaImagenActionPerformed

         

         private void menuNuevoSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoSonidoActionPerformed
             JFileChooser dlg = new JFileChooser();
            int resp = dlg.showSaveDialog(this);
            try{
                 if(resp == JFileChooser.APPROVE_OPTION)
                 {
                    File f = dlg.getSelectedFile();
                    
                    miVentanaGrabacionSonido mvgs = new miVentanaGrabacionSonido(f);
                    escritorio.add(mvgs);
                    mvgs.setVisible(true);
                    organizaBotonesForma();
                 }
            }catch(Exception e){System.err.println("error de lectura "+e.getCause());}


         }//GEN-LAST:event_menuNuevoSonidoActionPerformed

         private void menuAyudaAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAyudaAcercaDeActionPerformed
            JOptionPane.showMessageDialog(this,"Nombre de la aplicación: Multimedia Suite.\nAplicación desarrollada por: Pablo Sánchez Robles.\n Versión: 1.0.",
                    "Acerca de",JOptionPane.INFORMATION_MESSAGE);
         }//GEN-LAST:event_menuAyudaAcercaDeActionPerformed

         private void menuBarraHerrFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarraHerrFiguraActionPerformed
             if(menuBarraHerrFigura.isSelected())
             {
                    panelPesta.setVisible(true);
             }else
             {
                    panelPesta.setVisible(false);
             }
         }//GEN-LAST:event_menuBarraHerrFiguraActionPerformed

         private void checkBoxGraduadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxGraduadoActionPerformed
            try{
                 MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
                 if(mvi != null)
                 {
                     if (checkBoxGraduado.isSelected())
                     {
                        checkBoxRelleno.setSelected(true);
                        mvi.getLienzo().setRelleno(true);
                        mvi.getLienzo().setGradual(true);
                        if(mvi.getLienzo().getEditar())
                        {
                            if((mvi.getLienzo().getForma()==Lienzo.ELIPSE
                                ||mvi.getLienzo().getForma()==Lienzo.RECTANGULO ))
                            {
                                (mvi.getLienzo().getMiFigura2DSeleccionada()).setRelleno(true);
                                (mvi.getLienzo().getMiFigura2DSeleccionada()).setGradual(true);
                            }
                        }
                     }else
                     {
                        mvi.getLienzo().setGradual(false);
                        if(mvi.getLienzo().getEditar())
                        {
                            if((mvi.getLienzo().getForma()==Lienzo.ELIPSE ||
                                mvi.getLienzo().getForma()==Lienzo.RECTANGULO ))
                            {
                                (mvi.getLienzo().getMiFigura2DSeleccionada()).setGradual(false);
                            }
                        }
                     }
                     mvi.getLienzo().repaint();
                 }
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_checkBoxGraduadoActionPerformed

         private void comboBoxTipoGraduadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoGraduadoActionPerformed
            try
            {
                MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
                mvi.getLienzo().setTipoDeg(comboBoxTipoGraduado.getSelectedIndex());

                if(mvi.getLienzo().getEditar()&& (mvi.getLienzo().getForma()==Lienzo.ELIPSE ||mvi.getLienzo().getForma()==Lienzo.RECTANGULO ))
                {
                    mvi.getLienzo().getMiFigura2DSeleccionada().setTipoDegradado(comboBoxTipoGraduado.getSelectedIndex());
                    repaint();
                }
            }catch(Exception e){System.out.println(e.getMessage());}
             
         }//GEN-LAST:event_comboBoxTipoGraduadoActionPerformed

         private void botonNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNegativoActionPerformed
             try
             {
                 MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
                 mvi.getLienzo().contrastar(LookupTableProducer.TYPE_NEGATIVE);
             }catch(Exception e){System.out.println(e.getMessage());}
             
         }//GEN-LAST:event_botonNegativoActionPerformed


         /*
          * Abre el tipo de ventana correspondiente al fichero que se elija.
          */
         private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
             JFileChooser dlg = new JFileChooser();
             String formato;
            int resp = dlg.showOpenDialog(this);
            try{
                 if(resp == JFileChooser.APPROVE_OPTION)
                 {
                     File f = dlg.getSelectedFile();
                     /*
                      * Si el archivo seleccionado es de los formatos de video reconocidos
                      * abre una ventana de vídeo, si es de audio codificado con alguno de
                      * los formatos .
                      */
                     formato = f.toURL().toString().toUpperCase();
                     if(formato.endsWith(".AVI")||formato.endsWith(".MPEG") ||
                             formato.endsWith(".MP1")||formato.endsWith(".MP2") ||
                             formato.endsWith(".MP3")||formato.endsWith(".MP4")  ||
                             formato.endsWith(".MPG"))
                     {
                         abrirVideo(f);
                     }
                     /*
                      * Si es de audio sin codificar abre una ventana de audio.
                      */
                     else if(formato.endsWith(".WAV")  )
                     {
                         abrirSonido(f);
                     }
                     /*
                      * Si es un archivo de imagen de los reconocidos abre un lienzo con la
                      * imagen para comenzar su edición.
                      */
                     else if( formato.endsWith(".JPG") ||formato.endsWith(".JPEG") ||
                             formato.endsWith(".PNG")  ||formato.endsWith(".GIF") )
                     {
                        abrirImagen(f);
                        panelPesta.setVisible(true);
                     }
                     /*
                      * Si no es ninguno de los anteriores muestra un mensaje de error.
                      */
                     else
                     {
                        JOptionPane.showMessageDialog(this,"El fichero seleccionado no corresponde a ningún formato conocido por este software.",
                            "Formato de archivo desconocido",JOptionPane.ERROR_MESSAGE);
                     }
                  }
            }catch(Exception e){System.err.println("error de lectura "+e.getCause());}
         }//GEN-LAST:event_menuAbrirActionPerformed

         /*
          * Método que crea una nueva ventana de reproducción de webcam.
          */

         private void grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabarActionPerformed
            /*
             * Como este sistema de gestión de webcam únicamente funciona en
             * sistemas operativos Microsoft comprobamos que la aplicación se está
             * ejecutando en uno de ellos, de no ser así mostramos un mensaje de
             * información.
             */
             String so = System.getProperty("os.name");
             System.out.println(so);
             try
             {
                 if(so.startsWith("Windows"))
                 {
                     MiVentanaWebCam mvwc =  MiVentanaWebCam.getInstance();
                     escritorio.add(mvwc);
                     mvwc.setVisible(true);
                     organizaBotonesForma();
                 }else
                 {
                    JOptionPane.showMessageDialog(this,"La herramienta que gestiona la web cam sólo funciona en sistemas operativos Windows.",
                        "Compatibilidad web cam",JOptionPane.INFORMATION_MESSAGE);
                 }
             }catch(Exception e){System.out.println(e.getMessage());}
            
         }//GEN-LAST:event_grabarActionPerformed

         private void capturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capturarActionPerformed

             /*
              * Método que realiza capturas, solo iniciará la captura si se tiene
              * seleccionada una ventana de reproducción de vídeo o de webcam.
              */
             try
             {
                  BufferedImage img;
                  Player player;
                  Dimension d;
                  String ventana = escritorio.getSelectedFrame().getClass().getName();
                  
                  if((ventana.compareTo("minipaint.MiVentanaJMF") == 0))
                  {
                      MiVentanaJMF mvj = (MiVentanaJMF)escritorio.getSelectedFrame();
                      player = mvj.getPlayer();
                  }else if(ventana.compareTo("minipaint.MiVentanaWebCam") == 0)
                  {
                      MiVentanaWebCam mvwc = (MiVentanaWebCam)escritorio.getSelectedFrame();
                      player = mvwc.getPlayer();
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(this,"Para capturar debe tener abierta una ventana de reproducción de video o de webcam",
                        "Problema con la captura",JOptionPane.INFORMATION_MESSAGE);
                      player = null;
                  }
                  if(player != null)
                  {
                      img = getFrame(player);
                      abrirCaptura(img);
                  }
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_capturarActionPerformed

         private void menuBarraHerrWebcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarraHerrWebcamActionPerformed
            if(menuBarraHerrWebcam.isSelected())
             {
                herramientasWebCamCaptura.setVisible(true);
             }else
             {
                herramientasWebCamCaptura.setVisible(false);
             }
         }//GEN-LAST:event_menuBarraHerrWebcamActionPerformed

         private void botonLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLibreActionPerformed
            try{
                organizaBotonesForma();
                botonLibre.setSelected(true);
                MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
                (mvi.getLienzo()).setForma(Lienzo.LIBRE);
                labelSeleccion.setText("  Dibujo Libre");
            }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_botonLibreActionPerformed

         private void botonGrisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrisesActionPerformed
             MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
             if(mvi != null && mvi.getLienzo().getImageFuente() != null)
             {
                mvi.getLienzo().imagenGamaGrises();
             }
         }//GEN-LAST:event_botonGrisesActionPerformed

         private void botonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarCambiosActionPerformed
             MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
             if(mvi != null && mvi.getLienzo().getImage() != null)
             {
                mvi.getLienzo().setImageFuente(mvi.getLienzo().getImage());
             }
         }//GEN-LAST:event_botonGuardarCambiosActionPerformed

         private void botonRecuperarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecuperarImagenActionPerformed
             MiVentanaInterna mvi=((MiVentanaInterna)escritorio.getSelectedFrame());
             if(mvi != null && mvi.getLienzo().getImage() != null)
             {
                mvi.getLienzo().setImageFuente(mvi.getLienzo().getImgCopiaSeguridad());
             }
         }//GEN-LAST:event_botonRecuperarImagenActionPerformed

         private void sliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBrilloStateChanged
             try{
                MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                if(mvi !=null)
                {
                    mvi.getLienzo().setBrillo(sliderBrillo.getValue()*2f);
                    mvi.getLienzo().rescaleOP();
                }
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_sliderBrilloStateChanged

         private void sliderContrasteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderContrasteStateChanged
             try{
                MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                if(mvi !=null)
                {
                    mvi.getLienzo().setContraste(sliderContraste.getValue());
                    mvi.getLienzo().rescaleOP();
                    System.out.println(sliderContraste.getValue());
                }
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_sliderContrasteStateChanged

         private void sliderTransparenciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTransparenciaStateChanged
             try{
                 MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                 int valor = ((Integer)sliderTransparencia.getValue());
                 if(mvi.getLienzo().getForma() == Lienzo.RECTANGULO || mvi.getLienzo().getForma() == Lienzo.ELIPSE)
                 {
                     Color c1 =   mvi.getLienzo().getMiFigura2DSeleccionada().getColor1();
                     Color c2 =   mvi.getLienzo().getMiFigura2DSeleccionada().getColor2();
                     if(mvi.getLienzo().getEditar())
                     {
                        mvi.getLienzo().getMiFigura2DSeleccionada().setColor1(new Color(c1.getRed(),c1.getGreen(),c1.getBlue(),valor));
                        mvi.getLienzo().getMiFigura2DSeleccionada().setColor2(new Color(c2.getRed(),c2.getGreen(),c2.getBlue(),valor));
                        mvi.getLienzo().repaint();
                     }else
                     {
                        mvi.getLienzo().setTransparencia(valor);
                     }
                }
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_sliderTransparenciaStateChanged

         private void botonSubirFiguraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSubirFiguraActionPerformed
            try{
                 MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                 if(mvi.getLienzo().getEditar())
                 {

                    if(mvi.getLienzo().getForma() == Lienzo.RECTANGULO
                        ||mvi.getLienzo().getForma() == Lienzo.ELIPSE)
                    {
                        mvi.getLienzo().moverPosicionFigura((MiFigura)mvi.getLienzo().getMiFigura2DSeleccionada(), true);
                    }
                    else
                    {
                        mvi.getLienzo().moverPosicionFigura((MiFigura)mvi.getLienzo().getMiFigura1DSeleccionada(), true);
                    }
                 }
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_botonSubirFiguraActionPerformed

         private void botonBajarCapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajarCapaActionPerformed
             try{
                 MiVentanaInterna mvi = ((MiVentanaInterna)escritorio.getSelectedFrame());
                 if(mvi.getLienzo().getEditar())
                 {
                     if(mvi.getLienzo().getForma() == Lienzo.RECTANGULO
                        ||mvi.getLienzo().getForma() == Lienzo.ELIPSE)
                    {
                        mvi.getLienzo().moverPosicionFigura((MiFigura)mvi.getLienzo().getMiFigura2DSeleccionada(), false);
                    }
                    else
                    {
                        mvi.getLienzo().moverPosicionFigura((MiFigura)mvi.getLienzo().getMiFigura1DSeleccionada(), false);
                    }
                 }
             }catch(Exception e){System.out.println(e.getMessage());}
         }//GEN-LAST:event_botonBajarCapaActionPerformed

         
/*
 * Abre la captura de pantalla creada y la pinta en un nuevo lienzo.
 */
         private void abrirCaptura(BufferedImage img)
         {
             try{
                Dimension d = new Dimension(img.getWidth(),img.getHeight());
                MiVentanaInterna mvi =new MiVentanaInterna();
                escritorio.add(mvi);
                mvi.setVisible(true);
                mvi.getLienzo().setImgCopiaSeguridad(img);
                mvi.getLienzo().setPreferredSize(d);

             }catch(Exception e){System.out.println(e.getMessage());}
         }

         /*
          * Realiza la captura de pantalla.
          */

         private BufferedImage getFrame(Player player)
         {
            FrameGrabbingControl fgc;
            fgc = (FrameGrabbingControl)player.getControl("javax.media.control.FrameGrabbingControl");
            Buffer bufferFrame = fgc.grabFrame();
            BufferToImage bti;
            bti = new BufferToImage((VideoFormat)bufferFrame.getFormat());
            Image img = bti.createImage(bufferFrame);
            return(BufferedImage) img;
            
         }

         private void abrirVideo(File f)
         {
            try{
                MiVentanaJMF mvJMF =  MiVentanaJMF.getInstance(f);
                escritorio.add(mvJMF);
                mvJMF.setVisible(true);
                organizaBotonesForma();
            }catch(Exception e){System.err.println("error de lectura "+e.getCause());}
         }
         private void abrirSonido(File f)
         {

             try{
                 miVentanaReproduccionSonido mvrs = new miVentanaReproduccionSonido(f);
                 escritorio.add(mvrs);
                 mvrs.setVisible(true);
                 organizaBotonesForma();
             }catch(Exception e){System.out.println(e.getMessage());}
         }

         private void abrirImagen(File f)
         {
             try{
                 BufferedImage img;
                 Dimension d;
                 img = ImageIO.read(f);
                 MiVentanaInterna mvi =new MiVentanaInterna();
                 escritorio.add(mvi);
                 mvi.setVisible(true);
                 img = convertImageType(img, BufferedImage.TYPE_INT_RGB);
                 mvi.getLienzo().setImgCopiaSeguridad(img);
                 d = new Dimension(img.getWidth(),img.getHeight());
                 mvi.getLienzo().setPreferredSize(d);
            }catch(Exception e){System.err.println("error de lectura " + e.getCause());}
        }


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton180;
    private javax.swing.JButton boton270;
    private javax.swing.JButton boton90;
    private javax.swing.JButton botonAumentar;
    private javax.swing.JButton botonBajarCapa;
    private javax.swing.JButton botonColor;
    private javax.swing.JButton botonColorTrazo;
    private javax.swing.JButton botonContrasteIluminado;
    private javax.swing.JButton botonContrasteNormal;
    private javax.swing.JButton botonContrasteOscurecido;
    private javax.swing.JButton botonDisminuir;
    private javax.swing.JButton botonGrises;
    private javax.swing.JButton botonGuardarCambios;
    private javax.swing.JToggleButton botonLibre;
    private javax.swing.JToggleButton botonLinea;
    private javax.swing.JButton botonNegativo;
    private javax.swing.JToggleButton botonOvalo;
    private javax.swing.JToggleButton botonPunto;
    private javax.swing.JToggleButton botonRectangulo;
    private javax.swing.JButton botonRecuperarImagen;
    private javax.swing.JButton botonSubirFigura;
    private javax.swing.JButton capturar;
    private javax.swing.JCheckBox checkBoxEditar;
    private javax.swing.JCheckBox checkBoxGraduado;
    private javax.swing.JCheckBox checkBoxRelleno;
    private javax.swing.JComboBox comboBoxFiltros;
    private javax.swing.JComboBox comboBoxTipoGraduado;
    private javax.swing.JComboBox comboBoxTrazo;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton grabar;
    private javax.swing.JToolBar herramientasFiguraTrazo;
    private javax.swing.JToolBar herramientasImagen;
    private javax.swing.JToolBar herramientasWebCamCaptura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelBrillo;
    private javax.swing.JLabel labelContraste;
    private javax.swing.JLabel labelEscala;
    private javax.swing.JLabel labelFiltro;
    private javax.swing.JLabel labelGrosor;
    private javax.swing.JLabel labelOpcionesImagen;
    private javax.swing.JLabel labelProfundidad;
    private javax.swing.JLabel labelRotacion;
    private javax.swing.JLabel labelSeleccion;
    private javax.swing.JLabel labelTransparencia;
    private javax.swing.JLabel labelTrazo;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuAyudaAcercaDe;
    private javax.swing.JMenu menuBarraHerr;
    private javax.swing.JCheckBoxMenuItem menuBarraHerrFigura;
    private javax.swing.JCheckBoxMenuItem menuBarraHerrWebcam;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuNuevaImagen;
    private javax.swing.JMenu menuNuevo;
    private javax.swing.JMenuItem menuNuevoSonido;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuVer;
    private javax.swing.JPanel panelBotonesContraste;
    private javax.swing.JPanel panelBotonesGuardarRecuperar;
    private javax.swing.JPanel panelBotonesRotacion;
    private javax.swing.JPanel panelBrillo;
    private javax.swing.JPanel panelBrilloFiltro;
    private javax.swing.JPanel panelCapa;
    private javax.swing.JPanel panelChecksFigura;
    private javax.swing.JPanel panelColCon;
    private javax.swing.JPanel panelColorTrazo;
    private javax.swing.JPanel panelContinuidad;
    private javax.swing.JPanel panelContraste;
    private javax.swing.JPanel panelContrastes;
    private javax.swing.JPanel panelDegradado;
    private javax.swing.JPanel panelDegradadoTransparenciaColor;
    private javax.swing.JPanel panelDeslizadorRotacion;
    private javax.swing.JPanel panelEdicionImagen;
    private javax.swing.JPanel panelEdiciones;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelEscala;
    private javax.swing.JPanel panelEscalaRotacion;
    private javax.swing.JPanel panelFigura;
    private javax.swing.JPanel panelFiguras;
    private javax.swing.JPanel panelFiltroBrilloContraste;
    private javax.swing.JPanel panelFiltros;
    private javax.swing.JPanel panelGrosor;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelIneferior;
    private javax.swing.JPanel panelLabelOpcionesFigura;
    private javax.swing.JPanel panelOpcionesFigura;
    private javax.swing.JTabbedPane panelPesta;
    private javax.swing.JPanel panelProfundidad;
    private javax.swing.JPanel panelRotaciones;
    private javax.swing.JPanel panelTipoDegradado;
    private javax.swing.JPanel panelTipoFigura;
    private javax.swing.JPanel panelTipoFiguraOpcionesTrazo;
    private javax.swing.JPanel panelTransparencia;
    private javax.swing.JPanel panelTrazo;
    private javax.swing.JSlider sliderBrillo;
    private javax.swing.JSlider sliderContraste;
    private javax.swing.JSlider sliderRotacion;
    private javax.swing.JSlider sliderTransparencia;
    private javax.swing.JSpinner spinnerGrosor;
    // End of variables declaration//GEN-END:variables

}
