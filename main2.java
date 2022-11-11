
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class main2{
    public static void main(String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(900, 850);
        
        
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        

        JLabel Prenom = new JLabel("Prenom");
        JTextField PrenomText = new JTextField(20);
        PrenomText.setBounds(10, 20, 165, 25);
        Prenom.setBounds(10, 20, 80, 25);
        panel.add(Prenom);
        panel.add(PrenomText);
        
        JLabel Nom = new JLabel("Nom");
        JTextField NomText = new JTextField(20);
        NomText.setBounds(10, 20, 165, 25);
        Nom.setBounds(10, 50, 80, 25);
        panel.add(Nom);
        panel.add(NomText);
        
        JLabel Tel = new JLabel("Tel");
        JTextField TelText = new JTextField(20);
        TelText.setBounds(10, 20, 165, 25);
        Tel.setBounds(10, 80, 80, 25);
        panel.add(Tel);
        panel.add(TelText);

       
        JButton Ajouter = new JButton("Ajouter");
        Ajouter.setBounds(20, 20, 80, 25);
        panel.add(Ajouter);

       

        JButton Supprimer = new JButton("Supprimer");
        Supprimer.setBounds(10, 80, 80, 25);
        panel.add(Supprimer);

        JButton Bloquer = new JButton("Bloquer");
        Bloquer.setBounds(10, 80, 80, 25);
        panel.add(Bloquer);

        JButton Debloquer = new JButton("Debloquer");
        Debloquer.setBounds(10, 80, 80, 25);
        panel.add(Debloquer);

        JButton Archiver = new JButton("Archiver");
        Archiver.setBounds(10, 80, 80, 25);
        panel.add(Archiver);

      
         //ActionListener on Archive button to open new window with list of archived contacts
         Archiver.addActionListener((ActionListener) new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  JFrame frame = new JFrame("Archived Contacts");
                  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frame.setSize(400, 400);
                  frame.setVisible(true);
                  frame.setLocationRelativeTo(null);
                  frame.setResizable(false);
                  frame.setLayout(null);

                  }

               
            });
            

        
        
        
        
        frame.setVisible(true);
      //Les elements ne vont pas bouger si on redimensionne la fenetre
        


    }
}
