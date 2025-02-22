package x7;

import ag.n2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.quickkonnect.silencio.R;
import java.io.IOException;
import java.util.Locale;
import m8.s;
import org.xmlpull.v1.XmlPullParserException;
import r8.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f16976a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16977b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final float f16978c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16979d;

    /* renamed from: e  reason: collision with root package name */
    public final float f16980e;

    public b(Context context, a aVar) {
        AttributeSet attributeSet;
        int i8;
        int next;
        Context context2 = context;
        a aVar2 = aVar == null ? new a() : aVar;
        int i10 = aVar2.f16981a;
        int i11 = 0;
        if (i10 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    i8 = asAttributeSet.getStyleAttribute();
                    attributeSet = asAttributeSet;
                } else {
                    throw new XmlPullParserException("Must have a <" + "badge" + "> start tag");
                }
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i8 = 0;
        }
        TypedArray d10 = s.d(context, attributeSet, n2.C, R.attr.badgeStyle, i8 == 0 ? 2132018180 : i8, new int[0]);
        Resources resources = context.getResources();
        this.f16978c = (float) d10.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f16980e = (float) d10.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f16979d = (float) d10.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        a aVar3 = this.f16977b;
        int i12 = aVar2.f16984d;
        aVar3.f16984d = i12 == -2 ? 255 : i12;
        CharSequence charSequence = aVar2.D;
        aVar3.D = charSequence == null ? context2.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar4 = this.f16977b;
        int i13 = aVar2.E;
        aVar4.E = i13 == 0 ? R.plurals.mtrl_badge_content_description : i13;
        int i14 = aVar2.F;
        aVar4.F = i14 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i14;
        Boolean bool = aVar2.H;
        aVar4.H = Boolean.valueOf(bool == null || bool.booleanValue());
        a aVar5 = this.f16977b;
        int i15 = aVar2.B;
        aVar5.B = i15 == -2 ? d10.getInt(8, 4) : i15;
        int i16 = aVar2.f16985e;
        if (i16 != -2) {
            this.f16977b.f16985e = i16;
        } else if (d10.hasValue(9)) {
            this.f16977b.f16985e = d10.getInt(9, 0);
        } else {
            this.f16977b.f16985e = -1;
        }
        a aVar6 = this.f16977b;
        Integer num = aVar2.f16982b;
        aVar6.f16982b = Integer.valueOf(num == null ? c.a(context2, d10, 0).getDefaultColor() : num.intValue());
        Integer num2 = aVar2.f16983c;
        if (num2 != null) {
            this.f16977b.f16983c = num2;
        } else if (d10.hasValue(3)) {
            this.f16977b.f16983c = Integer.valueOf(c.a(context2, d10, 3).getDefaultColor());
        } else {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(2132017679, n2.f463k0);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList a10 = c.a(context2, obtainStyledAttributes, 3);
            c.a(context2, obtainStyledAttributes, 4);
            c.a(context2, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i17 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
            obtainStyledAttributes.getResourceId(i17, 0);
            obtainStyledAttributes.getString(i17);
            obtainStyledAttributes.getBoolean(14, false);
            c.a(context2, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(2132017679, n2.X);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f16977b.f16983c = Integer.valueOf(a10.getDefaultColor());
        }
        a aVar7 = this.f16977b;
        Integer num3 = aVar2.G;
        aVar7.G = Integer.valueOf(num3 == null ? d10.getInt(1, 8388661) : num3.intValue());
        a aVar8 = this.f16977b;
        Integer num4 = aVar2.I;
        aVar8.I = Integer.valueOf(num4 == null ? d10.getDimensionPixelOffset(6, 0) : num4.intValue());
        a aVar9 = this.f16977b;
        Integer num5 = aVar2.J;
        aVar9.J = Integer.valueOf(num5 == null ? d10.getDimensionPixelOffset(10, 0) : num5.intValue());
        a aVar10 = this.f16977b;
        Integer num6 = aVar2.K;
        aVar10.K = Integer.valueOf(num6 == null ? d10.getDimensionPixelOffset(7, aVar10.I.intValue()) : num6.intValue());
        a aVar11 = this.f16977b;
        Integer num7 = aVar2.L;
        aVar11.L = Integer.valueOf(num7 == null ? d10.getDimensionPixelOffset(11, aVar11.J.intValue()) : num7.intValue());
        a aVar12 = this.f16977b;
        Integer num8 = aVar2.M;
        aVar12.M = Integer.valueOf(num8 == null ? 0 : num8.intValue());
        a aVar13 = this.f16977b;
        Integer num9 = aVar2.N;
        aVar13.N = Integer.valueOf(num9 != null ? num9.intValue() : i11);
        d10.recycle();
        Locale locale = aVar2.C;
        if (locale == null) {
            this.f16977b.C = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f16977b.C = locale;
        }
        this.f16976a = aVar2;
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0315a();
        public int B = -2;
        public Locale C;
        public CharSequence D;
        public int E;
        public int F;
        public Integer G;
        public Boolean H = Boolean.TRUE;
        public Integer I;
        public Integer J;
        public Integer K;
        public Integer L;
        public Integer M;
        public Integer N;

        /* renamed from: a  reason: collision with root package name */
        public int f16981a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f16982b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f16983c;

        /* renamed from: d  reason: collision with root package name */
        public int f16984d = 255;

        /* renamed from: e  reason: collision with root package name */
        public int f16985e = -2;

        /* renamed from: x7.b$a$a  reason: collision with other inner class name */
        public class C0315a implements Parcelable.Creator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final Object[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f16981a);
            parcel.writeSerializable(this.f16982b);
            parcel.writeSerializable(this.f16983c);
            parcel.writeInt(this.f16984d);
            parcel.writeInt(this.f16985e);
            parcel.writeInt(this.B);
            CharSequence charSequence = this.D;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.E);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.K);
            parcel.writeSerializable(this.L);
            parcel.writeSerializable(this.M);
            parcel.writeSerializable(this.N);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.C);
        }

        public a(Parcel parcel) {
            this.f16981a = parcel.readInt();
            this.f16982b = (Integer) parcel.readSerializable();
            this.f16983c = (Integer) parcel.readSerializable();
            this.f16984d = parcel.readInt();
            this.f16985e = parcel.readInt();
            this.B = parcel.readInt();
            this.D = parcel.readString();
            this.E = parcel.readInt();
            this.G = (Integer) parcel.readSerializable();
            this.I = (Integer) parcel.readSerializable();
            this.J = (Integer) parcel.readSerializable();
            this.K = (Integer) parcel.readSerializable();
            this.L = (Integer) parcel.readSerializable();
            this.M = (Integer) parcel.readSerializable();
            this.N = (Integer) parcel.readSerializable();
            this.H = (Boolean) parcel.readSerializable();
            this.C = (Locale) parcel.readSerializable();
        }
    }
}
