package kc;

import ag.v1;
import android.os.Parcelable;
import com.quickkonnect.silencio.models.response.auth.UserModel;
import f3.v;
import ff.m;
import i3.h;
import i3.k;
import i3.p;
import i3.r;
import i3.t;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import jf.d;
import m3.f;
import sf.j;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final p f10404a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10405b;

    public class a extends h {
        public a(p pVar) {
            super(pVar, 1);
        }

        public final String b() {
            return "INSERT OR REPLACE INTO `user` (`uuid`,`id`,`firstName`,`lastName`,`email`,`nickName`,`type`,`registrationType`,`countryCode`,`phone`,`walletBalance`,`recordingTime`,`recordingCount`,`avgTime`,`lastLogin`,`authToken`,`inviteCode`,`profileImg`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        public final void c(f fVar, Parcelable parcelable) {
            UserModel userModel = (UserModel) parcelable;
            fVar.H(1, (long) userModel.getUuid());
            if (userModel.getId() == null) {
                fVar.h0(2);
            } else {
                fVar.m(2, userModel.getId());
            }
            if (userModel.getFirstName() == null) {
                fVar.h0(3);
            } else {
                fVar.m(3, userModel.getFirstName());
            }
            if (userModel.getLastName() == null) {
                fVar.h0(4);
            } else {
                fVar.m(4, userModel.getLastName());
            }
            if (userModel.getEmail() == null) {
                fVar.h0(5);
            } else {
                fVar.m(5, userModel.getEmail());
            }
            if (userModel.getNickName() == null) {
                fVar.h0(6);
            } else {
                fVar.m(6, userModel.getNickName());
            }
            if (userModel.getType() == null) {
                fVar.h0(7);
            } else {
                fVar.m(7, userModel.getType());
            }
            if (userModel.getRegistrationType() == null) {
                fVar.h0(8);
            } else {
                fVar.m(8, userModel.getRegistrationType());
            }
            if (userModel.getCountryCode() == null) {
                fVar.h0(9);
            } else {
                fVar.m(9, userModel.getCountryCode());
            }
            if (userModel.getPhone() == null) {
                fVar.h0(10);
            } else {
                fVar.m(10, userModel.getPhone());
            }
            if (userModel.getWalletBalance() == null) {
                fVar.h0(11);
            } else {
                fVar.m(11, userModel.getWalletBalance());
            }
            if (userModel.getRecordingTime() == null) {
                fVar.h0(12);
            } else {
                fVar.m(12, userModel.getRecordingTime());
            }
            if (userModel.getRecordingCount() == null) {
                fVar.h0(13);
            } else {
                fVar.m(13, userModel.getRecordingCount());
            }
            if (userModel.getAvgTime() == null) {
                fVar.h0(14);
            } else {
                fVar.m(14, userModel.getAvgTime());
            }
            if (userModel.getLastLogin() == null) {
                fVar.h0(15);
            } else {
                fVar.m(15, userModel.getLastLogin());
            }
            if (userModel.getAuthToken() == null) {
                fVar.h0(16);
            } else {
                fVar.m(16, userModel.getAuthToken());
            }
            if (userModel.getInviteCode() == null) {
                fVar.h0(17);
            } else {
                fVar.m(17, userModel.getInviteCode());
            }
            if (userModel.getProfileImg() == null) {
                fVar.h0(18);
            } else {
                fVar.m(18, userModel.getProfileImg());
            }
            if (userModel.getCreatedAt() == null) {
                fVar.h0(19);
            } else {
                fVar.m(19, userModel.getCreatedAt());
            }
        }
    }

    public class b extends h {
        public b(p pVar) {
            super(pVar, 0);
        }

        public final String b() {
            return "DELETE FROM `user` WHERE `uuid` = ?";
        }
    }

    /* renamed from: kc.c$c  reason: collision with other inner class name */
    public class C0191c implements Callable<m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UserModel f10406a;

        public C0191c(UserModel userModel) {
            this.f10406a = userModel;
        }

        public final Object call() {
            c cVar = c.this;
            p pVar = cVar.f10404a;
            pVar.a();
            pVar.a();
            m3.b N = pVar.f().N();
            pVar.f9511e.f(N);
            if (N.s0()) {
                N.J();
            } else {
                N.f();
            }
            try {
                cVar.f10405b.d(this.f10406a);
                pVar.f().N().I();
                return m.f8717a;
            } finally {
                pVar.k();
            }
        }
    }

    public c(p pVar) {
        this.f10404a = pVar;
        this.f10405b = new a(pVar);
        new b(pVar);
    }

    public final Object a(UserModel userModel, d<? super m> dVar) {
        return v1.j(this.f10404a, new C0191c(userModel), dVar);
    }

    public final t b() {
        int i8 = 0;
        r e10 = r.e(0, "SELECT * FROM user");
        k kVar = this.f10404a.f9511e;
        d dVar = new d(this, e10);
        kVar.getClass();
        String[] d10 = kVar.d(new String[]{"user"});
        int length = d10.length;
        while (i8 < length) {
            String str = d10[i8];
            LinkedHashMap linkedHashMap = kVar.f9469d;
            Locale locale = Locale.US;
            j.e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (linkedHashMap.containsKey(lowerCase)) {
                i8++;
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        v vVar = kVar.f9475j;
        vVar.getClass();
        return new t((p) vVar.f8516a, vVar, dVar, d10);
    }
}
