package application.dal.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Client extends Person {


    public Client(){
        super();

    }

    public Client(ResultSet rst) throws SQLException {
        super(rst);
    }
    public Client(Long id, String fullName, String cin, String tele, String address, String email){
        super(id, fullName, cin, tele, address, email);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}