package accessible.controller;

import accessible.dao.CategoryDAO;
import accessible.model.Category;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author jfranco
 */
@Controller
public class CategoryController {
    
    private final Result result;
    private final CategoryDAO categoryDAO;

    public CategoryController() {
        this.result = null;
        this.categoryDAO = null;
    }
    
    @Inject
    public CategoryController(Result result, CategoryDAO placesDAO) {
        this.result = result;
        this.categoryDAO = placesDAO;
    }

    @Get
    @Path({"category/", "category"})
    public void list() {
        List categories = categoryDAO.list();
        result.use(Results.json()).withoutRoot().from(categories).serialize();
    }

    @Post
    @Path({"category/", "category"})
    public void insert(Category category) {
        categoryDAO.insert(category);
        result.nothing();
    }

    @Get
    @Path({"category/{id}"})
    public void load(Integer id) {
        Category category = categoryDAO.load(id);
        result.use(Results.json()).from(category).serialize();
    }

    @Post
    @Path({"category/{id}"})
    public void update(Category category, Integer id) {
        categoryDAO.update(category, id);
    }
    
}
