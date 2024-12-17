package training.abstract_lessen_2;

public class Rectangle extends Figure {
    private int tretiyStorona;
    public Rectangle(int height, int width, int tretiyStorona){
        super(height,width);
        this.tretiyStorona = tretiyStorona;
    }

    @Override
    public void square() {
        System.out.print(getHeight() * getWidth() * tretiyStorona);
    }
}
