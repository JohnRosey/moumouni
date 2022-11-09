import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Nov 09 01:34:02 EST 2022
 */



/**
 * @author Ismael GANSONRE
 */
public class Main_Menu extends JFrame {
    public Main_Menu() {
        initComponents();
    }

    private void Exercice1(MouseEvent e) {
        liste_de_contact dialog = new liste_de_contact();
        dialog.pack();
        dialog.setVisible(true);
    }

    /**
     * @param e
     */
    private void exercice2(MouseEvent e) {
        // TODO add your code here
        //titac dialog = new titac();
       new titac().setVisible(true);


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ismael GANSONRE
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        button1 = new JButton();
        label2 = new JLabel();
        button2 = new JButton();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
            javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax
            . swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
            . awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
            . Color .red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .
            PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .
            equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new MigLayout(
                    "insets dialog,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("EXERCICE1 :");
                contentPanel.add(label1, "cell 0 1");

                //---- button1 ----
                button1.setText("ACCES 1");
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        Exercice1(e);
                    }
                });
                contentPanel.add(button1, "cell 1 1");

                //---- label2 ----
                label2.setText("EXERCICE2:");
                contentPanel.add(label2, "cell 0 2");

                //---- button2 ----
                button2.setText("ACCES 2");
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        exercice2(e);
                    }
                });
                contentPanel.add(button2, "cell 1 2");
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setLayout(new MigLayout(
                    "insets dialog,alignx right",
                    // columns
                    "[button,fill]" +
                    "[button,fill]",
                    // rows
                    null));

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, "cell 0 0");

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, "cell 1 0");
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
    private JButton button1;
    private JLabel label2;
    private JButton button2;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
