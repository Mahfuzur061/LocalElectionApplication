package Repository;

import Entity.CandidateEntity;

import java.util.List;

public interface CandidateRepo {
    //READ
    List<CandidateEntity> fetchAllCandidates();
    CandidateEntity findUserByCpr(Integer cpr);
    CandidateEntity findUserByFirstName(String candidateName);
}
