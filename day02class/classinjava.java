class Box {
    private int length, breadth, width;

    public void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        width = h;
    }

    public void showDimension() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Width: " + width);
    }
}

class Box1 {
    private int length, breadth, width;

    public void setDimensions(int l, int b, int h) {
        length = l;
        breadth = b;
        width = h;
    }

    public void showDimensions() {
        System.out.println("For the second box:");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Width: " + width);
    }
}

public class classinjava {
    public static void main(String[] args) {
        Box smallBox = new Box();
        smallBox.setDimension(1, 2, 3);
        smallBox.showDimension();

        Box1 bigBox = new Box1();
        bigBox.setDimensions(9, 6, 8);
        bigBox.showDimensions();
    }
}
