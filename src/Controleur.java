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
	private BufferedReader input;
	private PrintWriter output;
	private String couleurJ = "Blanc";

	public Controleur()
	{
		this.metier = new Plateau();
		this.PannelPlateau = new ChessBoard(this);

		try
		{
			// Connexion au serveur
			this.socket = new Socket("172.26.4.203", 6666);
			this.input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			this.output = new PrintWriter(socket.getOutputStream(), true);

			Thread serverListener = new Thread(this::ecouterServeur);
			serverListener.start();

			this.couleurJ = input.readLine();
			System.out.println("Vous etes le joueur " + this.couleurJ);
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

		if ((this.metier.getTourBlanc() && this.couleurJ.equals("Blanc"))
				|| (!this.metier.getTourBlanc() && this.couleurJ.equals("Noir")))

			if (this.metier.deplacer(ligD, colD, ligF, colF))
			{
				String coordonnees = ligD + "" + colD + "" + ligF + "" + colF;
				envoyerCoordonneesAuServeur(coordonnees);
				return true;
			}
		return false;
	}

	private void envoyerCoordonneesAuServeur(String coordonnees)
	{
		this.output.println(coordonnees);
	}

	public boolean changer()
	{
		return this.metier.changer();
	}

	public void ecouterServeur()
	{
		try
		{
			String message;
			while ((message = input.readLine()) != null)
			{
				System.out.println("Message recu du serveur : " + message);
				mettreAJourIHM(message);
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void changerPiece()
	{
		System.out.println(this.PannelPlateau.changerPiece());
		this.metier.changerPiece(this.PannelPlateau.changerPiece());
		this.PannelPlateau.IhmMaj();

	}

	public String getCouleurJ()
	{
		return this.couleurJ;
	}

	public static void main(String[] args)
	{
		new Controleur();
	}
}
