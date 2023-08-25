package az.ingress.orders.controller;

import az.ingress.orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lombok.AccessLevel.PRIVATE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class OrderController {

    OrderService orderService;

}
