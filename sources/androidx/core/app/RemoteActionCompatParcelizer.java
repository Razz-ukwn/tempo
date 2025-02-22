package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import t3.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1734a;
        if (aVar.h(1)) {
            obj = aVar.m();
        }
        remoteActionCompat.f1734a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1735b;
        if (aVar.h(2)) {
            charSequence = aVar.g();
        }
        remoteActionCompat.f1735b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1736c;
        if (aVar.h(3)) {
            charSequence2 = aVar.g();
        }
        remoteActionCompat.f1736c = charSequence2;
        Object obj2 = remoteActionCompat.f1737d;
        if (aVar.h(4)) {
            obj2 = aVar.k();
        }
        remoteActionCompat.f1737d = (PendingIntent) obj2;
        boolean z10 = remoteActionCompat.f1738e;
        if (aVar.h(5)) {
            z10 = aVar.e();
        }
        remoteActionCompat.f1738e = z10;
        boolean z11 = remoteActionCompat.f1739f;
        if (aVar.h(6)) {
            z11 = aVar.e();
        }
        remoteActionCompat.f1739f = z11;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1734a;
        aVar.n(1);
        aVar.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1735b;
        aVar.n(2);
        aVar.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1736c;
        aVar.n(3);
        aVar.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1737d;
        aVar.n(4);
        aVar.t(pendingIntent);
        boolean z10 = remoteActionCompat.f1738e;
        aVar.n(5);
        aVar.o(z10);
        boolean z11 = remoteActionCompat.f1739f;
        aVar.n(6);
        aVar.o(z11);
    }
}
