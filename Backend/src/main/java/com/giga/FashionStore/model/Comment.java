package com.giga.FashionStore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Product comment model.
 */
@Document(collection = "comments")
public class Comment {
    @Id
    private long comment_id;
    private String comment_msg;
    private Date comment_timestamp;
    private User comment_user;

    public Comment(String comment_msg, Date comment_timestamp, User comment_user) {
        this.comment_msg = comment_msg;
        this.comment_timestamp = comment_timestamp;
        this.comment_user = comment_user;
    }

    // getters
    public long getComment_id() {
        return comment_id;
    }

    public String getComment_msg() {
        return comment_msg;
    }

    public Date getComment_timestamp() {
        return comment_timestamp;
    }

    public User getComment_user() {
        return comment_user;
    }

    // setters
    public void setComment_id(long comment_id) {
        this.comment_id = comment_id;
    }

    public void setComment_msg(String comment_msg) {
        this.comment_msg = comment_msg;
    }

    public void setComment_timestamp(Date comment_timestamp) {
        this.comment_timestamp = comment_timestamp;
    }

    public void setComment_user(User comment_user) {
        this.comment_user = comment_user;
    }
}
