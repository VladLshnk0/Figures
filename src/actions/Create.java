package actions;

import figures.*;

import java.util.ArrayList;
import java.util.Random;

public class Create {
    ArrayList<Figure> figures = new ArrayList<Figure>();
    Random random = new Random();

    public ArrayList<Figure> getFigures(int numberOfFigures) {
        for(int i = 0; i < numberOfFigures; i++){
            createArrayOfFigures(random.nextInt(4));
        }
        return figures;
    }

    private void createArrayOfFigures(int val){
        switch(val){
            case 0: figures.add(new Square(random.nextInt(1000), getRandomColor()));
            break;
            case 1: figures.add(new Triangle(random.nextInt(1000), random.nextInt(1000), getRandomColor()));
            break;
            case 2: figures.add(new Circle(random.nextInt(1000), getRandomColor()));
            break;
            case 3: figures.add(new Trapezoid(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000), getRandomColor()));
            break;
        }
    }

    private String getRandomColor(){
        int val = random.nextInt(8);
        String color = "";
        switch (val){
            case 0: color = "red";
            break;
            case 1: color = "green";
            break;
            case 2: color = "blue";
            break;
            case 3: color = "gray";
            break;
            case 4: color = "white";
            break;
            case 5: color = "black";
            break;
            case 6: color = "yellow";
            break;
            case 7: color = "purple";
            break;
        }
        return color;
    }
}
