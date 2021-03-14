package sk.stuba.fei.uim.oop.exam.exam.Web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.stuba.fei.uim.oop.exam.exam.cannon.Cannon;
import sk.stuba.fei.uim.oop.exam.exam.cannon.HeavyCannon;
import sk.stuba.fei.uim.oop.exam.exam.component.Tower;
import sk.stuba.fei.uim.oop.exam.exam.resource.TowerResource;
import sk.stuba.fei.uim.oop.exam.exam.service.ApiService;
import sk.stuba.fei.uim.oop.exam.exam.tank.Tank;

import java.util.Optional;

@Controller
@RequestMapping("/tank")
public class VehicleController {

    private ApiService apiService;

    public VehicleController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/")
    public String all(Model model) {
        model.addAttribute("tanks", apiService.getAllVehicles());
        return "tank/all";
    }


    @GetMapping("/id/{id}")
    public String byId(@PathVariable long id, Model model) {
        Optional<Tank> tankById = apiService.findTankById(id);
        if (tankById.isPresent()) {
            Tank tank = tankById.get();
            model.addAttribute("tank", tank);

           // model.addAttribute("contracts", contractService.AllUserContracts(user.getUid()));
        }
        return "tank/one";
    }



}
