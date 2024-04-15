import iut.algo.*;

public class Plateau
{
	private Piece[] tabPiece;
	private boolean tourBlanc;

	public Plateau ()
	{
		this.tabPiece=new Piece[32];

		boolean 	fin=true ;
		String		rep1=""  ;
		String		rep2=""	 ;
		boolean		this.tourBlanc=true;

		for (int i=0; i<8; i++)
			this.tabPiece[i]=new Pion (7, (char)((int)'A'+i), 'b');
		
		for (int i=0; i<8; i++)
			this.tabPiece[8+i]=new Pion (2, (char)((int)'A'+i), 'n');
		
		this.tabPiece[16]=new Tour (8,'A','b');
		this.tabPiece[17]=new Tour (8,'H','b');
		this.tabPiece[18]=new Tour (1,'A','n');
		this.tabPiece[19]=new Tour (1,'H','n');

		this.tabPiece[20]=new Cavalier (8,'B','b');
		this.tabPiece[21]=new Cavalier (8,'G','b');
		this.tabPiece[22]=new Cavalier (1,'B','n');
		this.tabPiece[23]=new Cavalier (1,'G','n');

		this.tabPiece[24]=new Roi (1,'E','n');
		this.tabPiece[25]=new Roi (8,'E','b');
		this.tabPiece[26]=new Reine(1,'D','n');
		this.tabPiece[27]=new Reine(8,'D','b');

		this.tabPiece[28]=new Fou (1,'C','n');
		this.tabPiece[29]=new Fou (1,'F','n');
		this.tabPiece[30]=new Fou (8,'F','b');
		this.tabPiece[31]=new Fou (8,'C','b');
	
	}

	public Piece[] getPieces(){return this.tabPiece;}

	public boolean deplacer(int ligD, char colD,int ligF,char colF, Piece[] tab)
	{
		for(int i=0; i<this.tabPiece.length; i++)
		{
			if (colD==this.tabPiece[i].getCol() && ligD===this.tabPiece[i].getLig())
			{
				if (this.tourBlanc && this.tabPiece[i].getCoul()=='b' || !this.tourBlanc && this.tabPiece[i].getCoul()=='n')
				{
					if(this.tabPiece[i].deplacer(this.tabPiece[i].getLig(), this.tabPiece[i].getCol(), ligF, colF, this.tabPiece))
					{
						this.tourBlanc= !this.tourBlanc;
						return true;
					}
						
				}
				else

					System.out.println("Ce n'est pas a votre tour");
			}
		}
		return false;
	}


	public String toString(Piece[] tab)
	{
		String res="\n    +----+----+----+----+----+----+----+----+\n";
		boolean vide=true;

		for (int i=8; i>=1; i--)
		{
			for (int j=0; j<8; j++)
			{
				if(j==0){res+= i+"   ";}
				for (int k=0; k<tab.length; k++)
				{
					if (tab[k].getLig()==i && tab[k].getCol()==(char)((int)'A'+j))
					{
						res+="+ "+tab[k].getClass().getName().substring(0,2)+" ";
						vide=false;
					}
				}
				if (vide){res+="+    ";}
				vide=true;
				
			}
			res+="+\n    +----+----+----+----+----+----+----+----+\n";
		}
		res+="      A    B    C    D    E    F    G    H\n";
		return res;

	}

	public boolean finF(Piece[] this.tabPiece)
	{
		for (int i=0; i<this.tabPiece.length; i++)
		{
			if (tabPiece[i].getClass().getName().equals("Roi"))
				if (tabPiece[i].getLig()==10 && tabPiece[i].getCol()=='Z')
				{
					System.out.print(toString(tabPiece));
					if (tabPiece[i].getCoul()=='b')
						System.out.println("Les noirs ont gagnés");
					else
						System.out.println("Les blancs ont gagnés");
					return false;
				}
					
		}

		return true;
	}
}