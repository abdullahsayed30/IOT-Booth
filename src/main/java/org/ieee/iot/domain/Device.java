package org.ieee.iot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "devices")
public class Device {

    @Transient
    public static final String SEQ_NAME = "devices_sequence";

    @Id
    private Long id;

//    @Column(columnDefinition = "varchar(255) unique")
    private String name;

    private String description;

//    @Column(columnDefinition = "boolean default false")
    private boolean state;
}
