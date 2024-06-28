package src.main.java.lesson11.Shape;

import java.util.List;

public class Canvas {

    public  void drawAll(List<?extends Shape> list){ //?extends означает любой символ все что экстендица от Shape можно подставить
        for (Shape el: list){
            el.draw(this);

        }
    }

}
