package com.quickkonnect.silencio.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.f1;
import s0.b0;
import sf.j;

public final class AlbumModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AlbumModel> CREATOR = new Creator();

    /* renamed from: id  reason: collision with root package name */
    private final int f6674id;
    private final String title;
    private final int userId;

    public static final class Creator implements Parcelable.Creator<AlbumModel> {
        public final AlbumModel createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new AlbumModel(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        public final AlbumModel[] newArray(int i8) {
            return new AlbumModel[i8];
        }
    }

    public AlbumModel(int i8, int i10, String str) {
        j.f(str, "title");
        this.f6674id = i8;
        this.userId = i10;
        this.title = str;
    }

    public static /* synthetic */ AlbumModel copy$default(AlbumModel albumModel, int i8, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i8 = albumModel.f6674id;
        }
        if ((i11 & 2) != 0) {
            i10 = albumModel.userId;
        }
        if ((i11 & 4) != 0) {
            str = albumModel.title;
        }
        return albumModel.copy(i8, i10, str);
    }

    public final int component1() {
        return this.f6674id;
    }

    public final int component2() {
        return this.userId;
    }

    public final String component3() {
        return this.title;
    }

    public final AlbumModel copy(int i8, int i10, String str) {
        j.f(str, "title");
        return new AlbumModel(i8, i10, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumModel)) {
            return false;
        }
        AlbumModel albumModel = (AlbumModel) obj;
        return this.f6674id == albumModel.f6674id && this.userId == albumModel.userId && j.a(this.title, albumModel.title);
    }

    public final int getId() {
        return this.f6674id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.title.hashCode() + f1.c(this.userId, Integer.hashCode(this.f6674id) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AlbumModel(id=");
        sb2.append(this.f6674id);
        sb2.append(", userId=");
        sb2.append(this.userId);
        sb2.append(", title=");
        return b0.a(sb2, this.title, ')');
    }

    public void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeInt(this.f6674id);
        parcel.writeInt(this.userId);
        parcel.writeString(this.title);
    }
}
