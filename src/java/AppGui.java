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

    private JTextField textFieldNameOfPhotographer       = new JTextField(null);
    private JTextField textFieldFixedPhoneOfPhotographer = new JTextField(null);
    private JTextField textFieldEmailOfPhotographer      = new JTextField(null);
    private JTextField textFieldCountryOfPhotographer    = new JTextField(null);
    private JTextField textFieldCityOfPhotographer       = new JTextField(null);
    private JTextField textFieldAddressOfPhotographer    = new JTextField(null);
    private JTextField textFieldZipOfPhotographer        = new JTextField(null);

    private JTextField textFieldShootDate                = new JTextField(null);
    private JTextField textFieldDateSignedOfPhotographer = new JTextField(null);

    private JTextField textFieldNameOfModel              = new JTextField(null);
    private JTextField textFieldFixedPhoneOfModel        = new JTextField(null);
    private JTextField textFieldEmailOfModel             = new JTextField(null);
    private JTextField textFieldCountryOfModel           = new JTextField(null);
    private JTextField textFieldCityOfModel              = new JTextField(null);
    private JTextField textFieldAddressOfModel           = new JTextField(null);
    private JTextField textFieldZipOfModel               = new JTextField(null);

    private JTextField textFieldDateSignedOfModel        = new JTextField(null);

    private JTextField textFieldNameOfWitness            = new JTextField(null);
    private JTextField textFieldDateSignedOfWitness      = new JTextField(null);

    private JTextField textFieldFixedPathSignatureImageOfPhotographer = new JTextField(null);
    private JTextField textFieldFixedPathSignatureImageOfModel        = new JTextField(null);
    private JTextField textFieldFixedPathSignatureImageOfWitness      = new JTextField(null);
    
    private JLabel textFieldNameOfPhotographerLabel;
    private JLabel textFieldFixedPhoneOfPhotographerLabel;
    private JLabel textFieldEmailOfPhotographerLabel;
    private JLabel textFieldCountryOfPhotographerLabel;
    private JLabel textFieldCityOfPhotographerLabel;
    private JLabel textFieldAddressOfPhotographerLabel;
    private JLabel textFieldZipOfPhotographerLabel;

    private JLabel textFieldShootDateLabel;

    private JLabel textFieldNameOfModelLabel;
    private JLabel textFieldFixedPhoneOfModelLabel;
    private JLabel textFieldEmailOfModelLabel;
    private JLabel textFieldCountryOfModelLabel;
    private JLabel textFieldCityOfModelLabel;  
    private JLabel textFieldAddressOfModelLabel;
    private JLabel textFieldZipOfModelLabel;

    private JLabel textFieldNameOfWitnessLabel;

    private JLabel textFieldDateSignedOfPhotographerLabel;
    private JLabel textFieldDateSignedOfModelLabel;
    private JLabel textFieldDateSignedOfWitnessLabel;

    private JButton buttonGenFiles;

    private JCheckBox yearsTrigger;

    public AppGui() {

        super("DocWork");

        System.setProperty("awt.useSystemAAFontSettings","on");
        System.setProperty("swing.aatext", "true");

        GridBagConstraints constraints = new GridBagConstraints();

        // setLayout(new GridBagLayout());

        // textFieldNameLabel.setSize(450,20);
        // textFieldName.setPreferredSize(new Dimension(10,20));
        // textFieldName.setBorder(new RoundedCornerBorder());

        textFieldNameOfPhotographerLabel        = new JLabel("Name of Photographer: ");
        textFieldFixedPhoneOfPhotographerLabel  = new JLabel("Phone of Photographer: ");
        textFieldEmailOfPhotographerLabel       = new JLabel("Email of Photographer: ");
        textFieldCountryOfPhotographerLabel     = new JLabel("Country of Photographer: ");
        textFieldCityOfPhotographerLabel        = new JLabel("City of Photographer: ");
        textFieldAddressOfPhotographerLabel     = new JLabel("Address of Photographer: ");
        textFieldZipOfPhotographerLabel         = new JLabel("Zip of Photographer: ");
        textFieldShootDateLabel                 = new JLabel("Shoot Date: ");
        textFieldNameOfModelLabel               = new JLabel("Name of Model: ");
        textFieldFixedPhoneOfModelLabel         = new JLabel("Phone of Model: ");
        textFieldEmailOfModelLabel              = new JLabel("Email of Model: ");
        textFieldCountryOfModelLabel            = new JLabel("Country of Model: ");
        textFieldCityOfModelLabel               = new JLabel("City of Model: ");
        textFieldAddressOfModelLabel            = new JLabel("Address of Model: ");
        textFieldZipOfModelLabel                = new JLabel("Zip of Model: ");
        textFieldDateSignedOfPhotographerLabel  = new JLabel("Date Signed of Photographer: ");
        textFieldDateSignedOfModelLabel         = new JLabel("Date Signed of Model: ");
        textFieldDateSignedOfWitnessLabel       = new JLabel("Date Signed of Witness: ");
        textFieldNameOfWitnessLabel             = new JLabel("Name of Witness: ");

        buttonGenFiles = new JButton("GenFiles");

        constraints.fill = GridBagConstraints.WEST;

        constraints.gridx = 0;
        constraints.gridy = 0;

        constraints.weightx = 1.0;
        constraints.weighty = 0.1;

        // JPanel fieldsPanel = new JPanel();

        // fieldsPanel.setLayout(new FlowLayout());
        // fieldsPanel.setVisible(true);

        // fieldsPanel.add(buttonGenFiles);

        Box buttonsBox = Box.createHorizontalBox();

        buttonsBox.add(buttonGenFiles, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.gridx = 0;
        constraints.gridy = 0;

        constraints.weightx = 1.0;
        constraints.weighty = 0.1;

        Box nameOfPhotographerBox = Box.createHorizontalBox();

        nameOfPhotographerBox.add(textFieldNameOfPhotographerLabel,constraints);
        nameOfPhotographerBox.add(textFieldNameOfPhotographer,constraints);
        nameOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box fixedPhoneOfPhotographerBox = Box.createHorizontalBox();

        fixedPhoneOfPhotographerBox.add(textFieldFixedPhoneOfPhotographerLabel,constraints);
        fixedPhoneOfPhotographerBox.add(textFieldFixedPhoneOfPhotographer,constraints);
        fixedPhoneOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box emailOfPhotographerBox = Box.createHorizontalBox();
        
        emailOfPhotographerBox.add(textFieldEmailOfPhotographerLabel,constraints);
        emailOfPhotographerBox.add(textFieldEmailOfPhotographer,constraints);
        emailOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box countryOfPhotographerBox = Box.createHorizontalBox();

        countryOfPhotographerBox.add(textFieldCountryOfPhotographerLabel,constraints);
        countryOfPhotographerBox.add(textFieldCountryOfPhotographer,constraints);
        countryOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box cityOfPhotographerBox = Box.createHorizontalBox();

        cityOfPhotographerBox.add(textFieldCityOfPhotographerLabel,constraints);
        cityOfPhotographerBox.add(textFieldCityOfPhotographer,constraints);
        cityOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box addressOfPhotographerBox = Box.createHorizontalBox();

        addressOfPhotographerBox.add(textFieldAddressOfPhotographerLabel,constraints);
        addressOfPhotographerBox.add(textFieldAddressOfPhotographer,constraints);
        addressOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box zipOfPhotographerBox = Box.createHorizontalBox();

        zipOfPhotographerBox.add(textFieldZipOfPhotographerLabel,constraints);
        zipOfPhotographerBox.add(textFieldZipOfPhotographer,constraints);
        zipOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box shootDateBox = Box.createHorizontalBox();

        shootDateBox.add(textFieldShootDateLabel,constraints);
        shootDateBox.add(textFieldShootDate,constraints);
        shootDateBox.add(Box.createVerticalStrut(10));

        Box nameOfModelBox = Box.createHorizontalBox();

        nameOfModelBox.add(textFieldNameOfModelLabel,constraints);
        nameOfModelBox.add(textFieldNameOfModel,constraints);
        nameOfModelBox.add(Box.createVerticalStrut(10));

        Box fixedPhoneOfModelBox = Box.createHorizontalBox();

        fixedPhoneOfModelBox.add(textFieldFixedPhoneOfModelLabel,constraints);
        fixedPhoneOfModelBox.add(textFieldFixedPhoneOfModel,constraints);
        fixedPhoneOfModelBox.add(Box.createVerticalStrut(10));

        Box emailOfModelBox = Box.createHorizontalBox();
        
        emailOfModelBox.add(textFieldEmailOfModelLabel,constraints);
        emailOfModelBox.add(textFieldEmailOfModel,constraints);
        emailOfModelBox.add(Box.createVerticalStrut(10));

        Box countryOfModelBox = Box.createHorizontalBox();

        countryOfModelBox.add(textFieldCountryOfModelLabel,constraints);
        countryOfModelBox.add(textFieldCountryOfModel,constraints);
        countryOfModelBox.add(Box.createVerticalStrut(10));

        Box cityOfModelBox = Box.createHorizontalBox();

        cityOfModelBox.add(textFieldCityOfModelLabel,constraints);
        cityOfModelBox.add(textFieldCityOfModel,constraints);
        cityOfModelBox.add(Box.createVerticalStrut(10));

        Box addressOfModelBox = Box.createHorizontalBox();

        addressOfModelBox.add(textFieldAddressOfModelLabel,constraints);
        addressOfModelBox.add(textFieldAddressOfModel,constraints);
        addressOfModelBox.add(Box.createVerticalStrut(10));

        Box zipOfModelBox = Box.createHorizontalBox();

        zipOfModelBox.add(textFieldZipOfModelLabel,constraints);
        zipOfModelBox.add(textFieldZipOfModel,constraints);
        zipOfModelBox.add(Box.createVerticalStrut(10));

        Box nameOfWitnessBox = Box.createHorizontalBox();

        nameOfWitnessBox.add(textFieldNameOfWitnessLabel,constraints);
        nameOfWitnessBox.add(textFieldNameOfWitness,constraints);
        nameOfWitnessBox.add(Box.createVerticalStrut(10));

        Box dateSignedOfPhotographerBox = Box.createHorizontalBox();

        dateSignedOfPhotographerBox.add(textFieldDateSignedOfPhotographerLabel,constraints);
        dateSignedOfPhotographerBox.add(textFieldDateSignedOfPhotographer,constraints);
        dateSignedOfPhotographerBox.add(Box.createVerticalStrut(10));

        Box dateSignedOfModelBox = Box.createHorizontalBox();

        dateSignedOfModelBox.add(textFieldDateSignedOfModelLabel,constraints);
        dateSignedOfModelBox.add(textFieldDateSignedOfModel,constraints);
        dateSignedOfModelBox.add(Box.createVerticalStrut(10));

        Box dateSignedOfWitnessBox = Box.createHorizontalBox();

        dateSignedOfWitnessBox.add(textFieldDateSignedOfWitnessLabel,constraints);
        dateSignedOfWitnessBox.add(textFieldDateSignedOfWitness,constraints);
        dateSignedOfWitnessBox.add(Box.createVerticalStrut(10));


        // textFieldNameOfPhotographerLabel       
        // textFieldFixedPhoneOfPhotographerLabel 
        // textFieldEmailOfPhotographerLabel      
        // textFieldCountryOfPhotographerLabel    
        // textFieldCityOfPhotographerLabel       
        // textFieldAddressOfPhotographerLabel    
        // textFieldZipOfPhotographerLabel        
        // textFieldShootDateLabel                
        // textFieldNameOfModelLabel              
        // textFieldFixedPhoneOfModelLabel        
        // textFieldEmailOfModelLabel             
        // textFieldCountryOfModelLabel           
        // textFieldCityOfModelLabel              
        // textFieldAddressOfModelLabel           
        // textFieldZipOfModelLabel               
        // textFieldDateSignedOfPhotographerLabel 
        // textFieldDateSignedOfModelLabel        
        // textFieldDateSignedOfWitnessLabel      

        // Box shareLabelAndFieldsBox = Box.createHorizontalBox();

        Box mainBox = Box.createVerticalBox();

        mainBox.add(buttonsBox,constraints);
        mainBox.add(Box.createHorizontalStrut(15));
        mainBox.add(Box.createVerticalStrut(10));
        // mainBox.add(Box.createHorizontalGlue());

        mainBox.add(nameOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(fixedPhoneOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(emailOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(countryOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(cityOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(addressOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(zipOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(shootDateBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(nameOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(fixedPhoneOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(emailOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(countryOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(cityOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(addressOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(zipOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(nameOfWitnessBox,constraints);
        mainBox.add(Box.createVerticalStrut(40));
        mainBox.add(dateSignedOfPhotographerBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(dateSignedOfModelBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));
        mainBox.add(dateSignedOfWitnessBox,constraints);
        mainBox.add(Box.createVerticalStrut(10));

        // mainBox.add(fieldsPanel,constraints);
        mainBox.add(Box.createHorizontalStrut(15));
        mainBox.add(Box.createVerticalStrut(10));

        setContentPane(mainBox);

        mainBox.setBorder(new EmptyBorder(10, 10, 10, 10));

        pack();

        // setResizable(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args)  {

        System.out.println("App compile ans works!");

        SwingUtilities.invokeLater(new Runnable()   {

            public void run()   {

                try {

                    JFrame jfrm = new AppGui();

                    jfrm.setSize(800,650);
                    jfrm.setVisible(true);

                }   catch(Exception e) {

                    e.printStackTrace();

                }

            }


        });

    };

}
