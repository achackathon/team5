package accessible.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author Maison Chaves
 */
@Controller
public class ServiceController {

    private final Result result;

    /**
     * @deprecated CDI eyes only
     */
    @Deprecated
    protected ServiceController() {
        this(null);
    }

    @Inject
    public ServiceController(Result result) {
        this.result = result;
    }

    @Path({"/"})
    public void index() {
        result.forwardTo("/index.html");
    }
}
