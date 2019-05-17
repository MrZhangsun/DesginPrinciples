package com.example.designprinciple.openclose;

import lombok.*;

@ToString
@NoArgsConstructor
public class DiscountJavaCourse extends JavaCourse {

    @Getter
    @Setter
    private Double discount;

    public DiscountJavaCourse(Integer id, String name, Double price, Double discount) {
        super(id, name, price);
        this.discount = discount;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    public Double getDiscountPrice() {
        return super.getPrice() * discount;
    }
}
