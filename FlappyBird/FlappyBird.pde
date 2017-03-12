int birdx = 254;
int birdy = 70;
double birdYVelocity = 0;
double gravity = 0.5;
int pipex = 500;
int pipey = 244;
int score = 0;
void setup(){
  size(500, 500);
}
void draw(){
 birdYVelocity += gravity;
 birdy += birdYVelocity;
 background(255,255,255);
 fill(24,239,24);
 ellipse(birdx, birdy, 20, 20);
 fill(32,123,246);
 rect(pipex, pipey, 47,600);
 rect(pipex, pipey - 715, 47, 600); 
 pipex -= 3;
 if (pipex < -10){
  pipex = 500; 
  pipey = (int) random(100,400);
 }
 if(intersects(birdx, birdy, pipex, pipey, 47, 600)){
    System.exit(0);
  }
  if(intersects(birdx, birdy, pipex, pipey - 715, 47, 600)){
   System.exit(0); 
  }
  if(birdy > 501 || birdy < -1){
   System.exit(0); 
  }
  textSize(20);
  fill(255,0,0);
  if(pipex == birdx){
   score++;
  }
  text(score, 15, 20);
}
void mousePressed(){
 birdYVelocity = -10.5;
}
boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength, int paddleHeight) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength && birdY < paddleY + paddleHeight)
return true;
else 
return false;
}