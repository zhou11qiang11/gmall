package cn.zq.api.bean;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class UmsMember implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String memberLevelId;
  private String username;
  private String password;
  private String nickname;
  private String phone;
  private Integer status;
  private Date createTime;
  private String icon;
  private Integer gender;
  private Date birthday;
  private String city;
  private String job;
  private String personalizedSignature;
  private long sourceType;
  private long integration;
  private long growth;
  private long luckeyCount;
  private long historyIntegration;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMemberLevelId() {
    return memberLevelId;
  }

  public void setMemberLevelId(String memberLevelId) {
    this.memberLevelId = memberLevelId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String getPersonalizedSignature() {
    return personalizedSignature;
  }

  public void setPersonalizedSignature(String personalizedSignature) {
    this.personalizedSignature = personalizedSignature;
  }

  public long getSourceType() {
    return sourceType;
  }

  public void setSourceType(long sourceType) {
    this.sourceType = sourceType;
  }

  public long getIntegration() {
    return integration;
  }

  public void setIntegration(long integration) {
    this.integration = integration;
  }

  public long getGrowth() {
    return growth;
  }

  public void setGrowth(long growth) {
    this.growth = growth;
  }

  public long getLuckeyCount() {
    return luckeyCount;
  }

  public void setLuckeyCount(long luckeyCount) {
    this.luckeyCount = luckeyCount;
  }

  public long getHistoryIntegration() {
    return historyIntegration;
  }

  public void setHistoryIntegration(long historyIntegration) {
    this.historyIntegration = historyIntegration;
  }
}
