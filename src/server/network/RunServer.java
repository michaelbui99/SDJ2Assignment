package server.network;

import java.io.IOException;

public class RunServer
{
  public static void main(String[] args) throws IOException
  {
    ServerSocket serverSocket = new ServerSocket();
    serverSocket.start();
  }
}
