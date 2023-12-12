package nextstep.ladder.domain;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PointCreator {
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    public static Point makeRandomPoint(List<Point> points, int index) {
        if (points.get(index).pointStatus()) {
            return Point.NOTHING;
        }
        return Point.valueOf(random.nextBoolean());
    }
}

