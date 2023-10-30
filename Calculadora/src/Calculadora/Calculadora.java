package Calculadora;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {

        //Comportamiento de cerrar ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Para abrir la ventana de java
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

}
