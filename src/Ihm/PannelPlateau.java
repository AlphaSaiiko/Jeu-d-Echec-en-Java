import javax.swing.*;
import java.awt.*;


public class PannelPlateau
{
	private JFrame frame;
	private PiecePanel piecePanel;
	private JPanel boardPanel;
	private JButton[][] boardSquares;

	public PannelPlateau()
	{
		frame = new JFrame("Chess Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800); // Set the size of the frame

		// Create the PiecePanel
		piecePanel = new PiecePanel();
		frame.add(piecePanel, BorderLayout.CENTER);

		boardPanel = new JPanel(new GridLayout(8, 8));
		frame.add(boardPanel, BorderLayout.CENTER);

		Color colorBlack = Color.BLACK;
		Color colorWhite = Color.WHITE;
		boardSquares = new JButton[8][8];

		String[] pieces = { "R", "N", "B", "Q", "K", "B", "N", "R" }; // Letters
																		// representing
																		// the
																		// pieces

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
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

				if (i == 0)
				{
					boardSquares[i][j].setText(pieces[j]);
				}
				else if (i == 1)
				{
					boardSquares[i][j].setText("P");
				}
				else if (i == 6)
				{
					boardSquares[i][j].setText("p");
				}
				else if (i == 7)
				{
					boardSquares[i][j].setText(pieces[j].toLowerCase());
				}
			}
		}

		frame.setVisible(true);
	}
	public static void main (String[] args)
	{
		new PannelPlateau();
	}
}