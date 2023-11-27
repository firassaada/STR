package exer3;

class Tache implements Runnable {
public void run () {
for ( int i = 0; i < 10; i ++) {
// Le thread en cours d ' execution attend entre 0 et 200 ms
try {
Thread . currentThread (). sleep (( int ) Math . random ()*200);}
catch ( InterruptedException e ) { return ;}
// Puis ecrit son nom
System . out . println ( " Je suis " + Thread . currentThread (). getName ()
+ " et je m ' execute " );
}
}
}
