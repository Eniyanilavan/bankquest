package com.example.eniyanilavan.banquest;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class verification extends AppCompatActivity {

    private RecyclerView languageList;
    private List<LanguagesList> list;
    private LangAdapter mLangAdapter;
    private Context mContext;
    private Button selectLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:app/src/main/java/com/example/eniyanilavan/banquest/verification.java
        setContentView(R.layout.verification);
=======
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();

        languageList = (RecyclerView) findViewById(R.id.lang_list);
        selectLang = (Button) findViewById(R.id.select_language);

        list = new ArrayList<>();

        mLangAdapter = new LangAdapter(mContext, list);


        final RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(mContext, 2);
        languageList.setLayoutManager(mLayoutManager);
        languageList.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        languageList.setItemAnimator(new DefaultItemAnimator());
        languageList.setAdapter(mLangAdapter);

        loadLanguages();

//        languageList.addOnItemTouchListener(new RecyclerItemListener(mContext, languageList,
//                new RecyclerItemListener.RecyclerTouchListener() {
//                    @Override
//                    public void onClickItem(View v, int position) {
//                        if(position == 0){
//                            //add voice clip
//                            Toast.makeText(mContext, "clicked"+position, Toast.LENGTH_SHORT).show();
//
//
//
//                        }if(position == 1){
//                            //add voice clip
//                        }if(position == 2){
//                            //add voice clip
//                        }if(position == 3){
//                            //add voice clip
//                        }if(position == 4){
//                            //add voice clip
//                        }if(position == 5){
//                            //add voice clip
//                        }
//                    }
//                }));

    }

    private void loadLanguages(){
        int[] lang_image = new int[]{
                R.drawable.img_1,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_6,
                R.drawable.img_10,
                R.drawable.img_8
        };
        int[] lang_sub = new int[]{
                R.drawable.img_2,
                R.drawable.img_2,
                R.drawable.img_5,
                R.drawable.img_7,
                R.drawable.img_11,
                R.drawable.img_9
        };
        int slctimg = R.drawable.select_img;

        LanguagesList a = new LanguagesList(lang_image[0], lang_sub[0], "Tamil",slctimg);
        list.add(a);

        a = new LanguagesList(lang_image[1], lang_sub[0], "English",slctimg);
        list.add(a);

        a = new LanguagesList(lang_image[2], lang_sub[2], "Hindi",slctimg);
        list.add(a);

        a = new LanguagesList(lang_image[3], lang_sub[3], "Telugu",slctimg);
        list.add(a);

        a = new LanguagesList(lang_image[4], lang_sub[4], "Bengali",slctimg);
        list.add(a);

        a = new LanguagesList(lang_image[5], lang_sub[5], "Kannada",slctimg);
        list.add(a);

        mLangAdapter.notifyDataSetChanged();
    }


    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view);
            int column = position % spanCount;

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount;
                outRect.right = (column + 1) * spacing / spanCount;

                if (position < spanCount) {
                    outRect.top = spacing;
                }
                outRect.bottom = spacing;
            } else {
                outRect.left = column * spacing / spanCount;
                outRect.right = spacing - (column + 1) * spacing / spanCount;
                if (position >= spanCount) {
                    outRect.top = spacing;
                }
            }
        }
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
>>>>>>> 3074dc1415865fb6f13125372dfa7839febf113f:app/src/main/java/com/example/eniyanilavan/banquest/MainActivity.java
    }
}
