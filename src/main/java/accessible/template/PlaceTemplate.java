package accessible.template;

import accessible.model.Place;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 *
 * @author Maison Chaves
 */
public class PlaceTemplate {

    public static void load() {
        Fixture.of(Place.class).addTemplate("valid", new Rule() {
            {
                add("name", random("Fogo de Chão", 
                        "Casa dos Contos", 
                        "Café com Letras", 
                        "Amadeus - Bar e Restaurante", 
                        "Restaurante Jin Lon", 
                        "Restaurante Bem Natural", 
                        "Dona Lucinha", 
                        "Restaurante Chop Stick San", 
                        "Vila Árabe", 
                        "La Traviata", 
                        "Dona Derna"));
                add("description", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                        + "Cras scelerisque enim dolor, et pretium est dictum sit amet. Aliquam "
                        + "facilisis nulla quis mi tempus, nec tempor felis faucibus. Nulla eu "
                        + "hendrerit odio, in sagittis ligula. Aliquam dignissim sem vitae mi "
                        + "efficitur laoreet vitae sit amet dolor. Nulla ipsum risus, viverra.");
                add("address", random("R. Tomé de Souza, 1331", "R. Padre Odorico, 38", "Rua Paraíba, 1356 - Savassi", "R. Antônio de Albuquerque, 448"));
                add("city", "Belo Horizonte");
                add("country", "Brasil");
                add("telephone", regex("(\\d{2}) \\d{4}-\\d{4}"));
            }
        });
    }

}
