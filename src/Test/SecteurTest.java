package Test;

import Entities.Liaison;
import Entities.Port;
import Entities.Secteur;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SecteurTest {

    private Secteur unSecteur;
    private Liaison liaison1;
    private Liaison liaison2;
    private Liaison liaison3;
    private Port portDestination1;
    private Port portDepart1;
    private Port portDestination2;
    private Port portDepart2;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        unSecteur = new Secteur(1,"La Rochelle");
        portDepart1 =new Port(1,"Quibron");
        portDestination1 = new Port(1,"Le palais");
        liaison1 = new Liaison(1,"Liaison n°1","15/03/2023","9:30",portDestination1,portDepart1);

        portDestination2 = new Port(2,"Belle île en mer");
        portDepart2 = new Port(2,"Molène");
        liaison2 = new Liaison(2,"Liaison n°2","15/03/2023","14:45",portDestination2,portDepart2);

        liaison3 = new Liaison(1,"Liaison n°3","01/04/2023","7:00",portDestination1,portDepart1);
    }

    @org.junit.jupiter.api.Test
    void lesLiaisonsDunPortDeDepart()
    {

        unSecteur.AjouterLiaison(liaison1);
        unSecteur.AjouterLiaison(liaison2);
        unSecteur.AjouterLiaison(liaison3);

        ArrayList<Liaison> expected = unSecteur.lesLiaisonsDunPortDeDepart(portDepart1);


        ArrayList<Liaison> actual = new ArrayList<>();
        actual.add(liaison1);
        actual.add(liaison3);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void lesLiaisonsDunPortDeDepartEtDuneDate() {
    }

    @org.junit.jupiter.api.Test
    void obtenirHeureDuneLiaison()
    {
       unSecteur.AjouterLiaison(liaison1);
       unSecteur.AjouterLiaison(liaison2);
       unSecteur.AjouterLiaison(liaison3);

       String expected = unSecteur.ObtenirHeureDuneLiaison(liaison1);
       String actual = "9:30";
       assertEquals(expected,actual);

       expected = unSecteur.ObtenirHeureDuneLiaison(liaison2);
       actual = "14:45";
       assertEquals(expected,actual);

       expected = unSecteur.ObtenirHeureDuneLiaison(liaison3);
       actual = "7:00";
       assertEquals(expected,actual);
    }
}