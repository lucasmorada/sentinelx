package com.sentinelx.metrics;

import com.sentinelx.threat.ThreatRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/metrics")
public class MetricsController {

    private final ThreatRepository repository;

    public MetricsController(ThreatRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/threats-count")
    public Long countThreats() {
        return repository.count();
    }
}
