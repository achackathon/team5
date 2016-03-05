package accessible;

import accessible.model.Accessibility;
import accessible.model.Place;
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
    @Path({"accessibility/", "accessibility"})
    public void lista() {
        List accessibility = accessibilityDAO.list();
        result.use(Results.json()).withoutRoot().from(accessibility).serialize();
    }

    @Post
    @Path({"accessibility/", "accessibility"})
    public void insert(Accessibility accessibility) {
        accessibilityDAO.insert(accessibility);
        result.nothing();
    }

    @Get
    @Path({"accessibility/{id}"})
    public void load(Integer id) {
        Accessibility accessibility = accessibilityDAO.load(id);
        result.use(Results.json()).from(accessibility).serialize();
    }

    @Post
    @Path({"accessibility/{id}"})
    public void update(Accessibility accessibility, Integer id) {
        accessibilityDAO.update(accessibility, id);
    }

}
