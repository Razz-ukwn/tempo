package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.platform.j3;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;
import t.r1;
import u6.q;
import x6.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sh  reason: invalid package */
public final class sh implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4921a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4922b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4923c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4924d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4925e;

    public /* synthetic */ sh(j3 j3Var, w wVar, h0 h0Var, m0 m0Var, q0 q0Var) {
        this.f4921a = q0Var;
        this.f4922b = h0Var;
        this.f4923c = j3Var;
        this.f4924d = m0Var;
        this.f4925e = wVar;
    }

    public /* synthetic */ sh(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, EditText editText, TextView textView) {
        this.f4921a = constraintLayout;
        this.f4922b = materialButton;
        this.f4923c = materialButton2;
        this.f4924d = editText;
        this.f4925e = textView;
    }

    public final void d(n nVar) {
        r0 r0Var = (r0) nVar;
        q0 q0Var = (q0) this.f4921a;
        q0Var.getClass();
        q.f("EMAIL");
        boolean contains = ((List) q0Var.f4828d.f2324b).contains("EMAIL");
        List list = null;
        Object obj = this.f4922b;
        if (contains) {
            ((h0) obj).f4593b = null;
        } else {
            String str = q0Var.f4826b;
            if (str != null) {
                ((h0) obj).f4593b = str;
            }
        }
        q0Var.getClass();
        q.f("DISPLAY_NAME");
        if (((List) q0Var.f4828d.f2324b).contains("DISPLAY_NAME")) {
            ((h0) obj).f4595d = null;
        } else {
            q0Var.getClass();
        }
        q0Var.getClass();
        q.f("PHOTO_URL");
        if (((List) q0Var.f4828d.f2324b).contains("PHOTO_URL")) {
            ((h0) obj).f4596e = null;
        } else {
            q0Var.getClass();
        }
        if (!TextUtils.isEmpty(q0Var.f4827c)) {
            h0 h0Var = (h0) obj;
            byte[] bytes = "redacted".getBytes();
            String encodeToString = bytes == null ? null : Base64.encodeToString(bytes, 0);
            h0Var.getClass();
            q.f(encodeToString);
        }
        r1 r1Var = r0Var.f4849a;
        if (r1Var != null) {
            list = r1Var.f15222a;
        }
        if (list == null) {
            list = new ArrayList();
        }
        h0 h0Var2 = (h0) obj;
        h0Var2.getClass();
        r1 r1Var2 = new r1(2);
        h0Var2.f4597f = r1Var2;
        r1Var2.f15222a.addAll(list);
        j3 j3Var = (j3) this.f4923c;
        m0 m0Var = (m0) this.f4924d;
        q.i(m0Var);
        String str2 = r0Var.f4850b;
        String str3 = r0Var.f4851c;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            m0Var = new m0(str3, str2, Long.valueOf(r0Var.f4852d), m0Var.f4726d);
        }
        j3Var.getClass();
        try {
            ((b) j3Var.f1338a).d(m0Var, h0Var2);
        } catch (RemoteException e10) {
            ((a) j3Var.f1339b).b("RemoteException when sending get token and account info user response", e10, new Object[0]);
        }
    }

    public final void zza(String str) {
        ((w) this.f4925e).zza(str);
    }
}
