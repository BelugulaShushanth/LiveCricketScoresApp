package com.cricFizzApp.bean.alert;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class AlertDetails {

    private String alertId;
    private String mailId;
    private String matchType;
    private Long seriesId;
    private Long matchId;
    private String alertType;
    private Integer timePeriod;
    private Boolean isActive;
    private LocalDateTime alertReceivedDT;
}
