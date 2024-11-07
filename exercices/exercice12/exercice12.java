public class exercice12 {
    public static void main(String[] args) {
        String maChaineDeCaractere;

        maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : " + maChaineDeCaractere.length());


        int positionContenu = maChaineDeCaractere.indexOf("contenu");
        System.out.println("Le mot \"contenu\" commence à la position : " + positionContenu);

        char lettrePosition10 = maChaineDeCaractere.charAt(10);
        System.out.println("La position 10 contient la lettre : " + lettrePosition10);
        String monPrenom;
        monPrenom = "Melvin";
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }
        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère \"Melvin\" contient le texte \"test\".");
        } else {
            System.out.println("La chaîne de caractère \"Melvin\" ne contient pas le texte \"test\".");
        }
    }
}