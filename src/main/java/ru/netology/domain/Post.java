package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int authorId;
    private boolean administratorAccess;
    private int administratorId;
    private long date;
    private long time;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String imageUrl;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private Views views;
    private RepostInfo repostInfo;
    private String link;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean postIsPinned;
    private boolean markedAsAds;
    private boolean isFavourite;
    private int postponedId;




    private boolean forward;



}
