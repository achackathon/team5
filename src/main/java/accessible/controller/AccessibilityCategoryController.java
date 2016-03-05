package accessible.controller;

import accessible.dao.AccessibilityCategoryDAO;
import accessible.model.AccessibilityCategory;
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
public class AccessibilityCategoryController {
    
    private final Result result;
    private final AccessibilityCategoryDAO accessibilityCategoryDAO;

    public AccessibilityCategoryController() {
        this.result = null;
        this.accessibilityCategoryDAO = null;
    }
    
    @Inject
    public AccessibilityCategoryController(Result result, AccessibilityCategoryDAO placesDAO) {
        this.result = result;
        this.accessibilityCategoryDAO = placesDAO;
    }

    @Get
    @Path({"accessibilityCategory/", "accessibilityCategory"})
    public void list() {
        List accessibilityCategories = accessibilityCategoryDAO.list();
        result.use(Results.json()).withoutRoot().from(accessibilityCategories).serialize();
    }

    @Post
    @Path({"accessibilityCategory/", "accessibilityCategory"})
    public void insert(AccessibilityCategory accessibilityCategory) {
        accessibilityCategoryDAO.insert(accessibilityCategory);
        result.nothing();
    }

    @Get
    @Path({"accessibilityCategory/{id}"})
    public void load(Integer id) {
        AccessibilityCategory accessibilityCategory = accessibilityCategoryDAO.load(id);
        result.use(Results.json()).from(accessibilityCategory).serialize();
    }

    @Post
    @Path({"accessibilityCategory/{id}"})
    public void update(AccessibilityCategory accessibilityCategory, Integer id) {
        accessibilityCategoryDAO.update(accessibilityCategory, id);
    }
    
}
