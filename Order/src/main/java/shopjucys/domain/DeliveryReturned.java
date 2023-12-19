package shopjucys.domain;

import java.util.*;
import lombok.*;
import shopjucys.domain.*;
import shopjucys.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String productId;
    private Integer qty;
    private String address;
    private String deliveryDate;
}
