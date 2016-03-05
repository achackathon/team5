package accessible.dao;

import accessible.model.Commentary;
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
