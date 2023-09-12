// javac -d ./compile *.java

public class Main {

  static int width = 5;
  static int height = 10;
  static double learningRate = 0.01;

  public static void main(String[] args) {
    System.out.println("Hello World");
    node[][] layers = new node[width][height];
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        layers[i][j] = new node();
        layers[i][j].main((double)Math.random()*10 - 5, height);
      }
    }
    for (int i = 0; i < layers.length; i++) {
      for (int j = 0; j < layers[i].length; j++) {
        System.out.println(layers[i][j].value+", "+layers[i][j].mod);
      }
    }
  }
}