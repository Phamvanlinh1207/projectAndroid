package vuphilinh.projectandroid.data.dao;

import java.util.List;

import vuphilinh.projectandroid.data.model.Product;

public interface ProductDao {
    Product find(int id);
    List<Product> all();
    void insert(Product product);
    void update(Product product);
    void delete(int id);
    List<Product> findByName(String name);
}
