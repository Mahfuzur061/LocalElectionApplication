package Service;

import Entity.CandidateEntity;

import java.util.List;

public interface ICandidateService {
    default List<CandidateEntity> fetchAllCandidate() {
        return null;
    }

    void deleteCandidate(String candidateName);
}
