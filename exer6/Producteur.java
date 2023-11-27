package exer6;

class Producteur implements Runnable {
private BufferCirc buffer ;
int i=5 ;
private int val ;
public Producteur ( BufferCirc b ) {
buffer = b ;
}
public void run () {

while ( i>0 ) {
i-- ;
buffer . depose ( new Integer ( val ));
System . out . println ( Thread . currentThread (). getName () +
" a depose " + val );
val ++;
try {
Thread . sleep (( int )( Math . random ()*100));
}
catch ( InterruptedException e ) {}
}
}
} // fin classe Producteur