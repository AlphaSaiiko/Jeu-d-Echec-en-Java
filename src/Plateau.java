import iut.algo.*;

public class Plateau
{
	public static void main (String[] args)
	{
		Piece[] tabPiece=new Piece[32];

		boolean 	fin=true ;
		String		rep1=""  ;
		String		rep2=""	 ;
		boolean		tour=true;

		for (int i=0; i<8; i++)
			tabPiece[i]=new Pion (7, (char)((int)'A'+i), 'b');
		
		for (int i=0; i<8; i++)
			tabPiece[8+i]=new Pion (2, (char)((int)'A'+i), 'n');
		
		tabPiece[16]=new Tour (8,'A','b');
		tabPiece[17]=new Tour (8,'H','b');
		tabPiece[18]=new Tour (1,'A','n');
		tabPiece[19]=new Tour (1,'H','n');

		tabPiece[20]=new Cavalier (8,'B','b');
		tabPiece[21]=new Cavalier (8,'G','b');
		tabPiece[22]=new Cavalier (1,'B','n');
		tabPiece[23]=new Cavalier (1,'G','n');

		tabPiece[24]=new Roi (1,'E','n');
		tabPiece[25]=new Roi (8,'E','b');
		tabPiece[26]=new Reine(1,'D','n');
		tabPiece[27]=new Reine(8,'D','b');

		tabPiece[28]=new Fou (1,'C','n');
		tabPiece[29]=new Fou (1,'F','n');
		tabPiece[30]=new Fou (8,'F','b');
		tabPiece[31]=new Fou (8,'C','b');
	
		while (fin && finF(tabPiece))
		{
			System.out.print(toString(tabPiece));

			if (tour)
				System.out.println("Tour : blanc");
			else
				System.out.println("Tour : noir");

			System.out.println("entrez le depart");
			rep1=Clavier.lireString();
			
			if (!(rep1.equals("fin")))
			{
				System.out.println("entrez l'arrivé");
				rep2=Clavier.lireString();
			}
			

			if (rep1.equals("fin"))
				fin=false;
			else 
				for(int i=0; i<tabPiece.length; i++)
				{
					if (rep1.charAt(0)==tabPiece[i].getCol() && Integer.parseInt(rep1.substring(1))==tabPiece[i].getLig())
					{
						if (tour && tabPiece[i].getCoul()=='b' || !tour && tabPiece[i].getCoul()=='n')
						{
							if(tabPiece[i].deplacer(tabPiece[i].getLig(), tabPiece[i].getCol(), Integer.parseInt(rep2.substring(1)), rep2.charAt(0), tabPiece))
								tour= !tour;
						}
						else
							System.out.println("Ce n'est pas a votre tour");
					}
				}
		}
	}

	public static String toString(Piece[] tab)
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

	public static boolean finF(Piece[] tabPiece)
	{
		for (int i=0; i<tabPiece.length; i++)
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