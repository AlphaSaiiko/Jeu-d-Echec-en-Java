import java.util.*;


public class Controleur
{
<<<<<<< HEAD
	//private   Plateau                   metier;         
	//private   PannelPlateau              PannelPlateau;   
	//private   HashMap<String,String>    hmImage;       
=======
	private   Plateau                    metier;         
	private   PannelPlateau              PannelPlateau;   
>>>>>>> 485c17b63bf5c5fcb8e94c78ec9be8ba29f62aa0

	public Controleur()
	{/* 
		metier            = new Plateau();
		framePlateau      = new PannelPlateau ( this );
<<<<<<< HEAD
		hmImage           = new HashMap<String,String>();*/

		//this.initHashMap();

	}
	/* 
	private   static String					chemin;

	public String getImage (String zone, int lig, int col)
	{
		String sImage = Controleur.chemin+"images/";

		if ( zone.equals ( "plateau" ) ) sImage += hmImage.get ( metier.getPiecePlateau ( lig, col ) );
		if ( zone.equals ( "pioche"  ) ) sImage += hmImage.get ( metier.getPioche       ( lig      ) );
		if ( zone.equals ( "enCours" ) ) sImage += hmImage.get ( metier.getPieceAJouer  (          ) );

		sImage += ".gif";

		return sImage;
	}

	

	public String getMessage()
	{
		return  metier.getNomJoueurEnCours() + " : " + metier.getMessage();
	}

	public void  bouton (int btn )
	{
		if ( btn >= 0  && btn <= 15 ) metier.piocher ( btn );
		if ( btn == 20              ) metier.quarto  ();

		framePlateau.majIHM();
	}

	public void cliquer (int lig, int col)
	{
		metier.placer ( lig, col);
		framePlateau.majIHM();
	}

	private void initHashMap()
	{
		hmImage.put ( "BlCrGdCa","bleu_creux_grand_carre" );
		hmImage.put ( "BlCrGdRd","bleu_creux_grand_rond"  );
		hmImage.put ( "BlCrPtCa","bleu_creux_petit_carre" );
		hmImage.put ( "BlCrPtRd","bleu_creux_petit_rond"  );
		hmImage.put ( "BlPlGdCa","bleu_plein_grand_carre" );
		hmImage.put ( "BlPlGdRd","bleu_plein_grand_rond"  );
		hmImage.put ( "BlPlPtCa","bleu_plein_petit_carre" );
		hmImage.put ( "BlPlPtRd","bleu_plein_petit_rond"  );
		hmImage.put ( "RgCrGdCa","rouge_creux_grand_carre");
		hmImage.put ( "RgCrGdRd","rouge_creux_grand_rond" );
		hmImage.put ( "RgCrPtCa","rouge_creux_petit_carre");
		hmImage.put ( "RgCrPtRd","rouge_creux_petit_rond" );
		hmImage.put ( "RgPlGdCa","rouge_plein_grand_carre");
		hmImage.put ( "RgPlGdRd","rouge_plein_grand_rond" );
		hmImage.put ( "RgPlPtCa","rouge_plein_petit_carre");
		hmImage.put ( "RgPlPtRd","rouge_plein_petit_rond" );
		hmImage.put ( null,      "vide"                   );

	}
=======
	}

	public Piece[] getTabPiece(){return this.metier.getPieces();}
>>>>>>> 485c17b63bf5c5fcb8e94c78ec9be8ba29f62aa0

	public boolean deplacer(int ligD, char colD,int ligF,char colF){return this.metier.deplacer(ligD,colD,ligF,colF);}

	public static void main(String[] arg)
	{
		new Controleur();
	}
	*/

}
