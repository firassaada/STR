package exer6;

class BufferCirc {
private Object [] tampon ;
private int taille ;
private int prem , der , nbObj ;
public BufferCirc ( int t ) {
taille = t ;
tampon = new Object [ taille ];
prem = 0;
der = 0;
nbObj = 0;
}
public synchronized void depose ( Object o ) {
while ( nbObj == taille ) {
try { wait ();}
catch ( InterruptedException e ) {}
}
tampon [ der ] = o ;
der = ( der + 1) % taille ;
nbObj = nbObj + 1;
notify ();
}
public synchronized Object preleve () {
while ( nbObj == 0) {
try { wait ();}
catch ( InterruptedException e ) {}
}
Object o = tampon [ prem ];
tampon [ prem ] = null ;
prem = ( prem + 1) % taille ;
nbObj = nbObj - 1;
notify ();
return ( o );
}
} // fin class BufferCirc