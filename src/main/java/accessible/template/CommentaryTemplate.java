package accessible.template;

import accessible.model.Accessibility;
import accessible.model.Commentary;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 *
 * @author Maison Chaves
 */
public class CommentaryTemplate {

    public static void load() {
        Fixture.of(Commentary.class).addTemplate("valid", new Rule() {
            {
                add("text", random(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed efficitur mi est, eu tempor mi posuere eu. Aliquam erat volutpat.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ac tortor fringilla, rutrum enim sit amet, hendrerit ante. Aenean ut. ",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas id erat fermentum, malesuada libero quis, maximus nisi. Sed ac fringilla.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vulputate velit vel enim vestibulum, eget facilisis neque fermentum. Donec accumsan.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse porta lectus nec pharetra tristique. Sed a sagittis nibh. Mauris eget.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed quis purus a dui sodales viverra. Nam mollis mi ante, id.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eget ex blandit, condimentum nunc ut, tincidunt enim. Integer finibus dolor.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam sodales ullamcorper neque sed commodo. Duis condimentum dui lobortis rutrum eleifend.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere, leo ac semper varius, metus nisi ultrices odio, a ultricies.",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras rhoncus mauris et ante consectetur, nec fermentum felis vestibulum. Phasellus sit."
                ));
                add("author", name());
            }
        });
    }
}
