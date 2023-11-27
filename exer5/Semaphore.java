package exer5;

public class Semaphore {
int n ;
String name ;
public Semaphore ( int max , String S ) {
n = max ;
name = S ;
}
public synchronized void P () {
if ( n == 0) {
try { wait (); }
catch ( InterruptedException e ) {}
}
n -- ;
}
public synchronized void V () {
n ++;
notify ();
}
}