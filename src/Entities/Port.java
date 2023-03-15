package Entities;

public class Port
{
    private int idPort;
    private String nomPort;

    public Port(int idPort, String nomPort) {
        this.idPort = idPort;
        this.nomPort = nomPort;
    }

    public int getIdPort() {
        return idPort;
    }

    public String getNomPort() {
        return nomPort;
    }
}