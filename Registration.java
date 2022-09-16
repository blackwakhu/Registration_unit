import javax.swing.*;
import java.awt.*;

public class Registration1 {

    private static final JFrame frame = new JFrame("student registration");
    private static final JPanel mainPanel = new JPanel();
    private static final GridBagConstraints gridbag = new GridBagConstraints();

    private static final JLabel label1 = new JLabel("student registration form");// first label for the form
    private static final JLabel label2 = new JLabel("enter the student details");// form label for the displaying the heading for the entry part of the form
    private static final JLabel nameilabel = new JLabel("enter name");//label for name input
    private static final JLabel yearilabel = new JLabel("enter the year");//label for year input
    private static final JLabel genderilabel = new JLabel("enter the gender");//label for gender input
    private static final JLabel unitilabel = new JLabel("enter two units");//label for unit input
    private static final JLabel label3 = new JLabel("Student details entered");//label to show that the next section is for displaying the information above
    private static final JLabel nameolabel = new JLabel("name:");
    private static final JLabel namedisplay = new JLabel();
    private static final JLabel yearolabel = new JLabel("year:");
    private static final JLabel yeardisplay = new JLabel();
    private static final JLabel genderolabel = new JLabel("gender:");
    private static final JLabel genderdisplay = new JLabel();
    private static final JLabel unitolabel = new JLabel("units:");
    private static final JLabel unitdisplay = new JLabel();

    private static final JTextField nametextfield = new JTextField(10);

    private static final String[] year = {"year 1", "year 2", "year 3", "year 4", "year 5", "year 6"};

    private static final JComboBox yearcombobox = new JComboBox(year);

    private static final JRadioButton male = new JRadioButton("male");
    private static final JRadioButton female = new JRadioButton("female");

    private static final ButtonGroup buttonGroup = new ButtonGroup();

    private static final JCheckBox sco200 = new JCheckBox("SCO200");
    private static final JCheckBox sco201 = new JCheckBox("SCO201");
    private static final JCheckBox sco202 = new JCheckBox("SCO202");

    private static final JButton submit = new JButton("submit");

    private static String namevar;
    private static String yearvar;
    private static String gendervar;
    private static String unitvar;

    public static void main(String[] args){

            mainPanel.setLayout(new GridBagLayout());

            gridbag.gridx = 1;
            gridbag.gridy = 0;
            mainPanel.add(label1, gridbag);

            gridbag.gridy = 1;
            gridbag.gridx = 0;
            mainPanel.add(label2, gridbag);

            gridbag.gridx = 0;
            gridbag.gridy = 2;
            mainPanel.add(nameilabel, gridbag);

            gridbag.gridy = 2;
            gridbag.gridx = 1;
            mainPanel.add(nametextfield, gridbag);

            gridbag.gridy = 3;
            gridbag.gridx = 0;
            mainPanel.add(yearilabel, gridbag);

            gridbag.gridx = 1;
            gridbag.gridy = 3;
            mainPanel.add(yearcombobox, gridbag);

            gridbag.gridx = 0;
            gridbag.gridy = 4;
            mainPanel.add(genderilabel, gridbag);

            buttonGroup.add(male);
            buttonGroup.add(female);

            gridbag.gridy = 4;
            gridbag.gridx = 1;
            mainPanel.add(male, gridbag);

            gridbag.gridx = 2;
            gridbag.gridy = 4;
            mainPanel.add(female, gridbag);

            gridbag.gridy = 5;
            gridbag.gridx = 0;
            mainPanel.add(unitilabel, gridbag);

            gridbag.gridx = 1;
            gridbag.gridy = 5;
            mainPanel.add(sco200, gridbag);

            gridbag.gridy = 6;
            gridbag.gridx = 1;
            mainPanel.add(sco201, gridbag);

            gridbag.gridx = 1;
            gridbag.gridy = 7;
            mainPanel.add(sco202, gridbag);

            gridbag.gridx = 2;
            gridbag.gridy = 8;
            mainPanel.add(submit, gridbag);

            gridbag.gridy = 9;
            gridbag.gridx = 0;
            mainPanel.add(label3, gridbag);

            gridbag.gridy = 10;
            gridbag.gridx = 0;
            mainPanel.add(nameolabel, gridbag);

            gridbag.gridy = 10;
            gridbag.gridx = 1;
            mainPanel.add(namedisplay, gridbag);

            gridbag.gridy = 11;
            gridbag.gridx = 0;
            mainPanel.add(yearolabel, gridbag);

            gridbag.gridy = 11;
            gridbag.gridx = 1;
            mainPanel.add(yeardisplay, gridbag);

            gridbag.gridy = 12;
            gridbag.gridx = 0;
            mainPanel.add(genderolabel, gridbag);

            gridbag.gridy = 12;
            gridbag.gridx = 1;
            mainPanel.add(genderdisplay, gridbag);

            gridbag.gridy = 13;
            gridbag.gridx = 0;
            mainPanel.add(unitolabel, gridbag);

            gridbag.gridy = 13;
            gridbag.gridx = 1;
            mainPanel.add(unitdisplay, gridbag);

            //when the male combobox is selected it must display male
            male.addItemListener(e -> gendervar = "male");

            //when the female combobox is selected it must display female
            female.addItemListener(e -> gendervar = "female");

            //adding functionality to the button
            submit.addActionListener(e -> {
                //displays the name in the namedisplay field with the namevar
                namevar = nametextfield.getText();
                namedisplay.setText(namevar);

                //displays the yeardisplay with the yearvar
                yearvar = ""+yearcombobox.getItemAt(yearcombobox.getSelectedIndex());
                yeardisplay.setText(yearvar);

                //displays the genderdisplay field with the gendervar
                genderdisplay.setText(gendervar);

                //displays the unitdisplay field with the unitvar
                if(sco200.isSelected() && sco201.isSelected()){
                    unitvar = "sco200 and sco201";
                } else if (sco200.isSelected() && sco202.isSelected()) {
                    unitvar = "sco200 and sco202";
                } else if (sco201.isSelected() && sco202.isSelected()) {
                    unitvar = "sco201 and sco202";
                } else if (sco200.isSelected() && sco201.isSelected() && sco202.isSelected()) {
                    JOptionPane.showMessageDialog(frame,"you did not enter the correct amount of units","error",JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(frame,"you did not enter the correct number of units", "error",JOptionPane.ERROR_MESSAGE);
                }
                unitdisplay.setText(unitvar);
            });

            frame.add(mainPanel);

            frame.setSize(500, 400);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
