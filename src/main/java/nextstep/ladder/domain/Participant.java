package nextstep.ladder.domain;

public class Participant {
    private static final String PARTICIPANT_LENGTH_ERROR = "참가자 이름은 5글자를 넘을 수 없습니다.";
    private static final int MAXIMUM_PARTICIPANT_LENGTH = 5;

    private final String name;
    private Position position;

    public Participant(String name, int position) {
        validateNameLength(name);
        this.name = name;
        this.position = new Position(position);
    }

    private void validateNameLength(String participant) {
        if (participant.length() > MAXIMUM_PARTICIPANT_LENGTH) {
            throw new IllegalArgumentException(PARTICIPANT_LENGTH_ERROR);
        }
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
