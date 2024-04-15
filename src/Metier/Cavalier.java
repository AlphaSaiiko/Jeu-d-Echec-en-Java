public class Cavalier extends Piece
{
	public Cavalier (int lig, char col, char coul)
	{
		super (lig,col, coul);
	}

	public boolean deplacer (int ligD, char colD,int ligF,char colF, Piece[] tab)
	{
		System.out.println("("+this.getClass().getName()+") "+colD+""+ligD+" --> "+colF+ligF);
		
		if (!(super.getLig()==ligD && super.getCol()==colD))
		{
			
			System.out.println("erreur : emplacement incorecte");
			return false;
		}

		if (ligF>8 || ligF<1 || colF > (int)'H' || colF < (int)'A') {System.out.println("erreur : en dehors du tableau");return false;}

		

		if( ligF == ligD-2){ if (colF==colD+1 || (int)colF == (int)colD-1){super.setPosition(ligF,colF); return true;} return false ;}
		if( ligF == ligD+2){ if (colF==colD+1 || (int)colF == (int)colD-1){super.setPosition(ligF,colF); return true;} return false ;}
		
		if( (int)colF == (int)colD-2 ){ if (ligF==ligD+1 || ligF == ligD-1){super.setPosition(ligF,colF); return true;} return false ;}
		if( (int)colF == (int)colD+2 ){ if (ligF==ligD+1 || ligF == ligD-1){super.setPosition(ligF,colF); return true;} return false ;}
		
		for (int i=0; i<tab.length;i++)
		{
			if (tab[i].getLig()==ligF && tab[i].getCol()==colF)
			{
				if (this.manger(this, tab[i])){return true;}
				System.out.println("erreur : il y a deja une piece");
				return false;
			}
				
		}
		return false;


	}
}