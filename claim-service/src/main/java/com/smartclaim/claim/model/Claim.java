package com.smartclaim.claim.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyNumber;

    private String claimantName;

    private String claimType; // e.g. "Damage", "Lost", "Return"

    private String description;

    private double claimAmount;

    private String status; // e.g. "Submitted", "Approved", "Rejected"

    private LocalDate dateSubmitted;

    private String userEmail; // Reference to who submitted
}
