package chinhanh.service.userservice;

import chinhanh.config.ConnectMySQL;
import chinhanh.model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService{
    Connection connection = ConnectMySQL.getConnection();
    public static final String SELECT_USER = "SELECT * FROM users WHERE email = ? and password = ?";
//    PreparedStatement statement = connection.prepareStatement(SELECT_USER);
//        (1, email);
//        statement.setString(2, password);
//
//    ResultSet result = statement.executeQuery();
//
//    User user = null;
//
//        if (result.next()) {
//        user = new User();
//        user.setFullname(result.getString("fullname"));
//        user.setEmail(email);
//    }
//
//    public UserServiceImpl() throws SQLException {
//    }
//
//        connection.close();
//
//        return user;

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users findById(Long id) {
        return null;
    }

    @Override
    public void save(Users users) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void edit(Long id, Users users) {

    }

    @Override
    public Users findByEmailAndPassword(String email, String password) {
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_USER);
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();

            Users user = null;

            if (result.next()) {
                user = new Users();
                user.setFullname(result.getString("fullname"));
                user.setEmail(email);
                user.setPassword(password);
            }
            System.out.println("SELECT -->"+statement);
            connection.setAutoCommit(true);  //Neu de connection.close() hoac connection.commit() thi chi dang nhap duoc 1 lan
            //Su khac biet cua setAutoCommit(true) la co the tu dong cap nhat lai query
            return user;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
