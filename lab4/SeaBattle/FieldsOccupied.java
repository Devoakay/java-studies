public class FieldsOccupied
{
    private int rowNumber;
    private int columnNumber;

    public FieldsOccupied(int rowNumber, int columnNumber)
    {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }
    // Getters
    public int getRowNumber() {
        return rowNumber;
    }
    public int getColumnNumber() {
        return columnNumber;
    }

    @Override
    public String toString() {
        return "Field occupied - rowNumber: " + rowNumber + ", columnNumber: " + columnNumber;
    }
}
