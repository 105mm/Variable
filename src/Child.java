public class Child extends Parent {
    int x = 1000;

    Child() {
        this(5000);
    }
    Child(int x) {
        this.x = x;
    }
    int getX() {
        return x;
    }
}