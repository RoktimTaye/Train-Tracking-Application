package com.TrainApplication.Train.Service;

import com.TrainApplication.Train.Entity.trainSchedule;
import com.TrainApplication.Train.Repo.TrainScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {

    private TrainScheduleRepository trainScheduleRepository;

    public TrainSearchService(TrainScheduleRepository trainScheduleRepository){
            this.trainScheduleRepository = trainScheduleRepository;
    }

    public List<trainSchedule> findTrainByStationCode(String sourceCode, String destinationCode) {
        return trainScheduleRepository.
                findBySource_StationCodeAndDestination_StationCode(sourceCode,destinationCode);
    }

    public List<trainSchedule> findTrainByStationName(String sourceName, String destinationName) {
        return trainScheduleRepository.
                findBySource_StationNameAndDestination_StationName(sourceName,destinationName);
    }
}
