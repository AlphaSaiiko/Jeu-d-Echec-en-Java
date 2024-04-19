package src.Metier;

public class Piece
{
	private int		lig	;
	private char 	col	;
	private char	coul;
	private String	type;

	public Piece (int lig, char col, char coul, String type)
	{
		this.lig=lig;
		this.col=col;
		this.coul=coul;
		this.type=type;
	}

	public int 	getLig() {return this.lig	;}
	public char getCol() {return this.col	;}
	public char getCoul(){return this.coul	;}
	public String getType(){return this.type;}

	public void setPosition(int lig, char col)
	{
		this.lig=lig;
		this.col=col;
	}

	

	public boolean manger (Piece p1, Piece p2)
	{
		if (p1.getType()=="Pion")
		{
			if (p1.getCoul()=='b')
			{
				if (p2.getLig()==p1.getLig()-1 && Math.abs((int)p1.getCol()-(int)p2.getCol())==1)
				{
					p1.setPosition(p2.getLig(), p2.getCol());
					p2.setPosition(10,'Z');
					return true;
				}
			}
			else
				if (p2.getLig()==p1.getLig()+1 && Math.abs((int)p1.getCol()-(int)p2.getCol())==1)
				{
					p1.setPosition(p2.getLig(), p2.getCol());
					p2.setPosition(10,'Z');
					return true;
				}
		}
		else
			if (p1.getCoul() != p2.getCoul() )
			{
				p1.setPosition(p2.getLig(), p2.getCol());
				p2.setPosition(10,'Z');
				return true;
			}
		return false;
	}

	public boolean roquer(Piece p1, Piece p2, Piece[] tab)
	{
		if (!(p2.getType().equals("Roi") || p2.getType().equals("Tour"))){return false;}
		if (p1.getCoul()!=p2.getCoul()){return false;}

		if (p1.getRoque() && p2.getRoque())
		{
			if (p1.getType().equals("Tour"))
			{
				if (p1.getCol()=='A')
				{
					for (int i=0; i<4; i++)
						for (int j=0; j<tab.length; j++)
							if (tab[j].getCol()==(char)((int)'A'+i) && tab[j].getLig()==p1.getLig() && tab[j]!=p1 && tab[j]!=p2)
							{
								System.out.println("ca march pas");
								return false ;
								
							}
								

					p1.setPosition(p1.getLig(), 'D');
					p2.setPosition(p2.getLig(), 'C');
					return true;
				}
				if (p1.getCol()=='H')
				{
					for (int i=0; i<3; i++)
						for (int j=0; j<tab.length; j++)
							if (tab[j].getCol()==(char)((int)'H'-i) && tab[j].getLig()==p1.getLig() && tab[j]!=p1 && tab[j]!=p2)
								return false ;
					
					p1.setPosition(p1.getLig(), 'G');
					p2.setPosition(p2.getLig(), 'F');
					return true;
				}
			}
			if (p1.getType().equals("Roi"))
			{
				if (p2.getCol()=='A')
				{
					for (int i=0; i<4; i++)
						for (int j=0; j<tab.length; j++)
							if (tab[j].getCol()==(char)((int)'A'+i) && tab[j].getLig()==p1.getLig() && tab[j]!=p1 && tab[j]!=p2)
								return false ;

					p1.setPosition(p1.getLig(), 'C');
					p2.setPosition(p2.getLig(), 'D');
					return true;
				}
				if (p2.getCol()=='H')
				{
					for (int i=0; i<4; i++)
						for (int j=0; j<tab.length; j++)
							if (tab[j].getCol()==(char)((int)'H'-i) && tab[j].getLig()==p1.getLig() && tab[j]!=p1 && tab[j]!=p2)
								return false ;

					p1.setPosition(p1.getLig(), 'G');
					p2.setPosition(p2.getLig(), 'F');
					return true;
				}
			}
		}
		return false;
	}

	public boolean getRoque (){return false;}
	public boolean deplacer(int ligD, char colD,int ligF,char colF, Piece[] tab){return true;}

}