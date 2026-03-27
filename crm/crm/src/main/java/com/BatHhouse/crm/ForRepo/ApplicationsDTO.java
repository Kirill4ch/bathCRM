package com.BatHhouse.crm.ForRepo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"заявки\"")
public class ApplicationsDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_заявки")
    private Integer id;
    @Column(name = "id_бани")
    private Integer idBath;
    @Column(name = "услуга")
    private String service;
    @Column(name = "начало_брони")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime start;
    @Column(name = "конец_брони")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime end;
    @Column(name = "цена")
    private BigDecimal cost;
    @Column(name = "количество_людей")
    private Integer colvo;
    @Column(name = "id_заказчика")
    private Integer id_customer;

    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                ", idBath=" + idBath +
                ", service='" + service + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", cost=" + cost +
                ", id_customer=" + id_customer +
                '}';
    }
}
