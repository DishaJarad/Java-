
// Java program to handle MouseListener events
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class All_Events extends Frame
        implements MouseListener, ActionListener, ItemListener, WindowListener, ListSelectionListener {

    static JLabel label1, label2, label3, label4;
    JRadioButton C1, C2, C11, C22;

    All_Events() {

    }

    public static void main(String[] args) {

        JFrame f = new JFrame("MouseListener");

        f.setSize(600, 100);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a new panel
        JPanel p1 = new JPanel();
        JPanel p = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JTabbedPane t1 = new JTabbedPane();
        t1.add(p4, "Summary");
        t1.add(p3, "Action Listeners");
        t1.add(p, "mouse Listeners");
        t1.add(p1, "Window Listeners");
        t1.add(p2, "Item Listeners");

        p.setLayout(new FlowLayout());
        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        // p4.setLayout(null);
        DefaultMutableTreeNode A= new DefaultMutableTreeNode("Listeners :");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Action Listener :");
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("actionPerformed()");

        DefaultMutableTreeNode b = new DefaultMutableTreeNode("Mouse Listener :");
        DefaultMutableTreeNode b12 = new DefaultMutableTreeNode("MousePressed()");
        DefaultMutableTreeNode b22 = new DefaultMutableTreeNode("MouseReleased()");
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("MouseEntered()");
        DefaultMutableTreeNode b4 = new DefaultMutableTreeNode("MouseExit()");
        DefaultMutableTreeNode b5 = new DefaultMutableTreeNode("MouseClicked()");

        DefaultMutableTreeNode c = new DefaultMutableTreeNode("Window Listener :");
        DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("windowClosing()");
        DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("windowClosed()");
        DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("WindowActivated()");
        DefaultMutableTreeNode c4 = new DefaultMutableTreeNode("windowDeactivated()");
        DefaultMutableTreeNode c5 = new DefaultMutableTreeNode("WindowIconified()");
        DefaultMutableTreeNode c6 = new DefaultMutableTreeNode("WindowDeiconified()");
        DefaultMutableTreeNode c7 = new DefaultMutableTreeNode("WindowOpen()");
     

        DefaultMutableTreeNode d = new DefaultMutableTreeNode("Item Listener :");
        DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("itemStateChanged()");

        A.add(a);
        A.add(b);
        A.add(c);
        A.add(d);

        a.add(a1);

        b.add(b12);
        b.add(b22);
        b.add(b3);
        b.add(b4);
        b.add(b5);   

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        c.add(c6);
        c.add(c7);

        d.add(d1);

      

        int v1 = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h1= ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

        JScrollPane jp11= new JScrollPane(v1, h1);
       
        f.getContentPane().add(jp11);



        // Create the JTree with the root node
        JTree tree = new JTree(A);
        // f.add(p4);
        p4.add(tree);

        label1 = new JLabel("no event ");

        label2 = new JLabel("no event ");

        label3 = new JLabel("no event ");

        All_Events m = new All_Events();

        p.addMouseListener(m);
        List itemList = new List();

        JScrollPane scrollPane = new JScrollPane(itemList);
        scrollPane.setPreferredSize(new Dimension(250, 150));
        f.getContentPane().add(scrollPane);

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

        JScrollPane jp1 = new JScrollPane(v, h);
        p3.add(jp1);

        f.add(t1);

        label4 = new JLabel("Implementation of mouse listeners");
        label4.setBounds(100, 100, 500, 30);
        label4.setFont(new Font("Arial", Font.ITALIC, 20));
        p.add(label1);
        p.add(label2);
        p.add(label3);
        p.add(label4);

        JLabel l6 = new JLabel("###You can now perform window operations!!!!");
        l6.setToolTipText("By minimizing,maximaxing,or closing the window you can get effect of window listeners");
        l6.setBounds(700, 30, 520, 20);
        l6.setFont(new Font("Times New Roman", Font.BOLD, 25));
        p1.add(l6);

        f.addWindowListener(new WindowListener() {

            public void windowOpened(WindowEvent e) {

                System.out.println("Window opened!");
            }

            @Override
            public void windowClosing(WindowEvent e) {

                System.out.println("Window closing...");
                // dispose(); // Close the frame
            }

            @Override
            public void windowClosed(WindowEvent e) {

                System.out.println("Window closed!");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified!");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window deiconified!");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated!");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated!");
            }
        });

        JLabel l1 = new JLabel("###Click on the button and see the change in text!!!!");
        p3.add(l1);
        l1.setBounds(100, 50, 500, 20);
        l1.setFont(new Font("Arial", Font.BOLD, 20));

        JButton b1 = new JButton("Button!!!!");
        b1.setBounds(100, 100, 100, 40);
        p3.add(b1);

        JLabel l2 = new JLabel("###Click on the button and see the change in text!!!!");
        p3.add(l2);
        l2.setBounds(100, 200, 600, 20);
        l2.setFont(new Font("Arial", Font.BOLD, 20));

        JButton b2 = new JButton("Button2!!!!");
        b2.setBounds(100, 250, 100, 40);
        p3.add(b2);

        Icon icon = new ImageIcon("image.jpg");
        Icon icon1 = new ImageIcon("Screenshot (108).png");

        JLabel l3 = new JLabel("###Click on the button and see the change on image!!!!1");
        p3.add(l3);
        l3.setBounds(100, 350, 500, 20);
        l3.setFont(new Font("Arial", Font.BOLD, 20));

        JButton button7 = new JButton(icon);
        button7.setBounds(100, 400, 400, 400);
        p3.add(button7);

        JLabel l4 = new JLabel("Button1 is not clicked yet!!!!");
        l4.setBounds(100, 150, 400, 30);
        l4.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel l41 = new JLabel("Button2 is not clicked yet!!!!");
        l41.setBounds(100, 300, 400, 30);
        l41.setFont(new Font("Arial", Font.PLAIN, 20));
        p3.add(l41);

        p3.add(l4);

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                button7.setIcon(icon1);
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                b1.setBackground(Color.YELLOW);
                l4.setForeground(Color.green);
                l4.setText("Button is clicked yet!!!!");
                l4.setFont(new Font("Times New Roman", Font.ITALIC, 30));

            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                b2.setBackground(Color.GREEN);
                l41.setForeground(Color.orange);
                l41.setBackground(Color.PINK);
                l41.setText("Button is clicked yet!!!!");
                l41.setFont(new Font("Times New Roman", Font.ITALIC, 30));
            }
        });

        f.show();
        JRadioButton C1, C2, C11, C22;
        JLabel l7 = new JLabel("###Chooose your most favourate language:");
        p2.add(l7);
        JLabel l8 = new JLabel("###Chooose your city:");
        p2.add(l8);
        l7.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        l7.setBounds(100, 50, 530, 30);
        l8.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        l8.setBounds(100, 400, 500, 30);

        C1 = new JRadioButton("C++");
        C1.setBounds(100, 100, 50, 50);
        C2 = new JRadioButton("Java");
        C2.setBounds(100, 150, 70, 50);
        p2.add(C1);
        p2.add(C2);

        C11 = new JRadioButton("Android");
        C11.setBounds(100, 200, 70, 50);
        C22 = new JRadioButton("React");
        C22.setBounds(100, 250, 70, 50);
        p2.add(C11);
        p2.add(C22);

        ButtonGroup gengp = new ButtonGroup();
        gengp.add(C1);
        gengp.add(C2);
        gengp.add(C11);
        gengp.add(C22);

        JLabel label = new JLabel();
        label.setBounds(100, 300, 380, 30);
        p2.add(label);

        JLabel labell = new JLabel();
        labell.setBounds(100, 650, 380, 30);
        p2.add(labell);
        labell.setFont(new Font("Times New Roman", Font.ITALIC, 30));

        itemList.add("Pune");
        itemList.add("Mumbai");
        itemList.add("Bandra");
        itemList.add("Pimpari Chinchwad");
        itemList.add("pimpri");
        itemList.add("Thane");
        itemList.add("Nagpur");
        itemList.add("Kolhapur");
        itemList.add("Satara");
        itemList.add("Solapur");
        itemList.add("Amaravati");
        itemList.add("Sangali");
        itemList.setBounds(100, 450, 200, 150);
        p2.add(itemList);

        itemList.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                String selectedItem = itemList.getSelectedItem();

                labell.setText("Selected Item: " + selectedItem);

            }
        });

        C1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {

                if (ie.getSource() == C1)
                    label.setFont(new Font("Times New Roman", Font.ITALIC, 30));
                label.setText("C++ Checkbox: "
                        + (ie.getStateChange() == 1 ? "checked" : "unchecked"));

            }

        });
        C2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {

                if (ie.getSource() == C2)
                    label.setFont(new Font("Times New Roman", Font.ITALIC, 30));
                label.setText("Java Checkbox: "
                        + (ie.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });

        C11.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {

                if (ie.getSource() == C11)
                    label.setFont(new Font("Times New Roman", Font.ITALIC, 30));
                label.setText("Android Checkbox: "
                        + (ie.getStateChange() == 1 ? "checked" : "unchecked"));
            }

        });

        C22.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {

                if (ie.getSource() == C22)
                    label.setFont(new Font("Times New Roman", Font.ITALIC, 30));
                label.setText("React Checkbox: "
                        + (ie.getStateChange() == 1 ? "checked" : "unchecked"));
            }

        });

    }

    public void mousePressed(MouseEvent e) {

        label1.setText("mouse pressed at point:"
                + e.getX() + " " + e.getY());
        label1.setFont(new Font("Arial", Font.BOLD, 15));
    }

    public void mouseReleased(MouseEvent e) {

        label1.setText("mouse released at point:"
                + e.getX() + " " + e.getY());
        label1.setFont(new Font("Arial", Font.BOLD, 15));
    }

    public void mouseExited(MouseEvent e) {

        label2.setText("mouse exited through point:"
                + e.getX() + " " + e.getY());
        label2.setFont(new Font("Arial", Font.BOLD, 15));
    }

    public void mouseEntered(MouseEvent e) {

        label2.setText("mouse entered at point:"
                + e.getX() + " " + e.getY());
        label2.setFont(new Font("Arial", Font.BOLD, 15));
    }

    public void mouseClicked(MouseEvent e) {

        label3.setText("mouse clicked at point:"
                + e.getX() + " "
                + e.getY() + "mouse clicked :" + e.getClickCount());
        label3.setFont(new Font("Arial", Font.BOLD, 15));
    }
}
