package server.network;

import java.io.IOException;
import java.net.Socket;

public class ServerSocket
{

  public void start() throws IOException
  {
    try (java.net.ServerSocket serverSocket = new java.net.ServerSocket(1234))
    {

      while (true)
      {
        Socket socket = serverSocket.accept();
        ServerSocketHandler handler = new ServerSocketHandler(socket);
        Thread handlerThread = new Thread(handler);
        handlerThread.start();
      }

    }
  }
}
