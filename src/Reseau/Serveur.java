import java.io.*;
import java.net.*;

public class Serveur 
{
    public static void main(String[] args) 
    {
        ServerSocket serverSocket = null;

        try 
        {
            // Creation du socket serveur
            serverSocket = new ServerSocket(12345);
            System.out.println("Attente des joueurs...");

            // Attente de la connexion du joueur 1
            Socket player1Socket = serverSocket.accept();
            System.out.println("Joueur 1 connecté.");

            // Attente de la connexion du joueur 2
            Socket player2Socket = serverSocket.accept();
            System.out.println("Joueur 2 connecté.");

            // Creation des flux de communication

            // Joueur 1 reçu
            BufferedReader player1Input = new BufferedReader(new InputStreamReader(player1Socket.getInputStream()));
            // Joueur 1 envoi
            PrintWriter player1Output = new PrintWriter(player1Socket.getOutputStream(), true);

            
            // Joueur 2 reçu
            BufferedReader player2Input = new BufferedReader(new InputStreamReader(player2Socket.getInputStream()));
            // Joueur 2 envoi
            PrintWriter player2Output = new PrintWriter(player2Socket.getOutputStream(), true);

            // Boucle principale pour la communication
            while (true) 
            {
                // Attente du mouvement du joueur 1
                String player1Move = player1Input.readLine();
                System.out.println("Joueur 1 a joue : " + player1Move);

                // Envoi du mouvement du joueur 1 au joueur 2
                player2Output.println(player1Move);

                // Attente du mouvement du joueur 2
                String player2Move = player2Input.readLine();
                System.out.println("Joueur 2 a joue : " + player2Move);

                // Envoi du mouvement du joueur 2 au joueur 1
                player1Output.println(player2Move);
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                // Fermeture des sockets et du socket serveur
                if (serverSocket != null) serverSocket.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
}
