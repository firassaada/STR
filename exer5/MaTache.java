package exer5;

class MaTache implements Runnable {

private Solde sld ;
public MaTache ( Solde s ) { sld = s ; }
public void run () { sld . incrementer (); }
public static void main ( String [] args ) {
Solde s = new Solde ( );
Thread t1 = new Thread ( new MaTache ( s ));
Thread t2 = new Thread ( new MaTache ( s ));
t1 . setName ( " t1 " );
t2 . setName ( " t2 " );
t1 . start ();
t2 . start ();
}
}