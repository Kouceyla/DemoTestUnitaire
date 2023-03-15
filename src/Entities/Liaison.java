

package Entities;

public class Liaison {
    private int idLiaison;
    private String nomLiaison;
    private String dateLiaison;
    private String heureLiaison;
    private Port portDestination;
    private Port portDepart;

    public Liaison(int idLiaison, String nomLiaison, String dateLiaison, String heureLiaison, Port portDestination, Port portDepart) {
        this.idLiaison = idLiaison;
        this.nomLiaison = nomLiaison;
        this.dateLiaison = dateLiaison;
        this.heureLiaison = heureLiaison;
        this.portDestination = portDestination;
        this.portDepart = portDepart;
    }

    public int getIdLiaison() {
        return idLiaison;
    }

    public String getNomLiaison() {
        return nomLiaison;
    }

    public String getDateLiaison() {
        return dateLiaison;
    }

    public String getHeureLiaison() {
        return heureLiaison;
    }

    public Port getPortDestination() {
        return portDestination;
    }

    public Port getPortDepart() {
        return portDepart;
    }
}