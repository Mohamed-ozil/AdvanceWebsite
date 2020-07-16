import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServletStudent extends javax.servlet.http.HttpServlet {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL ="jdbc:mysql://localhost:3306/eshop";
    private static String DB_USER = "root";
    static final String DB_PASS = "";

    static final String USER = "root";
    static final String PASS = "";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
    try {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String reg = request.getParameter("reg");
        String grade = request.getParameter("grade");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String course = request.getParameter("course");

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stm = conn.createStatement();
        String query = "INSERT INTO walimu ";
        ResultSet result = stm.executeQuery(query);
        stm.setString(name);
        stm.setString(reg);
        stm.setString(grade);
        stm.setString(phone);
        stm.setString(email);
        stm.setString(gender);
        stm.setString(course);


    }
    catch (Exception se){

    }
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
