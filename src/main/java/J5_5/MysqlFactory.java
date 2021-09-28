package J5_5;

public class MysqlFactory implements DatabaseFactory{
    public Connectionobject createConnection(){
        return new MsqlConnection();
    }
    public Statementobject createStatement(){
        return new MysqlStatement();
    }
}
