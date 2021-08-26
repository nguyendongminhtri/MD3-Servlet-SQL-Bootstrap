package chinhanh.service.userservice;

import chinhanh.config.ConnectMySQL;
import chinhanh.model.Category;
import chinhanh.model.Users;
import chinhanh.service.IParentService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IUserService extends IParentService<Users> {
    Users findByEmailAndPassword(String email, String password);
}
