package l9.ejer2;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountGUI extends JFrame {
    private JLabel archivoLabel, lineasLabel, palabrasLabel, caracteresLabel;

    public WordCountGUI() {
        super("WordCount GUI");
        initComponents();
        pack();
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initComponents() {
        archivoLabel = new JLabel();
        lineasLabel = new JLabel();
        palabrasLabel = new JLabel();
        caracteresLabel = new JLabel();

        JButton analizarButton = new JButton("Analizar archivo");
        analizarButton.addActionListener(e -> analizarArchivo());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.add(archivoLabel);
        panel.add(lineasLabel);
        panel.add(palabrasLabel);
        panel.add(caracteresLabel);
        panel.add(analizarButton);

        getContentPane().add(panel);
    }

    private void analizarArchivo() {
        String fileName = "src/leer.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.split("[^a-zA-Z0-9]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        archivoLabel.setText("Archivo: " + fileName);
        lineasLabel.setText("Líneas= " + lineCount);
        palabrasLabel.setText("Palabras= " + wordCount);
        caracteresLabel.setText("Caracteres= " + charCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WordCountGUI());
    }
}
