package com.rhiodamuthie.springbootin28m.model.base;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {

    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}
