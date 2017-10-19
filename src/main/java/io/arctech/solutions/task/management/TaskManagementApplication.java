package io.arctech.solutions.task.management;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TaskManagementApplication {

    public static void main (String[] args) throws Exception {
        log.info("Starting task management....");
        SpringApplication.run(TaskManagementApplication.class, args);
    }
}
