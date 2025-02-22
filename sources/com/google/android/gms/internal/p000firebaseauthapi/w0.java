package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import v6.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w0  reason: invalid package */
public final class w0 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int o10 = b.o(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < o10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.c(parcel2, readInt);
                    break;
                case 3:
                    str2 = b.c(parcel2, readInt);
                    break;
                case 4:
                    str3 = b.c(parcel2, readInt);
                    break;
                case 5:
                    str4 = b.c(parcel2, readInt);
                    break;
                case 6:
                    str5 = b.c(parcel2, readInt);
                    break;
                case 7:
                    str6 = b.c(parcel2, readInt);
                    break;
                case 8:
                    str7 = b.c(parcel2, readInt);
                    break;
                case 9:
                    str8 = b.c(parcel2, readInt);
                    break;
                case 10:
                    z10 = b.h(parcel2, readInt);
                    break;
                case ModuleDescriptor.MODULE_VERSION:
                    z11 = b.h(parcel2, readInt);
                    break;
                case 12:
                    str9 = b.c(parcel2, readInt);
                    break;
                case 13:
                    str10 = b.c(parcel2, readInt);
                    break;
                case 14:
                    str11 = b.c(parcel2, readInt);
                    break;
                case 15:
                    str12 = b.c(parcel2, readInt);
                    break;
                case 16:
                    z12 = b.h(parcel2, readInt);
                    break;
                case 17:
                    str13 = b.c(parcel2, readInt);
                    break;
                default:
                    b.n(parcel2, readInt);
                    break;
            }
        }
        b.g(parcel2, o10);
        return new v0(str, str2, str3, str4, str5, str6, str7, str8, z10, z11, str9, str10, str11, str12, z12, str13);
    }

    public final /* synthetic */ Object[] newArray(int i8) {
        return new v0[i8];
    }
}
