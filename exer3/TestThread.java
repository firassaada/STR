package exer3;

class TestThread {
public static void main ( String [] args ) {
// Declare trois threads
Thread t1 ;
Thread t2 ;
Thread t3 ;
// ====== METHODE 1 : en heritant de la class Thread ========
System . out . println ( " -------- Avec la methode 1 -------" );
// Cree trois thread suivant le modele defini dans MonThread .
// Leur comportement est celui du run de la class MonThread .
t1 = new MonThread ();
t2 = new MonThread ();
t3 = new MonThread ();
// Donne un nom a chaque thread
t1 . setName ( " Tom " );
t2 . setName ( " Pierre " );
t3 . setName ( " Lucie " );
// Lance les threads
t1 . start ();
t2 . start ();
t3 . start ();
try {
// le thread main attend la fin d ' execution des threads t1 et t2
t1 . join ();
t2 . join ();
t3 . join ();
}
catch ( InterruptedException e ) { return ;};
System . out . println ();
System . out . println ();

// ===== METHODE 2 : en implementant l ' interface Runnable =====
System . out . println ( " -------- Avec la methode 2 -------" );
// cree une tache a executer pour les threads
Tache job = new Tache ();
// Crée trois thread avec le comportement defini par l ' objet job
// Leur comportement est donc celui du run de la class Tache .
t1 = new Thread ( job );
t2 = new Thread ( job );
t3 = new Thread ( job );
// Donne un nom a chaque thread
t1 . setName ( " Jerry " );
t2 . setName ( " Luc " );
t3 . setName ( " Namie " );
// Lance les threads
t1 . start ();
t2 . start ();
t3 . start ();
try {
// le thread main attend la fin d ' execution des threads t1 et t2
t1 . join ();
t2 . join ();
t3 . join ();
}
catch ( InterruptedException e ) { return ;};
}
}