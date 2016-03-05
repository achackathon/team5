package accessible.model;

import java.util.List;

/**
 *
 * @author jfranco
 */
public class Accessibility {
    
    private Integer id;
    private String name;
    private String description;
    private List<AccessibiltyCategory> accessibiltyCategory;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the accessibiltyCategory
     */
    public List<AccessibiltyCategory> getAccessibiltyCategory() {
        return accessibiltyCategory;
    }

    /**
     * @param accessibiltyCategory the accessibiltyCategory to set
     */
    public void setAccessibiltyCategory(List<AccessibiltyCategory> accessibiltyCategory) {
        this.accessibiltyCategory = accessibiltyCategory;
    }
   
}
