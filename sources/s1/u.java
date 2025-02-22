package s1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import s1.z;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14531a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f14532b;

    /* renamed from: c  reason: collision with root package name */
    public final s f14533c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f14534d = new Bundle();

    public static class a {
        public static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setPriority(i8);
        }

        public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        public static Notification.Builder d(Notification.Builder builder, boolean z10) {
            return builder.setUsesChronometer(z10);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setShowWhen(z10);
        }
    }

    public static class c {
        public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    public static class d {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i8, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class e {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i8) {
            return builder.setColor(i8);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i8) {
            return builder.setVisibility(i8);
        }
    }

    public static class f {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class g {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class h {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setBadgeIconType(i8);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i8) {
            return builder.setGroupAlertBehavior(i8);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    public static class i {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i8) {
            return builder.setSemanticAction(i8);
        }
    }

    public static class j {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class k {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i8) {
            return builder.setForegroundServiceBehavior(i8);
        }
    }

    public u(s sVar) {
        ArrayList<m> arrayList;
        Bundle[] bundleArr;
        int i8;
        int i10;
        s sVar2 = sVar;
        new ArrayList();
        this.f14533c = sVar2;
        Context context = sVar2.f14511a;
        this.f14531a = context;
        Notification.Builder a10 = h.a(context, sVar2.f14526q);
        this.f14532b = a10;
        Notification notification = sVar2.f14528s;
        ArrayList<String> arrayList2 = null;
        int i11 = 0;
        a10.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(sVar2.f14515e).setContentText(sVar2.f14516f).setContentInfo((CharSequence) null).setContentIntent(sVar2.f14517g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : true).setLargeIcon(sVar2.f14518h).setNumber(sVar2.f14519i).setProgress(0, 0, false);
        a.b(a.d(a.c(a10, (CharSequence) null), false), sVar2.f14520j);
        Iterator<m> it = sVar2.f14512b.iterator();
        while (it.hasNext()) {
            m next = it.next();
            if (next.f14497b == null && (i10 = next.f14503h) != 0) {
                next.f14497b = IconCompat.a("", i10);
            }
            IconCompat iconCompat = next.f14497b;
            Notification.Action.Builder a11 = f.a(iconCompat != null ? IconCompat.a.f(iconCompat, (Context) null) : null, next.f14504i, next.f14505j);
            b0[] b0VarArr = next.f14498c;
            if (b0VarArr != null) {
                int length = b0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (b0VarArr.length <= 0) {
                    for (int i12 = 0; i12 < length; i12++) {
                        d.c(a11, remoteInputArr[i12]);
                    }
                } else {
                    b0 b0Var = b0VarArr[0];
                    throw null;
                }
            }
            Bundle bundle = next.f14496a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z10 = next.f14499d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            int i13 = Build.VERSION.SDK_INT;
            g.a(a11, z10);
            int i14 = next.f14501f;
            bundle2.putInt("android.support.action.semanticAction", i14);
            if (i13 >= 28) {
                i.b(a11, i14);
            }
            if (i13 >= 29) {
                j.c(a11, next.f14502g);
            }
            if (i13 >= 31) {
                k.a(a11, next.f14506k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f14500e);
            d.b(a11, bundle2);
            d.a(this.f14532b, d.d(a11));
        }
        Bundle bundle3 = sVar2.f14523n;
        if (bundle3 != null) {
            this.f14534d.putAll(bundle3);
        }
        int i15 = Build.VERSION.SDK_INT;
        b.a(this.f14532b, sVar2.f14521k);
        d.i(this.f14532b, sVar2.m);
        d.g(this.f14532b, (String) null);
        d.j(this.f14532b, (String) null);
        d.h(this.f14532b, false);
        e.b(this.f14532b, (String) null);
        e.c(this.f14532b, sVar2.f14524o);
        e.f(this.f14532b, sVar2.f14525p);
        e.d(this.f14532b, (Notification) null);
        e.e(this.f14532b, notification.sound, notification.audioAttributes);
        ArrayList<z> arrayList3 = sVar2.f14513c;
        ArrayList<String> arrayList4 = sVar2.f14529t;
        if (i15 < 28) {
            if (arrayList3 != null) {
                arrayList2 = new ArrayList<>(arrayList3.size());
                Iterator<z> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    z next2 = it2.next();
                    String str = next2.f14539c;
                    if (str == null) {
                        CharSequence charSequence = next2.f14537a;
                        if (charSequence != null) {
                            str = "name:" + charSequence;
                        } else {
                            str = "";
                        }
                    }
                    arrayList2.add(str);
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    o.b bVar = new o.b(arrayList4.size() + arrayList2.size());
                    bVar.addAll(arrayList2);
                    bVar.addAll(arrayList4);
                    arrayList4 = new ArrayList<>(bVar);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            for (String a12 : arrayList4) {
                e.a(this.f14532b, a12);
            }
        }
        ArrayList<m> arrayList5 = sVar2.f14514d;
        if (arrayList5.size() > 0) {
            if (sVar2.f14523n == null) {
                sVar2.f14523n = new Bundle();
            }
            Bundle bundle4 = sVar2.f14523n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i16 = 0;
            while (i11 < arrayList5.size()) {
                String num = Integer.toString(i11);
                m mVar = arrayList5.get(i11);
                Object obj = v.f14535a;
                Bundle bundle7 = new Bundle();
                if (mVar.f14497b == null && (i8 = mVar.f14503h) != 0) {
                    mVar.f14497b = IconCompat.a("", i8);
                }
                IconCompat iconCompat2 = mVar.f14497b;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.b() : i16);
                bundle7.putCharSequence("title", mVar.f14504i);
                bundle7.putParcelable("actionIntent", mVar.f14505j);
                Bundle bundle8 = mVar.f14496a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", mVar.f14499d);
                bundle7.putBundle("extras", bundle9);
                b0[] b0VarArr2 = mVar.f14498c;
                if (b0VarArr2 == null) {
                    bundleArr = null;
                    arrayList = arrayList5;
                } else {
                    Bundle[] bundleArr2 = new Bundle[b0VarArr2.length];
                    arrayList = arrayList5;
                    if (b0VarArr2.length <= 0) {
                        bundleArr = bundleArr2;
                    } else {
                        b0 b0Var2 = b0VarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", mVar.f14500e);
                bundle7.putInt("semanticAction", mVar.f14501f);
                bundle6.putBundle(num, bundle7);
                i11++;
                i16 = 0;
                arrayList5 = arrayList;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (sVar2.f14523n == null) {
                sVar2.f14523n = new Bundle();
            }
            sVar2.f14523n.putBundle("android.car.EXTENSIONS", bundle4);
            this.f14534d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i17 = Build.VERSION.SDK_INT;
        c.a(this.f14532b, sVar2.f14523n);
        g.e(this.f14532b, (CharSequence[]) null);
        h.b(this.f14532b, 0);
        h.e(this.f14532b, (CharSequence) null);
        h.f(this.f14532b, (String) null);
        h.g(this.f14532b, 0);
        h.d(this.f14532b, 0);
        if (!TextUtils.isEmpty(sVar2.f14526q)) {
            this.f14532b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
        }
        if (i17 >= 28) {
            Iterator<z> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                z next3 = it3.next();
                Notification.Builder builder = this.f14532b;
                next3.getClass();
                i.a(builder, z.a.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(this.f14532b, sVar2.f14527r);
            j.b(this.f14532b, (Notification.BubbleMetadata) null);
        }
    }
}
