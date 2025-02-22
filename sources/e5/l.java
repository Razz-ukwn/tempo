package e5;

import ag.i0;
import ag.v1;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.j0;
import androidx.fragment.app.p;
import androidx.fragment.app.x;
import com.bumptech.glide.i;
import com.bumptech.glide.m;
import e5.k;
import java.util.HashMap;
import q2.d;
import y4.q;

public final class l implements Handler.Callback {

    /* renamed from: g  reason: collision with root package name */
    public static final a f7816g = new a();

    /* renamed from: a  reason: collision with root package name */
    public volatile m f7817a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7818b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7819c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f7820d;

    /* renamed from: e  reason: collision with root package name */
    public final b f7821e;

    /* renamed from: f  reason: collision with root package name */
    public final g f7822f;

    public class a implements b {
    }

    public interface b {
    }

    public l(b bVar, i iVar) {
        f fVar;
        new o.a();
        new o.a();
        new Bundle();
        this.f7821e = bVar == null ? f7816g : bVar;
        this.f7820d = new Handler(Looper.getMainLooper(), this);
        if (!q.f17216h || !q.f17215g) {
            new v1
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: CONSTRUCTOR  (r2v5 ? I:ag.v1) =  call: ag.v1.<init>():void type: CONSTRUCTOR in method: e5.l.<init>(e5.l$b, com.bumptech.glide.i):void, dex: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v5 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f7818b = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.f7819c = r0
                o.a r0 = new o.a
                r0.<init>()
                o.a r0 = new o.a
                r0.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                if (r2 == 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                e5.l$a r2 = f7816g
            L_0x0025:
                r1.f7821e = r2
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r2.<init>(r0, r1)
                r1.f7820d = r2
                boolean r2 = y4.q.f17216h
                if (r2 == 0) goto L_0x0051
                boolean r2 = y4.q.f17215g
                if (r2 != 0) goto L_0x003b
                goto L_0x0051
            L_0x003b:
                java.util.Map<java.lang.Class<?>, java.lang.Object> r2 = r3.f4070a
                java.lang.Class<com.bumptech.glide.g> r3 = com.bumptech.glide.g.class
                boolean r2 = r2.containsKey(r3)
                if (r2 == 0) goto L_0x004b
                e5.f r2 = new e5.f
                r2.<init>()
                goto L_0x0056
            L_0x004b:
                cb.c r2 = new cb.c
                r2.<init>()
                goto L_0x0056
            L_0x0051:
                ag.v1 r2 = new ag.v1
                r2.<init>()
            L_0x0056:
                r1.f7822f = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e5.l.<init>(e5.l$b, com.bumptech.glide.i):void");
        }

        public static Activity a(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                return a(((ContextWrapper) context).getBaseContext());
            }
            return null;
        }

        public final m b(Context context) {
            if (context != null) {
                char[] cArr = l5.l.f11007a;
                boolean z10 = false;
                if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
                    if (context instanceof x) {
                        return c((x) context);
                    }
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (!(Looper.myLooper() == Looper.getMainLooper())) {
                            return b(activity.getApplicationContext());
                        }
                        if (activity instanceof x) {
                            return c((x) activity);
                        }
                        if (!activity.isDestroyed()) {
                            this.f7822f.d();
                            FragmentManager fragmentManager = activity.getFragmentManager();
                            Activity a10 = a(activity);
                            if (a10 == null || !a10.isFinishing()) {
                                z10 = true;
                            }
                            k d10 = d(fragmentManager);
                            m mVar = d10.f7813d;
                            if (mVar != null) {
                                return mVar;
                            }
                            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(activity);
                            k.a aVar = d10.f7811b;
                            ((a) this.f7821e).getClass();
                            m mVar2 = new m(b10, d10.f7810a, aVar, activity);
                            if (z10) {
                                mVar2.a();
                            }
                            d10.f7813d = mVar2;
                            return mVar2;
                        }
                        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                    } else if (context instanceof ContextWrapper) {
                        ContextWrapper contextWrapper = (ContextWrapper) context;
                        if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                            return b(contextWrapper.getBaseContext());
                        }
                    }
                }
                if (this.f7817a == null) {
                    synchronized (this) {
                        if (this.f7817a == null) {
                            com.bumptech.glide.b b11 = com.bumptech.glide.b.b(context.getApplicationContext());
                            b bVar = this.f7821e;
                            i0 i0Var = new i0();
                            d dVar = new d(1);
                            Context applicationContext = context.getApplicationContext();
                            ((a) bVar).getClass();
                            this.f7817a = new m(b11, i0Var, dVar, applicationContext);
                        }
                    }
                }
                return this.f7817a;
            }
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }

        public final m c(x xVar) {
            char[] cArr = l5.l.f11007a;
            boolean z10 = false;
            if (!(Looper.myLooper() == Looper.getMainLooper())) {
                return b(xVar.getApplicationContext());
            }
            if (!xVar.isDestroyed()) {
                this.f7822f.d();
                j0 I = xVar.I();
                Activity a10 = a(xVar);
                if (a10 == null || !a10.isFinishing()) {
                    z10 = true;
                }
                return f(xVar, I, (p) null, z10);
            }
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }

        public final k d(FragmentManager fragmentManager) {
            HashMap hashMap = this.f7818b;
            k kVar = (k) hashMap.get(fragmentManager);
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (kVar2 == null) {
                kVar2 = new k();
                kVar2.B = null;
                hashMap.put(fragmentManager, kVar2);
                fragmentManager.beginTransaction().add(kVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f7820d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return kVar2;
        }

        public final q e(androidx.fragment.app.i0 i0Var, p pVar) {
            HashMap hashMap = this.f7819c;
            q qVar = (q) hashMap.get(i0Var);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = (q) i0Var.D("com.bumptech.glide.manager");
            if (qVar2 == null) {
                qVar2 = new q();
                qVar2.A0 = pVar;
                if (!(pVar == null || pVar.q() == null)) {
                    p pVar2 = pVar;
                    while (true) {
                        p pVar3 = pVar2.S;
                        if (pVar3 == null) {
                            break;
                        }
                        pVar2 = pVar3;
                    }
                    androidx.fragment.app.i0 i0Var2 = pVar2.P;
                    if (i0Var2 != null) {
                        qVar2.n0(pVar.q(), i0Var2);
                    }
                }
                hashMap.put(i0Var, qVar2);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(i0Var);
                aVar.d(0, qVar2, "com.bumptech.glide.manager", 1);
                aVar.h();
                this.f7820d.obtainMessage(2, i0Var).sendToTarget();
            }
            return qVar2;
        }

        public final m f(Context context, androidx.fragment.app.i0 i0Var, p pVar, boolean z10) {
            q e10 = e(i0Var, pVar);
            m mVar = e10.f7843z0;
            if (mVar != null) {
                return mVar;
            }
            com.bumptech.glide.b b10 = com.bumptech.glide.b.b(context);
            ((a) this.f7821e).getClass();
            m mVar2 = new m(b10, e10.f7839v0, e10.f7840w0, context);
            if (z10) {
                mVar2.a();
            }
            e10.f7843z0 = mVar2;
            return mVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.fragment.app.i0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: android.app.FragmentManager} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.app.FragmentManager} */
        /* JADX WARNING: type inference failed for: r16v1, types: [androidx.fragment.app.p] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0144  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean handleMessage(android.os.Message r19) {
            /*
                r18 = this;
                r0 = r18
                r1 = r19
                int r2 = r1.arg1
                r3 = 1
                r4 = 0
                if (r2 != r3) goto L_0x000c
                r2 = r3
                goto L_0x000d
            L_0x000c:
                r2 = r4
            L_0x000d:
                int r5 = r1.what
                android.os.Handler r6 = r0.f7820d
                java.lang.String r10 = "We failed to add our Fragment the first time around, trying again..."
                java.lang.String r11 = " New: "
                java.lang.String r12 = "We've added two fragments with requests! Old: "
                java.lang.String r13 = "com.bumptech.glide.manager"
                java.lang.String r14 = "RMRetriever"
                if (r5 == r3) goto L_0x00c4
                r15 = 2
                if (r5 == r15) goto L_0x0026
                r3 = r4
                r1 = 0
                r2 = 5
                r9 = 0
                goto L_0x0154
            L_0x0026:
                java.lang.Object r1 = r1.obj
                androidx.fragment.app.i0 r1 = (androidx.fragment.app.i0) r1
                java.util.HashMap r5 = r0.f7819c
                java.lang.Object r16 = r5.get(r1)
                r9 = r16
                e5.q r9 = (e5.q) r9
                androidx.fragment.app.p r16 = r1.D(r13)
                r8 = r16
                e5.q r8 = (e5.q) r8
                if (r8 != r9) goto L_0x0040
                goto L_0x00bb
            L_0x0040:
                if (r8 == 0) goto L_0x005f
                com.bumptech.glide.m r7 = r8.f7843z0
                if (r7 != 0) goto L_0x0047
                goto L_0x005f
            L_0x0047:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r12)
                r2.append(r8)
                r2.append(r11)
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x005f:
                if (r2 != 0) goto L_0x0099
                boolean r2 = r1.H
                if (r2 == 0) goto L_0x0066
                goto L_0x0099
            L_0x0066:
                androidx.fragment.app.a r2 = new androidx.fragment.app.a
                r2.<init>((androidx.fragment.app.i0) r1)
                r2.d(r4, r9, r13, r3)
                if (r8 == 0) goto L_0x0073
                r2.l(r8)
            L_0x0073:
                boolean r7 = r2.f2112g
                if (r7 != 0) goto L_0x0091
                r2.f2113h = r4
                androidx.fragment.app.i0 r7 = r2.f1897q
                r7.y(r2, r3)
                android.os.Message r2 = r6.obtainMessage(r15, r3, r4, r1)
                r2.sendToTarget()
                r2 = 3
                boolean r2 = android.util.Log.isLoggable(r14, r2)
                if (r2 == 0) goto L_0x008f
                android.util.Log.d(r14, r10)
            L_0x008f:
                r2 = r4
                goto L_0x00bc
            L_0x0091:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "This transaction is already being added to the back stack"
                r1.<init>(r2)
                throw r1
            L_0x0099:
                boolean r2 = r1.H
                if (r2 == 0) goto L_0x00aa
                r2 = 5
                boolean r6 = android.util.Log.isLoggable(r14, r2)
                if (r6 == 0) goto L_0x00b6
                java.lang.String r2 = "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled"
                android.util.Log.w(r14, r2)
                goto L_0x00b6
            L_0x00aa:
                r2 = 6
                boolean r2 = android.util.Log.isLoggable(r14, r2)
                if (r2 == 0) goto L_0x00b6
                java.lang.String r2 = "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup"
                android.util.Log.e(r14, r2)
            L_0x00b6:
                e5.a r2 = r9.f7839v0
                r2.c()
            L_0x00bb:
                r2 = r3
            L_0x00bc:
                if (r2 == 0) goto L_0x014c
                java.lang.Object r2 = r5.remove(r1)
                goto L_0x0148
            L_0x00c4:
                java.lang.Object r1 = r1.obj
                android.app.FragmentManager r1 = (android.app.FragmentManager) r1
                java.util.HashMap r5 = r0.f7818b
                java.lang.Object r7 = r5.get(r1)
                e5.k r7 = (e5.k) r7
                android.app.Fragment r8 = r1.findFragmentByTag(r13)
                e5.k r8 = (e5.k) r8
                if (r8 != r7) goto L_0x00d9
                goto L_0x0141
            L_0x00d9:
                if (r8 == 0) goto L_0x00f8
                com.bumptech.glide.m r9 = r8.f7813d
                if (r9 != 0) goto L_0x00e0
                goto L_0x00f8
            L_0x00e0:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r12)
                r2.append(r8)
                r2.append(r11)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00f8:
                if (r2 != 0) goto L_0x0124
                boolean r2 = r1.isDestroyed()
                if (r2 == 0) goto L_0x0101
                goto L_0x0124
            L_0x0101:
                android.app.FragmentTransaction r2 = r1.beginTransaction()
                android.app.FragmentTransaction r2 = r2.add(r7, r13)
                if (r8 == 0) goto L_0x010e
                r2.remove(r8)
            L_0x010e:
                r2.commitAllowingStateLoss()
                android.os.Message r2 = r6.obtainMessage(r3, r3, r4, r1)
                r2.sendToTarget()
                r2 = 3
                boolean r2 = android.util.Log.isLoggable(r14, r2)
                if (r2 == 0) goto L_0x0122
                android.util.Log.d(r14, r10)
            L_0x0122:
                r2 = r4
                goto L_0x0142
            L_0x0124:
                r2 = 5
                boolean r6 = android.util.Log.isLoggable(r14, r2)
                if (r6 == 0) goto L_0x013c
                boolean r2 = r1.isDestroyed()
                if (r2 == 0) goto L_0x0137
                java.lang.String r2 = "Parent was destroyed before our Fragment could be added"
                android.util.Log.w(r14, r2)
                goto L_0x013c
            L_0x0137:
                java.lang.String r2 = "Tried adding Fragment twice and failed twice, giving up!"
                android.util.Log.w(r14, r2)
            L_0x013c:
                e5.a r2 = r7.f7810a
                r2.c()
            L_0x0141:
                r2 = r3
            L_0x0142:
                if (r2 == 0) goto L_0x014c
                java.lang.Object r2 = r5.remove(r1)
            L_0x0148:
                r9 = r2
                r4 = r3
                r2 = 5
                goto L_0x0154
            L_0x014c:
                r1 = 0
                r2 = 5
                r9 = 0
                r17 = r4
                r4 = r3
                r3 = r17
            L_0x0154:
                boolean r2 = android.util.Log.isLoggable(r14, r2)
                if (r2 == 0) goto L_0x016f
                if (r3 == 0) goto L_0x016f
                if (r9 != 0) goto L_0x016f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Failed to remove expected request manager fragment, manager: "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                android.util.Log.w(r14, r1)
            L_0x016f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: e5.l.handleMessage(android.os.Message):boolean");
        }
    }
