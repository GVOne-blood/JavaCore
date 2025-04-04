import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket svr = null;
        Socket cl = null;
        Socket pclient;
        BufferedReader inp = null;
        PrintWriter outp = null;
        InetAddress addrClient;
        int pserver = 3456;
        String sr;

        try{
            svr = new ServerSocket(pserver);
            System.out.println("Server da san sang ");
            cl = svr.accept();
            inp = new BufferedReader(new InputStreamReader(cl.getInputStream()));
            outp = new PrintWriter(cl.getOutputStream(), true);
            addrClient = cl.getInetAddress();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try{
                if (inp != null) inp.close();
                if (outp != null) outp.close();
                if (cl != null) cl.close();
                if (svr != null) svr.close();
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
