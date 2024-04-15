import javax.swing.*;
import java.awt.*;

public class ChessBoard
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Chess Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800); // Set the size of the frame

		JPanel boardPanel = new JPanel(new GridLayout(8, 8));
		frame.add(boardPanel, BorderLayout.CENTER);

		Color colorBlack = Color.BLACK;
		Color colorWhite = Color.WHITE;
		JButton[][] boardSquares = new JButton[8][8];

		String[] pieces = { "R", "N", "B", "Q", "K", "B", "N", "R" }; // Letters
																		// representing
																		// the
																		// pieces
																		
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				JButton button = new JButton();
				button.setPreferredSize(new Dimension(100, 100)); // Set the
																	// size of
																	// the
																	// button
				if ((i + j) % 2 == 0)
				{
					button.setBackground(colorWhite);
				}
				else
				{
					button.setBackground(colorBlack);
				}
				if (i == 0)
				{
					button.setText(pieces[j]); // Set the text of the button to
												// the corresponding piece
				}
				else if (i == 1)
				{
					button.setText("P"); // Set the text of the button to "P"
											// for pawns
				}
				else if (i == 6)
				{
					button.setText("P"); // Set the text of the button to "P"
											// for pawns
				}
				else if (i == 7)
				{
					button.setText(pieces[j]); // Set the text of the button to
												// the corresponding piece
				}
				boardSquares[i][j] = button;
				boardPanel.add(button);
			}
		}

		frame.setVisible(true);
	}
}