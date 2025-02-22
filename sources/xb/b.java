package xb;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import wb.a;

public final class b extends a {

    /* renamed from: k  reason: collision with root package name */
    public static final float[] f17024k;

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f17025l = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public static final int m;

    /* renamed from: c  reason: collision with root package name */
    public final FloatBuffer f17026c;

    /* renamed from: d  reason: collision with root package name */
    public final FloatBuffer f17027d;

    /* renamed from: e  reason: collision with root package name */
    public int f17028e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17029f = 36197;

    /* renamed from: g  reason: collision with root package name */
    public final int f17030g;

    /* renamed from: h  reason: collision with root package name */
    public final int f17031h;

    /* renamed from: i  reason: collision with root package name */
    public final int f17032i;

    /* renamed from: j  reason: collision with root package name */
    public final int f17033j;

    static {
        String str = a.f16661b;
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f17024k = fArr;
        m = fArr.length / 2;
    }

    public b() {
        int c3;
        float[] fArr = f17024k;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        int i8 = 0;
        asFloatBuffer.position(0);
        this.f17026c = asFloatBuffer;
        float[] fArr2 = f17025l;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        this.f17027d = asFloatBuffer2;
        int c10 = a.c(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n");
        if (!(c10 == 0 || (c3 = a.c(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) == 0)) {
            int glCreateProgram = GLES20.glCreateProgram();
            a.a("glCreateProgram");
            a aVar = a.f17023b;
            if (glCreateProgram == 0) {
                aVar.a(3, "Could not create program");
            }
            GLES20.glAttachShader(glCreateProgram, c10);
            a.a("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, c3);
            a.a("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                aVar.a(3, "Could not link program:", GLES20.glGetProgramInfoLog(glCreateProgram));
                GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i8 = glCreateProgram;
            }
        }
        this.f17028e = i8;
        int glGetAttribLocation = GLES20.glGetAttribLocation(i8, "aPosition");
        this.f17032i = glGetAttribLocation;
        a.b(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f17028e, "aTextureCoord");
        this.f17033j = glGetAttribLocation2;
        a.b(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f17028e, "uMVPMatrix");
        this.f17030g = glGetUniformLocation;
        a.b(glGetUniformLocation, "uMVPMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f17028e, "uTexMatrix");
        this.f17031h = glGetUniformLocation2;
        a.b(glGetUniformLocation2, "uTexMatrix");
    }
}
