package training.abstract_lessen_2;

public class Quadrate extends Figure {
    public Quadrate(int height, int width){
        super(height,width);
    }

    @Override
    public void square() {
        System.out.println(getHeight() * getWidth());
    }
}
