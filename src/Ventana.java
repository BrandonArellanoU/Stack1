import org.w3c.dom.xpath.XPathResult;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtNumero;
    private JButton insertarElementoALaButton;
    private JButton btnEliminar;
    private JButton btnConsulltar;
    private JButton btnListar;
    private JTextArea txtListarElementos;

    private Pila coleccion = new Pila();

    public Ventana() {
        insertarElementoALaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coleccion.insertar(Integer.parseInt(txtNumero.getText()));
                JOptionPane.showMessageDialog(null,"Insertado en la Pila");
            }
        });


        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null,"Eliminado"
                    +coleccion.eliminar());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        });

        btnConsulltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    JOptionPane.showMessageDialog(null,"Cimal" +
                            coleccion.consultaTope());
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListarElementos.setText(coleccion.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
