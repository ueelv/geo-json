package lv.uee.geo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Point implements Geometry {
    private GeometryType type=GeometryType.Point;
    private List<Double> coordinates = new ArrayList<>();

    public Point(Position position) {
        this.coordinates.add(position.latitude());
        this.coordinates.add(position.longitude());
    }

    @Override
    public String toString() {
        return "Point{" +
                "type='" + type + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
