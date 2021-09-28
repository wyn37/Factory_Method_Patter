package J5_5;


public class Client {
    public static void main(String args[]) {
        MysqlFactory factory;
        Connectionobject cnnection;
        Statementobject statement;
        factory = (MysqlFactory) XMLUtil.getBean();
        cnnection = factory.createConnection();
        statement = factory.createStatement();
        cnnection.type();
        statement.type();
    }
}