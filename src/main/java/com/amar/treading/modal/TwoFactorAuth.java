package com.amar.treading.modal;

import com.amar.treading.domain.VerificationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Version;
import lombok.Data;

@Data

public class TwoFactorAuth {
    private  boolean isEnabled = false;
    private VerificationType sendTo;

}
