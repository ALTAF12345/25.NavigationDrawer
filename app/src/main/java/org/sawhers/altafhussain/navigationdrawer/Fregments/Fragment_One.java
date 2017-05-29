package org.sawhers.altafhussain.navigationdrawer.Fregments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.sawhers.altafhussain.navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_One extends Fragment {

    ImageView iv;
    TextView tv;

    public Fragment_One() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment__one, container, false);
        final View view =inflater.inflate(R.layout.fragment_fragment__one, container, false);
        iv= (ImageView) view.findViewById(R.id.iv);
        tv= (TextView) view.findViewById(R.id.tv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), "Iv Clicked", Toast.LENGTH_SHORT).show();
                tv.setText("image Clicked");
            }
        });
        return view;
    }

}
