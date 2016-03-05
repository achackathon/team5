package accessible.dao;

import accessible.model.Commentary;
import accessible.model.Place;
import accessible.template.CommentaryTemplate;
import accessible.template.PlaceTemplate;
import br.com.six2six.fixturefactory.Fixture;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author jfranco
 */
@ApplicationScoped
public class CommentaryDAO {
    
    List<Commentary> list = new ArrayList<>();

    public CommentaryDAO() {
        CommentaryTemplate.load();
        list = Fixture.from(Commentary.class).gimme(2, "valid");
    }

    public List<Commentary> list() {
        return list;
    }

    public void insert(Commentary commentary) {
        list.add(commentary);
    }

    public Commentary load(Integer id) {
        return list.get(id);
    }

    public void update(Commentary commentary, Integer id) {
        list.set(id, commentary);
    }
    
}
