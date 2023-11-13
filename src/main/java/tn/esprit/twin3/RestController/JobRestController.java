package tn.esprit.twin3.RestController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.twin3.Entities.Job;
import tn.esprit.twin3.Services.JobServiceImpl;
import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping("/job")
public class JobRestController {
JobServiceImpl jobService;
    @GetMapping("/afficherjobs")
    List<Job> retrieveAllBlocs(){
        return jobService.retrieveAllBlocs();
    }
    @GetMapping("/afficherjob/{idjob}")
    Job retrieveJob(@PathVariable("idjob") long idjob){return jobService.retrieveBloc(idjob);}

    @PutMapping("/{id}/state/{newState}")
    public void updateJobState(@PathVariable Long id, @PathVariable boolean newState) {
       jobService.updateJobState(id, newState);
    }
    }
