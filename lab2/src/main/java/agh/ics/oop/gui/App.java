package agh.ics.oop.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);
        gridPane.add(new Label("xxd"),0,1);
        Label label = new Label("Zwierzak");

        Scene scene = new Scene(label, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();

    }}
//
//public void start(Stage primaryStage) throws Exception {
//        Label first_name=new Label("First Name");
//        Label last_name=new Label("Last Name");
//        Label x1=new Label("Last Name");
//
//        Button Submit=new Button ("Submit");
//        GridPane root=new GridPane();
//        root.setGridLinesVisible(true);
//        Scene scene = new Scene(root,400,200);
//        root.addRow(0, first_name,x1);
//        root.addRow(1, last_name,x1);
//        root.addRow(2, Submit);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        }
//public static void main(String[] args) {
//        launch(args);
//        }
//        }

