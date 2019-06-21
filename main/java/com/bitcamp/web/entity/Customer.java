package com.bitcamp.web.entity;

import javax.persistence.Entity;

import java.awt.print.PrinterAbortException;
import java.io.Serializable;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Customer
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@ToString
@Table(name = "customers")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private static final long serialVersionUID = 1L;
    @Column(name = "customer+id")
    private String customerId;
    private String customerName;
    private String password;
    private String ssn;
    private String phone;
    private String city;
    private String address;
    private String postalcode;
    private String photo;
    private Object id;

    public String ToString() {

        return String.format("고객정보 No : %d\n" + "id:%s", id, customerId);
    }

    @Builder
    private Customer(String customerId, String customerName, String password, String ssn, String phone, String city,
            String address, String postalcode, String photo) {
        this.customerId = customerId;
        this.password = password;
        this.customerName = customerName;
        this.ssn = ssn;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.postalcode = postalcode;
        this.photo = photo;
        this.id = id;

    };
}