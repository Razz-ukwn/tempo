package xb;

import android.opengl.GLES20;
import android.opengl.Matrix;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f17022a;

    /* renamed from: b  reason: collision with root package name */
    public static final wb.a f17023b = new wb.a(a.class.getSimpleName());

    static {
        float[] fArr = new float[16];
        f17022a = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            f17023b.a(3, "Error during", str, "glError 0x", Integer.toHexString(glGetError));
            throw new RuntimeException(wb.a.f16661b);
        }
    }

    public static void b(int i8, String str) {
        if (i8 < 0) {
            f17023b.a(3, "Unable to locate", str, "in program");
            throw new RuntimeException(wb.a.f16661b);
        }
    }

    public static int c(int i8, String str) {
        int glCreateShader = GLES20.glCreateShader(i8);
        a("glCreateShader type=" + i8);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        f17023b.a(3, "Could not compile shader", Integer.valueOf(i8), ":", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
