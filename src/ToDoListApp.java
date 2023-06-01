import javax.swing.*;
import java.awt.*;

public class ToDoListApp {

    public static void main(String[] args) {
        // defining the initial frame of the application.

        JFrame frame = new JFrame("To-Do list App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //adding a JPanel to hold the to-do list items:
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        //Create a JScrollPane to make the list scrollable:
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //Add the scrollPane to the frame:
        frame.add(scrollPane, BorderLayout.CENTER);

        //Add a text field and a button for adding new to-do items. We'll create a separate method called addItem() to handle this functionality:
        JTextField textField = new JTextField();
        JButton addButton = new JButton("Add");
        addButton.addActionListener(e -> addItem(panel, textField.getText()));

        //Add the text field and button to the frame:
        frame.add(textField, BorderLayout.NORTH);
        frame.add(addButton, BorderLayout.SOUTH);


    }
    //Implement the addItem() method:
    public static void addItem(JPanel panel, String item) {
        if(!item.isEmpty()){
            JCheckBox checkBox = new JCheckBox(item);
            panel.add(checkBox);
            panel.revalidate();
            panel.repaint();

        }

    }
}
