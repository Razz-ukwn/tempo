package com.quickkonnect.silencio.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.f1;
import b3.x;
import s0.b0;
import sf.j;

public final class AlbumPhotoModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AlbumPhotoModel> CREATOR = new Creator();
    private final int albumId;

    /* renamed from: id  reason: collision with root package name */
    private final int f6675id;
    private final String thumbnailUrl;
    private final String title;
    private final String url;

    public static final class Creator implements Parcelable.Creator<AlbumPhotoModel> {
        public final AlbumPhotoModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new AlbumPhotoModel(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final AlbumPhotoModel[] newArray(int i8) {
            return new AlbumPhotoModel[i8];
        }
    }

    public AlbumPhotoModel(int i8, int i10, String str, String str2, String str3) {
        j.f(str, "title");
        j.f(str2, "url");
        j.f(str3, "thumbnailUrl");
        this.albumId = i8;
        this.f6675id = i10;
        this.title = str;
        this.url = str2;
        this.thumbnailUrl = str3;
    }

    public static /* synthetic */ AlbumPhotoModel copy$default(AlbumPhotoModel albumPhotoModel, int i8, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i8 = albumPhotoModel.albumId;
        }
        if ((i11 & 2) != 0) {
            i10 = albumPhotoModel.f6675id;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str = albumPhotoModel.title;
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            str2 = albumPhotoModel.url;
        }
        String str5 = str2;
        if ((i11 & 16) != 0) {
            str3 = albumPhotoModel.thumbnailUrl;
        }
        return albumPhotoModel.copy(i8, i12, str4, str5, str3);
    }

    public final int component1() {
        return this.albumId;
    }

    public final int component2() {
        return this.f6675id;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.url;
    }

    public final String component5() {
        return this.thumbnailUrl;
    }

    public final AlbumPhotoModel copy(int i8, int i10, String str, String str2, String str3) {
        j.f(str, "title");
        j.f(str2, "url");
        j.f(str3, "thumbnailUrl");
        return new AlbumPhotoModel(i8, i10, str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumPhotoModel)) {
            return false;
        }
        AlbumPhotoModel albumPhotoModel = (AlbumPhotoModel) obj;
        return this.albumId == albumPhotoModel.albumId && this.f6675id == albumPhotoModel.f6675id && j.a(this.title, albumPhotoModel.title) && j.a(this.url, albumPhotoModel.url) && j.a(this.thumbnailUrl, albumPhotoModel.thumbnailUrl);
    }

    public final int getAlbumId() {
        return this.albumId;
    }

    public final int getId() {
        return this.f6675id;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.thumbnailUrl.hashCode() + x.a(this.url, x.a(this.title, f1.c(this.f6675id, Integer.hashCode(this.albumId) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlbumPhotoModel(albumId=");
        sb2.append(this.albumId);
        sb2.append(", id=");
        sb2.append(this.f6675id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", thumbnailUrl=");
        return b0.a(sb2, this.thumbnailUrl, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeInt(this.albumId);
        parcel.writeInt(this.f6675id);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
    }
}
