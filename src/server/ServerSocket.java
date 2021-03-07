package server;

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
      }

    }
  }
}
