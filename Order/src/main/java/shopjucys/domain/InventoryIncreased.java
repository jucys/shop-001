package shopjucys.domain;

import java.util.*;
import lombok.*;
import shopjucys.domain.*;
import shopjucys.infra.AbstractEvent;

@Data
@ToString
public class InventoryIncreased extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;
    private Integer price;
}
