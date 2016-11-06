package animal;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Lion {
String color;
int teeth;
String lionname;
	public Lion(String color, String lionname, int teeth) {
	this.color = color;
	this.teeth = teeth;
	this.lionname = lionname;
}
	public Lion() {
		// TODO Auto-generated constructor stub
	}
public void roar(){
System.out.println("roar");
}

public void bite(){
System.out.println("bite");
}
public void loosetooth(){
teeth--;
System.out.println(lionname + " lost a tooth!");
System.out.println(lionname + " now has " + teeth + " teeth");
}
}
