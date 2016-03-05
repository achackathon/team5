package accessible.dao;

import accessible.model.Category;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author jfranco
 */
@ApplicationScoped
public class CategoryDAO {
    
    List<Category> list = new ArrayList<>();

    public List<Category> list() {
        return list;
    }

    public void insert(Category category) {
        list.add(category);
    }

    public Category load(Integer id) {
        return list.get(id);
    }

    public void update(Category category, Integer id) {
        list.set(id, category);
    }
    
}
