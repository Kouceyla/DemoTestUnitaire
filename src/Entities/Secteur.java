package Entities;

import java.util.ArrayList;

public class Secteur {
    private int idSecteur;
    private String nomSecteur;
    private ArrayList<Liaison> lesLiaisons;

    public Secteur(int idSecteur, String nomSecteur) {
        this.idSecteur = idSecteur;
        this.nomSecteur = nomSecteur;
        lesLiaisons = new ArrayList<>(); // l'instancier nous meme
    }

    public int getIdSecteur() {
        return idSecteur;
    }

    public String getNomSecteur() {
        return nomSecteur;
    }

    public ArrayList<Liaison> getLesLiaisons() {
        return lesLiaisons;
    }

    public void AjouterLiaison(Liaison uneLiaison){
        lesLiaisons.add(uneLiaison);
    }
    public ArrayList<Liaison> lesLiaisonsDunPortDeDepart(Port portDepart){
        ArrayList<Liaison> desLiaisons = new ArrayList<>();
        for(Liaison uneLiaison : lesLiaisons)
        {
            if(uneLiaison.getPortDepart().getIdPort() == portDepart.getIdPort())
            {
                desLiaisons.add(uneLiaison);
            }
        }
        return desLiaisons;
    }

    public ArrayList<Liaison> lesLiaisonsDunPortDeDepartEtDuneDate(Port portDepart,String uneDate)
    {
        ArrayList<Liaison> desLiaison = new ArrayList<>();
      for (Liaison uneLiaison : lesLiaisons)
      {
          if (uneLiaison.getPortDepart().getIdPort() == portDepart.getIdPort() && uneLiaison.getDateLiaison().compareTo( uneDate) == 0)
          //if (uneLiaison.getPortDepart().getIdPort() == portDepart.getIdPort() && uneLiaison.getDateLiaison().equals(uneDate))
          {
              desLiaison.add(uneLiaison);
          }
      }
        return desLiaison;
    }

    public String ObtenirHeureDuneLiaison(Liaison uneLiaison)
    {
        String heure ="";

        for (Liaison liaison : lesLiaisons)
        {
            if (liaison.getHeureLiaison().equals(uneLiaison.getHeureLiaison()))
            {
                heure = liaison.getHeureLiaison();
            }
        }

        return heure;
    }

}