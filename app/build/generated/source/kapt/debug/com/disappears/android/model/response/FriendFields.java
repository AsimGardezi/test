package com.disappears.android.model.response;

import java.lang.String;

/**
 * This class enumerate all queryable fields in {@link com.disappears.android.model.response.Friend}
 */
public final class FriendFields {
  public static final String ALIAS_DATA = "aliasData";

  public static final String ALIAS_PLAIN = "aliasPlain";

  public static final String ALIAS_VERSION = "aliasVersion";

  public static final String AVAILABLE_MESSAGE_CONTROL_ID = "availableMessageControlId";

  public static final String AVAILABLE_MESSAGE_ID = "availableMessageId";

  public static final String FLAGS = "flags";

  public static final String HAS_NEW_MESSAGE = "hasNewMessage";

  public static final String LAST_RECEIVED_MESSAGE_ID = "lastReceivedMessageId";

  public static final String NAME = "name";

  public static final class KEYS {
    public static final String $ = "keys";

    public static final String DH_PUB = "keys.dhPub";

    public static final String DH_PUB_SIG = "keys.dhPubSig";

    public static final String DSA_PUB = "keys.dsaPub";

    public static final String DSA_PUB_SIG = "keys.dsaPubSig";

    public static final String FRIEND_NAME = "keys.friendName";

    public static final String VERSION = "keys.version";
  }

  public static final class PROFILE {
    public static final String $ = "profile";

    public static final String FLAGS = "profile.flags";

    public static final String FRIEND_NAME = "profile.friendName";

    public static final String IMAGE_IV = "profile.imageIv";

    public static final String IMAGE_URL = "profile.imageUrl";

    public static final String IMAGE_VERSION = "profile.imageVersion";

    public static final String LAST_SEEN = "profile.lastSeen";

    public static final String NAME = "profile.name";

    public static final String USERNAME = "profile.username";
  }
}
