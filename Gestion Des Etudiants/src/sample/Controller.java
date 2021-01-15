package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import Connectivty.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Controller {
  @FXML
    private Button btn;
  Connection conn;
  DbConnection connClass = new DbConnection();
  @FXML
  void clickButton(ActionEvent event) throws ClassNotFoundException, SQLException {
    conn = connClass.getConnection();
      System.out.println(conn);
      System.out.println("Connection etablie");
  }
}
