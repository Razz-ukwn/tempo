package ba;

import ba.b;
import ba.h;
import ba.m;
import com.google.auto.value.AutoValue;
import java.nio.charset.Charset;

@AutoValue
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f3440a = Charset.forName("UTF-8");

    @AutoValue
    public static abstract class a {

        @AutoValue
        /* renamed from: ba.b0$a$a  reason: collision with other inner class name */
        public static abstract class C0041a {
            public abstract String a();

            public abstract String b();

            public abstract String c();
        }

        @AutoValue.Builder
        public static abstract class b {
        }

        public abstract c0<C0041a> a();

        public abstract int b();

        public abstract int c();

        public abstract String d();

        public abstract long e();

        public abstract int f();

        public abstract long g();

        public abstract long h();

        public abstract String i();
    }

    @AutoValue.Builder
    public static abstract class b {
    }

    @AutoValue
    public static abstract class c {
        public abstract String a();

        public abstract String b();
    }

    @AutoValue
    public static abstract class d {

        @AutoValue
        public static abstract class a {
            public abstract byte[] a();

            public abstract String b();
        }

        public abstract c0<a> a();

        public abstract String b();
    }

    @AutoValue
    public static abstract class e {

        @AutoValue
        public static abstract class a {

            @AutoValue
            /* renamed from: ba.b0$e$a$a  reason: collision with other inner class name */
            public static abstract class C0042a {
                public abstract void a();
            }

            public abstract String a();

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract C0042a f();

            public abstract String g();
        }

        @AutoValue.Builder
        public static abstract class b {
        }

        @AutoValue
        public static abstract class c {

            @AutoValue.Builder
            public static abstract class a {
            }

            public abstract int a();

            public abstract int b();

            public abstract long c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract long g();

            public abstract int h();

            public abstract boolean i();
        }

        @AutoValue
        public static abstract class d {

            @AutoValue
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: ba.b0$e$d$a$a  reason: collision with other inner class name */
                public static abstract class C0043a {
                }

                @AutoValue
                public static abstract class b {

                    @AutoValue
                    /* renamed from: ba.b0$e$d$a$b$a  reason: collision with other inner class name */
                    public static abstract class C0044a {

                        @AutoValue.Builder
                        /* renamed from: ba.b0$e$d$a$b$a$a  reason: collision with other inner class name */
                        public static abstract class C0045a {
                        }

                        public abstract long a();

                        public abstract String b();

                        public abstract long c();

                        public abstract String d();
                    }

                    @AutoValue
                    /* renamed from: ba.b0$e$d$a$b$b  reason: collision with other inner class name */
                    public static abstract class C0046b {
                        public abstract C0046b a();

                        public abstract c0<C0047d.C0048a> b();

                        public abstract int c();

                        public abstract String d();

                        public abstract String e();
                    }

                    @AutoValue
                    public static abstract class c {
                        public abstract long a();

                        public abstract String b();

                        public abstract String c();
                    }

                    @AutoValue
                    /* renamed from: ba.b0$e$d$a$b$d  reason: collision with other inner class name */
                    public static abstract class C0047d {

                        @AutoValue
                        /* renamed from: ba.b0$e$d$a$b$d$a  reason: collision with other inner class name */
                        public static abstract class C0048a {

                            @AutoValue.Builder
                            /* renamed from: ba.b0$e$d$a$b$d$a$a  reason: collision with other inner class name */
                            public static abstract class C0049a {
                            }

                            public abstract String a();

                            public abstract int b();

                            public abstract long c();

                            public abstract long d();

                            public abstract String e();
                        }

                        public abstract c0<C0048a> a();

                        public abstract int b();

                        public abstract String c();
                    }

                    public abstract a a();

                    public abstract c0<C0044a> b();

                    public abstract C0046b c();

                    public abstract c d();

                    public abstract c0<C0047d> e();
                }

                public abstract Boolean a();

                public abstract c0<c> b();

                public abstract b c();

                public abstract c0<c> d();

                public abstract int e();

                public abstract m.a f();
            }

            @AutoValue.Builder
            public static abstract class b {
            }

            @AutoValue
            public static abstract class c {

                @AutoValue.Builder
                public static abstract class a {
                }

                public abstract Double a();

                public abstract int b();

                public abstract long c();

                public abstract int d();

                public abstract long e();

                public abstract boolean f();
            }

            @AutoValue
            /* renamed from: ba.b0$e$d$d  reason: collision with other inner class name */
            public static abstract class C0050d {
                public abstract String a();
            }

            public abstract a a();

            public abstract c b();

            public abstract C0050d c();

            public abstract long d();

            public abstract String e();
        }

        @AutoValue
        /* renamed from: ba.b0$e$e  reason: collision with other inner class name */
        public static abstract class C0051e {

            @AutoValue.Builder
            /* renamed from: ba.b0$e$e$a */
            public static abstract class a {
            }

            public abstract String a();

            public abstract int b();

            public abstract String c();

            public abstract boolean d();
        }

        @AutoValue
        public static abstract class f {
            public abstract String a();
        }

        public abstract a a();

        public abstract c b();

        public abstract Long c();

        public abstract c0<d> d();

        public abstract String e();

        public abstract int f();

        public abstract String g();

        public abstract C0051e h();

        public abstract long i();

        public abstract f j();

        public abstract boolean k();

        public abstract h.a l();
    }

    public abstract a a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract d f();

    public abstract int g();

    public abstract String h();

    public abstract e i();

    public final b j(long j10, String str, boolean z10) {
        b bVar = (b) this;
        b.a aVar = new b.a(bVar);
        e eVar = bVar.f3428h;
        if (eVar != null) {
            h.a l10 = eVar.l();
            l10.f3483d = Long.valueOf(j10);
            l10.f3484e = Boolean.valueOf(z10);
            if (str != null) {
                l10.f3486g = new w(str);
            }
            aVar.f3437g = l10.a();
        }
        return aVar.a();
    }
}
