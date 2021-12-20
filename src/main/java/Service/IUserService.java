package Service;

import Entity.UserEntity;
import Entity.CandidateEntity;
import org.apache.tomcat.jni.User;

import java.util.List;
public interface IUserService {

    //Create new candidate
    UserEntity addNewCandidate (CandidateEntity candidate);

    //Read
    List<CandidateEntity> fetchAllCandidate();
    CandidateEntity findCandidateByCpr(Integer cpr);
    CandidateEntity findCandidateByName(String firstName);

    //Update
    UserEntity updateCandidate(int cpr, CandidateEntity candidate);


    //Delete
    Boolean deleteCandidate(int cpr);


    List<User> fetchAllUser();
}
