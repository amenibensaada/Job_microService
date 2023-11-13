package tn.esprit.twin3.Services;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import tn.esprit.twin3.Entities.Job;
import tn.esprit.twin3.Repositories.JobRepo;
import java.util.List;
import java.util.Optional;


@Service
    @AllArgsConstructor
    public class JobServiceImpl  {
        JobRepo jobRepo;
        public List<Job> retrieveAllBlocs()  {
            return jobRepo.findAll();
        }


        public Job retrieveBloc(long idJob) {
            return jobRepo.findById(idJob).orElse(null);
        }

        public void updateJobState(Long id, boolean newState) {
            Optional<Job> optionalJob = jobRepo.findById(id);
            if (optionalJob.isPresent()) {
                Job job = optionalJob.get();
                job.setEtat(newState);
                jobRepo.save(job);
            }
        }

    }

