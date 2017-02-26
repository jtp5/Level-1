
public class Minion {
private String name;
private int eyes;
private String color;
private String master;
public Minion(String name, int eyes, String color, String master){
	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
}
String getName(){
	return name;
}
void setName(String x){
	name = x;
}
int getEyes(){
	return eyes;
}
void setEyes(int x){
	eyes = x;
}
String getColor(){
	return color;
}
void setColor(String x){
	color = x;
}
String getMaster(){
	return master;
}
void setMaster(String x){
	master = x;
}
}
