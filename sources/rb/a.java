package rb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.f1;
import com.lassi.presentation.cropper.CropImageView;
import com.quickkonnect.silencio.R;
import h0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nb.b;
import q.g;
import sf.j;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0264a();
    public static final a V = new a(0);
    public int B;
    public int C;
    public int D;
    public ArrayList<b> E;
    public int F;
    public int G;
    public int H;
    public int I;
    public long J;
    public long K;
    public CropImageView.c L;
    public List<String> M;
    public com.lassi.presentation.cameraview.controls.a N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public long S;
    public long T;
    public boolean U;

    /* renamed from: a  reason: collision with root package name */
    public int f14186a;

    /* renamed from: b  reason: collision with root package name */
    public int f14187b;

    /* renamed from: c  reason: collision with root package name */
    public int f14188c;

    /* renamed from: d  reason: collision with root package name */
    public int f14189d;

    /* renamed from: e  reason: collision with root package name */
    public int f14190e;

    /* renamed from: rb.a$a  reason: collision with other inner class name */
    public static final class C0264a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            j.f(parcel2, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            int readInt8 = parcel.readInt();
            int readInt9 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt9);
            for (int i8 = 0; i8 != readInt9; i8++) {
                arrayList.add(b.CREATOR.createFromParcel(parcel2));
            }
            return new a(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, arrayList, f1.i(parcel.readString()), parcel.readInt(), parcel.readInt(), b.d(parcel.readString()), parcel.readLong(), parcel.readLong(), CropImageView.c.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : com.lassi.presentation.cameraview.controls.a.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a() {
        this(0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v0, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, java.util.ArrayList<nb.b> r16, java.lang.Object r17, int r18, int r19, java.lang.Object r20, long r21, long r23, com.lassi.presentation.cropper.CropImageView.c r25, java.util.List<java.lang.String> r26, com.lassi.presentation.cameraview.controls.a r27, boolean r28, boolean r29, boolean r30, int r31, long r32, long r34, boolean r36) {
        /*
            r7 = this;
            r0 = r7
            r1 = r16
            r2 = r17
            r3 = r20
            r4 = r25
            r5 = r26
            java.lang.String r6 = "selectedMedias"
            sf.j.f(r1, r6)
            java.lang.String r6 = "mediaType"
            com.google.android.gms.internal.measurement.f2.a(r2, r6)
            java.lang.String r6 = "lassiOption"
            com.google.android.gms.internal.measurement.f2.a(r3, r6)
            java.lang.String r6 = "cropType"
            sf.j.f(r4, r6)
            java.lang.String r6 = "supportedFileType"
            sf.j.f(r5, r6)
            r7.<init>()
            r6 = r8
            r0.f14186a = r6
            r6 = r9
            r0.f14187b = r6
            r6 = r10
            r0.f14188c = r6
            r6 = r11
            r0.f14189d = r6
            r6 = r12
            r0.f14190e = r6
            r6 = r13
            r0.B = r6
            r6 = r14
            r0.C = r6
            r6 = r15
            r0.D = r6
            r0.E = r1
            r0.F = r2
            r1 = r18
            r0.G = r1
            r1 = r19
            r0.H = r1
            r0.I = r3
            r1 = r21
            r0.J = r1
            r1 = r23
            r0.K = r1
            r0.L = r4
            r0.M = r5
            r1 = r27
            r0.N = r1
            r1 = r28
            r0.O = r1
            r1 = r29
            r0.P = r1
            r1 = r30
            r0.Q = r1
            r1 = r31
            r0.R = r1
            r1 = r32
            r0.S = r1
            r1 = r34
            r0.T = r1
            r1 = r36
            r0.U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.a.<init>(int, int, int, int, int, int, int, int, java.util.ArrayList, int, int, int, int, long, long, com.lassi.presentation.cropper.CropImageView$c, java.util.List, com.lassi.presentation.cameraview.controls.a, boolean, boolean, boolean, int, long, long, boolean):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14186a == aVar.f14186a && this.f14187b == aVar.f14187b && this.f14188c == aVar.f14188c && this.f14189d == aVar.f14189d && this.f14190e == aVar.f14190e && this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && j.a(this.E, aVar.E) && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.K == aVar.K && this.L == aVar.L && j.a(this.M, aVar.M) && j.a(this.N, aVar.N) && this.O == aVar.O && this.P == aVar.P && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.T == aVar.T && this.U == aVar.U;
    }

    public final int hashCode() {
        int hashCode = (this.M.hashCode() + ((this.L.hashCode() + e.a(this.K, e.a(this.J, (g.c(this.I) + f1.c(this.H, f1.c(this.G, (g.c(this.F) + ((this.E.hashCode() + f1.c(this.D, f1.c(this.C, f1.c(this.B, f1.c(this.f14190e, f1.c(this.f14189d, f1.c(this.f14188c, f1.c(this.f14187b, Integer.hashCode(this.f14186a) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31), 31)) * 31, 31), 31)) * 31)) * 31;
        com.lassi.presentation.cameraview.controls.a aVar = this.N;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        boolean z10 = this.O;
        boolean z11 = true;
        if (z10) {
            z10 = true;
        }
        int i8 = (hashCode2 + (z10 ? 1 : 0)) * 31;
        boolean z12 = this.P;
        if (z12) {
            z12 = true;
        }
        int i10 = (i8 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.Q;
        if (z13) {
            z13 = true;
        }
        int a10 = e.a(this.T, e.a(this.S, f1.c(this.R, (i10 + (z13 ? 1 : 0)) * 31, 31), 31), 31);
        boolean z14 = this.U;
        if (!z14) {
            z11 = z14;
        }
        return a10 + (z11 ? 1 : 0);
    }

    public final String toString() {
        return "LassiConfig(toolbarColor=" + this.f14186a + ", statusBarColor=" + this.f14187b + ", toolbarResourceColor=" + this.f14188c + ", progressBarColor=" + this.f14189d + ", galleryBackgroundColor=" + this.f14190e + ", placeHolder=" + this.B + ", errorDrawable=" + this.C + ", selectionDrawable=" + this.D + ", selectedMedias=" + this.E + ", mediaType=" + f1.h(this.F) + ", maxCount=" + this.G + ", gridSize=" + this.H + ", lassiOption=" + b.c(this.I) + ", minTime=" + this.J + ", maxTime=" + this.K + ", cropType=" + this.L + ", supportedFileType=" + this.M + ", cropAspectRatio=" + this.N + ", enableFlipImage=" + this.O + ", enableRotateImage=" + this.P + ", enableActualCircleCrop=" + this.Q + ", compressionRation=" + this.R + ", minFileSize=" + this.S + ", maxFileSize=" + this.T + ", isCrop=" + this.U + ')';
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        j.f(parcel, "out");
        parcel.writeInt(this.f14186a);
        parcel.writeInt(this.f14187b);
        parcel.writeInt(this.f14188c);
        parcel.writeInt(this.f14189d);
        parcel.writeInt(this.f14190e);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        ArrayList<b> arrayList = this.E;
        parcel.writeInt(arrayList.size());
        Iterator<b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i8);
        }
        parcel.writeString(f1.f(this.F));
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeString(b.b(this.I));
        parcel.writeLong(this.J);
        parcel.writeLong(this.K);
        parcel.writeString(this.L.name());
        parcel.writeStringList(this.M);
        com.lassi.presentation.cameraview.controls.a aVar = this.N;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i8);
        }
        parcel.writeInt(this.O ? 1 : 0);
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R);
        parcel.writeLong(this.S);
        parcel.writeLong(this.T);
        parcel.writeInt(this.U ? 1 : 0);
    }

    public /* synthetic */ a(int i8) {
        this(-16777216, -16777216, -1, -16777216, -1, R.drawable.ic_image_placeholder, R.drawable.ic_image_placeholder, R.drawable.ic_checked_media, new ArrayList(), 1, 1, 2, 3, 0, 0, CropImageView.c.f6551a, new ArrayList(), (com.lassi.presentation.cameraview.controls.a) null, false, false, false, 0, 0, 0, true);
    }
}
