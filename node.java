public class node {

    public double mod;

    public double value;

    public node[] connections; // these will be the connected (input) nodes

    public void main(double val, int height) {
        mod = val;
        connections = new node[height];
        in();
    }

    public void in() {
        int sum = 0;
        for (int i = 0; i < connections.length; i++) {
            sum += connections[i].value;
        }
        value = sum * mod;
    }
}
