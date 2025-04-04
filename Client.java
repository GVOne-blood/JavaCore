import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        // khai bao bien kieu socket
        Socket cl = null;
        BufferedReader inp = null;
        PrintWriter outp = null;

        String ipserver = "127.0.0.1";
        int serverport = 3456;
        String data = "HelloWorld";
        try{
            cl = new Socket(ipserver, serverport);
            inp = new BufferedReader(new InputStreamReader(cl.getInputStream()));
            outp = new PrintWriter(cl.getOutputStream(), true);

        }catch(Exception e){
            throw new RuntimeException(e);
        }
        finally {
            try{
                if (inp != null) inp = null;
                if (outp != null) outp = null;

            }catch (Exception e ){

            }
        }
    }
}
