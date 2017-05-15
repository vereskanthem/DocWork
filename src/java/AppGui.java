import java.util.*;
import java.lang.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AppGui extends JFrame  {

    JLabel textFieldNameLabel;

    JTextField textFieldName = new JTextField(null);

    public AppGui() {

        super("DocWork");

        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        textFieldName.setPreferredSize(new Dimension(450,20));
        // textFieldName.setBorder(new RoundedCornerBorder());

        textFieldNameLabel = new JLabel("Name", JLabel.CENTER);

        Box nameBox = Box.createHorizontalBox();

        nameBox.add(textFieldNameLabel);
        nameBox.add(textFieldName);

        // constraints.fill = GridBagConstraints.BOTH;

        constraints.weightx = 1.0;
        constraints.weighty = 1.0;

        Box mainBox = Box.createVerticalBox();

        mainBox.add(Box.createHorizontalStrut(15));
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(Box.createVerticalGlue());

        mainBox.add(nameBox,constraints);

        setContentPane(mainBox);

        mainBox.setBorder(new EmptyBorder(10, 10, 10, 10));

        pack();

        setResizable(true);

    }

    public static void main(String[] args)  {

        System.out.println("App compile ans works!");

        SwingUtilities.invokeLater(new Runnable()   {

            public void run()   {

                try {

                    JFrame jfrm = new AppGui();

                    jfrm.setSize(760,550);
                    jfrm.setVisible(true);

                }   catch(Exception e) {

                    e.printStackTrace();

                }

            }


        });

    };

}
