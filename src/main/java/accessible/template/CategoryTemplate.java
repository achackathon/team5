package accessible.template;

import accessible.model.Category;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 *
 * @author Maison Chaves
 */
public class CategoryTemplate {

    public static void load() {
        Fixture.of(Category.class).addTemplate("valid", new Rule() {
            {
                add("name", random(
                        "Hotel",
                        "Restaurante",
                        "Bares",
                        "Ponto turístico",
                        "Shopping",
                        "Boates"
                ));
            }
        });
    }
}
