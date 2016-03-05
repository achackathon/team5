package accessible.model;

/**
 *
 * @author jfranco
 */
public class Place {
    
    private Integer id;
    private String description;
    private String adress;
    private String city;
    private String country;
    private String telephone;
    private String latitude;
    private String longitude;
    private AccessibilityItem accessibilityItem;
    private PlaceType placeType;

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
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
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
    public AccessibilityItem getAccessibilityItem() {
        return accessibilityItem;
    }

    /**
     * @param accessibilityItem the accessibilityItem to set
     */
    public void setAccessibilityItem(AccessibilityItem accessibilityItem) {
        this.accessibilityItem = accessibilityItem;
    }

    /**
     * @return the placeType
     */
    public PlaceType getPlaceType() {
        return placeType;
    }

    /**
     * @param placeType the placeType to set
     */
    public void setPlaceType(PlaceType placeType) {
        this.placeType = placeType;
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
    
}
