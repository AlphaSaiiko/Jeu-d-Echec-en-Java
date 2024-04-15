import java.util.*;


public class Controleur
{

	private   Plateau                    metier;         
	private   ChessBoard              pannel;   

	public Controleur()
	{
		this.metier            = new Plateau();
		this.pannel      = new ChessBoard ( this );
	}

	public Piece[] getTabPiece(){return this.metier.getPieces();}

	public Plateau metier(){return this.metier;}

	public boolean deplacer(int ligD, char colD,int ligF,char colF){return this.metier.deplacer(ligD,colD,ligF,colF);}

	public static void main(String[] arg)
	{
		new Controleur();
	}
	

}
