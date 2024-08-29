package exercices.exercice05;

public class ExerciceCondition2 {
    public static void main(String[] args) {
        String P = "a"; 
        int X = 21;
        if (X %2==1) {
            P = "impaire";
        }
        if (X %2==0) {
            P = "paire";
        }
        System.out.println("se chifre est " + P);
    }
}
