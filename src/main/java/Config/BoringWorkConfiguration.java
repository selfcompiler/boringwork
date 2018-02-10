package Config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import io.dropwizard.db.DataSourceFactory;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@Data
public class BoringWorkConfiguration extends Configuration {
    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";


    @Valid
    @NotNull
    private DataSourceFactory databaseConfiguration;

    @JsonProperty
    public String getTemplate() {
        return template;
    }



    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public String getDefaultName() {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) {
        this.defaultName = name;
    }

}
