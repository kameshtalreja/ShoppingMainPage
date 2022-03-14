package com.kamesh.usellup.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.kamesh.usellup.R;
import com.kamesh.usellup.adapters.CategoryAdapter;
import com.kamesh.usellup.adapters.ImageAdapter;
import com.kamesh.usellup.adapters.ProductAdapter;
import com.kamesh.usellup.adapters.ProfileAdapter;
import com.kamesh.usellup.adapters.SubCategoryAdapter;
import com.kamesh.usellup.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    CategoryAdapter categoryAdapter;

    ProductAdapter productAdapter;

    ProfileAdapter profileAdapter;

    SubCategoryAdapter subCategoryAdapter;

    LinearLayoutManager linearLayoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,true);

        categoryAdapter = new CategoryAdapter(getContext());
        binding.recyclerViewCategory.setLayoutManager(linearLayoutManager);
        binding.recyclerViewCategory.setAdapter(categoryAdapter);

        productAdapter = new ProductAdapter(getContext());
        binding.gridViewProducts.setAdapter(productAdapter);

        profileAdapter = new ProfileAdapter(getContext());
        binding.recyclerViewProfiles.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,true));
        binding.recyclerViewProfiles.setAdapter(profileAdapter);

        subCategoryAdapter = new SubCategoryAdapter(getContext());
        binding.recyclerViewSubCategory.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,true));
        binding.recyclerViewSubCategory.setAdapter(subCategoryAdapter);

        ImageAdapter adapter = new ImageAdapter(getContext());
        binding.viewPager.setAdapter(adapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}