import java.util.Random;
int frogx = 200;
int frogy = 375;
int hopdistance = 25;
Random r = new Random();
car a = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car b = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car c = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car d = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car e = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car f = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car g = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car h = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car j = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
car k = new car(r.nextInt(400), r.nextInt(400), r.nextInt(100), r.nextInt(100), r.nextInt(10));
void setup(){
size(400, 400);
}

void draw(){
background(100,100,100);
fill(0,255,0);
ellipse(frogx, frogy, 50, 50);
a.display();
b.display();
c.display();
d.display();
e.display();
f.display();
g.display();
h.display();
j.display();
k.display();
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
}

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP && frogy >= 50)
      {
      frogy -= hopdistance;
      }
      else if(keyCode == DOWN && frogy <= 350)
      {
        frogy += hopdistance;
      }
      else if(keyCode == RIGHT && frogx <= 350)
      {
       frogx += hopdistance;
      }
      else if(keyCode == LEFT && frogx >= 50)
      {
        frogx -= hopdistance;
      }
   }
}

class car{
  int carx;
  int cary;
  int carwidth;
  int carheight;
  int carspeed;
  car(int carx, int cary, int carwidth, int carheight, int carspeed){
    this.carx = carx;
    this.cary = cary;
    this.carwidth = carwidth;
    this.carheight = carheight;
    this.carspeed = carspeed;
  }
  void display() 
  {
    fill(0,255,0);
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
}