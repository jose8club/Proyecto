package jose.tab.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import jose.tab.R;
import jose.tab.activity.TabsActivity;

public class LocalFragment extends Fragment{

    /**
     * Boton de resumen
     */
    Button local_btn_summary;

    /**
     * Boton de imagen
     */
    Button local_btn_image;

    public LocalFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_local, container, false);
        //return inflater.inflate(R.layout.fragment_local, container, false);
        local_btn_summary = (Button) view.findViewById(R.id.local_btn_summary);
        local_btn_summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getBackground().setAlpha(128);
                Runnable clickButton = new Runnable() {
                    @Override
                    public void run() {
                        local_btn_summary.getBackground().setAlpha(255);
                        modal("Resumen");
                    }
                };
                view.postDelayed(clickButton, 500);
            }
        });
        local_btn_image = (Button) view.findViewById(R.id.local_btn_image);
        local_btn_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getBackground().setAlpha(128);
                Runnable clickButton = new Runnable() {
                    @Override
                    public void run() {
                        local_btn_image.getBackground().setAlpha(255);
                        modal("Imagen");
                    }
                };
                view.postDelayed(clickButton, 500);
            }
        });
        return view;
    }

    private void modal(String resumen) {
        Toast.makeText(getActivity(), resumen, Toast.LENGTH_LONG).show();
    }
}
