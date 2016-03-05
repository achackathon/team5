
package accessible.template;

import accessible.model.Accessibility;
import accessible.model.AccessibilityItem;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 *
 * @author Maison Chaves
 */
public class AccessibilityItemTemplate {
    public static void load(){
        Fixture.of(AccessibilityItem.class).addTemplate("valid", new Rule() {
            {
                add("grade", random(Integer.class, range(0, 5)));
                add("accessibility", one(Accessibility.class, "valid"));
            }
        });
    }
}
