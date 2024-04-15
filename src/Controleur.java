import java.util.*;


public class Controleur
{
	private   Plateau                    metier;         
	private   PannelPlateau              PannelPlateau;   

	public Controleur()
	{
		metier            = new Plateau();
		framePlateau      = new PannelPlateau ( this );
	}

	public Piece[] getTabPiece(){return this.metier.getPieces();}

	public boolean deplacer(int ligD, char colD,int ligF,char colF){return this.metier.deplacer(ligD,colD,ligF,colF);}

	public static void main(String[] arg)
	{
		new Controleur();
	}
	

}
