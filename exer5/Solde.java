package exer5;

class Solde extends Thread  {
private int solde = 0;
public Solde () { }
public synchronized void incrementer () {
int n = solde ;
try { Thread.sleep (200);}
catch ( InterruptedException e ) {}
solde = n + 1;
}
}