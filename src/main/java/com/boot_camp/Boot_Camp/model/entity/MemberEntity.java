package com.boot_camp.Boot_Camp.model.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.File;

@Document(indexName = "member")
@Getter
@Setter
public class MemberEntity {
    @Id
    @ReadOnlyProperty
    private String id;

    @Field(type = FieldType.Text, name = "idAccount")
    private String idAccount;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Text, name = "username")
    private String username;

    @Field(type = FieldType.Text, name = "password")
    private String password;

    @Field(type = FieldType.Text, name = "birthday")
    private String birthday;

    @Field(type = FieldType.Boolean, name = "store")
    private boolean store;

    @Field(type = FieldType.Text, name = "picture")
    private String picture;

    @Field(type = FieldType.Text, name = "sex")
    private String sex;

    @Field(type = FieldType.Integer, name = "point")
    private int point;
}
