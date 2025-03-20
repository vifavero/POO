package br.executordeclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class ExecutorDeClasses {
    private static Object obj; // Stores the instance of the dynamically loaded class
    private static Class<?> cls;
    private static JTextArea outputArea;
    private static JTextField textField1, textField2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Executor de Classes");
        frame.setSize(500, 450); // Increased window height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Main panel to organize layout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Input panel (top)
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JLabel label1 = new JLabel("Informe a quantidade de genes1:");
        textField1 = new JTextField("");

        JLabel label2 = new JLabel("Informe a quantidade de genes2");;
        textField2 = new JTextField("");

        inputPanel.add(label1);
        inputPanel.add(textField1);
        inputPanel.add(label2);
        inputPanel.add(textField2);

        // Drop label (center)
        JLabel dropLabel = new JLabel("Arraste um arquivo .class aqui", SwingConstants.CENTER);
        dropLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dropLabel.setPreferredSize(new Dimension(500, 40));

        // JTextArea (bottom)
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 30));

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setPreferredSize(new Dimension(500, 200)); // Ensures visibility

        // Buttons panel (bottom)
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
//        JButton btnIdentificaSe = new JButton("Identifica-se");
        JButton btnformacao = new JButton("Formacao");
        JButton btnareaDePesquisa = new JButton("Area de Pesquisa");
        JButton btnanimalDeInteresse = new JButton("Animal de interesse");
        JButton btndespedeSe = new JButton("Despede-se");
        JButton btncomputaGenes = new JButton("Computa Genes");

//        buttonPanel.add(btnIdentificaSe);
        buttonPanel.add(btnformacao);
        buttonPanel.add(btnareaDePesquisa);
        buttonPanel.add(btnanimalDeInteresse);
        buttonPanel.add(btndespedeSe);
        buttonPanel.add(btncomputaGenes);

        // Adding components to the main panel
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(dropLabel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        // Add panels to frame
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Drag and Drop functionality
        new DropTarget(dropLabel, new DropTargetAdapter() {
            public void drop(DropTargetDropEvent e) {
                try {
                    e.acceptDrop(DnDConstants.ACTION_COPY);
                    File file = ((java.util.List<File>) e.getTransferable()
                            .getTransferData(DataFlavor.javaFileListFlavor)).get(0);
                    if (!file.getName().endsWith(".class")) return;

                    // Ensure correct package reference when loading the class
                    String className = "br.executordeclasses." + file.getName().replace(".class", "");
                    cls = new URLClassLoader(new URL[]{file.getParentFile().toURI().toURL()})
                            .loadClass(className);

                    if (!Zoologico.class.isAssignableFrom(cls)) {
                        JOptionPane.showMessageDialog(null, "Erro: A classe não herda de Zoologico!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    obj = cls.getDeclaredConstructor().newInstance();
                    outputArea.setText("Classe " + className + " carregada com sucesso!\n");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao carregar/executar a classe!", "Erro", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });

        // Event Listeners for Each Button
        btnformacao.addActionListener(e -> invokeMethod("formacao"));
        btnareaDePesquisa.addActionListener(e -> invokeMethod("areaDePesquisa"));
        btnanimalDeInteresse.addActionListener(e -> invokeMethod("animalDeInteresse"));
        btndespedeSe.addActionListener(e -> invokeMethod("despedeSe"));
        btncomputaGenes.addActionListener(e -> computeNumbers());

        frame.setVisible(true);
    }

    private static void invokeMethod(String methodName) {
        if (obj == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma classe carregada!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Method method = cls.getMethod(methodName);
            String result = (String) method.invoke(obj);
            outputArea.append(methodName + ": " + result + "\n");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao chamar " + methodName + "!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    private static void computeNumbers() {
        if (obj == null) {
            JOptionPane.showMessageDialog(null, "Nenhuma classe carregada!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());

            Method method = cls.getMethod("computaGenes", double.class, double.class);
            double result = (double) method.invoke(obj, num1, num2);
            outputArea.append("computa(" + num1 + ", " + num2 + "): " + result + "\n");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao chamar computa()!", "Erro", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
