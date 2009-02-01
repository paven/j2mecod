/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javax.microedition.lcdui.game;

import java.awt.Graphics;
import java.awt.Image;

 /**
             *  since it bothers me that, java does not have the same classes in
  *             diffrent enviroments i her build a Sprite class(
             * @author paven
             * @see http://java.sun.com/javame/reference/apis/jsr118/javax/microedition/lcdui/game/Sprite.html
             */









class Sprite {
    private int x=0, xReference = 0;
    private int y=0, yReference = 0;
    private Image image;

    public Sprite(Image image){
        this.image = image;
    }

    public void paint(Graphics g){
        g.drawImage(image, x-xReference, y-yReference, null);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


}
