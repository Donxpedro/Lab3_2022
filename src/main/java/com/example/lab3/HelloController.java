package com.example.lab3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.effect.Light;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import static java.text.Collator.PRIMARY;
import static javafx.scene.paint.Color.color;

public class HelloController {

        @FXML

       private Circle myCircle;
       private double x;
       private double y;



    public void Up(ActionEvent e) {
             System.out.println("UP");
             myCircle.setCenterY(y-=40
             );

        }
        public void Down(ActionEvent e) {
             System.out.println("DOWN");
             myCircle.setCenterY(y+=40);
        }

        public void left(ActionEvent e) {
            System.out.println("LEFT");
            myCircle.setCenterX(x-=40);
        }

        public void right(ActionEvent e) {
            System.out.println("RIGHT");
            myCircle.setCenterX(x+=40);
        }

        public void CircleView(Circle event){
        System.out.println("view");
        CircleView(myCircle);
        }






    //public void Mytriangel (ActionEvent event) {
        //System.out.println("Circle");
        //myCircle.set;

    @FXML
    void RemoveCircle(MouseEvent event) {
        //myCircle.


    }



    @FXML
    void addCircle(Circle event) {

        addCircle(myCircle);

    }


    @FXML
    private Pane myPane;
    @FXML
    private ColorPicker myColorPicker;

    public void changeColor(ActionEvent event) {
        Color myColor = myColorPicker.getValue();
        myPane.setBackground(new Background(new BackgroundFill(myColor,null,null)));
    }

    public void addCircle (MouseEvent mouseEvent){
    }


    @FXML
    private Polygon Triangel;


    @FXML

    private ColorPicker TriangelColor;

    public void ChangeTriangel(ActionEvent event){
        Color myColore = TriangelColor.getValue();
        Triangel.setFill(myColore);
    }


    @FXML

    private Line MyLine;

    public void Horizontal(ActionEvent event){
        System.out.println("Horizontal");
        MyLine.setRotate(90);

    }

    public void Vertical(ActionEvent event){
        System.out.println("Vertical");
        MyLine.setRotate(90);

    }

    @FXML

    private Circle Point;

    public void MyCirclebutton(ActionEvent b) {
        System.out.println("Circle");
        Point.setFill(Color.RED);

    }













            @FXML
            private ListView<String> personView;
            @FXML
            private Label welcomeText;

            @FXML
            protected void onHelloButtonClick () {
                welcomeText.setText("Welcome to JavaFX Application!");
            }



}
