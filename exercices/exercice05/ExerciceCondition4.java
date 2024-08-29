package exercices.exercice05;

public class ExerciceCondition4 {
    public static void main(String[] args) {
        int temps = 1;
    String P = "a";
    if ((temps>=-10)&&(temps<0)) {
        P = "il fait froid";
    }
    if ((temps>=0)&&(temps<25)) {
        P = "il fait normal";
    }
    if ((temps>=25)&&(temps<35)) {
        P = "il fait chaud";
    }
    if (temps>=35) {
        P = "il fait très chaud";
    }
    if (temps<=-10) {
        P = "il fait très froid";
    }
    System.out.println(P);
    }
}
