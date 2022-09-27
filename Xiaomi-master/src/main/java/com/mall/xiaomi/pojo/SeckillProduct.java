package com.mall.xiaomi.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Auther: wdd
 * @Date: 2020-03-28 19:40
 * @Description:
 */
@Data
@Table(name = "seckill_product")
public class SeckillProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer seckillId;

    private Integer productId;

    private Double seckillPrice;

    private Integer seckillStock;

    private Integer timeId;
}
