
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class ManageServer extends javax.swing.JFrame {

    MyServer obj;

    public ManageServer() {
        initComponents();
        MyServer obj;
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println(d);
        setSize(d);
        photolb.setBounds(0, 0, d.width, d.height);
//        getContentPane().setBackground(Color.black);
        ImageIcon i1 = new ImageIcon("src/uploads/back01.jpeg");
        Image img = i1.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb.setIcon(i2);
//getContentPane().setBackground(Color.red);
        setVisible(true);
//        jButton1.setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        photolb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt1.setBackground(new java.awt.Color(51, 0, 51));
        bt1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 204));
        bt1.setText("START");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(450, 160, 330, 70);

        bt2.setBackground(new java.awt.Color(51, 0, 51));
        bt2.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 255, 204));
        bt2.setText("STOP");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(450, 290, 330, 70);

        jButton1.setBackground(new java.awt.Color(51, 0, 51));
        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 204));
        jButton1.setText("User Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 550, 330, 70);

        jButton2.setBackground(new java.awt.Color(51, 0, 51));
        jButton2.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("Admin Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 420, 330, 70);

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Bookingfluent");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 40, 470, 90);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(370, 40, 440, 70);

        photolb.setText("jLabel1");
        getContentPane().add(photolb);
        photolb.setBounds(1160, 50, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        try {
            obj = new MyServer(9000);
            bt1.setEnabled(false);
            bt2.setEnabled(true);
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        try {
            obj.shutdown();
            bt1.setEnabled(true);
            bt2.setEnabled(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_bt2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        signinlogin obj = new signinlogin();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adminlogin obj = new adminlogin();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel photolb;
    // End of variables declaration//GEN-END:variables
}
