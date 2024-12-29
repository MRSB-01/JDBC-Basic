import java.sql.*;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/JDBC";
    private static final String username = "root";
    private static final String password = "2004";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Create Connection
        try {

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            // Insert Data
            //String query = String.format("INSERT INTO std (sname, age, marks) VALUES('%s', %d, %f)", "Mannu", 20, 89.20);

            // Retrieve Data
            //String query = "INSERT INTO std(sname,age,marks) VALUES('Manu',20,89.20)";

            // Update Data
            //String query = String.format("update std set marks = %f where id = %d ", 78.10, 1);

            // Delete Data
            String query = "delete from std where id = 1";

            int rowAffected = statement.executeUpdate(query);

            if (rowAffected > 0) {
                //System.out.println("Data Inserted : ");
                //System.out.println("Data Updated : ");
                System.out.println("Data Deleted : ");
            } else {
                System.out.println("Error : ");
            }
//            ResultSet resultSet = statement.executeQuery(query);

//            while(resultSet.next()){
//
//                int id = resultSet.getInt("id");
//                String sname = resultSet.getString("sname");
//                int age = resultSet.getInt("age");
//                double marks = resultSet.getDouble("marks");
//
//                System.out.println("Id : "+id);
//                System.out.println("Name : "+sname);
//                System.out.println("Age : "+age);
//                System.out.println("Marks : "+marks);
//            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}