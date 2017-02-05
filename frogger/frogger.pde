import java.util.Random;
 boolean intersects(Car car){
   if((frogy>car.getY()&&frogy<car.getY()+26) && (frogx>car.getX() && frogx<car.getX()+car.getSize()))
     return true;
   else
   return false;
  }
int frogx = 200;
int frogy = 324;
int hopdistance = 24;
Random r = new Random();
int rand = (int) random(1, 10);
Car a = new Car(r.nextInt(400), 48, r.nextInt(100), 24, (int) random(1, 10));
Car b = new Car(r.nextInt(400), 72, r.nextInt(100), 24, (int) random(1, 10));
Car c = new Car(r.nextInt(400), 96, r.nextInt(100), 24, (int) random(1, 10));
Car d = new Car(r.nextInt(400), 120, r.nextInt(100), 24, (int) random(1, 10));
Car e = new Car(r.nextInt(400), 144, r.nextInt(100), 24, (int) random(1, 10));
Car f = new Car(r.nextInt(400), 168, r.nextInt(100), 24, (int) random(1, 10));
Car g = new Car(r.nextInt(400), 192, r.nextInt(100), 24, (int) random(1, 10));
Car h = new Car(r.nextInt(400), 216, r.nextInt(100), 24, (int) random(1, 10));
Car j = new Car(r.nextInt(400), 240, r.nextInt(100), 24, (int) random(1, 10));
Car k = new Car(r.nextInt(400), 264, r.nextInt(100), 24, (int) random(1, 10));
void setup(){
size(400, 400);
}

void draw(){
background(100,100,100);
fill(0,255,0);
ellipse(frogx, frogy, 24, 24);
a.display();
if(intersects(a)){
 frogx = 200;
 frogy = 324;
}
b.display();
if(intersects(b)){
 frogx = 200;
 frogy = 324;
}
c.display();
if(intersects(c)){
 frogx = 200;
 frogy = 324;
}
d.display();
if(intersects(d)){
 frogx = 200;
 frogy = 324;
}
e.display();
if(intersects(e)){
 frogx = 200;
 frogy = 324;
}
f.display();
if(intersects(f)){
 frogx = 200;
 frogy = 324;
}
g.display();
if(intersects(g)){
 frogx = 200;
 frogy = 324;
}
h.display();
if(intersects(h)){
 frogx = 200;
 frogy = 324;
}
j.display();
if(intersects(j)){
 frogx = 200;
 frogy = 324;
}
k.display();
if(intersects(k)){
 frogx = 200;
 frogy = 324;
}
a.moveleft();
b.moveright();
c.moveleft();
d.moveright();
e.moveleft();
f.moveright();
g.moveleft();
h.moveright();
j.moveleft();
k.moveright();
fill(255, 255, 255);
if(frogy < 24){
 text("You Win!!!", 85, 200);
 textSize(50);
}
}

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP && frogy >= 20)
      {
      frogy -= hopdistance;
      }
      else if(keyCode == DOWN && frogy <= 380)
      {
        frogy += hopdistance;
      }
      else if(keyCode == RIGHT && frogx <= 380)
      {
       frogx += hopdistance;
      }
      else if(keyCode == LEFT && frogx >= 20)
      {
        frogx -= hopdistance;
      }
   }
}

class Car{
  int carx;
  int cary;
  int carwidth;
  int carheight;
  int carspeed;
  Car(int carx, int cary, int carwidth, int carheight, int carspeed){
    this.carx = carx;
    this.cary = cary;
    this.carwidth = carwidth;
    this.carheight = carheight;
    this.carspeed = carspeed;
  }
  void display() 
  {
    fill(150,85,90);
    rect(carx, cary, carwidth, carheight, 50);
  }
  void moveleft(){
   carx += carspeed;
   if(carx >= 400){
   carx = 0;
   }
  }
  void moveright(){
  carx -= carspeed;
  if(carx <= 0){
  carx = 400;
  }
  }
  int getX(){
    return carx;
  }
  int getY(){
   return cary; 
  }
  int getSize(){
   return  carwidth;
  }
 
}