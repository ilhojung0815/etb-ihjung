package com.emptybeer.etb.entities.bbs;

import java.util.Date;
import java.util.Objects;

public class ReviewArticleLikeEntity {
    private String userEmail;
    private int articleIndex;
    private Date createOn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewArticleLikeEntity that = (ReviewArticleLikeEntity) o;
        return articleIndex == that.articleIndex && Objects.equals(userEmail, that.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, articleIndex);
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getArticleIndex() {
        return articleIndex;
    }

    public void setArticleIndex(int articleIndex) {
        this.articleIndex = articleIndex;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }
}
