package devoirs.devoir03;
 
public class devoir03 {
    public static void main(String[] args) {
       
   
    int jour = 15;  
        int mois = 9;  
        int annee = 2023;
 
       
        if (annee >= 0 && annee <= 9999) {
           
            if (mois >= 1 && mois <= 12) {
               
                int joursDansMois;
                switch (mois) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        joursDansMois = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        joursDansMois = 30;
                        break;
                    case 2:
                        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                            joursDansMois = 29;
                        } else {
                            joursDansMois = 28;
                        }
                        break;
                    default:
                        joursDansMois = -1;
                }
 
                if (jour >= 1 && jour <= joursDansMois) {
                   
                    int numeroJourAnnee = jour;
                    for (int i = 1; i < mois; i++) {
                        switch (i) {
                            case 1:
                            case 3:
                            case 5:
                            case 7:
                            case 8:
                            case 10:
                            case 12:
                                numeroJourAnnee += 31;
                                break;
                            case 4:
                            case 6:
                            case 9:
                            case 11:
                                numeroJourAnnee += 30;
                                break;
                            case 2:
                                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                                    numeroJourAnnee += 29;
                                    numeroJourAnnee += 28;
                                }
                                break;
                        }
                    }
                }
                   
                    System.out.println("Nous sommes le jour N°" + numeroJourAnnee + " de l'année " + annee + ".");
            
    }

}
    }
}