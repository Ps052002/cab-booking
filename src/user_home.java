
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class user_home extends javax.swing.JFrame {

    
    public user_home() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        photolb.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back03.jpg");
        Image img = i1.getImage().getScaledInstance(photolb.getWidth(), photolb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        photolb.setIcon(i2);
        setVisible(true);
        lb1.setText("Welcome "+global.user_name);
        getallcars();
    }

    void getallcars(){
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:9000/getallcars")
                    .asString();
            if(res.getStatus()==200){
                String ans=res.getBody();
                System.out.println(ans);
                StringTokenizer st=new StringTokenizer(ans,";;");
               int count= st.countTokens();
                car_design arr[]= new car_design[count];  //declaration
    
                int x=20,y=20;
                
                for(int i=0;i<count;i++){
                    arr[i]=new car_design();
                    String row=st.nextToken();
                    StringTokenizer st2=new StringTokenizer(row,"~~");
                    String car_id = st2.nextToken();
                    String Car_Names=st2.nextToken();
                    String price_per_day_without_driver=st2.nextToken();
                    String price_per_day_with_driver=st2.nextToken();
                    String Security=st2.nextToken();
                    String photo=st2.nextToken();
                    String description = st2.nextToken();
                    String brand = st2.nextToken();
                    String car_type = st2.nextToken();
                    System.out.println(Car_Names+" "+price_per_day_without_driver+" "+price_per_day_with_driver+" "+Security+" "+photo+" "+description+" "+car_type);
                    URL url = new URL("http://localhost:9000/GetResource/"+photo);
                    BufferedImage img = ImageIO.read(url);
                    ImageIcon i1 = new ImageIcon(img);
                    Image resized = i1.getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon i2 = new ImageIcon(resized);
                    
                    arr[i].lb1.setIcon(i2);
                    arr[i].lb2.setText("Car Names: "+Car_Names);
                    arr[i].lb3.setText("Price Without Driver: "+price_per_day_without_driver);
                    arr[i].lb4.setText("Price With Driver: "+price_per_day_with_driver);
                    arr[i].lb5.setText("Security: "+Security);
                    
                    arr[i].addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            try {
                                booking obj = new booking(car_id,photo,Car_Names,brand,description,price_per_day_without_driver,price_per_day_with_driver,Security,car_type);
                            } catch (IOException ex) {
                                Logger.getLogger(user_home.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        
                    });
                    arr[i].setBounds(x,y,600,350);
                    main.add(arr[i]);
                    main.repaint();
                    arr[i].repaint();
                    y+=360;
                    i++;
                }
                main.setPreferredSize(new Dimension(700,350*count));
                main.revalidate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lb2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        main1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        photolb1 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        main = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        photolb = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(null);

        lb2.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        lb2.setText("WELCOME");
        jFrame1.getContentPane().add(lb2);
        lb2.setBounds(80, 20, 330, 60);

        main1.setBackground(new java.awt.Color(0, 0, 0,80));
        main1.setLayout(null);
        jScrollPane2.setViewportView(main1);

        jFrame1.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 120, 720, 520);

        jButton3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton3.setText("Change Password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton3);
        jButton3.setBounds(710, 30, 190, 50);

        jButton4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton4);
        jButton4.setBounds(950, 30, 140, 50);

        bt4.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        bt4.setText("Booking History");
        jFrame1.getContentPane().add(bt4);
        bt4.setBounds(470, 30, 190, 50);

        photolb1.setText("jLabel1");
        jFrame1.getContentPane().add(photolb1);
        photolb1.setBounds(1190, 50, 37, 16);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Kristen ITC", 0, 36)); // NOI18N
        lb1.setText("WELCOME");
        getContentPane().add(lb1);
        lb1.setBounds(80, 20, 330, 60);

        main.setLayout(null);
        jScrollPane1.setViewportView(main);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 120, 640, 520);

        jButton1.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 30, 190, 50);

        jButton2.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(950, 30, 140, 50);

        bt3.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        bt3.setText("Booking History");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(470, 30, 190, 50);

        photolb.setText("jLabel1");
        getContentPane().add(photolb);
        photolb.setBounds(1190, 50, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userchangepassword obj=new userchangepassword();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        global.user_name="";
        dispose();
        signinlogin obj = new signinlogin();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        booking_history obj = new booking_history();
    }//GEN-LAST:event_bt3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JPanel main;
    private javax.swing.JPanel main1;
    private javax.swing.JLabel photolb;
    private javax.swing.JLabel photolb1;
    // End of variables declaration//GEN-END:variables
}
