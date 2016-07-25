
package Nim;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Employee {
    
    ResultSet rs;
    PreparedStatement pst;  
    Statement st;  
    
    GetDBConnection dbc = new GetDBConnection(); //connect to database
      
    String id;
    String name;
    int phone;
    String add;
    String post;
    String gender;

    String username;
    String password;

    String birthday;
    
    
    
    public Employee(String pid, String pname, int pphone, String padd, String ppost, String pgender, String pBirth, String pusername, String ppassword)
    {
        this.id = pid;
        this.name = pname;
        this.phone = pphone;
        this.add = padd;
        this.post = ppost;
        this.gender = pgender;

        this.birthday = pBirth;
        
        this.username = pusername;
        this.password = ppassword;
     
    }
    
    
    public void addEmployee()
    {
        try {

            String sql = "insert into Employee values ('" + id + "','" + name + "'," + phone + ",'" + add + "','" + post + "','" + gender + "','" + birthday + "','" + username + "','" + password + "')";
            pst = dbc.con.prepareStatement(sql);
            pst.execute();
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, " error");
        }
    }
    
}
