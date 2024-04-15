package src;

import java.util.*;

import src.Metier.*;
import src.Ihm.*;

public class Controleur
{

<<<<<<< HEAD
	private   Plateau                    metier;         
	private   ChessBoard              pannel;   

	public Controleur()
	{
		this.metier            = new Plateau();
		this.pannel      = new ChessBoard ( this );
=======
	private   Plateau                 metier;         
	private   ChessBoard              PannelPlateau;   

	public Controleur()
	{
		this.metier             = new Plateau();
		this.PannelPlateau      = new ChessBoard ( this );
>>>>>>> f24832ca78a3842050bc4129eb8cc35a385a20e5
	}

	public Piece[] getTabPiece(){return this.metier.getPieces();}

	public Plateau metier(){return this.metier;}

	public boolean deplacer(int ligD, char colD,int ligF,char colF){return this.metier.deplacer(ligD,colD,ligF,colF);}

	public static void main(String[] args)
	{
		new Controleur();
	}
<<<<<<< HEAD
	
=======
>>>>>>> f24832ca78a3842050bc4129eb8cc35a385a20e5

}
