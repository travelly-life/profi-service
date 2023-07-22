package com.travelly.profiservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ps_orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "user_id")
    private UUID user_id;
    @Column(name = "service_id")
    private UUID service_id;
    @Column(name = "create_at")
    private Timestamp create_at;
    @Column(name = "status")
    private String status;
}
