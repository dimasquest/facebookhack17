package map;

/**
 * Created by irinadanes on 11/03/17.
 */

public class Square {

  private int x, y;
  private char c;

  public Square(int x, int y) {
    this.x = x;
    this.y = y;
    this.c = ' ';
  }

  public char getC() {
    return c;
  }

  public void setX(int a) {
    this.x = x + a;
  }

  public void setY(int b) {
    this.y = y + b;
  }

  public void setSquare(int a, int b) {
    this.x = x + a;
    this.y = y + b;
  }

  public void setC(char c) {
    this.c = c;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

}
