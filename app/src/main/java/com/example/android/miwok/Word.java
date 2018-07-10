package com.example.android.miwok;

import android.media.MediaPlayer;
import android.widget.ImageView;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = -1 ;
    private int mAudioResourceId ;



    public Word(String defaultTransaltion, String miwokTranslation , int audioResourceId){

    mDefaultTranslation = defaultTransaltion;
    mMiwokTranslation = miwokTranslation;
    mAudioResourceId = audioResourceId;



    }

    public Word (String defaultTransaltion , String miwokTranslation , int imageResourceId , int audioResourceId){

        mDefaultTranslation = defaultTransaltion;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public int getAudioResourceId() {return mAudioResourceId; }



    public boolean hasImage(){
        return mImageResourceId != -1 ;
    }


}


