import java.io.*;
import java.net.*;

public class Serveur
{
	public static void main(String[] args)
	{
		ServerSocket serverSocket = null;
		try
		{
			serverSocket = new ServerSocket(12345);
			System.out.println("Attente des joueurs...");
			Socket player1Socket = serverSocket.accept();
			System.out.println("Joueur 1 connecte.");
			Socket player2Socket = serverSocket.accept();
			System.out.println("Joueur 2 connecte.");

			BufferedReader player1Input = new BufferedReader(new InputStreamReader(player1Socket.getInputStream()));
			PrintWriter player1Output = new PrintWriter(player1Socket.getOutputStream(), true);
			BufferedReader player2Input = new BufferedReader(new InputStreamReader(player2Socket.getInputStream()));
			PrintWriter player2Output = new PrintWriter(player2Socket.getOutputStream(), true);

			while (true)
			{
				String player1Move = player1Input.readLine();
				System.out.println("Joueur 1 a joue : " + player1Move);
				// Envoi du mouvement du joueur 1 à tous les clients connectés
				player1Output.println(player1Move);
				player2Output.println("Adversaire a joue : " + player1Move); // Envoyer
																				// le
																				// mouvement
																				// à
																				// l'autre
																				// joueur

				String player2Move = player2Input.readLine();
				System.out.println("Joueur 2 a joue : " + player2Move);
				// Envoi du mouvement du joueur 2 à tous les clients connectés
				player2Output.println(player2Move);
				player1Output.println("Adversaire a joue : " + player2Move); // Envoyer
																				// le
																				// mouvement
																				// à
																				// l'autre
																				// joueur
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				if (serverSocket != null)
					serverSocket.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
