/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theluxuryrestaurantsystem;

//import TicTacToe.TicTacToe_s;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author msi
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */static String num, pass;
     BufferedReader br;
    public Profile(String num,String pass) {
        initComponents();
        jTextArea1.setEditable(false);
        this.num = num;
        this.pass =pass;
         try {
             br = new BufferedReader(new FileReader("login.txt"));
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        String rd;
        try {
            rd = br.readLine();
        while(rd!=null)
        {
            String nrd [] = rd.split(" ");
            if(nrd[2].equals(num)&& nrd[4].equals(pass))
            {
                for(int i =0 ;i<nrd.length;i++)
                {
                    if(nrd[i].equals(pass))
                    {
                       
                    }
                    else{
                        
                         jTextArea1.setText(jTextArea1.getText()+"\n"+nrd[i]);
                    }
                    
                }
            }
            rd= br.readLine();
            
        }
        } catch (IOException ex) {
            Logger.getLogger(SignUp_LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton_Surprice = new javax.swing.JButton();
        jButton_exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        menu_button.setBackground(new java.awt.Color(153, 0, 51));
        menu_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menu_button.setForeground(new java.awt.Color(255, 255, 255));
        menu_button.setText("FOOD MENU");
        menu_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(menu_button);
        menu_button.setBounds(811, 132, 153, 51);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 396, 678);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("If you are boring then click SURPRISE Button");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(555, 201, 435, 37);

        jButton_Surprice.setBackground(new java.awt.Color(153, 0, 51));
        jButton_Surprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Surprice.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Surprice.setText("Surprice");
        jButton_Surprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SurpriceActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Surprice);
        jButton_Surprice.setBounds(806, 256, 156, 47);

        jButton_exit.setBackground(new java.awt.Color(153, 0, 51));
        jButton_exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_exit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_exit.setText("EXIT");
        jButton_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_exitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_exit);
        jButton_exit.setBounds(855, 650, 100, 36);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\msi\\Desktop\\TheLuxuryRestaurantSystem\\src\\large-wood-wallpaper-3840x2160-f-WTG200621260.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 700);

        jButton_back.setBackground(new java.awt.Color(153, 0, 51));
        jButton_back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_back.setText("BACK");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_back);
        jButton_back.setBounds(883, 11, 81, 36);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_buttonActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(num,pass);
        menu.setVisible(true);
    }//GEN-LAST:event_menu_buttonActionPerformed

    private void jButton_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_exitActionPerformed
        // TODO add your handling code here:
                
        int c_exit_button = JOptionPane.showConfirmDialog(null,"Do you reallay want to EXIT ?","EXIT",JOptionPane.YES_NO_OPTION);
        if(c_exit_button==0){
        System.exit(0);
        }
    }//GEN-LAST:event_jButton_exitActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
                
       new SignUp_LogIn().setVisible(true);
       this.setVisible(false);
       this.dispose();
        
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_SurpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SurpriceActionPerformed
        // TODO add your handling code here:
        new TicTacToe_s().setVisible(true);
        
        
    }//GEN-LAST:event_jButton_SurpriceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile(num, pass).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Surprice;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton menu_button;
    // End of variables declaration//GEN-END:variables
}