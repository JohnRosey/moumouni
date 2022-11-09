import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Nov 09 00:53:45 EST 2022
 */



/**
 * @author Ismael GANSONRE
 */
public class liste_de_contact extends JFrame {
    public liste_de_contact() {
        initComponents();
    }

    private void button5MouseClicked(MouseEvent e) {
liste_noire_archivee liste_noire_archivee = new liste_noire_archivee();
liste_noire_archivee.pack();
liste_noire_archivee.setVisible(true);

    }

    private void button5(ActionEvent e) {

    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ismael GANSONRE
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        setTitle("Liste de Contact");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
            swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e",javax.swing.border
            .TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dialo\u0067"
            ,java.awt.Font.BOLD,12),java.awt.Color.red),dialogPane. getBorder
            ()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
            .beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName()))throw new RuntimeException
            ();}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "insets dialog,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("Prenom:");
                contentPanel.add(label1, "cell 0 0");
                contentPanel.add(textField1, "cell 1 0");

                //---- label2 ----
                label2.setText("nom:");
                contentPanel.add(label2, "cell 2 0");
                contentPanel.add(textField2, "cell 3 0");

                //---- label3 ----
                label3.setText("tel:");
                contentPanel.add(label3, "cell 4 0");
                contentPanel.add(textField3, "cell 5 0 2 1");

                //---- button1 ----
                button1.setText("Ajouter");
                contentPanel.add(button1, "cell 0 2");

                //---- button2 ----
                button2.setText("Supprimer");
                contentPanel.add(button2, "cell 1 2");

                //---- button3 ----
                button3.setText("Bloquer");
                contentPanel.add(button3, "cell 2 2");

                //---- button4 ----
                button4.setText("Debloquer");
                contentPanel.add(button4, "cell 3 2");

                //---- button5 ----
                button5.setText("Archiver");
                button5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button5MouseClicked(e);
                    }
                });
                button5.addActionListener(this::button5);
                contentPanel.add(button5, "cell 5 2");

                //---- label4 ----
                label4.setText("Liste d'amis");
                contentPanel.add(label4, "cell 0 4");

                //---- label5 ----
                label5.setText("Liste noire");
                contentPanel.add(label5, "cell 3 4");

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(list1);
                }
                contentPanel.add(scrollPane1, "cell 0 6 2 1");

                //======== scrollPane2 ========
                {
                    scrollPane2.setViewportView(list2);
                }
                contentPanel.add(scrollPane2, "cell 3 6 3 1");
            }
            dialogPane.add(contentPanel, BorderLayout.WEST);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, "cell 0 0");
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Ismael GANSONRE
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label4;
    private JLabel label5;
    private JScrollPane scrollPane1;
    private JList list1;
    private JScrollPane scrollPane2;
    private JList list2;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
