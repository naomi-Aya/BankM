public class BankManager {
    public static void main(String[] args) {
        // Création des instances
        CheckingAccount monCourant = new CheckingAccount("FR76-1234", 1500.0, 500.0);
        SavingsAccount monEpargne = new SavingsAccount("FR76-5678", 5000.0, 0.03);
        COD monCOD = new COD("FR76-9012", 10000.0, 12);

        // Accès aux attributs (lecture et modification)
        System.out.println("Compte courant : " + monCourant.getAccount() + " | Solde : " + monCourant.getBalance());

        monCourant.setBalance(1600.0); // Modification du solde
        System.out.println("Nouveau solde courant : " + monCourant.getBalance());

        System.out.println("Compte épargne : " + monEpargne.getAccount());
        System.out.println("COD : " + monCOD.getAccount());
    }
}

