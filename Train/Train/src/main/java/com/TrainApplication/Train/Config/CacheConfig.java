package com.TrainApplication.Train.Config;

import com.TrainApplication.Train.Entity.trainSchedule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean(name = "ttaygsyahs")
    public trainSchedule getInstance(){
            return new trainSchedule();
    }
}
