import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PiecePanel extends JPanel
{
	private JButton[][] boardSquares = new JButton[8][8];

	public PiecePanel()
	{
		super(new GridLayout(8, 8)); // Panel for the chess board

		// Add the chess pieces to the pieces panel
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				JButton button = new JButton();
				this.add(button);
				boardSquares[i][j] = button;

				// Add action listeners to the buttons
				final int x = i;
				final int y = j;
				button.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						System.out.println("Button at (" + x + ", " + y + ") clicked");
					}
				});
			}
		}
	}
}