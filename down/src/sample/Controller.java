package sample;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;
import java.awt.BorderLayout;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button panelButtonEight;

    @FXML
    private Button panelButtonEleven;

    @FXML
    private Button panelButtonFive;

    @FXML
    private Button panelButtonFour;

    @FXML
    private Button panelButtonFourten;

    @FXML
    private Button panelButtonNine;

    @FXML
    private Button panelButtonOne;

    @FXML
    private Button panelButtonSeven;

    @FXML
    private Button panelButtonSix;

    @FXML
    private Button panelButtonTen;

    @FXML
    private Button panelButtonThithdten;

    @FXML
    private Button panelButtonThree;

    @FXML
    private Button panelButtonTwelve;

    @FXML
    private Button panelButtonTwo;

    @FXML
    private ImageView photoBag;


    @FXML
    void initialize() {

        panelButtonOne.setOnAction(actionEvent -> {
            try {
                photoBag.setImage(new Image(new BufferedInputStream(new FileInputStream("C:\\Users\\Евгени\\IdeaProjects\\down\\src\\images\\08-Wrench-icon.png"))));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        panelButtonTwo.setOnAction(actionEvent -> {
            try {
                photoBag.setImage(new Image(new BufferedInputStream(new FileInputStream("C:\\Users\\Евгени\\IdeaProjects\\down\\src\\images\\Sidebar-Desktop-icon.png"))));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });
        panelButtonThree.setOnAction(actionEvent -> {
            try {
                photoBag.setImage(new Image(new BufferedInputStream(new FileInputStream("C:\\Users\\Евгени\\IdeaProjects\\down\\src\\images\\Sidebar-Utilities-icon.png"))));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        });

    }

}
