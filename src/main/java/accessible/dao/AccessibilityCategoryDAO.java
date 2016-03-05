package accessible.dao;

import accessible.model.AccessibilityCategory;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author jfranco
 */
@ApplicationScoped
public class AccessibilityCategoryDAO {
    
    List<AccessibilityCategory> list = new ArrayList<>();

    public List<AccessibilityCategory> list() {
        return list;
    }

    public void insert(AccessibilityCategory accessibilityCategory) {
        list.add(accessibilityCategory);
    }

    public AccessibilityCategory load(Integer id) {
        return list.get(id);
    }

    public void update(AccessibilityCategory accessibilityCategory, Integer id) {
        list.set(id, accessibilityCategory);
    }
    
}
