package src.Metier;

public class Cavalier extends Piece
{
	public Cavalier (int lig, char col, char coul, String type)
	{
		super (lig,col, coul, type);
	}

	public boolean deplacer (int ligD, char colD,int ligF,char colF, Piece[] tab)
	{
		System.out.println("("+this.getType()+") "+colD+""+ligD+" --> "+colF+ligF);
		
		if( ligF == ligD-2)
		{ 
			if (colF==colD+1 || (int)colF == (int)colD-1)
			{
				this.vaManger(ligD,ligF,colD,colF,tab); 
				return true;
			} 
			return false ;
		}

		if( ligF == ligD+2){ if (colF==colD+1 || (int)colF == (int)colD-1)
			{
				this.vaManger(ligD,ligF,colD,colF,tab);
				return true;
			} 
			return false ;
		}
		
		if( (int)colF == (int)colD-2 )
		{ 
			if (ligF==ligD+1 || ligF == ligD-1)
			{
				this.vaManger(ligD,ligF,colD,colF,tab);
				return true;
			} 
			return false ;
		}

		if( (int)colF == (int)colD+2 )
		{ 
			if (ligF==ligD+1 || ligF == ligD-1)
			{
				this.vaManger(ligD,ligF,colD,colF,tab);
				return true;
			} 
			return false ;
		}
		
		return false;


	}

	public boolean vaManger(int ligD, int ligF, char colD, char colF,Piece[] tab)
	{
		for (int i=0; i<tab.length;i++)
		{
			if (tab[i].getLig()==ligF && tab[i].getCol()==colF)
			{
				System.out.print("ffesqweswwwwwwwwwwwwsef");
				if (this.manger(this, tab[i])){return true;}
				System.out.println("erreur : il y a deja une piece");
				return false;
			}
				
		}

		return false;
	}
}