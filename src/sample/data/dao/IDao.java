package sample.data.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;

public interface IDao<T> {



    public Vector<T> findAll();
    public void refresh();

    public Vector<T> selectAll();

    public T find(long id);

    public boolean delete(long id);

    public boolean update(T o);

    public boolean insert(T o);

    void assignParams(PreparedStatement preStm, T o) throws SQLException;

}
