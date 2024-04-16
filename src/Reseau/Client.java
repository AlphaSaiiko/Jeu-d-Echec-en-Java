package Reseau;

import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			// Connexion au serveur
			Socket socket = new Socket("localhost", 12345);

			// Création des flux de communication
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

			// Lecture de l'entrée utilisateur
			BufferedReader utilInput = new BufferedReader(new InputStreamReader(System.in));

			// Création d'un thread pour lire les messages du serveur
			Thread serverListener = new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					try
					{
						while (true)
						{
							String serverMessage = input.readLine();
							if (serverMessage != null)
							{
								System.out.println(serverMessage);
							}
						}
					} catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			});
			serverListener.start();

			// Boucle principale pour la communication
			while (true)
			{
				// Demande de saisie du mouvement
				System.out.print("Votre mouvement : ");
				String monMouvement = utilInput.readLine();

				// Envoi du mouvement au serveur
				output.println(monMouvement);
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
