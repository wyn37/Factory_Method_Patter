package J5_5;

public interface DatabaseFactory {
    public Connectionobject createConnection();
    public Statementobject createStatement();
}
