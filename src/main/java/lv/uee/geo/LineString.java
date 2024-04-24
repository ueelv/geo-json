package lv.uee.geo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class LineString implements Geometry {
    private GeometryType type = GeometryType.LineString;
    private List<List<Double>> coordinates = new ArrayList<>();

    public LineString(List<Position> positions) {
        for (Position position : positions) {
            List<Double> coordinate = new ArrayList<>();
            coordinate.add(position.latitude());
            coordinate.add(position.longitude());
            coordinates.add(coordinate);
        }

    }

}
