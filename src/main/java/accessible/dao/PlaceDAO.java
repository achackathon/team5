package accessible.dao;

import accessible.model.Place;
import accessible.template.*;
import br.com.six2six.fixturefactory.Fixture;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Maison Chaves
 */
@ApplicationScoped
public class PlaceDAO {

    private final List<Place> list;

    public PlaceDAO() {
        AccessibilityTemplate.load();
        AccessibilityItemTemplate.load();
        PlaceTemplate.load();
        list = Fixture.from(Place.class).gimme(5, "valid");
    }

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

    public List<Place> search(String filter) {
        List<Place> retorno = new ArrayList<>();

        for (Place place : list) {
            if (place.filter(filter)) {
                retorno.add(place);
            }
        }

        return retorno;
    }

}
