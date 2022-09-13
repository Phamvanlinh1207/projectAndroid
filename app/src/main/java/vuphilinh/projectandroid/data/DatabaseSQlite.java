package vuphilinh.projectandroid.data;

import android.content.Context;

import vuphilinh.projectandroid.data.dao.CategoryDao;
import vuphilinh.projectandroid.data.dao.ProductDao;

public class DatabaseSQlite extends DatabaseDao{
    private Context context;

    public DatabaseSQlite(Context context){
        this.context = context;
    }

    @Override
    public CategoryDao getCategoryDao() {
        return null;
    }

    @Override
    public ProductDao getProductDao() {
        return null;
    }
}
