
package accessible.dao;

import accessible.model.Accessibility;
import accessible.model.Place;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Maison Chaves
 */
@ApplicationScoped
public  class AccessibilityDAO {

    List<Accessibility> list = new ArrayList<>();

    public List<Accessibility> list() {
        return list;
    }

    public void insert(Accessibility accessibility) {
        list.add(accessibility);
    }

    public Accessibility load(Integer id) {
        return list.get(id);
    }

    public void update(Accessibility accessibility, Integer id) {
        list.set(id, accessibility);
    }
    
}
