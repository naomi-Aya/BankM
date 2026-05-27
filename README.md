# BankManager

Projet Java de gestion bancaire utilisant l'héritage et la programmation orientée objet (POO).

## Description
Ce projet implémente un système simple de comptes bancaires :
- **BankAccount** : Classe parente contenant les attributs communs (solde, numéro de compte).
- **CheckingAccount** : Hérite de BankAccount avec une limite de découvert.
- **SavingsAccount** : Hérite de BankAccount avec un taux d'intérêt.
- **COD** : Hérite de BankAccount avec une durée de blocage.

## Structure du projet
- `BankAccount.java` : Classe de base.
- `CheckingAccount.java`, `SavingsAccount.java`, `COD.java` : Classes spécialisées.
- `BankManager.java` : Classe principale contenant la méthode `main`.

## Prérequis
- Java Development Kit (JDK) 8 ou supérieur installé.

## Installation et exécution
1. Clonez ce dépôt :
   `git clone https://github.com/votre-nom-utilisateur/BankManager.git`
2. Compilez les fichiers Java :
   `javac *.java`
3. Exécutez le programme :
   `java BankManager`

## Auteur
[Naomi]
