package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.MarriageSeeker;

public interface MarriageRepository extends JpaRepository<MarriageSeeker, Long> {
 
}