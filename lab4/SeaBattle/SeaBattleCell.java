import javafx.scene.control.Button;

public class SeaBattleCell extends Button
{
    private int rowNumber;
    private int columnNumber;
    private static SeaBattleController seaBattleController;

    public SeaBattleCell(int rowNumber, int columnNumber, boolean player) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;

        this.setStyle("-fx-background-color: silver; -fx-background-radius: 0; -fx-border-width: 1; -fx-border-color: black; -fx-pref-width: 42px; -fx-pref-height: 40px;");

        if(player)
        {
            this.setOnMousePressed(event -> {
                // Place ship when player press left mouse button while cursor is on player GridPane
                if(event.isPrimaryButtonDown())
                {
                    seaBattleController.placePlayerShip(this.getRowNumber(), this.getColumnNumber());
//                    System.out.println("Ship placed!");
                }

                // Rotate ship when player press right mouse button while cursor is on player GridPane
                if(event.isSecondaryButtonDown())
                {
                    seaBattleController.rotateShip();
                }
            });
        }
    }

    // Getters and setters
    public int getRowNumber() {
        return rowNumber;
    }
    public int getColumnNumber() {
        return columnNumber;
    }
    public static void setSeaBattleController(SeaBattleController seaBattleController) {
        SeaBattleCell.seaBattleController = seaBattleController;
    }
}
