
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class userchangepassword extends javax.swing.JFrame {

    
    public userchangepassword() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tf.setText(global.user_name);
        tf.setEditable(false);
        setVisible(true);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        jphoto.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back14.jpg");
        Image img = i1.getImage().getScaledInstance(jphoto.getWidth(), jphoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        jphoto.setIcon(i2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        ps1 = new javax.swing.JPasswordField();
        ps2 = new javax.swing.JPasswordField();
        ps3 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jphoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Leelawadee UI", 0, 48)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 204, 204));
        lb1.setText("RESET PASSWORD");
        getContentPane().add(lb1);
        lb1.setBounds(390, 110, 490, 90);

        lb2.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(0, 255, 204));
        lb2.setText("Username:");
        getContentPane().add(lb2);
        lb2.setBounds(380, 250, 190, 30);

        lb3.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(0, 255, 204));
        lb3.setText("Old Password:");
        getContentPane().add(lb3);
        lb3.setBounds(380, 310, 190, 30);

        lb4.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(0, 255, 204));
        lb4.setText("New Password:");
        getContentPane().add(lb4);
        lb4.setBounds(380, 370, 190, 30);

        lb5.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(0, 255, 204));
        lb5.setText("Confirm New Password:");
        getContentPane().add(lb5);
        lb5.setBounds(380, 430, 190, 30);
        getContentPane().add(tf);
        tf.setBounds(580, 250, 230, 30);

        bt1.setBackground(new java.awt.Color(255, 204, 204));
        bt1.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        bt1.setForeground(new java.awt.Color(204, 0, 255));
        bt1.setText("CHANGE");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(500, 480, 180, 40);

        ps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps1ActionPerformed(evt);
            }
        });
        getContentPane().add(ps1);
        ps1.setBounds(580, 310, 230, 30);
        getContentPane().add(ps2);
        ps2.setBounds(580, 370, 230, 30);
        getContentPane().add(ps3);
        ps3.setBounds(580, 430, 230, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(330, 120, 510, 430);

        jphoto.setText("jLabel1");
        getContentPane().add(jphoto);
        jphoto.setBounds(1170, 40, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        String u=tf.getText();
        String op=ps1.getText();
        String np=ps2.getText();
        String cnp=ps3.getText();
        
        if (u.isEmpty() || op.isEmpty() || np.isEmpty() || cnp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "all fileds are manadatory");
        } else if (np.equals(" ") && (cnp.equals(" "))) {
            JOptionPane.showMessageDialog(this, "both must be same");

        } else {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:9000/user_change_password")
                        .queryString("username", u)
                        .queryString("old_password", op)
                        .queryString("new_password", np)
                        .asString();
                if(res.getStatus()==200){ //ok
                    String ans=res.getBody();
                    System.out.println(ans);
                    
                  if(ans.equals("success")){
                        JOptionPane.showMessageDialog(this, "password changed successfully");
                    }else{
                        JOptionPane.showMessageDialog(this, "password not changed");
                  }
                  }                
            
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
       
    }//GEN-LAST:event_bt1ActionPerformed

    private void ps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps1ActionPerformed

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
            java.util.logging.Logger.getLogger(userchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userchangepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userchangepassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jphoto;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JPasswordField ps1;
    private javax.swing.JPasswordField ps2;
    private javax.swing.JPasswordField ps3;
    public javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
