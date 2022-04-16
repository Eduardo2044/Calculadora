package eduardo.gui.p1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private int tipoOperacion;

    // Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents() {
        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos el área de texto
        areaTexto = new JTextArea(10, 50);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(areaTexto, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton : this.botonera.getgrupoBotones()) {
            boton.addActionListener(this);
        }

    }

    int num1 = 0;
    int num2 = 0;
    String operador = "";

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();
        if (((JButton) o).getText().equals("1") || ((JButton) o).getText().equals("2") || ((JButton) o).getText().equals("3")
                || ((JButton) o).getText().equals("4") || ((JButton) o).getText().equals("5") || ((JButton) o).getText().equals("6")
                || ((JButton) o).getText().equals("7") || ((JButton) o).getText().equals("8") || ((JButton) o).getText().equals("9")) {
            this.areaTexto.setText(this.areaTexto.getText() + ((JButton) o).getText());
        }

        if (((JButton) o).getText().equals("+")) {
            System.out.println("Suma");
            this.num1 = Integer.parseInt(this.areaTexto.getText());
            operador = "+";
            this.areaTexto.setText("");
        }

        if (((JButton) o).getText().equals("-")) {
            System.out.println("Resta");
            this.num1 = Integer.parseInt(this.areaTexto.getText());
            operador = "-";
            this.areaTexto.setText("");
        }

        if (((JButton) o).getText().equals("*")) {
            System.out.println("Multiplicación");
            this.num1 = Integer.parseInt(this.areaTexto.getText());
            operador = "*";
            this.areaTexto.setText("");
        }

        if (((JButton) o).getText().equals("/")) {
            System.out.println("División");
            this.num1 = Integer.parseInt(this.areaTexto.getText());
            operador = "/";
            this.areaTexto.setText("");
        }

        if (((JButton) o).getText().equals("=")) {
            System.out.println("Igual");
            this.num2 = Integer.parseInt(this.areaTexto.getText());

            switch (operador) {
                case "+":
                    this.areaTexto.setText(Integer.toString(this.num1 + this.num2));
                    break;
                case "-":
                    this.areaTexto.setText(Integer.toString(this.num1 - this.num2));
                    break;
                case "*":
                    this.areaTexto.setText(Integer.toString(this.num1 * this.num2));
                    break;
                case "/":
                    this.areaTexto.setText(Integer.toString(this.num1 / this.num2));
                    break;
            }
        }
        if (((JButton) o).getText().equals("C")) {
            areaTexto.setText("");
        }

    }

}
