package vuphilinh.projectandroid.data.dao;

import java.util.List;

import vuphilinh.projectandroid.data.model.OrderDetail;

public interface OrderDetailDao {
    OrderDetail find(int id);
    List<OrderDetail> all();
    void insert(OrderDetail orderDetail);
    void update(OrderDetail orderDetail);
    void delete(int id);
    List<OrderDetail> findByName(String name);
}
