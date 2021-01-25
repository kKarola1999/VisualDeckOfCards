import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class DeckViewController implements Initializable {

    @FXML private Button nextCardButton;
    @FXML private ImageView deckImageView;
    @FXML private ImageView activeCardImageView;
    @FXML
    private ImageView Player1Card1;

    @FXML
    private ImageView Player1Card3;

    @FXML
    private ImageView Player1Card2;

    @FXML
    private ImageView Player1Card5;

    @FXML
    private ImageView Player1Card4;

    @FXML
    private ImageView Player2Card1;

    @FXML
    private ImageView Player2Card5;

    @FXML
    private ImageView Player2Card4;

    @FXML
    private ImageView Player2Card3;

    @FXML
    private ImageView Player2Card2;
    private DeckOfCards deck;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        deck = new DeckOfCards();
        deck.shuffle();

        deckImageView.setImage(deck.getBackOfCardImage());
    }

    @FXML public void nextCardButtonPushed()
    {

        activeCardImageView.setImage(deck.dealTopCard().getImage());
        Player1Card1.setImage(deck.dealTopCard().getImage());
        Player1Card2.setImage(deck.dealTopCard().getImage());
        Player1Card3.setImage(deck.dealTopCard().getImage());
        Player1Card4.setImage(deck.dealTopCard().getImage());
        Player1Card5.setImage(deck.dealTopCard().getImage());
        Player2Card1.setImage(deck.dealTopCard().getImage());
        Player2Card2.setImage(deck.dealTopCard().getImage());
        Player2Card3.setImage(deck.dealTopCard().getImage());
        Player2Card4.setImage(deck.dealTopCard().getImage());
        Player2Card5.setImage(deck.dealTopCard().getImage());
    }

    public void mo(MouseEvent mouseEvent) {
    }
}
