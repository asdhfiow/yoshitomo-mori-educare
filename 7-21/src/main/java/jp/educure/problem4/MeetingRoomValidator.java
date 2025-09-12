package jp.educure.problem4;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.DayOfWeek;
import java.time.Duration;

@Component
public class MeetingRoomValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return MeetingRoomForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        MeetingRoomForm form = (MeetingRoomForm) target;

        if (form.getRoomName() == null || form.getRoomName().isEmpty()) {
            errors.rejectValue("roomName", "roomName.required", "会議室名は必須です");
        }
        if (form.getParticipants() == null) {
            errors.rejectValue("participants", "participants.required", "利用人数は必須です");
        } else if (form.getParticipants() < 1 || form.getParticipants() > 20) {
            errors.rejectValue("participants", "participants.range", "利用人数は1〜20の範囲で入力してください");
        }

        if (form.getStartTime() == null || form.getEndTime() == null) {
            errors.reject("time.required", "利用開始と終了の日時を入力してください");
            return;
        }

        // 平日チェック
        if (form.getStartTime().getDayOfWeek() == DayOfWeek.SATURDAY ||
            form.getStartTime().getDayOfWeek() == DayOfWeek.SUNDAY) {
            errors.rejectValue("startTime", "time.weekday", "土日には予約できません");
        }

        // 時間範囲チェック
        if (form.getStartTime().getHour() < 9 || form.getEndTime().getHour() > 18) {
            errors.rejectValue("startTime", "time.range", "利用可能時間は平日の9:00〜18:00です");
        }

        // 最大利用時間3時間
        Duration duration = Duration.between(form.getStartTime(), form.getEndTime());
        if (duration.toHours() > 3) {
            errors.rejectValue("endTime", "time.duration", "最大利用時間は3時間までです");
        }

        // 人数と部屋の対応
        if (form.getParticipants() != null) {
            if (form.getParticipants() >= 10 && !"大会議室".equals(form.getRoomName())) {
                errors.rejectValue("roomName", "roomName.large", "10人以上の場合は大会議室を選択してください");
            } else if (form.getParticipants() <= 9 && !"小会議室".equals(form.getRoomName())) {
                errors.rejectValue("roomName", "roomName.small", "9人以下の場合は小会議室を選択してください");
            }
        }
    }
}
