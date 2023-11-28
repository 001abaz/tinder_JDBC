package model.entity;

import model.Enums.OrderStatus;

import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private OrderStatus orderStatus;
    private Person sender;
    private Person recipient;

    public Order(Integer id, LocalDateTime createDate, LocalDateTime updateDate, OrderStatus orderStatus, Person sender, Person recipient) {
        this.id = id;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.orderStatus = orderStatus;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Order(LocalDateTime createDate, LocalDateTime updateDate, OrderStatus orderStatus, Person sender, Person recipient) {
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.orderStatus = orderStatus;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Order() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", orderStatus=" + orderStatus +
                ", sender=" + sender +
                ", recipient=" + recipient +
                '}';
    }
}
