import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Nov 09 01:06:38 EST 2022
 */



/**
 * @author Ismael GANSONRE
 */
public class liste_noire_archivee extends JDialog {
    public liste_noire_archivee() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Ismael GANSONRE
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        buttonBar = new JPanel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(
            new javax.swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
            ,javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM
            ,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12)
            ,java.awt.Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(
            new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
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
                    "[]"));

                //---- label1 ----
                label1.setText("Liste noire archivee");
                contentPanel.add(label1, "cell 0 0");

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(list1);
                }
                contentPanel.add(scrollPane1, "cell 0 2 12 1");
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
    private JScrollPane scrollPane1;
    private JList list1;
    private JPanel buttonBar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
