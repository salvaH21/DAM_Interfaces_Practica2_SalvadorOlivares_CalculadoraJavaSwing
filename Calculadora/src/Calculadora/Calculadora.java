package Calculadora;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {
        //Inicialización de componentes
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        //Comportamiento de cerrar ventana de java
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Textos por defecto en los componentes
        jButton1.setText("1");
        jButton2.setText("2");
        jButton3.setText("3");
        jButton4.setText("4");
        jButton5.setText("5");
        jButton6.setText("6");
        jButton7.setText("7");
        jButton8.setText("8");
        jButton9.setText("9");
        jButton10.setText("0");
        jButton11.setText("=");
        jButton12.setText("C");
        jButton13.setText("+");
        jButton14.setText("-");
        jButton15.setText("X");
        jButton16.setText("/");

        //Maquetación gráfica
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextArea1)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton4)
                                .addComponent(jButton5)
                                .addComponent(jButton6)
                                .addComponent(jButton7)
                                .addComponent(jButton8)
                                .addComponent(jButton9)
                                .addComponent(jButton10)
                                .addComponent(jButton11)
                                .addComponent(jButton12)
                                .addComponent(jButton13)
                                .addComponent(jButton14)
                                .addComponent(jButton15)
                                .addComponent(jButton16)
                                .addContainerGap(357, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextArea1)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton4)
                                .addComponent(jButton5)
                                .addComponent(jButton6)
                                .addComponent(jButton7)
                                .addComponent(jButton8)
                                .addComponent(jButton9)
                                .addComponent(jButton10)
                                .addComponent(jButton11)
                                .addComponent(jButton12)
                                .addComponent(jButton13)
                                .addComponent(jButton14)
                                .addComponent(jButton15)
                                .addComponent(jButton16)
                                .addContainerGap(278, Short.MAX_VALUE))
        );

        pack();
    }

    public static void main(String[] args) {
        // Para abrir la ventana de java
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    //Declaración de variables
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
}
