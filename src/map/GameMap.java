package map;

/**
 * Created by irinadanes on 11/03/17.
 */

public class GameMap {

  private Square[][] map = new Square[100][100];

  public GameMap() {
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        this.map[i][j] = new Square(i, j);
      }
    }

    // City
    for (int j = 5; j <= 95; j++) {
      this.map[30][j].setC('-');
      this.map[70][j].setC('-');
    }
    for (int i = 31; i < 70; i++) {
      this.map[i][5].setC('|');
      this.map[i][95].setC('|');
    }

    // Bar
    for (int j = 10; j <= 20; j++) {
      this.map[40][j].setC('-');
      this.map[50][j].setC('-');
    }
    for (int i = 41; i < 50; i++) {
      this.map[i][10].setC('|');
      this.map[i][20].setC('|');
    }
    this.map[45][14].setC('B');
    this.map[45][15].setC('A');
    this.map[45][16].setC('R');

    // Hotel
    for (int j = 10; j <= 30; j++) {
      this.map[55][j].setC('-');
      this.map[68][j].setC('-');
    }
    for (int i = 56; i < 68; i++) {
      this.map[i][10].setC('|');
      this.map[i][30].setC('|');
    }
    this.map[62][18].setC('H');
    this.map[62][19].setC('O');
    this.map[62][20].setC('T');
    this.map[62][21].setC('E');
    this.map[62][22].setC('L');

    // Sheriff
    for (int j = 65; j <= 85; j++) {
      this.map[33][j].setC('-');
      this.map[48][j].setC('-');
    }
    for (int i = 34; i < 48; i++) {
      this.map[i][65].setC('|');
      this.map[i][85].setC('|');
    }
    this.map[41][72].setC('S');
    this.map[41][73].setC('H');
    this.map[41][74].setC('E');
    this.map[41][75].setC('R');
    this.map[41][76].setC('I');
    this.map[41][77].setC('F');
    this.map[41][78].setC('F');

    // Church
    for (int j = 30; j <= 55; j++) {
      this.map[33][j].setC('-');
      this.map[43][j].setC('-');
    }
    for (int i = 34; i < 43; i++) {
      this.map[i][30].setC('|');
      this.map[i][55].setC('|');
    }
    this.map[38][40].setC('C');
    this.map[38][41].setC('H');
    this.map[38][42].setC('U');
    this.map[38][43].setC('R');
    this.map[38][44].setC('C');
    this.map[38][45].setC('H');

    // House 1
    for (int j = 73; j <= 85; j++) {
      this.map[52][j].setC('-');
      this.map[56][j].setC('-');
    }
    for (int i = 53; i < 56; i++) {
      this.map[i][73].setC('|');
      this.map[i][85].setC('|');
    }
    this.map[54][77].setC('H');
    this.map[54][78].setC('O');
    this.map[54][79].setC('U');
    this.map[54][80].setC('S');
    this.map[54][81].setC('E');

    // House 2
    for (int j = 73; j <= 85; j++) {
      this.map[58][j].setC('-');
      this.map[62][j].setC('-');
    }
    for (int i = 59; i < 62; i++) {
      this.map[i][73].setC('|');
      this.map[i][85].setC('|');
    }
    this.map[60][77].setC('H');
    this.map[60][78].setC('O');
    this.map[60][79].setC('U');
    this.map[60][80].setC('S');
    this.map[60][81].setC('E');

  // House 3
    for (int j = 73; j <= 85; j++) {
      this.map[64][j].setC('-');
      this.map[68][j].setC('-');
    }
    for (int i = 65; i < 68; i++) {
      this.map[i][73].setC('|');
      this.map[i][85].setC('|');
    }
    this.map[66][77].setC('H');
    this.map[66][78].setC('O');
    this.map[66][79].setC('U');
    this.map[66][80].setC('S');
    this.map[66][81].setC('E');

    // Road
    for (int i = 44; i < 70; i++) {
      this.map[i][50].setC('|');
    }
    for (int j = 51; j < 73; j++) {
      this.map[66][j].setC('-');
      this.map[60][j].setC('-');
      this.map[54][j].setC('-');
    }
    for (int j = 31; j < 50; j++) {
      this.map[62][j].setC('-');
    }
    for (int j = 21; j < 50; j++) {
      this.map[46][j].setC('-');
    }
    for (int j = 51; j < 65; j++) {
      this.map[46][j].setC('-');
    }

  }

  public void display() {
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        System.out.print(map[i][j].getC());
      }
      System.out.println();
    }
  }

}
