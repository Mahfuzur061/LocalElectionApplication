package Repository;


import Entity.UserEntity;
import Entity.CandidateEntity;

import java.util.List;


public interface UserRepo {


    //Create

    CandidateEntity addNewUser(CandidateEntity candidate);

    //READ
    List<CandidateEntity> fetchAllCandidates();
    CandidateEntity findUserByCpr(Integer cpr);
    CandidateEntity findUserByFirstName(String candidateName);

    //Update
    UserEntity getAllCandidate();
    CandidateEntity updateCandidate(int cpr, CandidateEntity candidate);

    //Delete
    Boolean deleteCandidate(int cpr);




}
