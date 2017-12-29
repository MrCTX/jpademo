package com.panda.po;


import javax.persistence.*;

/**
 * @Author :Mack Chen
 * Email :mackc@synnex.com
 * @Date :14:50 in 11/29/17
 * Description :
 * Modified :
 */
@Entity
@Table(schema = "root",catalog = "prac",name = "classes")//schema指定数据库的用户名,catalog指定数据库名,name指定表名
public class Classes {
    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Classes(){}

    public Classes(Integer id , String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classes classes = (Classes) o;

        if (id != null ? !id.equals(classes.id) : classes.id != null) return false;
        return name != null ? name.equals(classes.name) : classes.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
