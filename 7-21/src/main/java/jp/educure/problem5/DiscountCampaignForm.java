package jp.educure.problem5;


import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class DiscountCampaignForm {

    @NotBlank(message = "キャンペーン名は必須です")
    private String campaignName;

    @NotBlank(message = "割引種別を選択してください")
    private String discountType; // "定額" or "定率"

    @NotNull(message = "割引値は必須です")
    private Integer discountValue;

    @NotNull(message = "開始日は必須です")
    private LocalDate startDate;

    @NotNull(message = "終了日は必須です")
    private LocalDate endDate;

    // --- Getter & Setter ---
    public String getCampaignName() {
        return campaignName;
    }
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getDiscountType() {
        return discountType;
    }
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Integer getDiscountValue() {
        return discountValue;
    }
    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
