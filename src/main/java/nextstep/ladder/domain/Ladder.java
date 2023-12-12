package nextstep.ladder.domain;

public class Ladder {
    private static final String MINIMUM_HEIGHT_ERROR = "사다리 최고 높이는 1보다 작을 수 없습니다.";
    private static final int MINIMUM_HEIGHT = 1;

    private final Lines ladderLines;

    public Ladder(int maxHeight, Participants participants) {
        validationMaxHeight(maxHeight);

        this.ladderLines = makeRandomLines(maxHeight, participants.getNumberOfParticipants());
    }

    private void validationMaxHeight(int maxHeight) {
        if (maxHeight < MINIMUM_HEIGHT) {
            throw new IllegalArgumentException(MINIMUM_HEIGHT_ERROR);
        }
    }

    public Lines getLadderLines() {
        return ladderLines;
    }

    private Lines makeRandomLines(int maxHeight, int numberOfParticipants) {
        return RandomLinesFactory.createLines(maxHeight, numberOfParticipants);
    }
}
