package com.samar.jwt.domain;

import com.samar.jwt.enums.OccupancyStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Flats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long flatNumber;

    private Long floorNumber;

    private OccupancyStatus occupancyStatus;

    private String block;

    private String owner_name;

    @CreationTimestamp
    private Date created;

    @UpdateTimestamp
    private Date updated;

    @OneToMany(mappedBy = "flats",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AppUser> users;

}
