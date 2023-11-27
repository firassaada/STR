package exer8;

class MonObjet {
static private int i ;
private String name ;
public MonObjet ( String n , int x ) {
i = x ;
name = n ;
}
public void action ( int x ) {
System . out . println ( Thread . currentThread (). getName ()
+ " au porte de " + name  );
ajoute (x , name );
System . out . println ( Thread . currentThread (). getName ()
+ " est sorti de " + name );
}
public static synchronized void ajoute ( int x , String n ) {
System . out . println ( Thread . currentThread (). getName ()
+ " entre dans " + n );
try {
System . out . println ( Thread . currentThread (). getName ()
+ " attend " );
Thread . currentThread (). sleep (200);
}
catch ( InterruptedException ex ) { return ; }
System . out . println ( Thread . currentThread (). getName ()
+ " ajoute dans " + n );
System . out . println ( " i = " + i );
i = i + x ;
System . out . println ( " : i = " + i );
System . out . println ( Thread . currentThread (). getName ()
+ " sort de " + n );
}
} // fin classe