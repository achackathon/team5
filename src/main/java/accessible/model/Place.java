package accessible.model;

import accessible.utils.Text;
import java.util.List;

/**
 *
 * @author jfranco
 */
public class Place {
    
    private Integer id;
    private String name;
    private String description;
    private String address;
    private String city;
    private String country;
    private String telephone;
    private String latitude;
    private String longitude;
    private List<AccessibilityItem> accessibilityItem;
    private Category category;
    private Commentary commentary;

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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the accessibilityItem
     */
    public List<AccessibilityItem> getAccessibilityItem() {
        return accessibilityItem;
    }

    /**
     * @param accessibilityItem the accessibilityItem to set
     */
    public void setAccessibilityItem(List<AccessibilityItem> accessibilityItem) {
        this.accessibilityItem = accessibilityItem;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
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
     * @return the commentary
     */
    public Commentary getCommentary() {
        return commentary;
    }

    /**
     * @param commentary the commentary to set
     */
    public void setCommentary(Commentary commentary) {
        this.commentary = commentary;
    } 

    public boolean filter(String filter) {
        return (name != null && Text.contains(name, filter)) || (category != null && category.filter(filter));
    }
    
}
