package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public final Uri B;
    public final Bundle C;
    public final Uri D;
    public Object E;

    /* renamed from: a  reason: collision with root package name */
    public final String f522a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f523b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f524c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f525d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f526e;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i8) {
            return new MediaDescriptionCompat[i8];
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f522a = str;
        this.f523b = charSequence;
        this.f524c = charSequence2;
        this.f525d = charSequence3;
        this.f526e = bitmap;
        this.B = uri;
        this.C = bundle;
        this.D = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r14) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x005b
            r1 = r14
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r3 = r1.getMediaId()
            java.lang.CharSequence r4 = r1.getTitle()
            java.lang.CharSequence r5 = r1.getSubtitle()
            java.lang.CharSequence r6 = r1.getDescription()
            android.graphics.Bitmap r7 = r1.getIconBitmap()
            android.net.Uri r8 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0030
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r10 = r2.getParcelable(r9)
            android.net.Uri r10 = (android.net.Uri) r10
            goto L_0x0031
        L_0x0030:
            r10 = r0
        L_0x0031:
            if (r10 == 0) goto L_0x004a
            java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r12 = r2.containsKey(r11)
            if (r12 == 0) goto L_0x0044
            int r12 = r2.size()
            r13 = 2
            if (r12 != r13) goto L_0x0044
            r9 = r0
            goto L_0x004b
        L_0x0044:
            r2.remove(r9)
            r2.remove(r11)
        L_0x004a:
            r9 = r2
        L_0x004b:
            if (r10 == 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            android.net.Uri r0 = r1.getMediaUri()
            r10 = r0
        L_0x0053:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.E = r14
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f523b + ", " + this.f524c + ", " + this.f525d;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        Object obj = this.E;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f522a);
            builder.setTitle(this.f523b);
            builder.setSubtitle(this.f524c);
            builder.setDescription(this.f525d);
            builder.setIconBitmap(this.f526e);
            builder.setIconUri(this.B);
            builder.setExtras(this.C);
            builder.setMediaUri(this.D);
            obj = builder.build();
            this.E = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i8);
    }
}
