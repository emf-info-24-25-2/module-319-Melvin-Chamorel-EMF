package devoirs.devoir04;

public class devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 10;
        int day = 3;
        System.out.println("date entrée est le " + day + "." + month + "." + year);
        if (year > 9999 || year < 0) {
            System.out.println("L'année [" + year + "] est hors limites ");
        } else {
            if (month > 12 || month < 1) {
                System.out.println("le mois [" + month + "] est hors limites !");
            } else {

                
            switch (month) {
                case 1:
                if (day > 31 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " janvier " + year);
                }
                break;
                case 2:
                    //RIF: et les années bissextiles? :-)
                if (day > 28 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " février " + year);
                }
                break;
                case 3:
                if (day > 31 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " mars " + year);
                }
                break;
                case 4:
                if (day > 30 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " avril " + year);
                }
                break;
                case 5:
                if (day > 31 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " mai " + year);
                }
                break;
                case 6:
                if (day > 30 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " juin " + year);
                }
                break;
                case 7:
                if (day > 31 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " juillet " + year);
                }
                break;
                case 8:
                if (day > 31 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " août " + year);
                }
                break;
                case 9:
                if (day > 30 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " septembre " + year);
                }
                break;
                case 10:
                if (day > 30 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " octobre " + year);
                }
                break;
                case 11:
                if (day > 31 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " novembre " + year);
                }
                break;  
                case 12:
                if (day > 31 || day < 0) {
                    System.out.println("le jour [" + day +"] est hors limites !");
                } else {
                    System.out.println("La date formatée est le " + day + " décembre " + year);
                }
                break;        
            
                default:
                System.out.print("ERROR");
                    break;
            }
            // RIF: pourquoi ce print?
            System.out.println(" " + year);
    
            }
            
        }
        
    }
}
