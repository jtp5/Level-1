int birdx = 254;
int birdy = 70;
double birdYVelocity = 0;
double gravity = 0.5;
void setup(){
  size(500, 500);
}
void draw(){
 birdYVelocity += gravity;
 birdy += birdYVelocity;
 background(255,255,255);
 fill(24,239,24);
 ellipse(birdx, birdy, 50, 50);
}