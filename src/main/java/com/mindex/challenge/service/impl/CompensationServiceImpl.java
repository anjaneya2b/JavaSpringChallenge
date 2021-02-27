package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.CompensationRepository;
import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CompensationServiceImpl implements CompensationService {

    private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Autowired
    private CompensationRepository compensationRepository;

    @Override
    public List<Compensation> readComps(String id) {

        if (id == null || id.isEmpty()) {
            throw new NullPointerException("Employee id is null.");
        }

        return compensationRepository.findByEmployeeEmployeeId(id);
    }

    @Override
    public Compensation createComp(Compensation compensation) {

        compensation.setCompensationId(UUID.randomUUID().toString());

        compensationRepository.insert(compensation);

        return compensation;
    }
}