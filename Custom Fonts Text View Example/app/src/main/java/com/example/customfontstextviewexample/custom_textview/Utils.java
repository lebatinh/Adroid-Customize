package com.example.customfontstextviewexample.custom_textview;
import android.content.Context;
import android.graphics.Typeface;
public class Utils {
    private static Typeface chunkFivePrintTypeface;
    private static Typeface lobsterTypeface;
    private static Typeface montserratAlternatesTypeface;
    private static Typeface openSansExtraBoldItalicTypeface;
    private static Typeface pacificoTypeface;
    private static Typeface playfairDisplayTypeface;
    private static Typeface quicksandTypeface;
    private static Typeface ralewayTypeface;

    public static Typeface getChunkFivePrintTypeface(Context context) {
        if(chunkFivePrintTypeface == null) {
            chunkFivePrintTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Chunk Five Print.otf");
        }
        return chunkFivePrintTypeface;
    }
    public static Typeface getLobsterTypeface(Context context) {
        if(lobsterTypeface == null) {
            lobsterTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Lobster_1.3.otf");
        }
        return lobsterTypeface;
    }
    public static Typeface getMontserratAlternatesTypeface(Context context) {
        if(montserratAlternatesTypeface == null) {
            montserratAlternatesTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/MontserratAlternates-BoldItalic.otf");
        }
        return montserratAlternatesTypeface;
    }
    public static Typeface getOpenSansExtraBoldItalicTypeface(Context context) {
        if(openSansExtraBoldItalicTypeface == null) {
            openSansExtraBoldItalicTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-ExtraBoldItalic.ttf");
        }
        return openSansExtraBoldItalicTypeface;
    }

    public static Typeface getPacificoTypeface(Context context) {
        if(pacificoTypeface == null) {
            pacificoTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Pacifico.ttf");
        }
        return pacificoTypeface;
    }

    public static Typeface getPlayfairDisplayTypeface(Context context) {
        if(playfairDisplayTypeface == null) {
            playfairDisplayTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/PlayfairDisplay-BlackItalic.otf");
        }
        return playfairDisplayTypeface;
    }

    public static Typeface getQuicksandTypeface(Context context) {
        if(quicksandTypeface == null) {
            quicksandTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Quicksand-BoldItalic.otf");
        }
        return quicksandTypeface;
    }

    public static Typeface getRalewayTypeface(Context context) {
        if(ralewayTypeface == null) {
            ralewayTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Raleway-BoldItalic.ttf");
        }
        return ralewayTypeface;
    }
}
