package map;

import quests.SecondaryQuest;

/**
 * Created by irinadanes on 11/03/17.
 */

public class GameMap {

  private Square[][] map = new Square[90][200];

  public Square getSquare(int i, int j) {
    return map[i][j];
  }

  public void setSquare(int x, int y, int a, int b) {
    map[x + a][y + b].setC('*');
  }

  public boolean isValidMove(int i, int j) {
    return 30 <= i && i < 90 && 0 <= j && j < 160;
  }

  public GameMap() {
    for (int i = 0; i < 90; i++) {
      for (int j = 0; j < 200; j++) {
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

    // Roads
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
    for (int i = 71; i < 90; i++) {
      this.map[i][50].setC('|');
    }
    for (int j = 51; j < 120; j++) {
      this.map[80][j].setC('-');
    }
    for (int i = 50; i < 80; i++) {
      this.map[i][108].setC('|');
    }
    for (int j = 108; j < 120; j++) {
      this.map[50][j].setC('-');
    }
    for (int j = 40; j < 50; j++) {
      this.map[80][j].setC('-');
    }

    // Cemetery
    for (int j = 120; j <= 145; j++) {
      this.map[69][j].setC('-');
      this.map[85][j].setC('-');
    }
    for (int i = 70; i < 85; i++) {
      this.map[i][120].setC('|');
      this.map[i][145].setC('|');
    }
    this.map[77][129].setC('C');
    this.map[77][130].setC('E');
    this.map[77][131].setC('M');
    this.map[77][132].setC('E');
    this.map[77][133].setC('T');
    this.map[77][134].setC('E');
    this.map[77][135].setC('R');
    this.map[77][136].setC('Y');

    // Crosses
    this.map[71][125].setC('|');
    this.map[72][125].setC('|');
    this.map[73][125].setC('|');
    this.map[71][124].setC('_');
    this.map[71][126].setC('_');

    this.map[71][140].setC('|');
    this.map[72][140].setC('|');
    this.map[73][140].setC('|');
    this.map[71][139].setC('_');
    this.map[71][141].setC('_');

    this.map[73][132].setC('|');
    this.map[74][132].setC('|');
    this.map[75][132].setC('|');
    this.map[73][131].setC('_');
    this.map[73][133].setC('_');

    this.map[81][125].setC('|');
    this.map[82][125].setC('|');
    this.map[83][125].setC('|');
    this.map[81][124].setC('_');
    this.map[81][126].setC('_');

    this.map[79][132].setC('|');
    this.map[80][132].setC('|');
    this.map[81][132].setC('|');
    this.map[79][131].setC('_');
    this.map[79][133].setC('_');

    this.map[81][140].setC('|');
    this.map[82][140].setC('|');
    this.map[83][140].setC('|');
    this.map[81][139].setC('_');
    this.map[81][141].setC('_');

    // Ruins
    for (int j = 120; j <= 150; j++) {
      this.map[40][j].setC('-');
      this.map[60][j].setC('-');
    }
    for (int i = 41; i < 60; i++) {
      this.map[i][120].setC('|');
      this.map[i][150].setC('|');
    }
    this.map[50][127].setC('R');
    this.map[50][128].setC('U');
    this.map[50][129].setC('I');
    this.map[50][130].setC('N');
    this.map[50][131].setC('S');
    this.map[50][132].setC(' ');
    this.map[50][133].setC('O');
    this.map[50][134].setC('F');
    this.map[50][135].setC(' ');
    this.map[50][136].setC('O');
    this.map[50][137].setC('L');
    this.map[50][138].setC('D');
    this.map[50][139].setC(' ');
    this.map[50][140].setC('T');
    this.map[50][141].setC('O');
    this.map[50][142].setC('W');
    this.map[50][143].setC('N');

    // Ranch
    for (int j = 5; j <= 40; j++) {
      this.map[75][j].setC('-');
      this.map[85][j].setC('-');
    }
    for (int i = 76; i < 85; i++) {
      this.map[i][5].setC('|');
      this.map[i][40].setC('|');
    }
    this.map[80][20].setC('R');
    this.map[80][21].setC('A');
    this.map[80][22].setC('N');
    this.map[80][23].setC('C');
    this.map[80][24].setC('H');

    // Quests
    this.map[82][49].setC('Q');
    this.map[51][49].setC('Q');
    this.map[65][60].setC('Q');
    this.map[49][118].setC('Q');
    this.map[79][90].setC('Q');
    this.map[61][40].setC('Q');
    this.map[82][25].setC('Q');

    this.map[53][65].setC('q');
    this.map[79][116].setC('q');
    this.map[42][40].setC('q');
    this.map[62][109].setC('q');
    this.map[46][19].setC('q');
    this.map[47][80].setC('q');

    // Get new guns
    this.map[71][90].setC('!');
    this.map[74][20].setC('!');

    // Legend
    for (int j = 165; j <= 199; j++) {
      this.map[43][j].setC('-');
      this.map[62][j].setC('-');
    }
    for (int i = 44; i < 62; i++) {
      this.map[i][165].setC('|');
      this.map[i][199].setC('|');
    }

    this.map[45][179].setC('L');
    this.map[45][180].setC('E');
    this.map[45][181].setC('G');
    this.map[45][182].setC('E');
    this.map[45][183].setC('N');
    this.map[45][184].setC('D');

    this.map[48][170].setC('Q');
    this.map[48][171].setC(' ');
    this.map[48][172].setC('-');
    this.map[48][173].setC(' ');
    this.map[48][174].setC('M');
    this.map[48][175].setC('a');
    this.map[48][176].setC('i');
    this.map[48][177].setC('n');
    this.map[48][178].setC(' ');
    this.map[48][179].setC('Q');
    this.map[48][180].setC('u');
    this.map[48][181].setC('e');
    this.map[48][182].setC('s');
    this.map[48][183].setC('t');

    this.map[49][170].setC('q');
    this.map[49][171].setC(' ');
    this.map[49][172].setC('-');
    this.map[49][173].setC(' ');
    this.map[49][174].setC('S');
    this.map[49][175].setC('e');
    this.map[49][176].setC('c');
    this.map[49][177].setC('o');
    this.map[49][178].setC('n');
    this.map[49][179].setC('d');
    this.map[49][180].setC('a');
    this.map[49][181].setC('r');
    this.map[49][182].setC('y');
    this.map[49][183].setC(' ');
    this.map[49][184].setC('Q');
    this.map[49][185].setC('u');
    this.map[49][186].setC('e');
    this.map[49][187].setC('s');
    this.map[49][188].setC('t');

    this.map[51][170].setC('*');
    this.map[51][171].setC(' ');
    this.map[51][172].setC('-');
    this.map[51][173].setC(' ');
    this.map[51][174].setC('Y');
    this.map[51][175].setC('o');
    this.map[51][176].setC('u');
    this.map[51][177].setC('r');
    this.map[51][178].setC(' ');
    this.map[51][179].setC('P');
    this.map[51][180].setC('l');
    this.map[51][181].setC('a');
    this.map[51][182].setC('y');
    this.map[51][183].setC('e');
    this.map[51][184].setC('r');

    this.map[52][170].setC('^');
    this.map[52][171].setC(' ');
    this.map[52][172].setC('-');
    this.map[52][173].setC(' ');
    this.map[52][174].setC('R');
    this.map[52][175].setC('a');
    this.map[52][176].setC('i');
    this.map[52][177].setC('d');
    this.map[52][178].setC('e');
    this.map[52][179].setC('r');

    this.map[53][170].setC('+');
    this.map[53][171].setC(' ');
    this.map[53][172].setC('-');
    this.map[53][173].setC(' ');
    this.map[53][174].setC('P');
    this.map[53][175].setC('r');
    this.map[53][176].setC('i');
    this.map[53][177].setC('e');
    this.map[53][178].setC('s');
    this.map[53][179].setC('t');

    this.map[54][170].setC('$');
    this.map[54][171].setC(' ');
    this.map[54][172].setC('-');
    this.map[54][173].setC(' ');
    this.map[54][174].setC('B');
    this.map[54][175].setC('a');
    this.map[54][176].setC('r');
    this.map[54][177].setC('t');
    this.map[54][178].setC('e');
    this.map[54][179].setC('n');
    this.map[54][180].setC('d');
    this.map[54][181].setC('e');
    this.map[54][182].setC('r');

    this.map[55][170].setC('@');
    this.map[55][171].setC(' ');
    this.map[55][172].setC('-');
    this.map[55][173].setC(' ');
    this.map[55][174].setC('S');
    this.map[55][175].setC('h');
    this.map[55][176].setC('e');
    this.map[55][177].setC('r');
    this.map[55][178].setC('i');
    this.map[55][179].setC('f');
    this.map[55][180].setC('f');

    this.map[56][170].setC('%');
    this.map[56][171].setC(' ');
    this.map[56][172].setC('-');
    this.map[56][173].setC(' ');
    this.map[56][174].setC('C');
    this.map[56][175].setC('h');
    this.map[56][176].setC('i');
    this.map[56][177].setC('l');
    this.map[56][178].setC('d');

    this.map[57][170].setC('&');
    this.map[57][171].setC(' ');
    this.map[57][172].setC('-');
    this.map[57][173].setC(' ');
    this.map[57][174].setC('H');
    this.map[57][175].setC('o');
    this.map[57][176].setC('t');
    this.map[57][177].setC('e');
    this.map[57][178].setC('l');
    this.map[57][179].setC(' ');
    this.map[57][180].setC('M');
    this.map[57][181].setC('a');
    this.map[57][182].setC('n');
    this.map[57][183].setC('a');
    this.map[57][184].setC('g');
    this.map[57][185].setC('e');
    this.map[57][186].setC('r');

    this.map[59][170].setC('!');
    this.map[59][171].setC(' ');
    this.map[59][172].setC('-');
    this.map[59][173].setC(' ');
    this.map[59][174].setC('G');
    this.map[59][175].setC('e');
    this.map[59][176].setC('t');
    this.map[59][177].setC(' ');
    this.map[59][178].setC('A');
    this.map[59][179].setC(' ');
    this.map[59][180].setC('N');
    this.map[59][181].setC('e');
    this.map[59][182].setC('w');
    this.map[59][183].setC(' ');
    this.map[59][184].setC('G');
    this.map[59][185].setC('u');
    this.map[59][186].setC('n');
  }

  public void display() {
    for (int i = 0; i < 90; i++) {
      for (int j = 0; j < 200; j++) {
        if (j > 160) {
          System.out.print("\u001B[36m" + map[i][j].getC() + "\u001B[0m");
        } else {
          switch (map[i][j].getC()) {
            case 'Q':
            case 'q':
              System.out.print("\u001B[31m" + 'Q' + "\u001B[0m");
              break;
            case '+':
            case '@':
            case '%':
            case '&':
            case '^':
            case '$':
              System.out.print("\u001B[33m" + map[i][j].getC() +
                  "\u001B[0m");
              break;
            case '!':
              System.out.print("\u001B[32m" + '!' + "\u001B[0m");
              break;
            case '*':
              System.out.print("\u001B[36m" + '*' + "\u001B[0m");
              break;
            default:
              System.out.print(map[i][j].getC());
              break;
          }
        }
      }
      System.out.println();
    }
  }


}
