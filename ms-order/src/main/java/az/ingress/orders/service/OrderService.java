package az.ingress.orders.service;

import az.ingress.orders.dao.repository.OrderRepository;
import az.ingress.orders.model.request.CreateOrderRequest;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import static lombok.AccessLevel.PRIVATE;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class OrderService {

    OrderRepository orderRepository;

    public void createOrder(CreateOrderRequest createOrderRequest) {

    }

}
