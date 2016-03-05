package accessible.dao;

import accessible.model.AccessibiltyCategory;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author jfranco
 */
@ApplicationScoped
public class AccessibiltyCategoryDAO {
    
    List<AccessibiltyCategory> list = new ArrayList<>();

    public List<AccessibiltyCategory> list() {
        return list;
    }

    public void insert(AccessibiltyCategory accessibilityCategory) {
        list.add(accessibilityCategory);
    }

    public AccessibiltyCategory load(Integer id) {
        return list.get(id);
    }

    public void update(AccessibiltyCategory accessibilityCategory, Integer id) {
        list.set(id, accessibilityCategory);
    }
    
}
