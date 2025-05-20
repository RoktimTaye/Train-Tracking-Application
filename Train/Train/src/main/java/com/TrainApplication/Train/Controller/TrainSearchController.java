package com.TrainApplication.Train.Controller;

import com.TrainApplication.Train.Entity.trainSchedule;
import com.TrainApplication.Train.Service.TrainSearchService;
import com.TrainApplication.Train.Service.TrainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class TrainSearchController {

    private TrainSearchService trainSearchService;

    private TrainSearchController(TrainSearchService trainSearchService){
        this.trainSearchService = trainSearchService;
    }

    @GetMapping("/by-code")
    public List<trainSchedule> findTrainByStationCode(@RequestParam String sourceCode,@RequestParam String destinationCode)
    {
        return trainSearchService.findTrainByStationCode(sourceCode.toUpperCase(),destinationCode.toUpperCase());
    }

    @GetMapping("/by-name")
    public List<trainSchedule> findTrainByStationName(@RequestParam String sourceName,@RequestParam String destinationName)
    {
        return trainSearchService.findTrainByStationName(sourceName.toUpperCase(),destinationName.toUpperCase());
    }
}
