package com.porkerspicks.fitbastats.service;

import com.porkerspicks.fitbastats.domain.Season;
import com.porkerspicks.fitbastats.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class FitbaStatsServiceImpl implements  FitbaStatsService {

    @Autowired
    private SeasonRepository seasonRepository;

    @Override
    public Season saveSeason(Season season) {
        return null;
    }
}