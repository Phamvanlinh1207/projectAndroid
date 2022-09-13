package vuphilinh.projectandroid.data.dao;


import java.util.List;

import vuphilinh.projectandroid.data.model.Category;

public interface CategoryDao {
    Category find(int id);
    List<Category> all();
    void insert(Category category);
    void update(Category category);
    void delete(int id);
    List<Category> findByName(String name);
}
