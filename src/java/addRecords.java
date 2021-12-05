
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

@WebServlet(name = "addRecords", urlPatterns = {"/addRecords"})
public class addRecords extends HttpServlet {

   
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        JSONArray list = new JSONArray();
        
        
        String stname = request.getParameter("stname");
        String course = request.getParameter("course");
        String fee = request.getParameter("fee");
        
        JSONObject obj = new JSONObject();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?autoReconnect=true&useSSL=false", "root", "rajini89");
            pst = con.prepareStatement("insert into record(stname,course,fee) values(?,?,?)");
            pst.setString(1,stname);
            pst.setString(2,course);
            pst.setString(3,fee);
            pst.executeUpdate();
            
            obj.put("name","success");
            list.add(obj);
            
            out.println(list.toJSONString());
            out.flush();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addRecords.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
    }

    

}
