package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MLogin {
     ResultSet rs;
        public void login(int userId,String password){
       try
        {
            if(userId == 0){
            JOptionPane.showMessageDialog(null, "User Id cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(password.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            Statement st=MyJDBConnection.createDBConnection().createStatement();
            String sql = "select * from tbl_users where user_id = '"+userId+"' and password = '" + password + "'";
             rs = st.executeQuery(sql);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"login successful","Login",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {               
                JOptionPane.showMessageDialog(null,"fail to login username and password does not match","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Editing failed","Customer",JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
        public  ResultSet getResult(){
            return rs;
        }
}
