package fr.ase.cow.socket;

import java.net.Socket;

/**
 * Permet de gérer la communication avec un server via java.net.Socket
 *
 * @author Axel Senzel
 * @version 1.0.0
 * @since 02/09/2015
 */
public class SocketManager {

    /**
     * Attribut qui contient la connexion au socket
     */
    private Socket socket;

    /**
     * Constructeur par default
     */
    public SocketManager() {
    }

    /**
     * Permet d'initiliser la connection avec le serveur
     *
     * @param host: Chaine contenant l'hôte du serveur
     * @param port: Port à écouter
     */
    public void connectToServer(String host, int port) {
    }


    /**
     * Ferme la connexion avec le serveur
     */
    public void disconnectFromServer() {
    }


    /**
     * Permet de savoir si la connexion est socket est bien effective
     *
     * @return boolean
     */
    public boolean isConnectedToServer() {
        return this.socket.isConnected();
    }
}
