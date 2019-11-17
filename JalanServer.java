package week12;

public class JalanServer {
    public MultiThreadedServer server;
    
    public void run(int port) {
        server = new MultiThreadedServer(port);
        new Thread(server).start();
        try {
            Thread.sleep(8000);
            if (server.getClientCount() == 0) {
                System.out.println("Stopping Server");
                server.stop();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public int getCount() {
        return server.getClientCount();
    }
    
    public String getDataOutput() {
        return server.getServerOutput();
    }
}
