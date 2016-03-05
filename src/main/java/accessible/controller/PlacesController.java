package accessible.controller;

import accessible.dao.PlaceDAO;
import accessible.model.Place;
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
public class PlacesController {

    private final Result result;
    private final PlaceDAO placesDAO;

    public PlacesController() {
        this.result = null;
        this.placesDAO = null;
    }
    
    @Inject
    public PlacesController(Result result, PlaceDAO placesDAO) {
        this.result = result;
        this.placesDAO = placesDAO;
    }

    @Get
    @Path({"places/", "places"})
    public void lista() {
        List places = placesDAO.list();
        result.use(Results.json()).withoutRoot().from(places).serialize();
    }

    @Post
    @Path({"places/", "places"})
    public void insert(Place place) {
        placesDAO.insert(place);
        result.nothing();
    }

    @Get
    @Path({"places/{id}"})
    public void load(Integer id) {
        Place place = placesDAO.load(id);
        result.use(Results.json()).from(place).serialize();
    }

    @Post
    @Path({"places/{id}"})
    public void update(Place place, Integer id) {
        placesDAO.update(place, id);
    }

}
