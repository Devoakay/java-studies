package lab5;

public class AccountNumber
{
    private int number;
    private String[][] pattern;

    public AccountNumber(int number, String[][] pattern)
    {
        this.number = number;
        this.pattern = pattern;
    }

    public int getNumber() {
        return number;
    }
    public String[][] getPattern() {
        return pattern;
    }
}
