package accessible.model;

import accessible.utils.Text;

/**
 *
 * @author jfranco
 */
public class Category {
    
    private Integer id;
    private String name;

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

    boolean filter(String filter) {
        return name != null && Text.contains(name, filter);
    }
}
