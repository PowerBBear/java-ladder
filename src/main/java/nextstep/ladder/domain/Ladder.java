package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ladder {
    private static final String MINIMUM_HEIGHT_ERROR = "사다리 최고 높이는 1보다 작을 수 없습니다.";
    private static final int MINIMUM_HEIGHT = 1;

    private final List<Line> lines = new ArrayList<>();

    public Ladder(int maxHeight, Participants participants) {
        validationMaxHeight(maxHeight);

        for (int i=0; i<maxHeight; i++) {
            lines.add(makeRandomLine(participants.getNumberOfParticipants()));
        }
    }

    private void validationMaxHeight(int maxHeight) {
        if (maxHeight < MINIMUM_HEIGHT) {
            throw new IllegalArgumentException(MINIMUM_HEIGHT_ERROR);
        }
    }

    public List<Line> getLines() {
        return lines;
    }

    private Line makeRandomLine(int numberOfParticipants) {
        return new Line(RandomLine.makeRandomLine(numberOfParticipants));
    }
}
