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
		
		Piece autre=null;

		for (int i=0; i<tab.length;i++)
			if (tab[i].getLig()==ligF && tab[i].getCol()==colF)
				autre=tab[i];


		if (!((Math.abs(ligD-ligF)==1 || Math.abs(ligD-ligF)==0) && (Math.abs((int)colD-(int)colF)==1 ||Math.abs((int)colD-(int)colF)==0)))
		{
			if (!super.roquer(this, autre, tab))
			{
				System.out.println("mouvement non autorisé");
				return false;
			}
			else 
				return true;
			
		}

		for (int i=0; i<tab.length;i++)
		{
			if (tab[i].getLig()==ligF && tab[i].getCol()==colF)
			{
				//if (this.roquer(this, tab[i], tab)){return true;};
				if (this.manger(this, tab[i])){return true;}
				return false;
				
			}
				
		}

		

		if (ligD==ligF && colD==colF){return false;}
		this.roque=false;
		super.setPosition(ligF,colF);
		return true;
		


	}

	public boolean getRoque(){System.out.println(this.roque);return this.roque;}
}