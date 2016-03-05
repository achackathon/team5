package accessible.controller;

import accessible.dao.CommentaryDAO;
import accessible.model.Commentary;
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
public class CommentaryController {
    
    private final Result result;
    private final CommentaryDAO commentaryDAO;

    public CommentaryController() {
        this.result = null;
        this.commentaryDAO = null;
    }
    
    @Inject
    public CommentaryController(Result result, CommentaryDAO commentaryDAO) {
        this.result = result;
        this.commentaryDAO = commentaryDAO;
    }

    @Get
    @Path({"commentary/", "commentary"})
    public void list() {
        List commentaries = commentaryDAO.list();
        result.use(Results.json()).withoutRoot().from(commentaries).serialize();
    }

    @Post
    @Path({"commentary/", "commentary"})
    public void insert(Commentary commentary) {
        commentaryDAO.insert(commentary);
        result.nothing();
    }

    @Get
    @Path({"commentary/{id}"})
    public void load(Integer id) {
        Commentary commentary = commentaryDAO.load(id);
        result.use(Results.json()).from(commentary).serialize();
    }

    @Post
    @Path({"commentary/{id}"})
    public void update(Commentary commentary, Integer id) {
        commentaryDAO.update(commentary, id);
    }
    
}
