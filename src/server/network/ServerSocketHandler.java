package server.network;

import shared.Request;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable
{
  private Socket socket;
  private ObjectInputStream in;
  private ObjectOutputStream out;

  public ServerSocketHandler(Socket socket) throws IOException
  {
    this.socket = socket;
    in = new ObjectInputStream(socket.getInputStream());
    out = new ObjectOutputStream(socket.getOutputStream());
  }

  @Override public void run()
  {
    System.out.println("Client connected from " + socket.getInetAddress().getHostAddress() + " " + socket.getPort());

    while (true)
    {
      //Listen for requests
      try
      {
        Request requestFromClient = (Request) in.readObject();
      }
      catch (IOException | ClassNotFoundException e)
      {
        e.printStackTrace();
      }
    }
  }
}
