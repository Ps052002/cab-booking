
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class booking extends javax.swing.JFrame {

    String id;
    String photo;
    String car_name;
    String brand;
    String description;
    String price_per_day_without_driver;
    String price_per_day_with_driver;
    String security;
    String car_type;

    public booking(String id, String photo, String car_name, String brand, String description, String price_per_day_without_driver, String price_per_day_with_driver, String security, String car_type) throws IOException {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.id = id;
        this.photo = photo;
        this.car_name = car_name;
        this.brand = brand;
        this.description = description;
        this.price_per_day_without_driver = price_per_day_without_driver;
        this.price_per_day_with_driver = price_per_day_with_driver;
        this.security = security;
        System.out.println("security is:" + security);
        jdescription.setText(description);
        jcarname.setText(car_name);
        jbrand.setText(brand);
        jSecurity.setText(security);
        rb1.setText(price_per_day_without_driver);
        rb2.setText(price_per_day_with_driver);
        URL url = new URL("http://localhost:9000/GetResource/" + photo);
        BufferedImage img = ImageIO.read(url);
        Image resized = img.getScaledInstance(jphoto.getWidth(), jphoto.getHeight(), Image.SCALE_SMOOTH);
        jphoto.setIcon(new ImageIcon(resized));
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(d);
        jphotolb.setBounds(0, 0, d.width, d.height);
        ImageIcon i1 = new ImageIcon("src/uploads/back03.jpg");
        Image img2 = i1.getImage().getScaledInstance(jphotolb.getWidth(), jphotolb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img2);
        jphotolb.setIcon(i2);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jphoto = new javax.swing.JLabel();
        jcarname = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        jSecurity = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        bt1 = new javax.swing.JButton();
        jdescription = new javax.swing.JLabel();
        jbrand = new javax.swing.JLabel();
        dt1 = new com.toedter.calendar.JDateChooser();
        dt2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jphotolb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jphoto.setText("jLabel1");
        getContentPane().add(jphoto);
        jphoto.setBounds(310, 150, 190, 190);

        jcarname.setBackground(new java.awt.Color(255, 255, 255));
        jcarname.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jcarname.setForeground(new java.awt.Color(255, 255, 255));
        jcarname.setText("car name");
        getContentPane().add(jcarname);
        jcarname.setBounds(690, 200, 310, 30);

        lb1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 48)); // NOI18N
        lb1.setText("Booking");
        getContentPane().add(lb1);
        lb1.setBounds(420, 20, 370, 60);

        lb4.setBackground(new java.awt.Color(255, 255, 255));
        lb4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(0, 204, 204));
        lb4.setText("Price Without Driver:");
        getContentPane().add(lb4);
        lb4.setBounds(300, 380, 200, 40);

        lb5.setBackground(new java.awt.Color(255, 255, 255));
        lb5.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(0, 204, 204));
        lb5.setText("Price With Driver:");
        getContentPane().add(lb5);
        lb5.setBounds(300, 440, 200, 40);

        jSecurity.setBackground(new java.awt.Color(255, 255, 255));
        jSecurity.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jSecurity.setForeground(new java.awt.Color(255, 255, 255));
        jSecurity.setText("Security");
        getContentPane().add(jSecurity);
        jSecurity.setBounds(690, 300, 360, 30);

        rb1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb1);
        rb1.setFont(new java.awt.Font("Raavi", 0, 18)); // NOI18N
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(510, 380, 120, 40);

        rb2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rb2);
        rb2.setFont(new java.awt.Font("Raavi", 0, 18)); // NOI18N
        getContentPane().add(rb2);
        rb2.setBounds(510, 430, 100, 40);

        bt1.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        bt1.setText("Book");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(330, 630, 330, 50);

        jdescription.setBackground(new java.awt.Color(255, 255, 255));
        jdescription.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jdescription.setForeground(new java.awt.Color(255, 255, 255));
        jdescription.setText("discription");
        getContentPane().add(jdescription);
        jdescription.setBounds(690, 150, 320, 30);

        jbrand.setBackground(new java.awt.Color(255, 255, 255));
        jbrand.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jbrand.setForeground(new java.awt.Color(255, 255, 255));
        jbrand.setText("brand");
        getContentPane().add(jbrand);
        jbrand.setBounds(690, 250, 310, 30);
        getContentPane().add(dt1);
        dt1.setBounds(510, 510, 120, 30);
        getContentPane().add(dt2);
        dt2.setBounds(510, 570, 120, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("From Date:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 510, 130, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Disciption:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 160, 100, 20);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Car Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 210, 100, 20);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Brand:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(580, 260, 70, 20);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Security:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 310, 90, 20);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("To Date:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 570, 90, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 10, 610, 620);

        jphotolb.setText("jLabel1");
        getContentPane().add(jphotolb);
        jphotolb.setBounds(1040, 20, 37, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        String price_per_day = "";
        if (rb1.isSelected()) {
            price_per_day = rb1.getText();
        } else {
            price_per_day = rb2.getText();
        }
        
        if (price_per_day.isEmpty() || dt1.getDate() == null || dt2.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "All the fields are required");
        } else {
            Date dd1 = dt1.getDate();
            Date dd2 = dt2.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(dd1);
            String date2 = sdf.format(dd2);
            LocalDate d1 = LocalDate.parse(date1);
            LocalDate d2 = LocalDate.parse(date2);
            Period period = Period.between(d2, d1);
            long daysDiff = Math.abs(period.getDays());
            int noofdays = 0;
            System.out.println(daysDiff);
            if (daysDiff == 0) {
                noofdays = (int) daysDiff + 1;
            } else if (daysDiff < 0) {
                JOptionPane.showMessageDialog(this, "please enter valid dates");
            } else {
                noofdays = (int) daysDiff + 1;
            }

            int ppd = Integer.parseInt(price_per_day);

            String start_date = date1;
            String end_date = date2;
            String no_of_days = noofdays + "";

            int rent = ppd * noofdays;
            String total_rent = rent + "";

            dispose();
            book_car obj = new book_car(id, price_per_day, start_date, end_date, no_of_days, security, total_rent);
        }


    }//GEN-LAST:event_bt1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new booking("", "", "", "", "", "", "", "", "").setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(booking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dt1;
    private com.toedter.calendar.JDateChooser dt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jSecurity;
    private javax.swing.JLabel jbrand;
    private javax.swing.JLabel jcarname;
    private javax.swing.JLabel jdescription;
    private javax.swing.JLabel jphoto;
    private javax.swing.JLabel jphotolb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    // End of variables declaration//GEN-END:variables
}
