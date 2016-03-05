
package accessible.dao;

import accessible.model.Place;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Maison Chaves
 */
@ApplicationScoped
public  class PlaceDAO {

    List<Place> list = new ArrayList<>();

    public List<Place> list() {
        return list;
    }

    public void insert(Place place) {
        list.add(place);
    }

    public Place load(Integer id) {
        return list.get(id);
    }

    public void update(Place place, Integer id) {
        list.set(id, place);
    }
    
}
