package vuphilinh.projectandroid.data.dao;


import java.util.List;

import vuphilinh.projectandroid.data.model.Order;

public interface OrderDao {
    Order find(int id);
    List<Order> all();
    void insert(Order order);
    void update(Order order);
    void delete(int id);
    List<Order> findByName(String name);
}
