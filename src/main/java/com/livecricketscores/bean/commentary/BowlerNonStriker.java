package com.livecricketscores.bean.commentary;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BowlerNonStriker{
    private int bowlId;
    private String bowlName;
    private int bowlMaidens;
    private int bowlNoballs;
    private int bowlOvs;
    private int bowlRuns;
    private int bowlWides;
    private int bowlWkts;
    private double bowlEcon;
}
