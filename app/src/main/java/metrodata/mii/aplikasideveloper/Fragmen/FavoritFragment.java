package metrodata.mii.aplikasideveloper.Fragmen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import metrodata.mii.aplikasideveloper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritFragment extends Fragment {


    public FavoritFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorit, container, false);
    }

}
