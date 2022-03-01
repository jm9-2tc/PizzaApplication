package com.pizza.data.entity.pizzaSize;

import com.pizza.data.entity.ordersSizes.OrderSizeEntity;
import com.pizza.data.entity.pizza.PizzaEntity;
import com.pizza.domain.model.SizeType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "pizza_size")
public class PizzaSizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private SizeType sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @OneToMany(mappedBy = "pizza_size")
    private Set<OrderSizeEntity> orderSizes;

    @ManyToOne
    @JoinColumn(name = "pizzas_id", insertable = false, updatable = false)
    private PizzaEntity pizza;
}
