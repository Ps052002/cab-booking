
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;  
import javax.swing.JOptionPane;

public class signinlogin extends javax.swing.JFrame {

    public signinlogin() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        photolb.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back03.jpg");
        Image img = i1.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb.setIcon(i2);
        setSize(d);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        bt1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        photolb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Username:");
        getContentPane().add(lb2);
        lb2.setBounds(490, 280, 80, 20);

        lb3.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Password:");
        getContentPane().add(lb3);
        lb3.setBounds(490, 330, 90, 21);

        tf1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(640, 280, 170, 30);
        getContentPane().add(pf1);
        pf1.setBounds(640, 330, 170, 30);

        bt1.setBackground(new java.awt.Color(0, 102, 204));
        bt1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 255));
        bt1.setText("LOGIN");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(560, 530, 160, 50);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New User?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 390, 80, 20);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Signup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 390, 80, 22);

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Click");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(630, 430, 80, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forgot Password?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 430, 110, 20);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lb1.setFont(new java.awt.Font("Engravers MT", 0, 48)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 204));
        lb1.setText("LOGIN");
        jPanel1.add(lb1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(430, 160, 410, 440);

        photolb.setText("jLabel1");
        getContentPane().add(photolb);
        photolb.setBounds(1180, 30, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        String user = tf1.getText();
        String pass = pf1.getText();
        System.out.println(user+" "+pass);
        if (user.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(this, "All Fields are mandatory!!");
        } else {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:9000/signinlogin")
                        .queryString("username", user)
                        .queryString("password", pass)
                        .asString();
                if (res.getStatus() == 200) {
                    String ans2 = res.getBody();
                    if(ans2.equals("success")){
                        JOptionPane.showMessageDialog(this,"login successfull");
                        global.user_name = user;
                        dispose();
                        user_home obj  = new user_home();
                    }else{
                        JOptionPane.showMessageDialog(this, "Login failure");
                    }
                }
            } catch (Exception ex) {
                
            }
        }        
    }//GEN-LAST:event_bt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Signup obj = new Signup();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        user_forgot_password obj =new user_forgot_password();
    }//GEN-LAST:event_jButton2ActionPerformed
       
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signinlogin().setVisible(true);
            }
        });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JLabel photolb;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
