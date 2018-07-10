package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.provider.UserDictionary;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId ;


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words , int colorResourceId) {

        super(context, 0, words);
        mColorResourceId = colorResourceId;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_word);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);

        miwokTextView.setText(currentWord.getMiwokTranslation());


        ImageView image = (ImageView) listItemView.findViewById(R.id.image);


        if (currentWord.hasImage()) {

            image.setImageResource(currentWord.getImageResourceId());

            image.setVisibility(View.VISIBLE);
        } else {

            image.setVisibility(View.GONE);

        }



        View backGroundColor = listItemView.findViewById(R.id.back_ground);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        backGroundColor.setBackgroundColor(color);



        return listItemView;
    }
}
