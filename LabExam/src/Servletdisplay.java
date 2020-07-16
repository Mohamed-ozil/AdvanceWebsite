import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

class ServletTest extends javax.servlet.http.HttpServlet {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL ="jdbc:mysql://localhost:3306/eshop";
    private static String DB_USER = "root";
    static final String DB_PASS = "";

    static final String USER = "root";
    static final String PASS = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        try {
            PrintWriter out = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement stm = conn.createStatement();

            String query = "SELECT name, grade, phone from walimu" ;
            ResultSet result = stm.executeQuery(query);


        }
        catch (Exception se){

        }
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
