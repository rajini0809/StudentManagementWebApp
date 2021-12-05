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
import javax.servlet.http.HttpSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet(name = "LoginValidate", urlPatterns = {"/LoginValidate"})
public class LoginValidate extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        JSONArray list = new JSONArray();
        
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
        JSONObject obj = new JSONObject();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?autoReconnect=true&useSSL=false", "root", "rajini89");
            pst = con.prepareStatement("select * from logintable where username = ? and password = ? ");
            pst.setString(1,username); 
            pst.setString(2,password);
           
            rs = pst.executeQuery();
            
            String msg;
            
            //HttpSession session = request.getSession();
            
            if(rs.next())
            {
                
                //session.setAttribute("username",username);
                //session.setAttribute("password",password);
                
                msg = "1";
                obj.put("msg",msg);
                list.add(obj);
                out.println(list.toJSONString());
                out.flush();
            
            }
            else
            {
                
                msg = "3";
                obj.put("msg",msg);
                list.add(obj);
                out.println(list.toJSONString());
                out.flush();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginValidate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }

    
}
