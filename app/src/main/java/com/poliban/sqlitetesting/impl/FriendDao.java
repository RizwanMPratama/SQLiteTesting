package com.poliban.sqlitetesting.impl;

import com.poliban.sqlitetesting.domain.Friend;

import java.util.List;

public interface FriendDao {
    void insert(Friend f);
    void update(Friend f);
    void  delete(int id);
    Friend getAFriendById(int id);
    List<Friend> getAllFriend();
}
