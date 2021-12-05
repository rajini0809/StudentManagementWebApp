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


@WebServlet(name = "edit_return", urlPatterns = {"/edit_return"})
public class edit_return extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        JSONArray list = new JSONArray();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?autoReconnect=true&useSSL=false", "root", "rajini89");
            String id = request.getParameter("id");
            pst = con.prepareStatement("select id,stname, course, fee from record where id = ?");
            pst.setString(1, id);
            rs = pst.executeQuery();
            
            if(rs.next() == true){
                String id1 = rs.getString(1);
                String stname = rs.getString(2);
                String scourse = rs.getString(3);
                String sfee = rs.getString(4);
                JSONObject obj = new JSONObject();
                
                obj.put("id", id1);
                obj.put("stname", stname);
                obj.put("scourse", scourse);
                obj.put("sfee", sfee);
                list.add(obj);
            }
            
            out.println(list.toJSONString());
            out.flush();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(edit_return.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(edit_return.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }

    

}
