package com.bamdule.memorymap.model.entity;

import java.time.LocalDateTime;

/**
 *
 * @author MW
 */
public class User {

    private Integer id;
    private String name;
    private String account;
    private String password;
    private Integer profileImgId;

    private LocalDateTime createDt;
    private LocalDateTime updateDt;

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getProfileImgId() {
        return profileImgId;
    }

    public void setProfileImgId(Integer profileImgId) {
        this.profileImgId = profileImgId;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", account=" + account + ", password=" + password + ", profileImgId=" + profileImgId + ", createDt=" + createDt + ", updateDt=" + updateDt + '}';
    }

}
