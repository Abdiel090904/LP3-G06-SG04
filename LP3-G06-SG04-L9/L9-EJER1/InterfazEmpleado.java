package l9.ejer1;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class InterfazEmpleado extends JFrame {

    private static final String ARCHIVO_EMPLEADOS = "empleados.txt";

    private DefaultTableModel modeloTabla;
    private JTextField numeroField, nombreField, sueldoField;

    public InterfazEmpleado() {
        super("Registro de Empleados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(600, 400);
        setMinimumSize(new Dimension(400, 300));
        setLocationRelativeTo(null);

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("N�mero");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Sueldo");

        JTable tablaEmpleados = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaEmpleados);

        JPanel panelDatos = new JPanel(new GridLayout(4, 2));
        JLabel labelDatosEmpleado = new JLabel("Datos del empleado");
        JLabel labelNumero = new JLabel("N�mero:");
        numeroField = new JTextField();
        JLabel labelNombre = new JLabel("Nombre:");
        nombreField = new JTextField();
        JLabel labelSueldo = new JLabel("Sueldo:");
        sueldoField = new JTextField();

        panelDatos.add(labelDatosEmpleado);
        panelDatos.add(new JLabel(""));
        panelDatos.add(labelNumero);
        panelDatos.add(numeroField);
        panelDatos.add(labelNombre);
        panelDatos.add(nombreField);
        panelDatos.add(labelSueldo);
        panelDatos.add(sueldoField);

        JPanel panelBotones = new JPanel(new BorderLayout());
        JButton agregarButton = new JButton("Agregar Empleado");
        agregarButton.setPreferredSize(new Dimension(150, 30));

        JPanel panelAgregarButton = new JPanel();
        panelAgregarButton.add(agregarButton);
        panelBotones.add(panelDatos, BorderLayout.NORTH);
        panelBotones.add(panelAgregarButton, BorderLayout.CENTER);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });

        JPanel panelEmpleadosAgregados = new JPanel(new BorderLayout());
        panelEmpleadosAgregados.add(new JLabel("Empleados Agregados"), BorderLayout.NORTH);
        panelEmpleadosAgregados.add(scrollPane, BorderLayout.CENTER);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panelBotones, BorderLayout.WEST);
        panelPrincipal.add(panelEmpleadosAgregados, BorderLayout.CENTER);

        add(panelPrincipal);

        cargarEmpleados();

        setVisible(true);
    }

    private void cargarEmpleados() {
        modeloTabla.setRowCount(0);

        File archivo = new File(ARCHIVO_EMPLEADOS);

        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(",");
                    Empleado empleado = new Empleado(Integer.parseInt(datos[0]), datos[1], Double.parseDouble(datos[2]));
                    modeloTabla.addRow(new Object[]{empleado.getNumero(), empleado.getNombre(), empleado.getSueldo()});
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void agregarEmpleado() {
        String numeroStr = numeroField.getText();
        String nombre = nombreField.getText();
        String sueldoStr = sueldoField.getText();

        try {
            int numero = Integer.parseInt(numeroStr);
            double sueldo = Double.parseDouble(sueldoStr);

            Empleado nuevoEmpleado = new Empleado(numero, nombre, sueldo);

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_EMPLEADOS, true))) {
                bw.write(nuevoEmpleado.getNumero() + "," + nuevoEmpleado.getNombre() + "," + nuevoEmpleado.getSueldo());
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            cargarEmpleados();
            JOptionPane.showMessageDialog(this, "Empleado agregado exitosamente.");

            numeroField.setText("");
            nombreField.setText("");
            sueldoField.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese datos v�lidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazEmpleado();
            }
        });
    }
}


