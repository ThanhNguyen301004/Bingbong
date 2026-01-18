import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OS
 */
public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 1;
    
    Ball(){
        
    }

    Ball(int x, int y, int width, int height) {
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0){
            randomXDirection--;
        }
        setXDirection(randomXDirection*initialSpeed);
        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0){
            randomYDirection--;
            
        }
        setYDirection(randomYDirection);
    }
    
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }
    public void move(){
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x, y, width, height);
    }
}
