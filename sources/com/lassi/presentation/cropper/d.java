package com.lassi.presentation.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.lassi.presentation.cropper.CropImageView;
import q.g;

public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public float G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public int L;
    public float M;
    public float N;
    public float O;
    public int P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public final CharSequence Z;

    /* renamed from: a  reason: collision with root package name */
    public CropImageView.c f6611a;

    /* renamed from: a0  reason: collision with root package name */
    public final int f6612a0;

    /* renamed from: b  reason: collision with root package name */
    public float f6613b;

    /* renamed from: b0  reason: collision with root package name */
    public Uri f6614b0;

    /* renamed from: c  reason: collision with root package name */
    public float f6615c;

    /* renamed from: c0  reason: collision with root package name */
    public final Bitmap.CompressFormat f6616c0;

    /* renamed from: d  reason: collision with root package name */
    public CropImageView.d f6617d;

    /* renamed from: d0  reason: collision with root package name */
    public int f6618d0;

    /* renamed from: e  reason: collision with root package name */
    public CropImageView.j f6619e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f6620e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f6621f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f6622g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f6623h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Rect f6624i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f6625j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f6626k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6627l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f6628m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f6629n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6630o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6631p0;

    /* renamed from: q0  reason: collision with root package name */
    public final CharSequence f6632q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f6633r0;

    public static class a implements Parcelable.Creator<d> {
        public final Object createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        public final Object[] newArray(int i8) {
            return new d[i8];
        }
    }

    public d() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.f6611a = CropImageView.c.f6551a;
        this.f6613b = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.f6615c = TypedValue.applyDimension(1, 24.0f, displayMetrics);
        this.f6617d = CropImageView.d.f6554a;
        this.f6619e = CropImageView.j.f6557a;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = false;
        this.F = 4;
        this.G = 0.1f;
        this.H = false;
        this.I = 1;
        this.J = 1;
        this.K = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        this.L = Color.argb(170, 255, 255, 255);
        this.M = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        this.N = TypedValue.applyDimension(1, 5.0f, displayMetrics);
        this.O = TypedValue.applyDimension(1, 14.0f, displayMetrics);
        this.P = -1;
        this.Q = TypedValue.applyDimension(1, 1.0f, displayMetrics);
        this.R = Color.argb(170, 255, 255, 255);
        this.S = Color.argb(119, 0, 0, 0);
        this.T = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.U = (int) TypedValue.applyDimension(1, 42.0f, displayMetrics);
        this.V = 40;
        this.W = 40;
        this.X = 99999;
        this.Y = 99999;
        this.Z = "";
        this.f6612a0 = 0;
        this.f6614b0 = Uri.EMPTY;
        this.f6616c0 = Bitmap.CompressFormat.PNG;
        this.f6618d0 = 90;
        this.f6620e0 = 0;
        this.f6621f0 = 0;
        this.f6622g0 = 1;
        this.f6623h0 = false;
        this.f6624i0 = null;
        this.f6625j0 = -1;
        this.f6626k0 = true;
        this.f6627l0 = true;
        this.f6628m0 = false;
        this.f6629n0 = 90;
        this.f6630o0 = false;
        this.f6631p0 = false;
        this.f6632q0 = null;
        this.f6633r0 = 0;
    }

    public final void a() {
        if (this.F < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        } else if (this.f6615c >= 0.0f) {
            float f10 = this.G;
            if (f10 < 0.0f || ((double) f10) >= 0.5d) {
                throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            } else if (this.I <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.J <= 0) {
                throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
            } else if (this.K < 0.0f) {
                throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
            } else if (this.M < 0.0f) {
                throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
            } else if (this.Q < 0.0f) {
                throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
            } else if (this.U >= 0) {
                int i8 = this.V;
                if (i8 >= 0) {
                    int i10 = this.W;
                    if (i10 < 0) {
                        throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
                    } else if (this.X < i8) {
                        throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
                    } else if (this.Y < i10) {
                        throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
                    } else if (this.f6620e0 < 0) {
                        throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
                    } else if (this.f6621f0 >= 0) {
                        int i11 = this.f6629n0;
                        if (i11 < 0 || i11 > 360) {
                            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
                    }
                } else {
                    throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
                }
            } else {
                throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
            }
        } else {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f6611a.ordinal());
        parcel.writeFloat(this.f6613b);
        parcel.writeFloat(this.f6615c);
        parcel.writeInt(this.f6617d.ordinal());
        parcel.writeInt(this.f6619e.ordinal());
        parcel.writeByte(this.B ? (byte) 1 : 0);
        parcel.writeByte(this.C ? (byte) 1 : 0);
        parcel.writeByte(this.D ? (byte) 1 : 0);
        parcel.writeByte(this.E ? (byte) 1 : 0);
        parcel.writeInt(this.F);
        parcel.writeFloat(this.G);
        parcel.writeByte(this.H ? (byte) 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J);
        parcel.writeFloat(this.K);
        parcel.writeInt(this.L);
        parcel.writeFloat(this.M);
        parcel.writeFloat(this.N);
        parcel.writeFloat(this.O);
        parcel.writeInt(this.P);
        parcel.writeFloat(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        TextUtils.writeToParcel(this.Z, parcel, i8);
        parcel.writeInt(this.f6612a0);
        parcel.writeParcelable(this.f6614b0, i8);
        parcel.writeString(this.f6616c0.name());
        parcel.writeInt(this.f6618d0);
        parcel.writeInt(this.f6620e0);
        parcel.writeInt(this.f6621f0);
        parcel.writeInt(g.c(this.f6622g0));
        parcel.writeInt(this.f6623h0 ? 1 : 0);
        parcel.writeParcelable(this.f6624i0, i8);
        parcel.writeInt(this.f6625j0);
        parcel.writeByte(this.f6626k0 ? (byte) 1 : 0);
        parcel.writeByte(this.f6627l0 ? (byte) 1 : 0);
        parcel.writeByte(this.f6628m0 ? (byte) 1 : 0);
        parcel.writeInt(this.f6629n0);
        parcel.writeByte(this.f6630o0 ? (byte) 1 : 0);
        parcel.writeByte(this.f6631p0 ? (byte) 1 : 0);
        TextUtils.writeToParcel(this.f6632q0, parcel, i8);
        parcel.writeInt(this.f6633r0);
    }

    public d(Parcel parcel) {
        this.f6611a = CropImageView.c.values()[parcel.readInt()];
        this.f6613b = parcel.readFloat();
        this.f6615c = parcel.readFloat();
        this.f6617d = CropImageView.d.values()[parcel.readInt()];
        this.f6619e = CropImageView.j.values()[parcel.readInt()];
        boolean z10 = true;
        this.B = parcel.readByte() != 0;
        this.C = parcel.readByte() != 0;
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
        this.F = parcel.readInt();
        this.G = parcel.readFloat();
        this.H = parcel.readByte() != 0;
        this.I = parcel.readInt();
        this.J = parcel.readInt();
        this.K = parcel.readFloat();
        this.L = parcel.readInt();
        this.M = parcel.readFloat();
        this.N = parcel.readFloat();
        this.O = parcel.readFloat();
        this.P = parcel.readInt();
        this.Q = parcel.readFloat();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6612a0 = parcel.readInt();
        this.f6614b0 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f6616c0 = Bitmap.CompressFormat.valueOf(parcel.readString());
        this.f6618d0 = parcel.readInt();
        this.f6620e0 = parcel.readInt();
        this.f6621f0 = parcel.readInt();
        this.f6622g0 = g.d(5)[parcel.readInt()];
        this.f6623h0 = parcel.readByte() != 0;
        this.f6624i0 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f6625j0 = parcel.readInt();
        this.f6626k0 = parcel.readByte() != 0;
        this.f6627l0 = parcel.readByte() != 0;
        this.f6628m0 = parcel.readByte() != 0;
        this.f6629n0 = parcel.readInt();
        this.f6630o0 = parcel.readByte() != 0;
        this.f6631p0 = parcel.readByte() == 0 ? false : z10;
        this.f6632q0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6633r0 = parcel.readInt();
    }
}
