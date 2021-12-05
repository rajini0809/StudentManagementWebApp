import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet(name = "getRecords", urlPatterns = {"/getRecords"})
public class getRecords extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        JSONArray list = new JSONArray();
        
       
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?autoReconnect=true&useSSL=false", "root", "rajini89");
            String query = "select * from record";
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            
            while(rs.next()){
                    JSONObject obj = new JSONObject();
                    String id = rs.getString("id");
                    String name = rs.getString("stname");
                    String course = rs.getString("course");
                    String fee = rs.getString("fee");
                    
                    obj.put("name",name);
                    obj.put("course",course);
                    obj.put("fee",fee);
                    obj.put("id",id);
                    
                    list.add(obj);
                    
                    
            }
            
            out.println(list.toJSONString());
            out.flush();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getRecords.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(getRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    

}
