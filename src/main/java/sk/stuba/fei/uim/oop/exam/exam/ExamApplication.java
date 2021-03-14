package sk.stuba.fei.uim.oop.exam.exam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import sk.stuba.fei.uim.oop.exam.exam.cannon.HeavyCannon;
import sk.stuba.fei.uim.oop.exam.exam.chassis.CrawlerChassis;
import sk.stuba.fei.uim.oop.exam.exam.component.Tower;
import sk.stuba.fei.uim.oop.exam.exam.service.ApiService;
import sk.stuba.fei.uim.oop.exam.exam.tank.HeavyTank;
import sk.stuba.fei.uim.oop.exam.exam.tank.Nationality;

@Slf4j
@Controller
@SpringBootApplication
public class ExamApplication implements CommandLineRunner {

    private ApiService apiService;

    public ExamApplication(ApiService apiService) {
        this.apiService = apiService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
        log.info("Open in browser: http://localhost:8080");
    }


    @Override
    public void run(String... args) throws Exception {
        CrawlerChassis crawlerChassis = new CrawlerChassis(1,"IS-3M",10.0,50,90,3.0);
        HeavyCannon heavyCannon = new HeavyCannon(1,"122mm-BL-9",122.0,50,120.0,50.0);
        Tower<HeavyCannon> heavyCannonTower = new Tower<>(1,"IS-3",50,100,heavyCannon);
        HeavyTank heavyTank = new HeavyTank(1,"IS-3", Nationality.ZSSR,10000.0,crawlerChassis,heavyCannon,heavyCannonTower);
        apiService.addVehicle(heavyTank);
        apiService.addComponent(crawlerChassis);
        apiService.addComponent(heavyCannon);
        apiService.addComponent(heavyCannonTower);

    }


}
