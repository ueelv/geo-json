package lv.uee;

import lv.uee.geo.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Feature<Geometry>> features = new ArrayList<>();


        Point point1= new Point(new Position(0.1,0.2));
        Map<String, Object>  pointProperties1 = new HashMap<>();
        pointProperties1.put("prop0","value0");
        Feature<Geometry> featurePoint1 = new Feature<>(point1,pointProperties1);
        features.add(featurePoint1);

        Point point2 =new Point(new Position(0.9,0.2));
        Map<String, Object>  pointProperties2 = new HashMap<>();
        pointProperties1.put("prop0",1);
        Feature<Geometry> featurePoint2 = new Feature<>(point2,pointProperties2);

        features.add(featurePoint2);

        List<Position> a = new ArrayList<>();
        a.add(new Position(0.3,0.2));
        a.add(new Position(0.5,0.2));
        LineString lineString = new LineString(a);
        Feature<Geometry> featureLiineString =  new Feature<>(lineString,null);
        features.add(featureLiineString);


        GeoJson<Feature<Geometry>> geoJson =GeoJson.builder()
                .type("FeatureCollection")
                .features(features)
                .build();




        System.out.println(LogUtils.convertToJson(geoJson));
    }
}