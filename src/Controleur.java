package src;

import java.io.*;
import java.net.*;
import src.Metier.*;
import src.Ihm.*;

public class Controleur
{
	private Plateau metier;
	private ChessBoard PannelPlateau;
	private Socket socket;
	private PrintWriter output;

	public Controleur()
	{
		this.metier = new Plateau();
		this.PannelPlateau = new ChessBoard(this);

		try
		{
			// Connexion au serveur
			this.socket = new Socket("172.26.4.203", 6666);
			this.output = new PrintWriter(socket.getOutputStream(), true);

			// Démarrer l'écoute des messages du serveur dans un thread séparé
			Thread serverListener = new Thread(this::ecouterServeur);
			serverListener.start();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void mettreAJourIHM(String message)
	{
		int ligD = Character.getNumericValue(message.charAt(0));
		char colD = message.charAt(1);
		int ligF = Character.getNumericValue(message.charAt(2));
		char colF = message.charAt(3);

		this.metier.deplacer(ligD, colD, ligF, colF);
		this.PannelPlateau.IhmMaj();
	}

	public boolean changer()
	{
		return this.metier.changer();
	}

	public void changerPiece()
	{
		System.out.println(this.PannelPlateau.changerPiece());
		this.metier.changerPiece(this.PannelPlateau.changerPiece());
		this.PannelPlateau.IhmMaj();

	}

	private void envoyerCoordonneesAuServeur(String coordonnees)
	{
		this.output.println(coordonnees);
	}

	public Piece[] getTabPiece()
	{
		return this.metier.getPieces();
	}

	public Plateau metier()
	{
		return this.metier;
	}

	public boolean deplacer(int ligD, char colD, int ligF, char colF)
	{
		if (this.metier.deplacer(ligD, colD, ligF, colF))
		{
			String coordonnees = ligD + "" + colD + "" + ligF + "" + colF;
			envoyerCoordonneesAuServeur(coordonnees);
			return true;
		}
		return false;
	}

	public void ecouterServeur()
	{
		try
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String message;
			while ((message = input.readLine()) != null)
			{
				System.out.println("Message reçu du serveur : " + message);
				mettreAJourIHM(message);
			}

			input.close();
			socket.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		new Controleur();
	}
}
