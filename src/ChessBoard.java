import javax.swing.*;
import java.awt.*;

public class ChessBoard
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Chess Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800); // Set the size of the frame
		JPanel panel = new JPanel(new GridLayout(8, 8));
		frame.add(panel);
		Color colorBlack = Color.BLACK;
		Color colorWhite = Color.WHITE;
		JButton[][] boardSquares = new JButton[8][8];

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
				boardSquares[i][j] = button;
				panel.add(button);
			}
		}

		frame.setVisible(true);
	}
}