package com.example.lab3;

import javafx.scene.shape.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    Circle circleTest = new Circle(100,100,20);

    @Test
     void checkIfUpWorked (){
        circleTest.setCenterY( circleTest.getCenterY() +40);
        assertEquals(140,circleTest.getCenterY());

    }






    @Test

    void checkIfDownWorked (){
        circleTest.setCenterY( circleTest.getCenterY() -40);
        assertEquals(60,circleTest.getCenterY());


    }

}