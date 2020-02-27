/*
 * Creator  : Sakti Wicaksono
 * Class    : Heores Fragment
 * Date     : 27-02-2020
 */

package com.example.tpm_pertemuan4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroesFragment extends Fragment {

    private RecyclerView rvHero;

    public HeroesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_heroes, container, false);
        rvHero = view.findViewById(R.id.fragment_rv);
        rvHero.setHasFixedSize(true);
        rvHero.setLayoutManager(new LinearLayoutManager(view.getContext()));
        HeroesAdapter heroesAdapter = new HeroesAdapter(view.getContext());
        heroesAdapter.setHeroesList(HeroesData.getHeroList());
        rvHero.setAdapter(heroesAdapter);
        return view;
    }
}
