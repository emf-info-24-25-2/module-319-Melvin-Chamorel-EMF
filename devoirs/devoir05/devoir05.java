package devoirs.devoir05;

public class devoir05 {
import java.util.Random;

import java.util.Scanner;

    public static void main(String[] args) {

        // Génération d'un nombre aléatoire entre 1 et 100

        Random random = new Random();

        int nombreAleatoire = random.nextInt(100) + 1; // +1 pour obtenir un nombre entre 1 et 100

 

        // Initialisation des variables

        int nombreEssais = 0;

        boolean aDevine = false;

 

        // Création d'un scanner pour obtenir les entrées de l'utilisateur

        Scanner scanner = new Scanner(System.in);

 

        System.out.println("Devinez le nombre entre 1 et 100.");

 

        while (!aDevine) {

            System.out.print("Entrez votre proposition : ");

            int proposition = scanner.nextInt();

            nombreEssais++;

 

            if (proposition < nombreAleatoire) {

                System.out.println("Le nombre à deviner est plus grand.");

            } else if (proposition > nombreAleatoire) {

                System.out.println("Le nombre à deviner est plus petit.");

            } else {

                aDevine = true;

                System.out.println("Félicitations ! Vous avez deviné le nombre en " + nombreEssais + " essais.");

            }

        }

 

        // Fermeture du scanner

        scanner.close();

    }