package com.wooread.wooreadnovel.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class NovelClass {
    @Id
    private String classId = UUID.randomUUID().toString().replace("-","");
    private String className;
    private Boolean removed;
}
