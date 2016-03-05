package accessible.dao;

import accessible.model.Accessibility;
import accessible.template.AccessibilityTemplate;
import br.com.six2six.fixturefactory.Fixture;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Maison Chaves
 */
@ApplicationScoped
public  class AccessibilityDAO {
    
    public AccessibilityDAO() {
        AccessibilityTemplate.load();
        list = Fixture.from(Accessibility.class).gimme(2, "valid");
    }

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
