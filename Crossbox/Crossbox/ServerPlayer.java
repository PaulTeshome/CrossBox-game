package Crossbox;

public class ServerPlayer {
    int id;
    ClientHandler client;
    ClientHandler opponent;
    String name;
    String role;
    String matchUid;
    int won;
    int lost;
    public ServerPlayer(ClientHandler client, String name, String role) {
        this.client = client;
        this.name = name;
        this.role = role;
    }
}
