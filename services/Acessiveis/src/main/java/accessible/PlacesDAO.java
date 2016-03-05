
package accessible;

import accessible.model.Place;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Maison Chaves
 */
@ApplicationScoped
public  class PlacesDAO {

    List<Place> list = new ArrayList<>();

    public List<Place> list() {
        return list;
    }

    void insert(Place place) {
        list.add(place);
    }

    Place load(Integer id) {
        return list.get(id);
    }

    void update(Place place, Integer id) {
        list.set(id, place);
    }
    
}
