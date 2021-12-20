package Controlller;
 import Entity.CandidateEntity;
 import Service.ICandidateService;
 import Service.IUserService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.dao.DataIntegrityViolationException;
 import  org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.PathVariable;

 import java.util.List;


 @Controller
public class CandidateController {
     @Autowired
     ICandidateService iCandidateService;
     @Autowired
     IUserService iUserService;

     //Display Candidates
     @GetMapping("/admin/viewCandidates")
     public String getManageCandidate(Model model){
         List<CandidateEntity> candidateList= iCandidateService.fetchAllCandidate();
         model.addAttribute("allCandidates", candidateList);

         return "admin/viewCandidates";
     }
     // Delete Candidates
     @GetMapping("/deleteCandidate/{candidateName}")
     public String deleteCandidate(@PathVariable String candidateName){
         try{
             iCandidateService.deleteCandidate(candidateName);
             return "redirect:/admin/viewCandidate";
         } catch (DataIntegrityViolationException e){
             e.printStackTrace();
         }
         return "errors/cannot_delete_Candidate";
     }
}
