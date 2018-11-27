import javafx.scene.control.Label;

public class Ship
{
    private Label shipInfo;
    private String orientation;
    private ShipCoordinates[] shipCoordinates;
    private int shipLength;
    // Controller
    private static SeaBattleController seaBattleController;

    // Getters and setters
    public static void setSeaBattleController(SeaBattleController seaBattleController) {
        Ship.seaBattleController = seaBattleController;
    }
    public Label getShipInfo() {
        return shipInfo;
    }
    public String getOrientation() {
        return orientation;
    }
    public ShipCoordinates[] getShipCoordinates() {
        return shipCoordinates;
    }
    public int getShipLength() {
        return shipLength;
    }

    public Ship(int shipLength, String orientation, ShipCoordinates[] shipCoordinates, boolean addComputerShipsInfo)
    {
        // Create new label and add it to proper container
        switch(shipLength)
        {
            case 1:
                shipInfo = new Label("-");
                shipInfo.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
                // Add ship info to proper VBox container
                if(addComputerShipsInfo)
                {
                    shipInfo.setVisible(false);
                    seaBattleController.getComputerShips().getChildren().add(shipInfo);
                }
                else
                    seaBattleController.getPlayerShips().getChildren().add(shipInfo);
                break;
            case 2:
                shipInfo = new Label("--");
                shipInfo.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
                // Add ship info to proper VBox container
                if(addComputerShipsInfo)
                {
                    shipInfo.setVisible(false);
                    seaBattleController.getComputerShips().getChildren().add(shipInfo);
                }
                else
                    seaBattleController.getPlayerShips().getChildren().add(shipInfo);
                break;
            case 3:
                shipInfo = new Label("---");
                shipInfo.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
                // Add ship info to proper VBox container
                if(addComputerShipsInfo)
                {
                    shipInfo.setVisible(false);
                    seaBattleController.getComputerShips().getChildren().add(shipInfo);
                }
                else
                    seaBattleController.getPlayerShips().getChildren().add(shipInfo);
                break;
            case 4:
                shipInfo = new Label("----");
                shipInfo.setStyle("-fx-font-size: 15px; -fx-font-weight: bold;");
                // Add ship info to proper VBox container
                if(addComputerShipsInfo)
                {
                    shipInfo.setVisible(false);
                    seaBattleController.getComputerShips().getChildren().add(shipInfo);
                }
                else
                    seaBattleController.getPlayerShips().getChildren().add(shipInfo);
                break;
        }

        // Set values to variables
        this.orientation = orientation;
        this.shipCoordinates = shipCoordinates;
        this.shipLength = shipLength;
    }
    @Override
    public String toString() {
        StringBuilder shipInfo = new StringBuilder();
        shipInfo.append("Ship info: ");
        if(shipCoordinates != null)
        {
            for(ShipCoordinates ship : shipCoordinates)
            {
                shipInfo.append("rowNumber = ");
                shipInfo.append(ship.getRow());
                shipInfo.append(", columnNumber = ");
                shipInfo.append(ship.getColumn());
                shipInfo.append("\n");
            }
        }
        return shipInfo.toString();
    }
}
