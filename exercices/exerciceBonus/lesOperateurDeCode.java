package exercices.exerciceBonus;

public class lesOperateurDeCode {
        public static void main(String[] args) {
            String name = "David Andrade"; // Example name
            int fixedLength = 45; 
            String formattedString = String.format("|%-" + (fixedLength - 1) + "s|    /                                        |", name);
            
            System.out.println(formattedString);
        }
}