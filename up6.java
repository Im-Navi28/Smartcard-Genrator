/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcard;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author V Hariharan
 */
public class up6 extends javax.swing.JFrame {

    /**
     * Creates new form up6
     */
    public up6() {
        initComponents();
                try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
            PreparedStatement ps = con.prepareStatement("select username from alld;");
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            if(rs.next())
            {
            jLabel3.setText(rs.getString(1)); 
            jLabel4.setText("");
            }
         }
        catch(ClassNotFoundException | SQLException ex)
           {
               JOptionPane optionPane = new JOptionPane("Insufficient Data",JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
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

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("VIEW UPLOADS");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel11.setText("Aadhaar Card");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel13.setText("PAN Card");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel15.setText("Voter ID");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel17.setText("License ");

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel19.setText("Ration Card");

        jButton2.setBackground(new java.awt.Color(102, 204, 0));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Approve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 51));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Reject");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 255));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Go Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 148, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))
                        .addGap(158, 158, 158)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addGap(157, 157, 157)
                        .addComponent(jButton7)))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(668, 668, 668)
                        .addComponent(jLabel22))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jButton3))
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jButton4))
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jButton5))
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jButton6))
                .addGap(75, 75, 75)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(9, 9, 9))
        );

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(569, 569, 569))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(684, 684, 684))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            String xz;
            byte[] imageBytes;
            Image image;
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
            PreparedStatement ps = con.prepareStatement("select mail,image from registration where username = ?;");
            ps.setString(1, jLabel3.getText());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                xz = rs.getString(1);
                imageBytes = rs.getBytes(2);
                image=getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                new ap1(jLabel3.getText(),xz,icon).setVisible(true);
            }
        }
        catch (Exception ex)

        {
            JOptionPane optionPane = new JOptionPane("Sorry",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
            dialog.setLocation(550, 275);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            byte[] imageBytes;
            Image image;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
            PreparedStatement ps = con.prepareStatement("select Aimg from alld;");
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            while(rs.next())
            {
                imageBytes = rs.getBytes(6);
                image=getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                jLabel4.setIcon(icon);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane optionPane = new JOptionPane("Cannot find Data",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
            dialog.setLocation(550, 275);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            byte[] imageBytes;
            Image image;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
            PreparedStatement ps = con.prepareStatement("select Pimg from alld;");
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            while(rs.next())
            {
                imageBytes = rs.getBytes(6);
                image=getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                jLabel4.setIcon(icon);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane optionPane = new JOptionPane("Cannot find Data",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
            dialog.setLocation(550, 275);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            byte[] imageBytes;
            Image image;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
            PreparedStatement ps = con.prepareStatement("select Vimg from alld;");
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            while(rs.next())
            {
                imageBytes = rs.getBytes(6);
                image=getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                jLabel4.setIcon(icon);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane optionPane = new JOptionPane("Cannot find Data",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
            dialog.setLocation(550, 275);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try
        {
            byte[] imageBytes;
            Image image;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
            PreparedStatement ps = con.prepareStatement("select Limg from alld;");
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            while(rs.next())
            {
                imageBytes = rs.getBytes(6);
                image=getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                jLabel4.setIcon(icon);
            }
        }
        catch(Exception ex)
        {
            JOptionPane optionPane = new JOptionPane("Cannot find Data",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
            dialog.setLocation(550, 275);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try
        {
            byte[] imageBytes;
            Image image;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
            PreparedStatement ps = con.prepareStatement("select Rimg from alld;");
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            rs.next();
            while(rs.next())
            {
                imageBytes = rs.getBytes(6);
                image=getToolkit().createImage(imageBytes);
                ImageIcon icon = new ImageIcon(image);
                jLabel4.setIcon(icon);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane optionPane = new JOptionPane("Cannot find Data",JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
            dialog.setLocation(550, 275);
            dialog.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String aq="";  
try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","");
                PreparedStatement ps = con.prepareStatement("select mail from registration where username = ?");
                ps.setString(1, jLabel3.getText());
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                aq = aq + rs.getString(1);
            }
            System.out.println(aq);
            final String username = "vitvellorebyhari@gmail.com";
        final String password = "11141127";
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(username, password);
            }
          });

        try {
            
            javax.mail.Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("vitvellorebyhari@gmail.com"));
            message.setRecipients(javax.mail.Message.RecipientType.TO,
                InternetAddress.parse(aq));
            
            message.setSubject("Regarding Your Smartcard request");
            
            
            message.setText("\nYour Smartcard request is Rejected.\nPlease Check the documents you uploaded");
            javax.mail.Transport.send(message);
            JOptionPane optionPane = new JOptionPane("Rejection Mail Sent successfully to the user",JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                PreparedStatement ps1 = con.prepareStatement("delete from alld where username = ?");
                ps1.setString(1, jLabel3.getText());
                ps1.executeUpdate();
                }
                catch(Exception e2)
                {
                    JOptionPane optionPane1 = new JOptionPane("No user found",JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog1 = optionPane1.createDialog(null, "ALERT!!");
                dialog1.setLocation(550, 275);
                dialog1.setVisible(true);
                }
        } catch (javax.mail.MessagingException e) {
            
            //throw new RuntimeException(e);
           JOptionPane optionPane = new JOptionPane("Check your Internet Connectivity",JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
        }
        }
        catch(Exception ex)
                {
                    JOptionPane optionPane = new JOptionPane("No user found",JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog(null, "ALERT!!");
                dialog.setLocation(550, 275);
                dialog.setVisible(true);
                }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ta6 t = new ta6();
        t.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(up6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(up6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(up6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(up6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new up6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
