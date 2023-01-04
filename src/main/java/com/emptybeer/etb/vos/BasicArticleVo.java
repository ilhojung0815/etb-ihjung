package com.emptybeer.etb.vos;

import com.emptybeer.etb.entities.bbs.BasicArticleEntity;

public class BasicArticleVo extends BasicArticleEntity {
    private String userNickname;
    private int commentCount;
    private  boolean isSigned; // 로그인 여부
    private boolean isLiked;    // 좋아요
    private int likeCount;  // 좋아요 개수

    public String getUserNickname() {
        return userNickname;
    }

    public BasicArticleVo setUserNickname(String userNickname) {
        this.userNickname = userNickname;
        return this;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public BasicArticleVo setCommentCount(int commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    public boolean isSigned() {
        return isSigned;
    }

    public BasicArticleVo setSigned(boolean signed) {
        isSigned = signed;
        return this;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public BasicArticleVo setLiked(boolean liked) {
        isLiked = liked;
        return this;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public BasicArticleVo setLikeCount(int likeCount) {
        this.likeCount = likeCount;
        return this;
    }
}
