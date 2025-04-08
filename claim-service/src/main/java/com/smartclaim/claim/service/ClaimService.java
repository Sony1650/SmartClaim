package com.smartclaim.claim.service;

import com.smartclaim.claim.model.Claim;
import com.smartclaim.claim.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public Claim submitClaim(Claim claim) {
        claim.setDateSubmitted(LocalDate.now());
        claim.setStatus("Submitted");
        return claimRepository.save(claim);
    }

    public Optional<Claim> getClaimById(Long id) {
        return claimRepository.findById(id);
    }

    public List<Claim> getClaimsByEmail(String email) {
        return claimRepository.findByUserEmail(email);
    }

    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    public Claim updateStatus(Long id, String newStatus) {
        Claim claim = claimRepository.findById(id).orElseThrow();
        claim.setStatus(newStatus);
        return claimRepository.save(claim);
    }
}
