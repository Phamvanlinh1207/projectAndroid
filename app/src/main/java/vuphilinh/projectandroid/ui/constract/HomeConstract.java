package vuphilinh.projectandroid.ui.constract;

import java.util.List;

import vuphilinh.projectandroid.data.model.Product;

public interface HomeConstract {
    interface IView{
        void setProductListToView(List<Product> productList);
        void showProductDetail(Product product);
    }

    interface IPresenter{
        void setView(IView view);
        void getProductList();
        void getProduct(int productId);
    }
}