package nextstep.ladder.domain;

import java.util.Arrays;

public enum Point {
    LINE(true),
    NOTHING(false);

    private static final String EQUAL_TWO_POINTS_ERROR = "두 사다리는 연속으로 등장할 수 없습니다.";
    private static final String NOT_MATCH_POINT_STATUS = "상태에 맞는 적잘한 사다리 계단을 찾을 수 없습니다.";

    private final boolean pointStatus;

    Point(boolean pointStatus) {
        this.pointStatus = pointStatus;
    }

    public static Point valueOf(boolean pointStatus) {
        return Arrays.stream(values())
                .filter(point -> point.pointStatus == pointStatus)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(NOT_MATCH_POINT_STATUS));
    }

    public void validateTwoContinusPoint(Point point) {
        if (this.pointStatus && point.pointStatus) {
            throw new IllegalArgumentException(EQUAL_TWO_POINTS_ERROR);
        }
    }

    public boolean pointStatus() {
        return pointStatus;
    }

    public boolean movable() {
        return this.pointStatus;
    }
}
