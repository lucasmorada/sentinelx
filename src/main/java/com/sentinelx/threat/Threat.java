package com.sentinelx.threat;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Threat {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String ipAddress;
    private String type;
    private int severityScore;
    private LocalDateTime detectedAt;
}
