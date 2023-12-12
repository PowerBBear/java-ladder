package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LineCreator {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    public static Line makeRandomLine(int numberOfParticipants) {
        List<Point> points = new ArrayList<>();
        points.add(Point.valueOf(random.nextBoolean()));
        for (int index = 1; index < numberOfParticipants - 1; index++) {
            points.add(PointCreator.makeRandomPoint(points, index - 1));
        }
        return new Line(points);
    }
}
