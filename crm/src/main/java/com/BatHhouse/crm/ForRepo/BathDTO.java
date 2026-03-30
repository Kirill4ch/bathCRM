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
@Table(name = "\"Бани\"")
public class BathDTO {
    @Id
    private Integer id;

    @Override
    public String toString() {
        return " {" +
                "id=" + id +
                '}';
    }
}
