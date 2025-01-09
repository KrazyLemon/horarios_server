package com.angel.velazquez.horarios.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "salones")
public class Salon {
    @Id
    private String id;
    private String salon;
    private String g_v;
    private String g_m;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getG_v() {
        return g_v;
    }

    public void setG_v(String g_v) {
        this.g_v = g_v;
    }

    public String getG_m() {
        return g_m;
    }

    public void setG_m(String g_m) {
        this.g_m = g_m;
    }
}
