package Models;

import java.util.Date;

public class BaseModel {
    private Long id;
    private Date createdAt; //Audit Attribute
    private Date updatedAt; //Audit Attribute
}
