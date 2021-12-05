import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        JSONArray list = new JSONArray();
        
        
        String Name = request.getParameter("name");
        String Email = request.getParameter("email");
        String Password = request.getParameter("password");
        
        JSONObject obj = new JSONObject();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?autoReconnect=true&useSSL=false", "root", "rajini89");
            pst = con.prepareStatement("insert into registrationtb (name,email,password) values(?,?,?)");
            pst.setString(1,Name);
            pst.setString(2,Email);
            pst.setString(3,Password);
            pst.executeUpdate();
            obj.put("name","success");
            list.add(obj);
            
            out.println(list.toJSONString());
            out.flush();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }

    

}
