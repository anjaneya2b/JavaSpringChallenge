package com.mindex.challenge.service;

import com.mindex.challenge.data.Compensation;

import java.util.List;

public interface CompensationService {
    List<Compensation> readComps(String id);
    Compensation createComp(Compensation compensation);
}