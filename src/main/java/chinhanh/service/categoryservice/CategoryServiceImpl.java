package chinhanh.service.categoryservice;

import chinhanh.config.ConnectMySQL;
import chinhanh.model.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryServiceImpl implements ICategoryService{
    Connection connection = ConnectMySQL.getConnection();
    public static final String SELECT_ALL_CATEGORY = "select * from category";
    public static final String INSERT_INTO_CATEGORY = "INSERT INTO category (category.nameCategory, category.avatarCategory) VALUES (?,?);";
    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_CATEGORY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nameCategory = resultSet.getString("nameCategory");
                String avatarCategory = resultSet.getString("avatarCategory");
                Category category = new Category(id, nameCategory,avatarCategory);
                categories.add(category);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {
        System.out.println("goi save");
//        int id = 0;
        System.out.println("QUERY: "+INSERT_INTO_CATEGORY);
        try (PreparedStatement statement = connection.prepareStatement(INSERT_INTO_CATEGORY)) {
            statement.setString(1, category.getNameCategory());
            statement.setString(2, category.getAvatarCategory());
            System.out.println("tren commit"+statement);
            statement.executeUpdate();
        } catch (SQLException throwables){
            try {
                connection.rollback();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteById(Long id) {

    }
    @Override
    public void edit(Long id, Category category) {

    }

    @Override
    public List<Category> findAllBySongId(Long song_id) {
        return null;
    }
}
