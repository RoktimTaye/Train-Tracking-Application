package com.TrainApplication.Train.Repo;

import com.TrainApplication.Train.Entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station,Long> {
}
