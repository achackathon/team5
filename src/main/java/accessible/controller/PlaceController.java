package accessible.controller;

import accessible.dao.PlaceDAO;
import accessible.model.Place;
import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Maison Chaves
 */
@Controller
public class PlaceController {

    private final Result result;
    private final PlaceDAO placesDAO;

    public PlaceController() {
        this.result = null;
        this.placesDAO = null;
    }

    @Inject
    public PlaceController(Result result, PlaceDAO placesDAO) {
        this.result = result;
        this.placesDAO = placesDAO;
    }

    @Get
    @Path(value = {"places/", "places"}, priority = Path.LOW)
    public void list() {
        List places = placesDAO.list();
        result.use(Results.json()).withoutRoot().from(places)
                .include("accessibilityItem")
                .include("accessibilityItem.accessibility")
                .serialize();
    }

    @Post
    @Path(value = {"places/", "places"}, priority = Path.LOW)
    @Consumes("application/json")
    public void insert(Place place) {
        placesDAO.insert(place);
        result.nothing();
    }

    @Get
    @Path(value = {"places/{id}/"}, priority = Path.HIGH)
    public void load(Integer id) {
        Place place = placesDAO.load(id);
        result.use(Results.json()).withoutRoot().from(place)
                .include("accessibilityItem")
                .include("accessibilityItem.accessibility")
                .serialize();
    }

    @Post
    @Consumes("application/json")
    @Path(value = {"places/{id}/"}, priority = Path.HIGH)
    public void update(Place place, Integer id) {
        placesDAO.update(place, id);
    }
    
    @Get
    @Path(value = {"places/search/{filter}/"}, priority = Path.HIGH)
    public void search(String filter) {
        List places = placesDAO.search(filter);
        result.use(Results.json()).withoutRoot().from(places)
                .include("accessibilityItem")
                .include("accessibilityItem.accessibility")
                .serialize();
    }
}
