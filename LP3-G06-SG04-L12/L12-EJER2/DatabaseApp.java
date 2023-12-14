package Ejercicio_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import java.sql.*;

public class DatabaseApp extends JFrame{
    int countRows = 0;
    Dimension inputFieldSize = new Dimension(170, 30);

    JButton previusButton = new JButton("Previus");
    JLabel totalPages = new JLabel("1");
    JLabel of = new JLabel(" of ");
    JLabel actualPages = new JLabel("1");
    JButton nextButton = new JButton("Next");
    JPanel navigationPanel = new JPanel(new FlowLayout());

    JLabel addressLabel = new JLabel("Address ID:       ");
    JTextField addressField = new JTextField();
    JPanel addressPanel = new JPanel(new GridLayout(1, 2));
    JPanel addressFieldPanel = new JPanel(new FlowLayout());

    JLabel firstNameLabel = new JLabel("First Name:       ");
    JTextField firstNameField = new JTextField();
    JPanel firstNamePanel = new JPanel(new GridLayout(1, 2));
    JPanel firstNameFieldPanel = new JPanel(new FlowLayout());

    JLabel lastNameLabel = new JLabel("Last Name:        ");
    JTextField lastNameField = new JTextField();
    JPanel lastNamePanel = new JPanel(new GridLayout(1, 2));
    JPanel lastNameFieldPanel = new JPanel(new FlowLayout());

    JLabel emailLabel = new JLabel("Email:                ");
    JTextField emailField = new JTextField();
    JPanel emailPanel = new JPanel(new GridLayout(1, 2));
    JPanel emailFieldPanel = new JPanel(new FlowLayout());

    JLabel phoneNumberLabel = new JLabel("Phone Number:");
    JTextField phoneNumberField = new JTextField();
    JPanel phoneNumberPanel = new JPanel(new GridLayout(1, 2));
    JPanel phoneNumberFieldPanel = new JPanel(new FlowLayout());

    JLabel findLastNameLabel = new JLabel("Last Name:");
    JTextField findLastNameTextField = new JTextField();
    JButton findFindButton = new JButton("Find");
    JPanel findPanel = new JPanel(new FlowLayout());

    JButton browseButton = new JButton("Browse All Entries");
    JButton insertButton = new JButton("Insert New Entries");
    JPanel actionButtonsPanel = new JPanel();

    private String query = "SELECT * FROM agenda";

    public DatabaseApp(){
        super("Database App");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);

        insertButton.addActionListener(new ActionNavigation());

        navigationPanel.add(previusButton);
        navigationPanel.add(actualPages);
        navigationPanel.add(of);
        navigationPanel.add(totalPages);
        navigationPanel.add(nextButton);

        nextButton.addActionListener(new ActionNavigation());
        previusButton.addActionListener(new ActionNavigation());

        createInputPanel(addressPanel, addressLabel, addressField);
        createInputPanel(firstNamePanel, firstNameLabel, firstNameField);
        createInputPanel(lastNamePanel, lastNameLabel, lastNameField);
        createInputPanel(emailPanel, emailLabel, emailField);
        createInputPanel(phoneNumberPanel, phoneNumberLabel, phoneNumberField);

        findPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        findPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Find an entry by last name"),
                            new SoftBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.GRAY)));
        findPanel.add(findLastNameLabel);
        findPanel.add(findLastNameTextField);
        findPanel.add(findFindButton);
        findLastNameTextField.setPreferredSize(inputFieldSize);

        actionButtonsPanel.add(browseButton);
        actionButtonsPanel.add(insertButton);

        JPanel panel = new JPanel(new GridLayout(8, 1));

        panel.add(navigationPanel);
        panel.add(addressPanel);
        panel.add(firstNamePanel);
        panel.add(lastNamePanel);
        panel.add(emailPanel);
        panel.add(phoneNumberPanel);
        panel.add(findPanel);
        panel.add(actionButtonsPanel);

        add(panel);
    }

    private void createInputPanel(JPanel inputPanel, JLabel label, JTextField textField){
        inputPanel.setLayout(new GridBagLayout());
        textField.setPreferredSize(inputFieldSize);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 0, 15);

        gbc.gridx = 0;
        inputPanel.add(label, gbc);

        gbc.gridx = 1;
        inputPanel.add(textField, gbc);
    }

    public class ActionNavigation implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == nextButton){
                if ((Integer.parseInt(actualPages.getText()) + 1) > countRows)
                    actualPages.setText("1");
                else{
                    actualPages.setText(String.valueOf(Integer.parseInt(actualPages.getText()) + 1));
                }
            } 
            else if (e.getSource() == previusButton){
                if ((Integer.parseInt(actualPages.getText()) - 1) < 1)
                    actualPages.setText(String.valueOf(countRows));
                else{
                    actualPages.setText(String.valueOf(Integer.parseInt(actualPages.getText()) - 1));
                }
            }
            else if (e.getSource() == insertButton){
                insertNewEntry();
            }
            else if (e.getSource() == findFindButton){
                filterByLastName(findLastNameTextField.getText());
            }
            else if (e.getSource() == browseButton){
                query = "SELECT * FROM agenda";
            }
            int total = showDatabaseInfo(Integer.parseInt(actualPages.getText()));
            totalPages.setText(String.valueOf(total));
        }
    }

    public int showDatabaseInfo(int j){
        int total = 0;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lab12G2", "root", "ItaloG14@");
            statement = connection.createStatement();

            ResultSet countResultSet = statement.executeQuery("SELECT COUNT(*) AS total FROM agenda");
            if (countResultSet.next()){
                total = countResultSet.getInt("total");
            }

            if (total >= j){
                resultSet = statement.executeQuery(query);

                int counter = 1;

                while (resultSet.next()){
                    if (counter == j){
                        break;
                    }
                    counter++;
                }

                addressField.setText(resultSet.getString(1));
                firstNameField.setText(resultSet.getString(2));
                lastNameField.setText(resultSet.getString(3));
                emailField.setText(resultSet.getString(4));
                phoneNumberField.setText(resultSet.getString(5));
            }

        } 
        catch (SQLException e){
            e.printStackTrace();
        } 
        finally{
            try{
                if (resultSet != null){
                    resultSet.close();
                }
                if (statement != null){
                    statement.close();
                }
                if (connection != null){
                    connection.close();
                }
            } 
            catch (SQLException e){
                e.printStackTrace();
            }
        }
        countRows = total;
        return total;
    }

    private void insertNewEntry() {
        Connection connection = null;
        PreparedStatement stmt = null;
    
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lab12G2", "root", "ItaloG14@");
    
            stmt = connection.prepareStatement("INSERT INTO agenda VALUES (?, ?, ?, ?, ?)");
    
            String addressValue = addressField.getText();
            String firstNameValue = firstNameField.getText();
            String lastNameValue = lastNameField.getText();
            String emailValue = emailField.getText();
            String phoneNumberValue = phoneNumberField.getText();
    
            stmt.setString(1, addressValue);
            stmt.setString(2, firstNameValue);
            stmt.setString(3, lastNameValue);
            stmt.setString(4, emailValue);
            stmt.setString(5, phoneNumberValue);
    
            stmt.executeUpdate();
    
            clearFields(); 
    
            totalPages.setText(String.valueOf(Integer.parseInt(totalPages.getText()) + 1));
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void clearFields() {
        addressField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
        phoneNumberField.setText("");
    }

    private void filterByLastName(String lastName) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lab12G2", "root", "ItaloG14@");
            preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS total FROM agenda");
            ResultSet countResultSet = preparedStatement.executeQuery();
            if (countResultSet.next()){
                countRows = countResultSet.getInt("total");
                totalPages.setText(String.valueOf(countRows));
                actualPages.setText(String.valueOf(1));
            }      

            query = "SELECT * FROM agenda WHERE LastName LIKE ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + lastName + "%");

            resultSet = preparedStatement.executeQuery();

            showDatabaseInfo(Integer.parseInt(actualPages.getText()));
            preparedStatement.close();
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
        finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } 
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
