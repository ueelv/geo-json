package lv.uee.geo;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Feature<T extends Geometry> {
    private String type = "Feature";
    private final T geometry;
    private final Map<String, Object> properties;

    public Feature(T geometry, Map<String, Object> properties) {
        this.geometry = geometry;
        this.properties = properties;
    }


}
