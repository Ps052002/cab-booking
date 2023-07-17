    //package vmm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class sms_sender {

    public static void main(String[] args) {
        send("", "hello");
    }

    public static void send(String mobileno, String message) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    String urlParameters = "username=BOOKCAB&password=MUDAFQ5R&message=" + message + "&phone_numbers=" + mobileno;
                    byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
                    int postDataLength = postData.length;
                    String request = "http://server1.vmm.education/VMMCloudMessaging/AWS_SMS_Sender";
                    URL url = new URL(request);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setDoOutput(true);
                    conn.setInstanceFollowRedirects(false);
                    conn.setRequestMethod("POST");
                    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    conn.setRequestProperty("charset", "utf-8");
                    conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
                    conn.setUseCaches(false);
                    try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                        wr.write(postData);
                    }

                    DataInputStream dis = new DataInputStream(conn.getInputStream());
                    String s = "";
                    while (true) {
                        s = dis.readLine();
                        if (s == null) {
                            break;
                        }
                        System.out.println(s);

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
