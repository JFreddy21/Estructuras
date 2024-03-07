package Automovil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class InterfazAutomovil extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel marcaLabel;
    private JLabel modeloLabel;
    private JLabel seguridadLabel;
    private JComboBox<String> marcaComboBox;
    private JComboBox<String> modeloComboBox;
    private JComboBox<String> seguridadComboBox;
    private JButton buscarButton;
    private JButton agregarButton;
    private JButton regresarButtonBuscar;
    private JButton regresarButtonAgregar;
    private JPanel paginaInicialPanel;
    private JPanel buscarPanel;
    private JPanel agregarPanel;
    private JPanel mostrarPanel;
    private JPanel autosGuardadosPanel;
    private List<String> autosGuardados;

    public InterfazAutomovil() {
        // Configuramos la ventana
        setTitle("Modelos que ofrecemos de la empresa Tesla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Inicializamos la lista de autos guardados
        autosGuardados = new ArrayList<>();

        // Creamos los componentes de la página inicial
        marcaLabel = new JLabel("Seleccione una marca: ");
        modeloLabel = new JLabel("Seleccione un año de modelo: ");
        seguridadLabel = new JLabel("Seleccione tipo de seguridad: ");
        marcaComboBox = new JComboBox<>(new String[]{"Jaguar", "Jeep", "KIA", "Lamborghini", "Tesla"});
        modeloComboBox = new JComboBox<>(new String[]{"2012", "2015", "2020", "2024", "2025"});
        seguridadComboBox = new JComboBox<>(new String[]{"Mecánico", "Automático", "Autopiloto"});
        buscarButton = new JButton("Buscar Automovil");
        agregarButton = new JButton("Agregar Auto");
        paginaInicialPanel = new JPanel();
        paginaInicialPanel.setLayout(new GridLayout(5, 1));
        paginaInicialPanel.add(marcaLabel);
        paginaInicialPanel.add(marcaComboBox);
        paginaInicialPanel.add(modeloLabel);
        paginaInicialPanel.add(modeloComboBox);
        paginaInicialPanel.add(seguridadLabel);
        paginaInicialPanel.add(seguridadComboBox);
        paginaInicialPanel.add(buscarButton);
        paginaInicialPanel.add(agregarButton);

        // Creamos los paneles de búsqueda, agregar y mostrar información
        buscarPanel = new JPanel(new GridLayout(3, 1));
        agregarPanel = new JPanel(new GridLayout(3, 1));
        mostrarPanel = new JPanel(new GridLayout(4, 1));
        autosGuardadosPanel = new JPanel(new BorderLayout());

        // Configuramos el layout y mostramos la página inicial
        setLayout(new BorderLayout());
        add(paginaInicialPanel, BorderLayout.CENTER);

        // Agregamos el listener al botón de buscar automóvil
        buscarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarInformacionAutomovil();
            }
        });

        // Agregamos el listener al botón de agregar auto
        agregarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarFormularioAgregarAuto();
            }
        });

        // Mostramos la ventana
        setVisible(true);
    }

    private void mostrarInformacionAutomovil() {
        // Obtenemos la marca, el modelo y el tipo de seguridad seleccionados
        String marcaSeleccionada = (String) marcaComboBox.getSelectedItem();
        String modeloSeleccionado = (String) modeloComboBox.getSelectedItem();
        String seguridadSeleccionada = (String) seguridadComboBox.getSelectedItem();

        // Configuramos el panel de mostrar información
        mostrarPanel.removeAll();
        mostrarPanel.add(new JLabel("Marca: " + marcaSeleccionada));
        mostrarPanel.add(new JLabel("Modelo: " + modeloSeleccionado));
        mostrarPanel.add(new JLabel("Tipo de Seguridad: " + seguridadSeleccionada));
        regresarButtonBuscar = new JButton("Regresar");
        mostrarPanel.add(regresarButtonBuscar);

        // Agregamos el listener al botón de regresar
        regresarButtonBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                volverPaginaInicial();
            }
        });

        // Cambiamos al panel de mostrar información
        remove(paginaInicialPanel);
        add(mostrarPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void mostrarFormularioAgregarAuto() {
        // Creamos el formulario para agregar un auto
        JTextField marcaField = new JTextField(10);
        JTextField modeloField = new JTextField(10);
        JButton guardarButton = new JButton("Guardar");

        // Configuramos el panel de agregar
        agregarPanel.removeAll();
        agregarPanel.add(new JLabel("Marca: "));
        agregarPanel.add(marcaField);
        agregarPanel.add(new JLabel("Modelo: "));
        agregarPanel.add(modeloField);
        agregarPanel.add(guardarButton);
        regresarButtonAgregar = new JButton("Regresar");
        agregarPanel.add(regresarButtonAgregar);

        // Agregamos el listener al botón de guardar
        guardarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String marca = marcaField.getText();
                String modelo = modeloField.getText();
                autosGuardados.add("Marca: " + marca + ", Modelo: " + modelo);
                mostrarAutosGuardados();
            }
        });

        // Agregamos el listener al botón de regresar
        regresarButtonAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                volverPaginaInicial();
            }
        });

        // Cambiamos al panel de agregar
        remove(paginaInicialPanel);
        add(agregarPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void mostrarAutosGuardados() {
        // Configuramos el panel de mostrar autos guardados
        JTextArea autosGuardadosTextArea = new JTextArea(10, 20);
        autosGuardadosTextArea.setEditable(false);
        autosGuardadosTextArea.setLineWrap(true);
        autosGuardadosTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(autosGuardadosTextArea);

        for (String auto : autosGuardados) {
            autosGuardadosTextArea.append(auto + "\n");
        }

        // Configuramos el panel de mostrar
        autosGuardadosPanel.removeAll();
        autosGuardadosPanel.add(new JLabel("Autos Guardados:"), BorderLayout.NORTH);
        autosGuardadosPanel.add(scrollPane, BorderLayout.CENTER);
        JButton regresarButton = new JButton("Regresar");
        autosGuardadosPanel.add(regresarButton, BorderLayout.SOUTH);

        // Agregamos el listener al botón de regresar
        regresarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                volverPaginaInicial();
            }
        });

        // Cambiamos al panel de mostrar
        remove(agregarPanel);
        remove(mostrarPanel);
        add(autosGuardadosPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void volverPaginaInicial() {
        // Cambiamos al panel de página inicial
        remove(mostrarPanel);
        remove(agregarPanel);
        remove(autosGuardadosPanel);
        add(paginaInicialPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        // Creamos una instancia de la interfaz
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazAutomovil();
            }
        });
    }
}