// Compte courant
class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }
}

// Compte épargne
class SavingsAccount extends BankAccount {
    private double interestRate; // Exemple d'attribut pour épargne

    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance);
        this.interestRate = interestRate;
    }
}

// Certificat de dépôt
class COD extends BankAccount {
    private int duration; // Durée du certificat

    public COD(String account, double balance, int duration) {
        super(account, balance);
        this.duration = duration;
    }
}

