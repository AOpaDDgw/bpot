public class Main {

  static int width = 5;
  static int height = 10;
  static double learningRate = 0.01;

  public static void main(String[] args) {
    System.out.println("Hello World");
    node[][] layers = new node[width][height];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        layers[i][j].main((double)Math.random()*10 - 5);
      }
    }
  }
}