package rodriguez.ciro.drools.controller;

import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rodriguez.ciro.drools.model.Order;

@RestController
public class OfferController {

    private final KieSession kieSession;

    public OfferController(KieSession kieSession) {
        this.kieSession = kieSession;
    }

    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order) {
        kieSession.insert(order);
        kieSession.fireAllRules();
        return order;
    }
}
