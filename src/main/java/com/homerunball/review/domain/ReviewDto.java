package com.homerunball.review.domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class ReviewDto {
int           revw_id;          /* 리뷰번호 */
String        pd_id;            /* 제품번호 */
int        c_id;             /* 고객번호 */
String        revw_cntn;        /* 리뷰내용 */
String        revw_attch_name;  /* 리뷰파일번호 */
Date revw_dt;          /* 리뷰작성일시 */
int           revw_score;       /* 리뷰점수 */
char          revw_is_reported; /* 신고여부 */
char          revw_is_show;     /* 노출여부 */
LocalDateTime frst_reg_dt;      /* 최초등록일시 */
String        frst_reg_id;      /* 최초등록자식별번호 */
LocalDateTime last_mod_dt;      /* 최종수정일시 */
String        last_mod_id;      /* 최종수정자식별번호 */

  /* constructor */
  public ReviewDto() {
  }

  public ReviewDto(String pd_id, int c_id, String revw_cntn, String revw_attch_name, int revw_score) {
    this.pd_id = pd_id;
    this.c_id = c_id;
    this.revw_cntn = revw_cntn;
    this.revw_attch_name = revw_attch_name;
    this.revw_score = revw_score;
  }

  public int getRevw_id() {
    return revw_id;
  }

  public void setRevw_id(int revw_id) {
    this.revw_id = revw_id;
  }

  public String getPd_id() {
    return pd_id;
  }

  public void setPd_id(String pd_id) {
    this.pd_id = pd_id;
  }

  public int getC_id() {
    return c_id;
  }

  public void setC_id(int c_id) {
    this.c_id = c_id;
  }

  public String getRevw_cntn() {
    return revw_cntn;
  }

  public void setRevw_cntn(String revw_cntn) {
    this.revw_cntn = revw_cntn;
  }

  public String getRevw_attch_name() {
    return revw_attch_name;
  }

  public void setRevw_attch_name(String revw_attch_name) {
    this.revw_attch_name = revw_attch_name;
  }

  public Date getRevw_dt() {
    return revw_dt;
  }

  public void setRevw_dt(Date revw_dt) {
    this.revw_dt = revw_dt;
  }

  public int getRevw_score() {
    return revw_score;
  }

  public void setRevw_score(int revw_score) {
    this.revw_score = revw_score;
  }

  public char getRevw_is_reported() {
    return revw_is_reported;
  }

  public void setRevw_is_reported(char revw_is_reported) {
    this.revw_is_reported = revw_is_reported;
  }

  public char getRevw_is_show() {
    return revw_is_show;
  }

  public void setRevw_is_show(char revw_is_show) {
    this.revw_is_show = revw_is_show;
  }

  public LocalDateTime getFrst_reg_dt() {
    return frst_reg_dt;
  }

  public void setFrst_reg_dt(LocalDateTime frst_reg_dt) {
    this.frst_reg_dt = frst_reg_dt;
  }

  public String getFrst_reg_id() {
    return frst_reg_id;
  }

  public void setFrst_reg_id(String frst_reg_id) {
    this.frst_reg_id = frst_reg_id;
  }

  public LocalDateTime getLast_mod_dt() {
    return last_mod_dt;
  }

  public void setLast_mod_dt(LocalDateTime last_mod_dt) {
    this.last_mod_dt = last_mod_dt;
  }

  public String getLast_mod_id() {
    return last_mod_id;
  }

  public void setLast_mod_id(String last_mod_id) {
    this.last_mod_id = last_mod_id;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    ReviewDto reviewDto = (ReviewDto) object;
    return revw_id == reviewDto.revw_id && c_id == reviewDto.c_id && revw_score == reviewDto.revw_score && revw_is_reported == reviewDto.revw_is_reported && revw_is_show == reviewDto.revw_is_show && Objects.equals(pd_id, reviewDto.pd_id) && Objects.equals(revw_cntn, reviewDto.revw_cntn) && Objects.equals(revw_attch_name, reviewDto.revw_attch_name) && Objects.equals(revw_dt, reviewDto.revw_dt) && Objects.equals(frst_reg_dt, reviewDto.frst_reg_dt) && Objects.equals(frst_reg_id, reviewDto.frst_reg_id) && Objects.equals(last_mod_dt, reviewDto.last_mod_dt) && Objects.equals(last_mod_id, reviewDto.last_mod_id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revw_id, pd_id, c_id, revw_cntn, revw_attch_name, revw_dt, revw_score, revw_is_reported, revw_is_show, frst_reg_dt, frst_reg_id, last_mod_dt, last_mod_id);
  }

  @Override
  public String toString() {
    return "ReviewDto{" +
            "revw_id=" + revw_id +
            ", pd_id='" + pd_id + '\'' +
            ", c_id=" + c_id +
            ", revw_cntn='" + revw_cntn + '\'' +
            ", revw_attch_name='" + revw_attch_name + '\'' +
            ", revw_dt=" + revw_dt +
            ", revw_score=" + revw_score +
            ", revw_is_reported=" + revw_is_reported +
            ", revw_is_show=" + revw_is_show +
            ", frst_reg_dt=" + frst_reg_dt +
            ", frst_reg_id='" + frst_reg_id + '\'' +
            ", last_mod_dt=" + last_mod_dt +
            ", last_mod_id='" + last_mod_id + '\'' +
            '}';
  }
}
