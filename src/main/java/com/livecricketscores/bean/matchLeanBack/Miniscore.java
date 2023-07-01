package com.livecricketscores.bean.matchLeanBack;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Miniscore{
    private int inningsId;
    private BatsmanStriker batsmanStriker;
    private BatsmanNonStriker batsmanNonStriker;
    private BatTeam batTeam;
    private BowlerStriker bowlerStriker;
    private BowlerNonStriker bowlerNonStriker;
    private double overs;
    private String recentOvsStats;
    private PartnerShip partnerShip;
    private double currentRunRate;
    private int requiredRunRate;
    private String lastWicket;
    private MatchScoreDetails matchScoreDetails;
    private ArrayList<Object> latestPerformance;
    private PpData ppData;
    private MatchUdrs matchUdrs;
    private ArrayList<Object> overSummaryList;
    private int lastWicketScore;
    private int remRunsToWin;
    private int responseLastUpdated;
    private String event;
    private long oversRem;
}
