package accessible.dao;

import accessible.model.AccessibilityItem;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author jfranco
 */
@ApplicationScoped
public class AccessibilityItemDAO {
    
    List<AccessibilityItem> list = new ArrayList<>();

    public List<AccessibilityItem> list() {
        return list;
    }

    public void insert(AccessibilityItem accessibilityItem) {
        list.add(accessibilityItem);
    }

    public AccessibilityItem load(Integer id) {
        return list.get(id);
    }

    public void update(AccessibilityItem accessibilityItem, Integer id) {
        list.set(id, accessibilityItem);
    }
    
}
