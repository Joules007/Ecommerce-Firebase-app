package com.example.sweven;


import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    private RecyclerView testing;
   /* ///////////////////////// BANNER SLIDER  /////////////////////////////////////////

    private ViewPager bannerSliderViewPager;
    private List<SliderModel> sliderModelList;
    private int currentPage = 2;
    private Timer timer;
    final private long DELAY_TIME = 3000;
    final private long PERIOD_TIME = 3000;

    ////////////////////////////  ENDS    ////////////////////////////////////
*/
/*
    ////////////////////////////////STRIP AD  ////////////////////////////////////////////////

    private ImageView stripAdImage;
    private ConstraintLayout stripAdContainer;

    //////////////////////////////// STRIP AD ////////////////////////////////////////////////

  */
/*
//////////////////////////////// HORIZONTAL PRODUCT SCROLL LAYOUT ////////////////////////////////////////////////
    private TextView horizontalLayoutTitle;
    private Button horizontalViewAllBtn;
    private RecyclerView horizontalRecyclerView;

    //////////////////////////////// HORIZONTAL PRODUCT SCROLL LAYOUT ////////////////////////////////////////////////

*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        categoryRecyclerView = view.findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);

        final List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link", "Home"));
        categoryModelList.add(new CategoryModel("link", "Cooking Essentials"));
        categoryModelList.add(new CategoryModel("link", "Packaged Foods"));
        categoryModelList.add(new CategoryModel("link", "Household Essentials"));
        categoryModelList.add(new CategoryModel("link", "Beauty & Grooming"));
        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();


        /////////////////////////BANNER SLIDER///////////////////////

        List<SliderModel>sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.banner_six, "#FFFFFF"));
        sliderModelList.add(new SliderModel(R.drawable.banner_seven, "#000000"));

        sliderModelList.add(new SliderModel(R.drawable.banner, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.banner_one, "#CFAB7F"));
        sliderModelList.add(new SliderModel(R.drawable.banner_two, "#FFFFFF"));
        sliderModelList.add(new SliderModel(R.drawable.banner_three, "#E7E9E8"));
        sliderModelList.add(new SliderModel(R.drawable.banner_four, "#FFFFFF"));
        sliderModelList.add(new SliderModel(R.drawable.banner_five, "#E5D3DF"));
        sliderModelList.add(new SliderModel(R.drawable.banner_six, "#FFFFFF"));
        sliderModelList.add(new SliderModel(R.drawable.banner_seven, "#000000"));

        sliderModelList.add(new SliderModel(R.drawable.banner, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.banner_one, "#CFAB7F"));
        ///////////////////////////////////



        //////////////////////////////// HORIZONTAL PRODUCT SCROLL LAYOUT ////////////////////////////////////////////////
        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();

        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.flour, "Aashirwaad Aata", "Pure Sugar Wheat Control Flour", "Rs. 649/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.biscuits, "Cadbury Cookies", "Delicious Cadbury Cookies", "Rs. 99/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.chips, "Lays Chips", "Simply Salted Chips", "Rs. 29/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.cleaner, "Lizol Cleaner", "Lizol Cleaner with Jasmine", "Rs. 250/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.coffee, "Nescafe Coffee", "Try Classic Coffee", "Rs. 120/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.dal, "Robin Toor Dal", "Perfect Tool Dal", "Rs. 659/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.deo, "Police Deo", "Try our 3 Combo deo", "Rs. 498/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.perfume, "Denver Perfume", "Smell Good", "Rs. 125/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.mipmap.cleaning_tools, "MOP Cleaner", "Clean your floor with MOP", "Rs. 999/-"));
        //////////////////////////////// HORIZONTAL PRODUCT SCROLL LAYOUT ////////////////////////////////////////////////

        testing = view.findViewById(R.id.homepage_recyclerview);
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);
        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0,sliderModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.stripadd_flour_image,"#FFFFFF"));
        homePageModelList.add(new HomePageModel(2,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.stripadd_flour_image,"#ffffff"));
        homePageModelList.add(new HomePageModel(3,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2,"Deals of the Day",horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1,R.drawable.stripadd_flour_image,"#FFFFFF"));
        homePageModelList.add(new HomePageModel(0,sliderModelList));
        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }

    ///////////////////BANNER SLIDER


}
