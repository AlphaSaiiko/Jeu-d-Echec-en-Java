Package Ihm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessBoard extends JFrame implements ActionListener
{
	private PiecePanel piecePanel;
	private JPanel boardPanel;
	private JButton[][] boardSquares;
	private Controleur ctrl;

	public ChessBoard(Controler ctrl)
	{
		//this.ctrl=  ctrl;

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800); // Set the size of the frame

		// Create the PiecePanel
		//piecePanel = new PiecePanel();
		//frame.add(piecePanel, BorderLayout.CENTER);

		boardPanel = new JPanel(new GridLayout(8, 8));
		this.add(boardPanel, BorderLayout.CENTER);

		Color colorBlack = new Color(240,195,128);
		Color colorWhite = new Color(109,62,23);
		this.boardSquares = new JButton[8][8];

		

		String[] pieces = {"To", "Ca", "Fo", "Re", "Ro", "Fo", "Ca", "To"}; // Letters
																		// representing
																		// the
																		// pieces

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				String sImage = "./images/";
				boardSquares[i][j] = new JButton();
				boardPanel.add(boardSquares[i][j]);

				if ((i + j) % 2 == 0)
				{
					boardSquares[i][j].setBackground(colorWhite);
				}
				else
				{
					boardSquares[i][j].setBackground(colorBlack);
				}
				
				switch (i) {
					case 0 -> {boardSquares[i][j].setIcon(new ImageIcon(sImage + pieces[j] + "B.png"));}
					case 1 -> {boardSquares[i][j].setIcon(new ImageIcon(sImage + "PiB.png"));}
					case 6 -> {boardSquares[i][j].setIcon(new ImageIcon(sImage + "PiN.png"));}
					case 7 -> {boardSquares[i][j].setIcon(new ImageIcon(sImage + pieces[j] +"N.png"));}
				}
				System.out.println(sImage);
			}
		}

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		for (int i = 0; i < this.boardSquares.length; i++) {
			for (int j = 0; j < this.boardSquares.length; j++) {
				if (e.getSource() == this.boardSquares[i][j])
				{
					JButton b = this.boardSquares[i][j];
					System.out.println( (this.boardSquares.length-i ) + " : " + (char)('A' + j));
				}
			}
		}
	}

	public void IhmMaj()
	{
		for (int i = 0; i < this.boardSquares.length; i++)
		{
			for (int j = 0; j < this.boardSquares.length; j++)
			{
				JButton button = this.boardSquares[i][j];

				// Mettez à jour le bouton ici. Par exemple, vous pouvez changer
				// le texte du bouton :
				button.setText("New text");

				// Ou vous pouvez changer l'image du bouton :
				ImageIcon icon = new ImageIcon("path/to/your/new/image.png");
				button.setIcon(icon);
			}
		}

		// Redessine le panneau pour refléter les changements
		this.repaint();
	}
	
	public static void main (String[] args)
	{
		new ChessBoard();
	}
}