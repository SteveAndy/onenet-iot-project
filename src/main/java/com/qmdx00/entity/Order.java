package com.qmdx00.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author yuanweimin
 * @date 19/06/10 15:53
 * @description 订单实体类
 */
@Entity
@Table(name = "t_order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
    // 订单编号
    @Id
    private String order_id;
    // 产品编号
    private String product_id;
    // 采购数量
    private Integer number;
    // 产品直径 (mm)
    @Column(name = "diameter", columnDefinition = "double(10,1) default 0.0")
    private Double diameter;
    // 产品长度 (m)
    @Column(name = "length", columnDefinition = "double(10,1) default 0.0")
    private Double length;
    // 产品重量 (kg)
    @Column(name = "weight", columnDefinition = "double(10,1) default 0.0")
    private Double weight;
}
