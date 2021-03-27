package application.main;

import application.DbConnection.DbConnection;
import com.itextpdf.text.Paragraph;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends Application {

    private static DbConnection daos;

    @Override
    public void start(Stage primaryStage) throws IOException {

        daos = new DbConnection();

        if (DbConnection.getConnection() == null)
            return;
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginDocument.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 777, 559));
        primaryStage.show();

    }


    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(date);

        System.out.println(strDate);

        launch(args);
    }

    public static DbConnection getDaos() {
        return daos;
    }
}
