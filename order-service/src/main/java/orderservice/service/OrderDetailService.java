package orderservice.service;

import orderservice.entity.Order;
import orderservice.entity.OrderDetail;
import orderservice.dto.OrderDetailDto;

import java.util.List;

public interface OrderDetailService {
  List<OrderDetail> createOrderDetails(Order order, List<OrderDetailDto> orderDetailDTOs);

  List<OrderDetail> getAllOrderDetailByOrder(Order order);
}
