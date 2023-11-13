package tn.esprit.twin3.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJob;
    private String Service;
    private Boolean Etat;

    public Long getIdJob() {
        return idJob;
    }

    public void setIdJob(Long idJob) {
        this.idJob = idJob;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public Boolean getEtat() {
        return Etat;
    }

    public void setEtat(Boolean etat) {
        Etat = etat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(idJob, job.idJob) && Objects.equals(Service, job.Service) && Objects.equals(Etat, job.Etat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJob, Service, Etat);
    }

    @Override
    public String toString() {
        return "Job{" +
                "idJob=" + idJob +
                ", Service='" + Service + '\'' +
                ", Etat=" + Etat +
                '}';
    }
}
