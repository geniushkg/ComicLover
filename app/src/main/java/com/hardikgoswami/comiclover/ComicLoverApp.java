package com.hardikgoswami.comiclover;

import android.app.Application;

import com.hardikgoswami.comiclover.utils.net.MarvelService;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by geniushkg on 7/31/2016.
 */
public class ComicLoverApp extends Application {
    public static final String BASE_URL = "http://gateway.marvel.com:80/v1/public/";
    public static final String MARVEL_PRIVATE = BuildConfig.MARVEL_PRIVATE;
    public static final String MARVEL_PUBLIC = BuildConfig.MARVEL_PUBLIC;
    private static MarvelService marvelService;
    public static final long TS = System.currentTimeMillis();

    @Override
    public void onCreate() {
        super.onCreate();

    }

    private static String getHash() {
        try {

            String s = "" + TS + MARVEL_PRIVATE + MARVEL_PUBLIC;
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++)
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    private static MarvelService getMarvelService() {
        if (marvelService == null) {
            throw new NullPointerException("service null");
        }
        return marvelService;
    }
}
