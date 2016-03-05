package accessible.template;

import accessible.model.Accessibility;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

/**
 *
 * @author Maison Chaves
 */
public class AccessibilityTemplate {

    public static void load() {
        Fixture.of(Accessibility.class).addTemplate("valid", new Rule() {
            {
                add("name", random(
                        "Estacionamento",
                        "Abrigos em pontos de embarque",
                        "Circulação externa",
                        "Rebaixamento de calçadas",
                        "Rampas",
                        "Escadas e degraus isolados",
                        "Elevadores",
                        "Plataformas de percurso vertical",
                        "Plataformas de percurso vertical",
                        "Portas",
                        "Barras de apoio",
                        "Boxe para bacia sanitária acessível",
                        "Áreas de transferência",
                        "Localização de barras de apoio",
                        "Instalação de bacias sanitárias",
                        "Papeleiras",
                        "Lavatório",
                        "Mictório",
                        "Bebedouros",
                        "Telefones",
                        "Mesas ou superfícies para trabalho ou refeições",
                        "Balcões",
                        "Comunicação e sinalização"
                ));
            }
        });
    }
}
