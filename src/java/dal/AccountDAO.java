package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

public class AccountDAO extends DBContext{
    public Account getAcc(String acc, String pass) {
        String sql="with t as (select * from Accounts ac where account = ? and password = ?)\n" +
"select t.*, st.Value as Gender, st1.Value as Status, st2.value as Role from t inner join settings st on t.Gender = st.id\n" +
"inner join settings st1 on statusID = st1.id inner join settings st2 on roleID = st2.id";
        try{
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, acc);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                Account c = new Account();
                c.setID(rs.getInt("id"));
                c.setFullName(rs.getString("fullname"));
                c.setGender(rs.getInt("gender"));
                c.setEmail(rs.getString("email"));
                c.setStatus(rs.getString("status"));
                c.setJoinDate(rs.getString("joindate"));
                c.setImage(rs.getString("image"));
                c.setRole(rs.getString("role"));
                return c;
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void newPass(String str, String newPass) {
        String sql="select * from accounts\n" +
            "WHERE Account = ? or Email = ?";
        String sql2="UPDATE accounts\n" +
            "SET Password = ? WHERE id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, str);
            st.setString(2, str);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                PreparedStatement st2 = connection.prepareStatement(sql2);
                st2.setString(1, newPass);
                st2.setInt(2, rs.getInt("ID"));
                st2.executeUpdate();
            }
            
        }catch (SQLException e) {
            System.out.println(e);
        }
    }
}
