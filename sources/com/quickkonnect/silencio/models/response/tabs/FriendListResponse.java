package com.quickkonnect.silencio.models.response.tabs;

import com.quickkonnect.silencio.models.response.BaseResponse;
import java.util.List;
import sf.e;
import sf.j;

public final class FriendListResponse extends BaseResponse {
    public static final int $stable = 8;
    private final List<FriendListModel> data;

    public FriendListResponse() {
        this((List) null, 1, (e) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FriendListResponse(List list, int i8, e eVar) {
        this((i8 & 1) != 0 ? null : list);
    }

    public static /* synthetic */ FriendListResponse copy$default(FriendListResponse friendListResponse, List<FriendListModel> list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = friendListResponse.data;
        }
        return friendListResponse.copy(list);
    }

    public final List<FriendListModel> component1() {
        return this.data;
    }

    public final FriendListResponse copy(List<FriendListModel> list) {
        return new FriendListResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FriendListResponse) && j.a(this.data, ((FriendListResponse) obj).data);
    }

    public final List<FriendListModel> getData() {
        return this.data;
    }

    public int hashCode() {
        List<FriendListModel> list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "FriendListResponse(data=" + this.data + ')';
    }

    public FriendListResponse(List<FriendListModel> list) {
        this.data = list;
    }
}
