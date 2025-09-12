package jp.educure.problem4;

import java.time.LocalDateTime;

public class MeetingRoomForm {
    private String roomName;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Integer participants;

    // getter, setter
    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public Integer getParticipants() {
        return participants;
    }
    public void setParticipants(Integer participants) {
        this.participants = participants;
    }
}
