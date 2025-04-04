import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClinetUDP {
    public static void main(String[] args) {
        DatagramSocket svr = null;
        InetAddress addrClient;
        int pclient;
        byte[] inbuff, outbuff;
        DatagramPacket inData, outData;
        int pserver = 0;
        String s;
        try{
            svr = new DatagramSocket(pserver);
            // tao goi tin
            inbuff = new byte[256];
            inData = new DatagramPacket(inbuff, inbuff.length);
            //nhan goi tin
            svr.receive(inData);
            addrClient = inData.getAddress();
            pclient = inData.getPort();
            s = new String(inData.getData());
            s = s.toUpperCase();
            // tao goi tin gui
            outbuff = s.getBytes(); // chuyen chuoi => mang byte
            outData = new DatagramPacket(outbuff, outbuff.length, addrClient, pclient);
            svr.send(outData);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        finally {
                if (svr != null) svr.close();

        }

    }
}
