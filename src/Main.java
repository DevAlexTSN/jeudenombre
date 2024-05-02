import java.util.Scanner;

public class Main {
    // Fonction pour vérifier si une chaîne est un entier
    public static boolean estEntier(String chaine) {
        try {
            Integer.parseInt(chaine);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Fonction pour afficher les informations sur le nombre
    public static void afficherInfos(int nombre) {
        // Vérification si le nombre est positif, négatif ou zéro
        if (nombre > 0) {
            System.out.println("Le nombre entré est positif.");
        } else if (nombre < 0) {
            System.out.println("Le nombre entré est négatif.");
        } else {
            System.out.println("Le nombre entré est égal à zéro.");
        }

        // Vérification si le nombre est pair ou impair
        if (nombre % 2 == 0) {
            System.out.println("Le nombre est pair.");
        } else {
            System.out.println("Le nombre est impair.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Entrez un nombre (ou 'exit' pour quitter) : ");
            input = scanner.nextLine();

            // Vérification si l'utilisateur veut quitter le programme
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Vérification si l'entrée est un entier
            if (!estEntier(input)) {
                System.out.println("Veuillez respecter la consigne : entrer un nombre entier ou 'exit'.");
                continue;
            }

            // Conversion de l'entrée en entier
            int nombre = Integer.parseInt(input);

            // Affichage des informations sur le nombre
            afficherInfos(nombre);

        } while (true);

        // Fermeture du scanner pour libérer les ressources
        scanner.close();
    }
}
