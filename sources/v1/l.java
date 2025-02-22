package v1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import u1.d;

public final class l extends n {
    public static Font f(FontFamily fontFamily, int i8) {
        FontStyle fontStyle = new FontStyle((i8 & 1) != 0 ? 700 : 400, (i8 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int g10 = g(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int g11 = g(fontStyle, font2.getStyle());
            if (g11 < g10) {
                font = font2;
                g10 = g11;
            }
        }
        return font;
    }

    public static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final Typeface a(Context context, d.c cVar, Resources resources, int i8) {
        try {
            FontFamily.Builder builder = null;
            for (d.C0288d dVar : cVar.f15658a) {
                try {
                    Font build = new Font.Builder(resources, dVar.f15664f).setWeight(dVar.f15660b).setSlant(dVar.f15661c ? 1 : 0).setTtcIndex(dVar.f15663e).setFontVariationSettings(dVar.f15662d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, i8).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface b(Context context, z1.l[] lVarArr, int i8) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (z1.l lVar : lVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(lVar.f17652a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(lVar.f17654c).setSlant(lVar.f17655d ? 1 : 0).setTtcIndex(lVar.f17653b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, i8).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface c(Context context, Resources resources, int i8, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i8).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final z1.l e(int i8, z1.l[] lVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
