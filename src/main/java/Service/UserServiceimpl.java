package Service;

import Entity.CandidateEntity;
import Entity.UserEntity;
import Repository.UserRepo;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class UserServiceimpl {
    @Service
    public class UserServiceImpl implements iUserServiceImpl {

        @Autowired
        UserRepo iUserRepo;


        @Override
        public UserEntity addNewCandidate(CandidateEntity candidate) {
            return null;
        }

        @Override
        public List<CandidateEntity> fetchAllCandidate() {
            return null;
        }

        @Override
        public CandidateEntity findCandidateByCpr(Integer cpr) {
            return null;
        }

        @Override
        public CandidateEntity findCandidateByName(String firstName) {
            return null;
        }

        @Override
        public UserEntity updateCandidate(int cpr, CandidateEntity candidate) {
            return null;
        }

        @Override
        public Boolean deleteCandidate(int cpr) {
            return null;
        }

        @Override
        public List<User> fetchAllUser() {
            return null;
        }

        @Override
        public UserEntity addNewUser(UserEntity user) {
            return null;
        }

        @Override
        public List<UserEntity> fetchAllUsers() {
            return null;
        }

        @Override
        public UserEntity findUserByCpr(Integer cpr) {
            return null;
        }

        @Override
        public UserEntity updateUser(int cpr, UserEntity user) {
            return null;
        }

        @Override
        public Boolean deleteUser(int cpr) {
            return null;
        }
    }

        }



