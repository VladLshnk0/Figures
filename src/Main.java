import actions.Create;
import figures.Figure;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Figure> figures = new Create().getFigures(random.nextInt(1000));

        for(int i = 0; i < figures.size(); i++){
            figures.get(i).print();
        }
    }
}
