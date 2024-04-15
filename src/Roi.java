public class Roi extends Piece
{
	public Roi (int lig, char col, char coul, String type)
	{
		super (lig,col, coul, type);
	}

	public boolean deplacer (int ligD, char colD,int ligF,char colF, Piece[] tab)
	{
		System.out.println("("+this.getClass().getName()+") "+colD+""+ligD+" --> "+colF+ligF);
		
		if (!(super.getLig()==ligD && super.getCol()==colD)){System.out.println("erreur : emplacement incorecte");return false;}

		if (ligF>8 || ligF<1 || colF > (int)'H' || colF < (int)'A') {System.out.println("erreur : en dehors du tableau");return false;}

		

		if (!((Math.abs(ligD-ligF)==1 || Math.abs(ligD-ligF)==0) && (Math.abs((int)colD-(int)colF)==1 ||Math.abs((int)colD-(int)colF)==0))){System.out.println("mouvement non autorisé");return false;}

		for (int i=0; i<tab.length;i++)
		{
			if (tab[i].getLig()==ligF && tab[i].getCol()==colF)
			{
				if (this.manger(this, tab[i])){return true;}
				System.out.println("erreur : il y a deja une piece");
				return false;
			}
				
		}

		super.setPosition(ligF,colF);
		return true;
		


	}
}