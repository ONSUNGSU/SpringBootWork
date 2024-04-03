package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class OrderItem extends BaseEntity{

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) // 지연 로딩으로 변경
    @JoinColumn(name = "item_id") // OrderItem.item_id = Item.item_id
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY) // 지연 로딩으로 변경
    @JoinColumn(name = "order_id") // OrderItem.order_id = Order.order_id
    private Order order;

    private int orderPrice; // 주문 가격

    private int count; // 수량
    /*
    private LocalDateTime regTime;

    private LocalDateTime updateTime;

     */
}
