package be.zatenzu.patterns.builders.builder.withjavafxapi;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextBuilder;

public class Client {

    public static void main(String[] args) {
        Text texct = TextBuilder.create().x(2.0).y(2.0).fill(Color.RED).build();
    }

}
