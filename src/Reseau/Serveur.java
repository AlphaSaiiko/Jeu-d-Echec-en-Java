import java.io.*;
import java.net.*;
import java.util.*;

public class Serveur
{
	private static final int MAX_CLIENTS = 2;
	private static List<PrintWriter> clients = new ArrayList<>();

	public static void main(String[] args)
	{
		try
		{
			ServerSocket serverSocket = new ServerSocket(6666);
			System.out.println("Serveur en attente des connexions...");

			for (int i = 0; i < MAX_CLIENTS; i++)
			{
				Socket clientSocket = serverSocket.accept();
				System.out.println("Nouvelle connexion: " + clientSocket);

				PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
				clients.add(output);

				Thread clientHandler = new Thread(new ClientHandler(clientSocket));
				clientHandler.start();
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private static class ClientHandler implements Runnable
	{
		private Socket clientSocket;

		public ClientHandler(Socket clientSocket)
		{
			this.clientSocket = clientSocket;
		}

		@Override
		public void run()
		{
			try
			{
				BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

				String message;
				while ((message = input.readLine()) != null)
				{
					System.out.println("Coordonnees recues : " + message);

					for (PrintWriter client : clients)
					{
						if (client != null)
						{
							client.println(message);
						}
					}
				}

				input.close();
				clientSocket.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
