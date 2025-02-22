package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import java.nio.charset.Charset;
import t3.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1741a = aVar.j(iconCompat.f1741a, 1);
        byte[] bArr = iconCompat.f1743c;
        if (aVar.h(2)) {
            bArr = aVar.f();
        }
        iconCompat.f1743c = bArr;
        Parcelable parcelable = iconCompat.f1744d;
        if (aVar.h(3)) {
            parcelable = aVar.k();
        }
        iconCompat.f1744d = parcelable;
        iconCompat.f1745e = aVar.j(iconCompat.f1745e, 4);
        iconCompat.f1746f = aVar.j(iconCompat.f1746f, 5);
        Object obj = iconCompat.f1747g;
        if (aVar.h(6)) {
            obj = aVar.k();
        }
        iconCompat.f1747g = (ColorStateList) obj;
        String str = iconCompat.f1749i;
        if (aVar.h(7)) {
            str = aVar.l();
        }
        iconCompat.f1749i = str;
        String str2 = iconCompat.f1750j;
        if (aVar.h(8)) {
            str2 = aVar.l();
        }
        iconCompat.f1750j = str2;
        iconCompat.f1748h = PorterDuff.Mode.valueOf(iconCompat.f1749i);
        switch (iconCompat.f1741a) {
            case IntegrityErrorCode.API_NOT_AVAILABLE /*-1*/:
                Parcelable parcelable2 = iconCompat.f1744d;
                if (parcelable2 != null) {
                    iconCompat.f1742b = parcelable2;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable3 = iconCompat.f1744d;
                if (parcelable3 == null) {
                    byte[] bArr2 = iconCompat.f1743c;
                    iconCompat.f1742b = bArr2;
                    iconCompat.f1741a = 3;
                    iconCompat.f1745e = 0;
                    iconCompat.f1746f = bArr2.length;
                    break;
                } else {
                    iconCompat.f1742b = parcelable3;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1743c, Charset.forName("UTF-16"));
                iconCompat.f1742b = str3;
                if (iconCompat.f1741a == 2 && iconCompat.f1750j == null) {
                    iconCompat.f1750j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.f1742b = iconCompat.f1743c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1749i = iconCompat.f1748h.name();
        switch (iconCompat.f1741a) {
            case IntegrityErrorCode.API_NOT_AVAILABLE /*-1*/:
                iconCompat.f1744d = (Parcelable) iconCompat.f1742b;
                break;
            case 1:
            case 5:
                iconCompat.f1744d = (Parcelable) iconCompat.f1742b;
                break;
            case 2:
                iconCompat.f1743c = ((String) iconCompat.f1742b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1743c = (byte[]) iconCompat.f1742b;
                break;
            case 4:
            case 6:
                iconCompat.f1743c = iconCompat.f1742b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i8 = iconCompat.f1741a;
        if (-1 != i8) {
            aVar.s(i8, 1);
        }
        byte[] bArr = iconCompat.f1743c;
        if (bArr != null) {
            aVar.n(2);
            aVar.p(bArr);
        }
        Parcelable parcelable = iconCompat.f1744d;
        if (parcelable != null) {
            aVar.n(3);
            aVar.t(parcelable);
        }
        int i10 = iconCompat.f1745e;
        if (i10 != 0) {
            aVar.s(i10, 4);
        }
        int i11 = iconCompat.f1746f;
        if (i11 != 0) {
            aVar.s(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f1747g;
        if (colorStateList != null) {
            aVar.n(6);
            aVar.t(colorStateList);
        }
        String str = iconCompat.f1749i;
        if (str != null) {
            aVar.n(7);
            aVar.u(str);
        }
        String str2 = iconCompat.f1750j;
        if (str2 != null) {
            aVar.n(8);
            aVar.u(str2);
        }
    }
}
