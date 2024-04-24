package lv.uee.geo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class GeoJson<T extends Feature<Geometry>> {
    private String type;
    private List<T> features;

}
