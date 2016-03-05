package accessible.dao;

import accessible.model.Category;
import accessible.template.CategoryTemplate;
import br.com.six2six.fixturefactory.Fixture;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author jfranco
 */
@ApplicationScoped
public class CategoryDAO {
    
    private List<Category> list;

    public CategoryDAO() {
        CategoryTemplate.load();
        list = Fixture.from(Category.class).gimme(6, "valid");
    }
    
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
