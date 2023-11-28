package repository.Impl;

import repository.DbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHelperImpl implements DbHelper {
    @Override
    public PreparedStatement getPreparedStatement(String sql) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/tinder_db",
                "postgres",
                "1234");
        return connection.prepareStatement(sql);
    }
}
