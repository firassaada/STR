package exer6;

class Principal {
public static void main ( String [] args ) {
BufferCirc b = new BufferCirc (20);
Producteur p = new Producteur ( b );
Consommateur c = new Consommateur ( b );
Thread P1 = new Thread ( p );
P1 . setName ( " P1 " );
Thread C1 = new Thread ( c );
C1 . setName ( " C1 " );
P1 . start ();
C1 . start ();
}
}
