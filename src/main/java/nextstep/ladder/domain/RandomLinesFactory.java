package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class RandomLinesFactory {
    public static Lines createLines(int height, int numberOfParticipants) {
        List<Line> lines = new ArrayList<>();

        for (int i = 0; i < height; i++) {
            lines.add(LineCreator.makeRandomLine(numberOfParticipants));
        }

        return new Lines(lines);
    }
}
