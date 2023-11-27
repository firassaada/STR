package exer8;

class Principale {
public static void main ( String [] args ) {
MonObjet o1 = new MonObjet ( " o1 " , 1);
MonObjet o2 = new MonObjet ( " o2 " , 2);
MonThread t1 = new MonThread ( o1 , 3);
MonThread t2 = new MonThread ( o2 , 5);
t1 . setName ( " t1 " );
t2 . setName ( " t2 " );
t1 . start ();
t2 . start ();
}
} // fin classe Principale