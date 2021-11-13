package entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_details")
public class OrderDetails extends BasicEntity{

    @ManyToOne
    @JoinColumn(name= "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "copy_id")
    private Copy copy;

}
