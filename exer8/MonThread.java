package exer8;

class MonThread extends Thread {
private MonObjet Obj ;
private int a ;
public MonThread ( MonObjet o , int x ) {
Obj = o ;
a = x ;
}
public void run () {
Obj . action ( a );
}
}
