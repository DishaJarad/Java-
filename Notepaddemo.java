
//In this prog notepad is created have set backgroundimage as a button
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
//import javax.imageio.ImageIO;

class notepaddemo extends JFrame {
    private JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea);

    notepaddemo() {

        setSize(400, 400);
        setVisible(true);
        setTitle("Notepad");
        JMenuBar m1 = new JMenuBar();
        JMenu mn1 = new JMenu("File");
        JMenuItem mt1 = new JMenuItem("New");
        JMenuItem mt2 = new JMenuItem("New Window");
        JMenuItem mt3 = new JMenuItem("Open");
        JMenuItem mt4 = new JMenuItem("Save");
        JMenuItem mt5 = new JMenuItem("Save as");

        JMenu mn2 = new JMenu("Edit");
        JMenuItem mtt1 = new JMenuItem("Undo");
        JMenuItem mtt2 = new JMenuItem("Cut");
        JMenuItem mtt3 = new JMenuItem("Copy");
        JMenuItem mtt4 = new JMenuItem("Paste");

        JMenu mn3 = new JMenu("Format");
        JMenuItem mttt1 = new JMenuItem("Word wrap");
        JMenuItem mttt2 = new JMenuItem("Font");

        JMenu mn4 = new JMenu("View");
        JMenuItem mtttt1 = new JMenuItem("Zoom");
        JMenuItem mtttt2 = new JMenuItem("Status bar");

        JMenu mn5 = new JMenu("Help");
        JMenuItem mttttt1 = new JMenuItem("Help");

        JButton bgImageButton = new JButton("Set Background Image");
        bgImageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png",
                        "gif");
                fileChooser.setFileFilter(filter);
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        // Image backgroundImage = ImageIO.read(selectedFile);
                        textArea.setOpaque(false);
                        textArea.setBackground(new Color(0, 0, 0, 0));
                        textArea.setBorder(BorderFactory.createEmptyBorder());
                        // textArea.setBackgroundImage(backgroundImage);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        add(bgImageButton, BorderLayout.NORTH);

        setJMenuBar(m1);
        add(scrollPane);

        m1.add(mn1);
        mn1.add(mt1);
        mn1.add(mt2);
        mn1.add(mt3);
        mn1.add(mt4);
        mn1.add(mt5);

        m1.add(mn2);
        mn2.add(mtt1);
        mn2.add(mtt2);
        mn2.add(mtt3);
        mn2.add(mtt4);

        m1.add(mn3);
        mn3.add(mttt1);
        mn3.add(mttt2);

        m1.add(mn4);
        mn4.add(mtttt1);
        mn4.add(mtttt2);

        m1.add(mn5);
        mn5.add(mttttt1);

    }

    public static void main(String args[]) {

        new notepaddemo();
    }
}
