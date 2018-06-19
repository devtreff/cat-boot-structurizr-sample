package cc.catalysts.boot.structurizr;

import cc.catalysts.structurizr.ViewProvider;
import com.structurizr.view.ViewSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>This is the main class of the architecture application. It starts as a {@link SpringBootApplication}, thus
 * also automatically configuring {@link cc.catalysts.structurizr.config.StructurizrAutoConfiguration}.</p>
 *
 * <p>The properties are taken from <code>application.properties</code>.</p>
 *
 * <p>All {@link org.springframework.stereotype.Component}s in this package and in subpackaged are detected, they
 * build the Structurizr {@link com.structurizr.model.Model}.</p>
 *
 * <p>This class also serves as a {@link ViewProvider} and created the {@link com.structurizr.view.SystemLandscapeView}
 * or our model.</p>
 *
 * @author Klaus Lehner, Catalysts GmbH
 */
@SpringBootApplication
public class Architecture implements ViewProvider {

    public static void main(String[] args) {
        SpringApplication.run(Architecture.class, args);
    }

    @Override
    public void createViews(ViewSet viewSet) {
        viewSet.createSystemLandscapeView("enterprise", "Enterprise Diagram").addAllElements();
    }
}
