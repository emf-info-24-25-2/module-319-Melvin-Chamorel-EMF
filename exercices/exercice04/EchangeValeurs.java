package exercices.exercice04;

public class EchangeValeurs {
    public static void main(String[] args) {
        int variable1 = 1;
        System.out.println("Le contenu de la variable1 est :" + variable1);
        int variable2 = 2;
        System.out.println("Le contenu de la variable2 est :" + variable2);
        int varialbeswap;
        

        varialbeswap = variable1;
        variable1 = variable2;
        variable2 = varialbeswap;
        System.out.println(".... Traitement ....");

        System.out.println("Le contenu de la variable1 est :" + variable1);
        System.out.println("Le contenu de la variable2 est :" + variable2);
    }
}
