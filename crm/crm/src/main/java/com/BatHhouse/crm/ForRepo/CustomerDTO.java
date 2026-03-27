package com.BatHhouse.crm.ForRepo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "заказчик")
public class CustomerDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "номер_телефона")
    private int num;
    private String fio;
    @Column(name = "gmail")
    private String gmail;

    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                ", num=" + num +
                ", Fio='" + fio + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
