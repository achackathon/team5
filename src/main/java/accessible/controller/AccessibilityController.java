package accessible.controller;

import accessible.dao.AccessibilityDAO;
import accessible.model.Accessibility;
import br.com.caelum.vraptor.Consumes;
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
 * @author Maison Chaves
 */
@Controller
public class AccessibilityController {

    private final Result result;
    private final AccessibilityDAO accessibilityDAO;

    public AccessibilityController() {
        this.result = null;
        this.accessibilityDAO = null;
    }
    
    @Inject
    public AccessibilityController(Result result, AccessibilityDAO accessibilityDAO) {
        this.result = result;
        this.accessibilityDAO = accessibilityDAO;
    }

    @Get
    @Path(value = {"accessibility/", "accessibility"}, priority = Path.LOW)
    public void list() {
        List accessibilities = accessibilityDAO.list();
        result.use(Results.json()).withoutRoot().from(accessibilities).serialize();
    }

    @Post
    @Path(value = {"accessibility/", "accessibility"}, priority = Path.LOW)
    @Consumes("application/json")
    public void insert(Accessibility accessibility) {
        accessibilityDAO.insert(accessibility);
        result.nothing();
    }

    @Get
    @Path(value = {"accessibility/{id}/"}, priority = Path.HIGH)
    public void load(Integer id) {
        Accessibility accessibility = accessibilityDAO.load(id);
        result.use(Results.json()).from(accessibility).serialize();
    }

    @Post
    @Consumes("application/json")
    @Path(value = {"accessibility/{id}/"}, priority = Path.HIGH)
    public void update(Accessibility accessibility, Integer id) {
        accessibilityDAO.update(accessibility, id);
    }

}
