package i0;

import android.graphics.BlendMode;
import android.graphics.Paint;
import sf.j;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f9395a = new v();

    public final void a(Paint paint, int i8) {
        BlendMode blendMode;
        j.f(paint, "paint");
        boolean z10 = false;
        if (i8 == 0) {
            blendMode = BlendMode.CLEAR;
        } else {
            if (i8 == 1) {
                blendMode = BlendMode.SRC;
            } else {
                if (i8 == 2) {
                    blendMode = BlendMode.DST;
                } else {
                    if (i8 == 3) {
                        blendMode = BlendMode.SRC_OVER;
                    } else {
                        if (i8 == 4) {
                            blendMode = BlendMode.DST_OVER;
                        } else {
                            if (i8 == 5) {
                                blendMode = BlendMode.SRC_IN;
                            } else {
                                if (i8 == 6) {
                                    blendMode = BlendMode.DST_IN;
                                } else {
                                    if (i8 == 7) {
                                        blendMode = BlendMode.SRC_OUT;
                                    } else {
                                        if (i8 == 8) {
                                            blendMode = BlendMode.DST_OUT;
                                        } else {
                                            if (i8 == 9) {
                                                blendMode = BlendMode.SRC_ATOP;
                                            } else {
                                                if (i8 == 10) {
                                                    blendMode = BlendMode.DST_ATOP;
                                                } else {
                                                    if (i8 == 11) {
                                                        blendMode = BlendMode.XOR;
                                                    } else {
                                                        if (i8 == 12) {
                                                            blendMode = BlendMode.PLUS;
                                                        } else {
                                                            if (i8 == 13) {
                                                                blendMode = BlendMode.MODULATE;
                                                            } else {
                                                                if (i8 == 14) {
                                                                    blendMode = BlendMode.SCREEN;
                                                                } else {
                                                                    if (i8 == 15) {
                                                                        blendMode = BlendMode.OVERLAY;
                                                                    } else {
                                                                        if (i8 == 16) {
                                                                            blendMode = BlendMode.DARKEN;
                                                                        } else {
                                                                            if (i8 == 17) {
                                                                                blendMode = BlendMode.LIGHTEN;
                                                                            } else {
                                                                                if (i8 == 18) {
                                                                                    blendMode = BlendMode.COLOR_DODGE;
                                                                                } else {
                                                                                    if (i8 == 19) {
                                                                                        blendMode = BlendMode.COLOR_BURN;
                                                                                    } else {
                                                                                        if (i8 == 20) {
                                                                                            blendMode = BlendMode.HARD_LIGHT;
                                                                                        } else {
                                                                                            if (i8 == 21) {
                                                                                                blendMode = BlendMode.SOFT_LIGHT;
                                                                                            } else {
                                                                                                if (i8 == 22) {
                                                                                                    blendMode = BlendMode.DIFFERENCE;
                                                                                                } else {
                                                                                                    if (i8 == 23) {
                                                                                                        blendMode = BlendMode.EXCLUSION;
                                                                                                    } else {
                                                                                                        if (i8 == 24) {
                                                                                                            blendMode = BlendMode.MULTIPLY;
                                                                                                        } else {
                                                                                                            if (i8 == 25) {
                                                                                                                blendMode = BlendMode.HUE;
                                                                                                            } else {
                                                                                                                if (i8 == 26) {
                                                                                                                    blendMode = BlendMode.SATURATION;
                                                                                                                } else {
                                                                                                                    if (i8 == 27) {
                                                                                                                        blendMode = BlendMode.COLOR;
                                                                                                                    } else {
                                                                                                                        if (i8 == 28) {
                                                                                                                            z10 = true;
                                                                                                                        }
                                                                                                                        blendMode = z10 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        paint.setBlendMode(blendMode);
    }
}
