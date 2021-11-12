package main;

import bank.Client;
import bank.Account;

public class Main
{
    public static void main(String[] args)
    {
        
        Account accountAna = new Account();
        Account accountCaio = new Account();

        Client clientAna = new Client();
        Client clientCaio = new Client();
        
        accountAna.deposit(1000);
        accountAna.withdraw(500, accountCaio);
        
        clientAna.setName("Ana");
        clientCaio.setName("Caio");
        
        System.out.println(clientCaio.getName() + ", seu saldo total é: " + accountCaio.getBalance());
        System.out.println(clientAna.getName() + ", seu saldo total é: " + accountAna.getBalance());
    }
}