import controller.DeckController
import model.Card
import org.json.JSONArray
import org.json.JSONObject
import java.sql.DriverManager.println

fun main() {
    val deckController = DeckController()
    val carta = deckController.drawCard()
    println(carta)
    val carta2 = deckController.drawCard()
    println(carta2)
}