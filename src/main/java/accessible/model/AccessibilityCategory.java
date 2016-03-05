package accessible.model;

/**
 *
 * @author jfranco
 */
public class AccessibilityCategory {
    
    private Integer id;
    private String name;
    private Accessibility accessibility;

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
     * @return the accessibility
     */
    public Accessibility getAccessibility() {
        return accessibility;
    }

    /**
     * @param accessibility the accessibility to set
     */
    public void setAccessibility(Accessibility accessibility) {
        this.accessibility = accessibility;
    }
    
}
