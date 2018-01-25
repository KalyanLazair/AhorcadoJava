/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Thomas
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    String palabraOculta= "CETYS";
    int numeroDeFallos=0;
    
    public VentanaAhorcado() {
        initComponents();
        //inicializo la imagen del label del ahorcado.
        dibujaImagen(0);
    }
    /*Creamos un método para que chequée la letra presionada (por ejemplo la A) que compruebe
    si esa letra se encuentra dentro del String palabraOculta.
    Recibe como parámetro un string al que llamamos letra. Lo que vamos a hacer es que a través
    de un bucle for comprobamos si la letra que le pasamos es igual a alguna de las letras del
    string.*/
    private void chequeaLetra(String letra){
        letra=letra.toUpperCase();
        boolean acierto=false;
        /*Declaramos un string auxiliar. Este string nos va a permitir guardar el String teniendo
        en cuenta los espacios entre guiones que también son caracteres. El getText nos coge los
        caracteres que haya en el jLabel, los guiones, los espacios y las letras que ya hubiera.*/
        String palabraConGuiones=jLabel1.getText();
        
        for(int i=0; i<palabraOculta.length();i++){
        if(letra.charAt(0)==palabraOculta.charAt(i)){
           //TODO Quita guión bajo de la letra correspondiente
           /*PalabraConGuiones la dividimos en substrings que vamos añadiendo. Utilizamos
           2*i porque se sustituye el guión por la palabra en la posición i, pero con los espacios
           el string es el doble de largo.
           Luego le sumamos la letra. Finalmente le añadimos otros substring en posición 2*i + 1 para
           que empiece a coger a partir de la posición siguiente a la palabra que sustituimos.*/
           
           palabraConGuiones= palabraConGuiones.substring(0,2*i)+letra+palabraConGuiones.substring(2*i+1);
            acierto=true;
        }
            
      }
        //Actualizamos el valor que se encuentra en la pantalla.
        jLabel1.setText(palabraConGuiones);
        
        if(acierto==false){
          numeroDeFallos++;
          dibujaImagen(numeroDeFallos);
        }
    
    }
    /*El evento pressed (evt) también es capaz de detectar no sólo las coordenadas donde se produce
    el evento sino también el objeto que ha generado el evento, por ejemplo un botón. Cómo sabe el
    programa cual de los 27 objetos ha originado el evento? Le preguntamos al evento.
    Con evt.getSource nos da el objeto que ha originado el evento.*/
    private void chequeaBoton(JButton _boton){
        //esta función hace que el botón quede deshabilitado cuando lo presionamos. Así el jugador
        //sabe que ha comprobado ya esa letra.
       _boton.setEnabled(false);
       //Le pasamos el método chequeaLetra y vamos a obtener el texto del botón con la función getText.
       chequeaLetra(_boton.getText());
    }
    /*getClass es una función que devuelve todos los objetos que tiene esa clase (el objeto Java en el que estamos
    trabajando). Nos devuelve recursos, que son esos archivos que están en esa carpeta llamada imagenes. Esto nos
    permite usar las rutas relativas, que para eso usamos la función URL.*/
    private void dibujaImagen(int numeroImagen){
       URL nombreImagen;
       
       /*Switch sustituye a la cadena de ifs. Le pasamos como parámetro numeroImagen que es el parámetro
       que estábamos utilizando en los ifs (if(numeroImagen==0). Lo que hace Switch es recorrer casos.*/
       switch(numeroImagen){
           case 0 : nombreImagen= getClass().getResource("/imagenes/ahorcado_0.png"); break;
           case 1 : nombreImagen= getClass().getResource("/imagenes/ahorcado_1.png"); break;
           case 2 : nombreImagen= getClass().getResource("/imagenes/ahorcado_2.png"); break;
           case 3 : nombreImagen= getClass().getResource("/imagenes/ahorcado_3.png"); break;
           case 4 : nombreImagen= getClass().getResource("/imagenes/ahorcado_4.png"); break;
           case 5 : nombreImagen= getClass().getResource("/imagenes/ahorcado_5.png"); break;
           //Default es lo que pasa si no se cumple ninguno de los casos.
           default : nombreImagen= getClass().getResource("/imagenes/ahorcado_fin.png"); break;
       }
        
      int ancho=jLabel2.getWidth();
      int alto=jLabel2.getHeight();
      //Con este imageIcon dibujamos la imagen en el jpanel. La siguiente función sirve para ajustar la imagen
      //al espacio del jLabel. Duplicamos el nombre porque no tenemos un ImageIcon sino una imagen. Para poder crear
      //el ImageIcon tenemos que duplicarlo.
      ImageIcon miImagen= new ImageIcon(
                            new ImageIcon(nombreImagen).getImage().getScaledInstance(ancho,alto,Image.SCALE_DEFAULT));
      jLabel2.setIcon(miImagen);
    }

    /**
     * Object es la madre de todos los objetos, la clase de la cual todos los objetos heredan sus atributos.
     * Un Object es genérico. A un Object no le podemos pedir un getText o un setText (como en Jbutton) porque no lo reconoce.
     * Cómo le decimos a un Object que no es un Object? Cómo podemos concretar para que nos permita usar esos
     * atributos? Casteamos. Castear es transformar tipos de los objetos, pasarlo de un tipo Object a un tipo
     * JButton. Casteamos el Source del evento a un botón añadiendo JButton delante del evt.getSource().
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonA = new javax.swing.JButton();
        BotonB = new javax.swing.JButton();
        BotonC = new javax.swing.JButton();
        BotonD = new javax.swing.JButton();
        BotonE = new javax.swing.JButton();
        BotonF = new javax.swing.JButton();
        BotonG = new javax.swing.JButton();
        BotonH = new javax.swing.JButton();
        BotonI = new javax.swing.JButton();
        BotonJ = new javax.swing.JButton();
        BotonK = new javax.swing.JButton();
        BotonL = new javax.swing.JButton();
        BotonM = new javax.swing.JButton();
        BotonN = new javax.swing.JButton();
        BotonNN = new javax.swing.JButton();
        BotonO = new javax.swing.JButton();
        BotonP = new javax.swing.JButton();
        BotonQ = new javax.swing.JButton();
        BotonR = new javax.swing.JButton();
        BotonS = new javax.swing.JButton();
        BotonT = new javax.swing.JButton();
        BotonU = new javax.swing.JButton();
        BotonV = new javax.swing.JButton();
        BotonW = new javax.swing.JButton();
        BotonX = new javax.swing.JButton();
        BotonY = new javax.swing.JButton();
        BotonZ = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _ ");

        BotonA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonA.setText("A");
        BotonA.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonA.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonAMousePressed(evt);
            }
        });
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });

        BotonB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonB.setText("B");
        BotonB.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonB.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonBMousePressed(evt);
            }
        });

        BotonC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonC.setText("C");
        BotonC.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonC.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonCMousePressed(evt);
            }
        });
        BotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCActionPerformed(evt);
            }
        });

        BotonD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonD.setText("D");
        BotonD.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonD.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonDMousePressed(evt);
            }
        });

        BotonE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonE.setText("E");
        BotonE.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonE.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonEMousePressed(evt);
            }
        });

        BotonF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonF.setText("F");
        BotonF.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonF.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonFMousePressed(evt);
            }
        });

        BotonG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonG.setText("G");
        BotonG.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonG.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonGMousePressed(evt);
            }
        });

        BotonH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonH.setText("H");
        BotonH.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonH.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonHMousePressed(evt);
            }
        });

        BotonI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonI.setText("I");
        BotonI.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonI.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonIMousePressed(evt);
            }
        });

        BotonJ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonJ.setText("J");
        BotonJ.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonJ.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonJMousePressed(evt);
            }
        });

        BotonK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonK.setText("K");
        BotonK.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonK.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonKMousePressed(evt);
            }
        });

        BotonL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonL.setText("L");
        BotonL.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonL.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonLMousePressed(evt);
            }
        });

        BotonM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonM.setText("M");
        BotonM.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonM.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonMMousePressed(evt);
            }
        });

        BotonN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonN.setText("N");
        BotonN.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonN.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonNMousePressed(evt);
            }
        });
        BotonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNActionPerformed(evt);
            }
        });

        BotonNN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonNN.setText("Ñ");
        BotonNN.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonNN.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonNN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonNNMousePressed(evt);
            }
        });

        BotonO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonO.setText("O");
        BotonO.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonO.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonOMousePressed(evt);
            }
        });

        BotonP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonP.setText("P");
        BotonP.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonP.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonPMousePressed(evt);
            }
        });

        BotonQ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonQ.setText("Q");
        BotonQ.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonQ.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonQMousePressed(evt);
            }
        });

        BotonR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonR.setText("R");
        BotonR.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonR.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonRMousePressed(evt);
            }
        });

        BotonS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonS.setText("S");
        BotonS.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonS.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonSMousePressed(evt);
            }
        });

        BotonT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonT.setText("T");
        BotonT.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonT.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonTMousePressed(evt);
            }
        });

        BotonU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonU.setText("U");
        BotonU.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonU.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonUMousePressed(evt);
            }
        });

        BotonV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonV.setText("V");
        BotonV.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonV.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonVMousePressed(evt);
            }
        });

        BotonW.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonW.setText("W");
        BotonW.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonW.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonWMousePressed(evt);
            }
        });

        BotonX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonX.setText("X");
        BotonX.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonX.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonXMousePressed(evt);
            }
        });

        BotonY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonY.setText("Y");
        BotonY.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonY.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonYMousePressed(evt);
            }
        });

        BotonZ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonZ.setText("Z");
        BotonZ.setMaximumSize(new java.awt.Dimension(64, 64));
        BotonZ.setPreferredSize(new java.awt.Dimension(64, 64));
        BotonZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonZMousePressed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton28.setMaximumSize(new java.awt.Dimension(64, 64));
        jButton28.setPreferredSize(new java.awt.Dimension(64, 64));
        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton28MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonW, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonY, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonNN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonH, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonK, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonN, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonD, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonG, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonD, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonG, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonK, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonH, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonNN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonT, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonW, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonV, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonY, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonBMousePressed

    private void BotonCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonCMousePressed

    private void BotonDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonDMousePressed

    private void BotonAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonAMousePressed

    private void BotonEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonEMousePressed

    private void BotonFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonFMousePressed

    private void BotonGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonGMousePressed

    private void BotonLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonLMousePressed

    private void BotonMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonMMousePressed

    private void BotonNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonNMousePressed

    private void BotonIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonIMousePressed

    private void BotonJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonJMousePressed

    private void BotonKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonKMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonKMousePressed

    private void BotonHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonHMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonHMousePressed

    private void BotonRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonRMousePressed

    private void BotonSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonSMousePressed

    private void BotonTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonTMousePressed

    private void BotonOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonOMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonOMousePressed

    private void BotonPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonPMousePressed

    private void BotonQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonQMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonQMousePressed

    private void BotonNNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNNMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonNNMousePressed

    private void BotonXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonXMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonXMousePressed

    private void BotonYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonYMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonYMousePressed

    private void BotonZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonZMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonZMousePressed

    private void BotonVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonVMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonVMousePressed

    private void BotonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonWMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonWMousePressed

    private void jButton28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_jButton28MousePressed

    private void BotonUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonUMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonUMousePressed

    private void BotonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonCActionPerformed

    private void BotonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonNActionPerformed

    private void BotonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonA;
    private javax.swing.JButton BotonB;
    private javax.swing.JButton BotonC;
    private javax.swing.JButton BotonD;
    private javax.swing.JButton BotonE;
    private javax.swing.JButton BotonF;
    private javax.swing.JButton BotonG;
    private javax.swing.JButton BotonH;
    private javax.swing.JButton BotonI;
    private javax.swing.JButton BotonJ;
    private javax.swing.JButton BotonK;
    private javax.swing.JButton BotonL;
    private javax.swing.JButton BotonM;
    private javax.swing.JButton BotonN;
    private javax.swing.JButton BotonNN;
    private javax.swing.JButton BotonO;
    private javax.swing.JButton BotonP;
    private javax.swing.JButton BotonQ;
    private javax.swing.JButton BotonR;
    private javax.swing.JButton BotonS;
    private javax.swing.JButton BotonT;
    private javax.swing.JButton BotonU;
    private javax.swing.JButton BotonV;
    private javax.swing.JButton BotonW;
    private javax.swing.JButton BotonX;
    private javax.swing.JButton BotonY;
    private javax.swing.JButton BotonZ;
    private javax.swing.JButton jButton28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
