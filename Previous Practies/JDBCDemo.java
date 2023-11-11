import java.sql.*;

public class JDBCDemo {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/user_name";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from user");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3)+" "+resultSet.getString(4));
            }

            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2));
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}