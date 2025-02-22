package sd;

import ag.g0;
import cb.b;
import com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet;
import ff.m;
import jf.d;
import kotlinx.coroutines.flow.g;
import lf.e;
import lf.i;
import rf.p;

@e(c = "com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet$setObserver$1", f = "ChangePasswordBottomSheet.kt", l = {92}, m = "invokeSuspend")
public final class a extends i implements p<g0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ChangePasswordBottomSheet f14921b;

    /* renamed from: sd.a$a  reason: collision with other inner class name */
    public static final class C0277a implements g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ChangePasswordBottomSheet f14922a;

        public C0277a(ChangePasswordBottomSheet changePasswordBottomSheet) {
            this.f14922a = changePasswordBottomSheet;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x022b, code lost:
            if (sf.j.a(r3.u0().f7105j.getValue(), r3.u0().f7106k.getValue()) != false) goto L_0x022f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object m(java.lang.Object r9, jf.d r10) {
            /*
                r8 = this;
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                java.lang.String r10 = "binding.tvChangePasswordError"
                r0 = 2131165343(0x7f07009f, float:1.79449E38)
                r1 = 1
                r2 = 0
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet r3 = r8.f14922a
                if (r9 != 0) goto L_0x01a6
                int r9 = com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordBottomSheet.T0
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r9 = r3.u0()
                kotlinx.coroutines.flow.y0 r9 = r9.f7105j
                java.lang.Object r9 = r9.getValue()
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r4 = "((?=.*[a-zA-Z0-9])(?=.*[-@%\\[\\}+'!/#$^?:;,\\(\"\\)~`.*=&\\{>\\]<_]).{8,1000})"
                java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r4)
                java.lang.String r6 = "compile(PASSWORD_PATTERN)"
                sf.j.e(r5, r6)
                java.util.regex.Matcher r9 = r5.matcher(r9)
                java.lang.String r5 = "pattern.matcher(password)"
                sf.j.e(r9, r5)
                boolean r9 = r9.matches()
                r7 = 2131165345(0x7f0700a1, float:1.7944904E38)
                if (r9 != 0) goto L_0x0089
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r9 = r3.u0()
                kotlinx.coroutines.flow.y0 r9 = r9.f7105j
                java.lang.Object r9 = r9.getValue()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x0050
                r9 = r1
                goto L_0x0051
            L_0x0050:
                r9 = r2
            L_0x0051:
                if (r9 == 0) goto L_0x0089
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.W
                r9.setBackgroundResource(r7)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                android.widget.TextView r9 = r9.Z
                sf.j.e(r9, r10)
                r9.setVisibility(r2)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                r10 = 2131951995(0x7f13017b, float:1.954042E38)
                java.lang.String r10 = r3.x(r10)
                android.widget.TextView r9 = r9.Z
                r9.setText(r10)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.button.MaterialButton r9 = r9.T
                r9.setEnabled(r2)
                ff.m r9 = ff.m.f8717a
                goto L_0x0236
            L_0x0089:
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.W
                r9.setBackgroundResource(r0)
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r9 = r3.u0()
                kotlinx.coroutines.flow.y0 r9 = r9.f7106k
                java.lang.Object r9 = r9.getValue()
                java.lang.String r9 = (java.lang.String) r9
                java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
                sf.j.e(r4, r6)
                java.util.regex.Matcher r9 = r4.matcher(r9)
                sf.j.e(r9, r5)
                boolean r9 = r9.matches()
                if (r9 != 0) goto L_0x0100
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r9 = r3.u0()
                kotlinx.coroutines.flow.y0 r9 = r9.f7106k
                java.lang.Object r9 = r9.getValue()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x00c7
                r9 = r1
                goto L_0x00c8
            L_0x00c7:
                r9 = r2
            L_0x00c8:
                if (r9 == 0) goto L_0x0100
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.V
                r9.setBackgroundResource(r7)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                android.widget.TextView r9 = r9.Z
                sf.j.e(r9, r10)
                r9.setVisibility(r2)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                r10 = 2131951748(0x7f130084, float:1.953992E38)
                java.lang.String r10 = r3.x(r10)
                android.widget.TextView r9 = r9.Z
                r9.setText(r10)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.button.MaterialButton r9 = r9.T
                r9.setEnabled(r2)
                ff.m r9 = ff.m.f8717a
                goto L_0x0236
            L_0x0100:
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.V
                r9.setBackgroundResource(r0)
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r9 = r3.u0()
                kotlinx.coroutines.flow.y0 r9 = r9.f7106k
                java.lang.Object r9 = r9.getValue()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x011e
                r9 = r1
                goto L_0x011f
            L_0x011e:
                r9 = r2
            L_0x011f:
                if (r9 == 0) goto L_0x0192
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r9 = r3.u0()
                kotlinx.coroutines.flow.y0 r9 = r9.f7105j
                java.lang.Object r9 = r9.getValue()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 <= 0) goto L_0x0135
                r9 = r1
                goto L_0x0136
            L_0x0135:
                r9 = r2
            L_0x0136:
                if (r9 == 0) goto L_0x0192
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r9 = r3.u0()
                kotlinx.coroutines.flow.y0 r9 = r9.f7105j
                java.lang.Object r9 = r9.getValue()
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r4 = r3.u0()
                kotlinx.coroutines.flow.y0 r4 = r4.f7106k
                java.lang.Object r4 = r4.getValue()
                boolean r9 = sf.j.a(r9, r4)
                if (r9 != 0) goto L_0x0192
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.V
                r9.setBackgroundResource(r7)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.W
                r9.setBackgroundResource(r7)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                android.widget.TextView r9 = r9.Z
                sf.j.e(r9, r10)
                r9.setVisibility(r2)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                r10 = 2131952031(0x7f13019f, float:1.9540493E38)
                java.lang.String r10 = r3.x(r10)
                android.widget.TextView r9 = r9.Z
                r9.setText(r10)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.button.MaterialButton r9 = r9.T
                r9.setEnabled(r2)
                ff.m r9 = ff.m.f8717a
                goto L_0x0236
            L_0x0192:
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.V
                r9.setBackgroundResource(r0)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.W
                r9.setBackgroundResource(r0)
            L_0x01a6:
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.V
                r9.setBackgroundResource(r0)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.google.android.material.textfield.TextInputLayout r9 = r9.W
                r9.setBackgroundResource(r0)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                android.widget.TextView r9 = r9.Z
                sf.j.e(r9, r10)
                r10 = 8
                r9.setVisibility(r10)
                nc.e r9 = r3.Q0
                sf.j.c(r9)
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r10 = r3.u0()
                kotlinx.coroutines.flow.y0 r10 = r10.f7104i
                java.lang.Object r10 = r10.getValue()
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                int r10 = r10.length()
                if (r10 <= 0) goto L_0x01e2
                r10 = r1
                goto L_0x01e3
            L_0x01e2:
                r10 = r2
            L_0x01e3:
                if (r10 == 0) goto L_0x022e
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r10 = r3.u0()
                kotlinx.coroutines.flow.y0 r10 = r10.f7105j
                java.lang.Object r10 = r10.getValue()
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                int r10 = r10.length()
                if (r10 <= 0) goto L_0x01f9
                r10 = r1
                goto L_0x01fa
            L_0x01f9:
                r10 = r2
            L_0x01fa:
                if (r10 == 0) goto L_0x022e
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r10 = r3.u0()
                kotlinx.coroutines.flow.y0 r10 = r10.f7106k
                java.lang.Object r10 = r10.getValue()
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                int r10 = r10.length()
                if (r10 <= 0) goto L_0x0210
                r10 = r1
                goto L_0x0211
            L_0x0210:
                r10 = r2
            L_0x0211:
                if (r10 == 0) goto L_0x022e
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r10 = r3.u0()
                kotlinx.coroutines.flow.y0 r10 = r10.f7105j
                java.lang.Object r10 = r10.getValue()
                com.quickkonnect.silencio.ui.menu.profile.changepassword.ChangePasswordViewModel r0 = r3.u0()
                kotlinx.coroutines.flow.y0 r0 = r0.f7106k
                java.lang.Object r0 = r0.getValue()
                boolean r10 = sf.j.a(r10, r0)
                if (r10 == 0) goto L_0x022e
                goto L_0x022f
            L_0x022e:
                r1 = r2
            L_0x022f:
                com.google.android.material.button.MaterialButton r9 = r9.T
                r9.setEnabled(r1)
                ff.m r9 = ff.m.f8717a
            L_0x0236:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.a.C0277a.m(java.lang.Object, jf.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ChangePasswordBottomSheet changePasswordBottomSheet, d<? super a> dVar) {
        super(2, dVar);
        this.f14921b = changePasswordBottomSheet;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f14921b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((g0) obj, (d) obj2)).invokeSuspend(m.f8717a);
    }

    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f10464a;
        int i8 = this.f14920a;
        if (i8 == 0) {
            b.J(obj);
            int i10 = ChangePasswordBottomSheet.T0;
            ChangePasswordBottomSheet changePasswordBottomSheet = this.f14921b;
            kotlinx.coroutines.flow.g0 g0Var = changePasswordBottomSheet.u0().f7107l;
            C0277a aVar2 = new C0277a(changePasswordBottomSheet);
            this.f14920a = 1;
            if (g0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            b.J(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8717a;
    }
}
