package m4;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import cb.b;
import ff.d;
import ff.m;
import g4.f;
import g4.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import t1.a;
import x3.h;

public final class j implements ComponentCallbacks2, f.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11208a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<h> f11209b;

    /* renamed from: c  reason: collision with root package name */
    public final f f11210c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f11211d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11212e;

    public j(h hVar, Context context, boolean z10) {
        g gVar;
        this.f11208a = context;
        this.f11209b = new WeakReference<>(hVar);
        if (z10) {
            hVar.getClass();
            Object obj = a.f15323a;
            ConnectivityManager connectivityManager = (ConnectivityManager) a.d.b(context, ConnectivityManager.class);
            if (connectivityManager != null) {
                if (a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        gVar = new g(connectivityManager, this);
                    } catch (Exception unused) {
                        new b
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0034: CONSTRUCTOR  (r3v6 ? I:cb.b) =  call: cb.b.<init>():void type: CONSTRUCTOR in method: m4.j.<init>(x3.h, android.content.Context, boolean):void, dex: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:363)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:322)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v6 ?
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	... 50 more
                            */
                        /*
                            this = this;
                            r1.<init>()
                            r1.f11208a = r3
                            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                            r0.<init>(r2)
                            r1.f11209b = r0
                            r0 = 0
                            if (r4 == 0) goto L_0x003e
                            r2.getClass()
                            java.lang.Object r2 = t1.a.f15323a
                            java.lang.Class<android.net.ConnectivityManager> r2 = android.net.ConnectivityManager.class
                            java.lang.Object r2 = t1.a.d.b(r3, r2)
                            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
                            if (r2 == 0) goto L_0x0038
                            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
                            int r3 = t1.a.a(r3, r4)
                            if (r3 != 0) goto L_0x0028
                            r3 = 1
                            goto L_0x0029
                        L_0x0028:
                            r3 = r0
                        L_0x0029:
                            if (r3 != 0) goto L_0x002c
                            goto L_0x0038
                        L_0x002c:
                            g4.g r3 = new g4.g     // Catch:{ Exception -> 0x0032 }
                            r3.<init>(r2, r1)     // Catch:{ Exception -> 0x0032 }
                            goto L_0x0043
                        L_0x0032:
                            cb.b r3 = new cb.b
                            r3.<init>()
                            goto L_0x0043
                        L_0x0038:
                            cb.b r3 = new cb.b
                            r3.<init>()
                            goto L_0x0043
                        L_0x003e:
                            cb.b r3 = new cb.b
                            r3.<init>()
                        L_0x0043:
                            r1.f11210c = r3
                            boolean r2 = r3.b()
                            r1.f11211d = r2
                            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                            r2.<init>(r0)
                            r1.f11212e = r2
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: m4.j.<init>(x3.h, android.content.Context, boolean):void");
                    }

                    public final void a(boolean z10) {
                        m mVar;
                        if (this.f11209b.get() != null) {
                            this.f11211d = z10;
                            mVar = m.f8717a;
                        } else {
                            mVar = null;
                        }
                        if (mVar == null) {
                            b();
                        }
                    }

                    public final void b() {
                        if (!this.f11212e.getAndSet(true)) {
                            this.f11208a.unregisterComponentCallbacks(this);
                            this.f11210c.shutdown();
                        }
                    }

                    public final void onConfigurationChanged(Configuration configuration) {
                        if (this.f11209b.get() == null) {
                            b();
                            m mVar = m.f8717a;
                        }
                    }

                    public final void onLowMemory() {
                        onTrimMemory(80);
                    }

                    public final void onTrimMemory(int i8) {
                        m mVar;
                        f4.b value;
                        h hVar = this.f11209b.get();
                        if (hVar != null) {
                            d<f4.b> dVar = hVar.f16934b;
                            if (!(dVar == null || (value = dVar.getValue()) == null)) {
                                value.a(i8);
                            }
                            mVar = m.f8717a;
                        } else {
                            mVar = null;
                        }
                        if (mVar == null) {
                            b();
                        }
                    }
                }
