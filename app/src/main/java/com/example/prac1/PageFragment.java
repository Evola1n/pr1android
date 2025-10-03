package com.example.prac1;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {
    private static final String ARG_TEXT = "arg_text";
    private static final String ARG_BG   = "arg_bg";

    public static PageFragment newInstance(String text, int bgColor) {
        PageFragment f = new PageFragment();
        Bundle b = new Bundle();
        b.putString(ARG_TEXT, text);
        b.putInt(ARG_BG, bgColor);
        f.setArguments(b);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_page, container, false);
        TextView tv = v.findViewById(R.id.page_text);

        Bundle arguments = getArguments();
        if (arguments != null) {
            String text = arguments.getString(ARG_TEXT, ""); // Use default value if key not found
            int bgColor = arguments.getInt(ARG_BG, Color.WHITE); // Use default value
            tv.setText(text);
            v.setBackgroundColor(bgColor);
        } else {
            // Handle case where no arguments were passed, which is unexpected
            // with the newInstance pattern.
            tv.setText("Error: No data");
            v.setBackgroundColor(Color.RED);
        }

        return v;
    }
}
