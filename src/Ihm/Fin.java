package src.Ihm;

import src.Metier.*;
import src.Ihm.ChessBoard;
import src.Controleur;

import javax.swing.*;
import java.awt.*;

public class Fin extends JFrame
{
	private JPanel panelFin;
	private Controleur ctrl;

	public Fin(Controleur ctrl)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);

		this.ctrl=ctrl;

		this.panelFin = new JPanel();

		if (this.ctrl.getCouleurJ().equals(this.ctrl.metier().finF()))
			this.panelFin.add(new JLabel ("Vous avez gagné"));
		else 
			this.panelFin.add(new JLabel ("Vous avez perdu"));
		
		this.add(this.panelFin);

		this.setVisible(true);
	}
}