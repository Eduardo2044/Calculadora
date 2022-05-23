package eduardo.gui.p1;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

    // Números del 0 al 9 y seis botones más para
    // suma, resta, multiplicacion, división, resultado y limpiar
    JButton[] grupoBotones = new JButton[16];

    public PanelBotones() {
        initComponents();
    }

    private void initComponents() {

        // Creación de los botones
        grupoBotones[0] = new JButton("1");
        grupoBotones[1] = new JButton("2"); 
        grupoBotones[2] = new JButton("3");
        grupoBotones[3] = new JButton("+");
        grupoBotones[4] = new JButton("4"); 
        grupoBotones[5] = new JButton("5");
        grupoBotones[6] = new JButton("6");
        grupoBotones[7] = new JButton("-"); 
        grupoBotones[8] = new JButton("7");
        grupoBotones[9] = new JButton("8");
        grupoBotones[10] = new JButton("9");
        grupoBotones[11] = new JButton("*");
        grupoBotones[12] = new JButton("C");
        grupoBotones[13] = new JButton("0");
        grupoBotones[14] = new JButton("=");
        grupoBotones[15] = new JButton("/");

        // Establecemos el layout
        this.setLayout(new GridLayout(4, 4));

        for (JButton boton : grupoBotones) {
            this.add(boton);
        }
    }

    public JButton[] getgrupoBotones() {
        return grupoBotones;
    }

}
