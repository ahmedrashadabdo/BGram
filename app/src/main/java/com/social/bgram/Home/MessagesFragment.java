package com.social.bgram.Home;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.social.bgram.R;

public class MessagesFragment extends Fragment {
    private static final String TAG = "MessagesFragment";

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle
        savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_messages, container, false);

            return view;
        }

        /*
     ***********************************************************************************************
     */

}
