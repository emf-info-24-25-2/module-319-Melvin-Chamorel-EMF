package exercices.exercice06;

public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age = 8 ;
        if (age == 7) {
            System.out.println("tu es Poussin");
        } else {
            if (age == 8 || age == 9) {
                System.out.println("tu es Pupille");
            } else {
                if (age == 10 || age == 11) {
                    System.out.println("tu es Minime");
                } else {
                    System.out.println("tu es Inconnu");
                }
            }
        }
        
    }
}
