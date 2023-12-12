package nextstep.ladder.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Participants {
    private static final String PARTICIPANTS_BLANK_ERROR = "참가자를 입력해주세요.";
    private static final String PARTICIPATNS_MINIMUM_ERROR = "참가자가 부족합니다.";

    private final List<Participant> participants;

    public Participants(List<String> participants) {
        this.participants = convertParticipants(participants);
    }

    private List<Participant> convertParticipants(List<String> participants) {
        return IntStream.range(0, participants.size())
                .mapToObj(position -> new Participant(participants.get(position), position))
                .collect(Collectors.toList());
    }

    private void isNullParticipants(String participants) {
        if (StringUtils.isBlank(participants)) {
            throw new IllegalArgumentException(PARTICIPANTS_BLANK_ERROR);
        }
    }

    private String[] splitParticipants(String participants) {
        String[] participantArray = participants.split(",");
        if (participantArray.length < 2) {
            throw new IllegalArgumentException(PARTICIPATNS_MINIMUM_ERROR);
        }
        return participantArray;
    }

    private List<String> convertList(String[] participants) {
        return Arrays.asList(participants);
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public int getNumberOfParticipants() {
        return participants.size();
    }
}
