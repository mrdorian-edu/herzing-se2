/*
 * Filename: MainController.java
 * Original Creator: Dorian Brandusa
 * Date Created: 12/15/2022
 * Last Updated: 03/20/2023
 * Version: v1
 */

package rms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

    @FXML
    private Button btnAddUser;

    @FXML
    private Button btnDeleteUser;

    @FXML
    private Button btnUpdateUser;

    @FXML
    private TableColumn<?, ?> columnEmailAddress;

    @FXML
    private TableColumn<?, ?> columnID;

    @FXML
    private TableColumn<?, ?> columnPassword;

    @FXML
    private TableColumn<?, ?> columnUsername;

    @FXML
    private TableView<?> tableUsers;

    @FXML
    void add(ActionEvent event) {
        // To be Added
    }

    @FXML
    void delete(ActionEvent event) {
        // To be Added
    }

    @FXML
    void update(ActionEvent event) {
        // To be Added
    }

}
