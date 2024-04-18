package src.Metier;

 

public class Roi extends Piece
{
	private boolean roque;

	public Roi (int lig, char col, char coul, String type)
	{
		super (lig,col, coul, type);
		this.roque=true;
	}

	public boolean deplacer (int ligD, char colD,int ligF,char colF, Piece[] tab)
	{
		System.out.println("("+this.getType()+") "+colD+""+ligD+" --> "+colF+ligF);
		
		if (!((Math.abs(ligD-ligF)==1 || Math.abs(ligD-ligF)==0) && (Math.abs((int)colD-(int)colF)==1 ||Math.abs((int)colD-(int)colF)==0))){System.out.println("mouvement non autorisé");return false;}

		for (int i=0; i<tab.length;i++)
		{
			if (tab[i].getLig()==ligF && tab[i].getCol()==colF)
			{
				if (this.manger(this, tab[i])){return true;}
				return (this.roquer(this, tab[i]));
			}
				
		}

		this.roque=false;
		super.setPosition(ligF,colF);
		return true;
		


	}

	public boolean getRoque(){return this.roque;}
}