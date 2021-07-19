package com.studysomoim.settings;

import com.studysomoim.domain.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notifications {

    private boolean studyCreatedByEmail;

    private boolean studyCreatedByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

    private boolean studyUpdatedByEmail;

    private boolean studyUpdatedByWeb;

    public Notifications(Account account) {
        this.studyCreatedByEmail = account.isStudyCreatedByEmail();
        this.studyCreatedByWeb = account.isStudyCreatedByWeb();
        this.studyEnrollmentResultByEmail = account.isStudyEnrollmentResultByEmail();
        this.studyEnrollmentResultByWeb = account.isStudyEnrollmentResultByWeb();
        this.studyUpdatedByEmail = account.isStudyUpdateByEmail();
        this.studyUpdatedByWeb = account.isStudyUpdateByWeb();
    }
}
