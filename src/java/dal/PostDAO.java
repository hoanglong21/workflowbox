package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Post;

public class PostDAO extends DBContext {

    public List<Post> getAll() {
        List<Post> list = new ArrayList<>();
        String sql = "select p.*, a.FullName, st.value as status from Posts p \n"
                + "inner join accounts a on p.hrid = a.id inner join settings st on p.statusid = st.id";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post c = new Post();
                c.setID(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDate(rs.getString("date"));
                c.setContent(rs.getString("content"));
                c.setBrief(rs.getString("brief"));
                c.setThumbnail(rs.getString("thumbnail"));
                c.setFullName(rs.getString("fullname"));
                c.setStatus(rs.getString("status"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Post> getLastN(int n) {
        List<Post> list = new ArrayList<>();
        String sql = "select p.*, a.FullName, st.value as status from Posts p \n"
                + "inner join accounts a on p.hrid = a.id inner join settings st on p.statusid = st.id order by p.id desc limit ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, n);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Post c = new Post();
                c.setID(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDate(rs.getString("date"));
                c.setContent(rs.getString("content"));
                c.setBrief(rs.getString("brief"));
                c.setThumbnail(rs.getString("thumbnail"));
                c.setFullName(rs.getString("fullname"));
                c.setStatus(rs.getString("status"));
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public static void main(String[] args) {
        PostDAO dao = new PostDAO();
        List<Post> list = dao.getAll();
        System.out.println(list.get(1).getHrName());
    }
}
