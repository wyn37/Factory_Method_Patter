package J5_5;

public class OracleFactory implements DatabaseFactory{
    public Connectionobject createConnection(){
        return new OracleConnection();
    }
    public Statementobject createStatement(){
        return new OracleStatement();
    }
}
