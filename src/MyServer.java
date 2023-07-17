
import com.vmm.JHTTPServer;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import vmm.DBLoader;
import java.sql.*;

public class MyServer extends JHTTPServer {

    public MyServer(int port) throws IOException {
        super(port);
    }

    @Override
    public Response serve(String uri, String method, Properties header, Properties parms, Properties files) {
        System.out.println(uri);
        Response res = null;
        if (uri.equals("/")) {
            res = new Response(HTTP_OK, "text/plain", "Hello world");
        } else if (uri.equals("/*")) {
            // write your logic here
            res = new Response(HTTP_OK, "text/plain", "hey");
        } else if (uri.contains("/three")) {
            String s = new java.util.Date().toString();

            return new Response(HTTP_OK, "text/plain", "hello world");

        } else if (uri.contains("/checklogin")) {
            String ans = "";
            String user = parms.getProperty("username");
            String pass = parms.getProperty("password");
            try {
                ResultSet rs = DBLoader.executeSQL("Select * from admin where username='" + user + "' and password = '" + pass + "'");
                if (rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "failure");

                }

            } catch (Exception ex) {

            }
        } else if (uri.contains("/change_password")) {
            String username = parms.getProperty("username");
            String op = parms.getProperty("old_password");
            String np = parms.getProperty("new_password");
            try {
                ResultSet rs = DBLoader.executeSQL("Select * from admin where username='" + username + "'");
                if (rs.next()) {
                    String password = rs.getString("password");
                    if (password.equals(op)) {
                        rs.updateString("password", np);
                        rs.updateRow();
                        res = new Response(HTTP_OK, "text/plain", "success");

                    }

                } else {
                    res = new Response(HTTP_OK, "text/plain", "password failure");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (uri.contains("/add_car")) {
            String Car_Name = parms.getProperty("car_name");
            String Brand = parms.getProperty("Brand");
            String Car_Type = parms.getProperty("Car_Type");
            String Fuel_Type = parms.getProperty("Fuel_Type");
            String price_per_day_without_driver = parms.getProperty("price_per_day_without_driver");
            String price_per_day_with_driver = parms.getProperty("price_per_day_with_driver");
            String Security = parms.getProperty("Security");
            String discription = parms.getProperty("discription");
            String filename = saveFileOnServerWithRandomName(files, parms, "photo", "src/uploads/");
            System.out.println(price_per_day_without_driver);
            try {
                ResultSet rs = DBLoader.executeSQL("select * from car_details");
                rs.moveToInsertRow();
                rs.updateString("Car_Names", Car_Name);
                rs.updateString("Brand", Brand);
                rs.updateString("Car_Type", Car_Type);
                rs.updateString("Fuel_Type", Fuel_Type);
                rs.updateString("price_per_day_without_driver", price_per_day_without_driver);
                rs.updateString("price_per_day_with_driver", price_per_day_with_driver);
                rs.updateString("Security", Security);
                rs.updateString("discription", discription);
                rs.updateString("photo", "src/uploads/" + filename);
                rs.insertRow();
                res = new Response(HTTP_OK, "text/plain", "success");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (uri.equals("/getcar")) {
            try {
                ResultSet rs = DBLoader.executeSQL("select * from car_details");
                rs.moveToInsertRow();
                String ans = " ";
                while (rs.next()) {
                    String car_id = rs.getString("Car_id");
                    String Car_Names = rs.getString("Car_Names");
                    String Brand = rs.getString("Brand");
                    String Car_Type = rs.getString("Car_Type");
                    String Fuel_Type = rs.getString("Fuel_Type");
                    String price_per_day_without_driver = rs.getString("price_per_day_without_driver");
                    String price_per_day_with_driver = rs.getString("price_per_day_with_driver");
                    String Security = rs.getString("Security");
                    String discription = rs.getString("discription");
                    String photo = rs.getString("Photo");
                    String row = car_id + "~~" + Car_Names + "~~" + Brand + "~~" + Car_Type + "~~" + Fuel_Type + "~~" + price_per_day_without_driver + "~~" + price_per_day_with_driver + "~~" + Security + "~~" + discription + "~~" + photo;
                    ans += row + ";;";
                }
                System.out.println(ans);
                res = new Response(HTTP_OK, "text/plain", ans);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/Signup")) {
            String ans = "";
            String u = parms.getProperty("username");
            String e = parms.getProperty("email");
            String p = parms.getProperty("password");
            String mno = parms.getProperty("mobile_no");
            String g = parms.getProperty("gender");

            try {
                ResultSet rs = DBLoader.executeSQL("select * from user");
                rs.moveToInsertRow();
                rs.updateString("username", u);
                rs.updateString("email", e);
                rs.updateString("password", p);
                rs.updateString("mobileno", mno);
                rs.updateString("gender", g);
                rs.insertRow();
                res = new Response(HTTP_OK, "text/plain", "success");

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (uri.contains("signinlogin")) {

            String user = parms.getProperty("username");
            String pass = parms.getProperty("password");
            System.out.println(user + " " + pass);
            try {
                ResultSet rs = DBLoader.executeSQL("Select * from user where username='" + user + "' and password = '" + pass + "'");
                if (rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "failure");

                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else if (uri.equals("/getallcars")) {
            String ans = "";
            try {
                ResultSet rs = DBLoader.executeSQL("select * from car_details");
                while (rs.next()) {
                    String id = rs.getString("Car_id");
                    String Car_Names = rs.getString("Car_Names");
                    String price_per_day_without_driver = rs.getString("price_per_day_without_driver");
                    String price_per_day_with_driver = rs.getString("price_per_day_with_driver");
                    String Security = rs.getString("Security");
                    String photo = rs.getString("Photo");
                    String description = rs.getString("discription");
                    String brand = rs.getString("Brand");
                    String car_type = rs.getString("Car_Type");
                    String row = id + "~~" + Car_Names + "~~" + price_per_day_without_driver + "~~" + price_per_day_with_driver + "~~" + Security + "~~" + photo + "~~" + description + "~~" + brand + "~~" + car_type;
                    ans += row + ";;";
                }
                res = new Response(HTTP_OK, "text/plain", ans);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.contains("/GetResource")) {
            uri = uri.substring(1);
//            System.out.println(uri);
            uri = uri.substring(uri.indexOf("/") + 1);
//            System.out.println(uri);
            res = sendCompleteFile(uri);
//            System.out.println("Response reference to be send to client-------------" + res);
        } else if (uri.contains("/user_change_password")) {
            String u = parms.getProperty("username");
            String op = parms.getProperty("old_password");
            String np = parms.getProperty("new_password");
            try {
                ResultSet rs = DBLoader.executeSQL("Select * from user where username='" + u + "'");
                if (rs.next()) {
                    String password = rs.getString("password");
                    if (password.equals(op)) {
                        rs.updateString("password", np);
                        rs.updateRow();
                        res = new Response(HTTP_OK, "text/plain", "success");

                    }

                } else {
                    res = new Response(HTTP_OK, "text/plain", "password failure");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (uri.equals("/book_car")) {
            String car_id = parms.getProperty("car_id");
            String price_per_day = parms.getProperty("price_per_day");
            String start_date = parms.getProperty("start_date");
            String end_date = parms.getProperty("end_date");
            String no_of_days = parms.getProperty("no_of_days");
            String rent = parms.getProperty("rent");
            String security = parms.getProperty("security");
            String name = parms.getProperty("name");
            String mobile = parms.getProperty("mobile");
            String address = parms.getProperty("address");
            String email = parms.getProperty("email");
            String payment_status = parms.getProperty("payment_status");

            try {
                ResultSet rs = DBLoader.executeSQL("select * from booking");
                rs.moveToInsertRow();
                rs.updateString("car_id", car_id);
                rs.updateString("price_per_day", price_per_day);
                rs.updateString("start_date", start_date);
                rs.updateString("end_date", end_date);
                rs.updateString("no_of_days", no_of_days);
                rs.updateString("rent", rent);
                rs.updateString("security", security);
                rs.updateString("name", name);
                rs.updateString("mobile_no", mobile);
                rs.updateString("address", address);
                rs.updateString("email", email);
                rs.updateString("payment_status", payment_status);
                rs.updateString("booking_status", "success");
                rs.insertRow();
                res = new Response(HTTP_OK, "text/plain", "success");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/delete_car")) {
            int car_id = Integer.parseInt(parms.getProperty("car_id"));
            System.out.println(car_id);
            try {
                ResultSet rs = DBLoader.executeSQL("select * from car_details where car_id = '" + car_id + "'");
                if (rs.next()) {
                    rs.deleteRow();
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "fails");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/getbookinghistory")) {
            String username = parms.getProperty("name");
            try {
                ResultSet rs = DBLoader.executeSQL("select * from booking where name ='" + username + "' ");
                rs.moveToInsertRow();
                String ans = "";
                while (rs.next()) {
                    String booking_id = rs.getString("booking_id");
                    String car_id = rs.getString("car_id");
                    String price_per_day = rs.getString("price_per_day");
                    String start_date = rs.getString("start_date");
                    String end_date = rs.getString("end_date");
                    String no_of_days = rs.getString("no_of_days");
                    String rent = rs.getString("rent");
                    String security = rs.getString("security");
                    String name = rs.getString("name");
                    String mobile_no = rs.getString("mobile_no");
                    String address = rs.getString("address");
                    String email = rs.getString("email");
                    String payment_status = rs.getString("payment_status");
                    String booking_status = rs.getString("booking_status");
                    String row = booking_id + "~~" + car_id + "~~" + price_per_day + "~~" + start_date + "~~" + end_date + "~~" + no_of_days + "~~" + rent + "~~" + security + "~~" + name + "~~" + mobile_no + "~~" + address + "~~" + email + "~~" + payment_status + "~~" + booking_status;

                    ans += row + ";;";
                }
                res = new Response(HTTP_OK, "text/plain", ans);
                System.out.println(ans);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (uri.equals("/getadminbookinghistory")) {

            try {
                ResultSet rs = DBLoader.executeSQL("select * from booking");
                rs.moveToInsertRow();
                String ans = "";
                while (rs.next()) {
                    String booking_id = rs.getString("booking_id");
                    String car_id = rs.getString("car_id");
                    String price_per_day = rs.getString("price_per_day");
                    String start_date = rs.getString("start_date");
                    String end_date = rs.getString("end_date");
                    String no_of_days = rs.getString("no_of_days");
                    String rent = rs.getString("rent");
                    String security = rs.getString("security");
                    String name = rs.getString("name");
                    String mobile_no = rs.getString("mobile_no");
                    String address = rs.getString("address");
                    String email = rs.getString("email");
                    String payment_status = rs.getString("payment_status");
                    String booking_status = rs.getString("booking_status");
                    String row = booking_id + "~~" + car_id + "~~" + price_per_day + "~~" + start_date + "~~" + end_date + "~~" + no_of_days + "~~" + rent + "~~" + security + "~~" + name + "~~" + mobile_no + "~~" + address + "~~" + email + "~~" + payment_status + "~~" + booking_status;

                    ans += row + ";;";
                }
                res = new Response(HTTP_OK, "text/plain", ans);
                System.out.println(ans);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (uri.equals("/user-forgot-password")) {
            String username = parms.getProperty("username");
            try {
                ResultSet rs = DBLoader.executeSQL("select * from user where username ='" + username + "' ");
                if (rs.next()) {
                    int random = (int) (1000 + (9999 - 1000) * Math.random());
                    String otp = random + "";

                    String mobileno = rs.getString("mobileno");
                    sms_sender.send("7973628467", "your otp is :" + otp);
                    global.otp = otp+"";
                    res = new Response(HTTP_OK, "text/plain", otp);
                } else {
                    res = new Response(HTTP_OK, "text/plain", "fails");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/set-new-password")) {
            String username = parms.getProperty("username");
            String password = parms.getProperty("newPassword");
            System.out.println(username + " " + password);
            try {
                ResultSet rs = DBLoader.executeSQL("select * from user where username ='" + username + "' ");
                if (rs.next()) {
                    rs.updateString("password", password);
                    rs.updateRow();
                    res = new Response(HTTP_OK, "text/plain", "updated");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "fails");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/admin_del_history")) {
            String booking_id = parms.getProperty("booking_id");
            try {
                ResultSet rs = DBLoader.executeSQL("select * from booking where booking_id ='" + booking_id + "' ");
                if (rs.next()) {
                    rs.deleteRow();
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "error");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/user_del_history")) {
            String booking_id = parms.getProperty("booking_id");
            try {
                ResultSet rs = DBLoader.executeSQL("select * from booking where booking_id ='" + booking_id + "' ");
                if (rs.next()) {
                    rs.deleteRow();
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "error");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (uri.equals("/cancel_booking")) {
            String booking_id = parms.getProperty("booking_id");
            try {
                ResultSet rs = DBLoader.executeSQL("select * from booking where booking_id ='" + booking_id + "' ");
                if (rs.next()) {
                    rs.updateString("booking_status", "cancel");
                    rs.updateRow();
                    res = new Response(HTTP_OK, "text/plain", "success");
                } else {
                    res = new Response(HTTP_OK, "text/plain", "error");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return res;

    }
}
